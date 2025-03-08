document.addEventListener('DOMContentLoaded', function() {

    let questions = [], questionNum = 1, score = 0,timer;
	document.querySelector('.startbtn').addEventListener('click',startGame);
//Now we start the game with the function 'startGame'
async function startGame(){

	let catogory = document.getElementById('category').value;
    let diffculty = document.getElementById('level').value;
	let api = `https://opentdb.com/api.php?amount=16&category=${catogory}&difficulty=${diffculty}&type=multiple`;

	try{
	let response = await fetch(api) //await is used to handle async process
	let data = await response.json()
	questions = data.results;

	}
	catch (error) {
        console.error("Error fetching questions:", error);
		return;
    }

    //console.log('clicking the start button to hide startscreen');
	document.getElementById('startScreen').classList.add('hidden');
	document.getElementById('gameScreen').classList.remove('hidden');
	//console.log('now new screen will be visible')

   loadQuestion(); //this will call next function to laod question
}

function loadQuestion(){
	document.getElementById('questionNum').textContent = "Q"+questionNum +".";

    if(questionNum >= questions.length) return endGame(); //game will be end when the number of question reaches to the end
	const question = questions[questionNum];
	document.getElementById('question').textContent = question.question;

	let optionBox = document.getElementById('answers');
	optionBox.innerHTML = '';
	let options = [...question.incorrect_answers]; //spread operator is used to creates a shallow copy and expands
	options.push(question.correct_answer); //here we push correct answer to the options

	options.sort(()=> Math.random() - 0.6);
	options.forEach(option => {
		const btn = document.createElement('button'); //here we dynamically creates the element
		btn.textContent = option;
		btn.classList.add('option')
		btn.onclick = () => checkAnswers(option,question.correct_answer); // onclick calls the function that checks the annswer correctness
		optionBox.appendChild(btn); //here it appends or add the options/buttons
	})
	startLoadTiming(); //this will call next function to start loading time
}

function startLoadTiming(){
let timeleft = 15;
document.getElementById('timer').textContent = timeleft;

clearInterval(timer); /*it clears the other timers if they exist before this
					   otherwise multiple timers will run simultaneously,
					that's not good also disturbs the user experience*/

 timer = setInterval(() => {
	timeleft--; //decreament timeleft = timeleft - 1;
	document.getElementById('timer').textContent = timeleft;

	if(timeleft === 0){
	clearInterval(timer);
	showCorrectAnswer(); //this will show the correct answer when time will reach 0
	}
}, 1000);
}

function checkAnswers(selectedOption,correctOption){
	clearInterval(timer);
    document.querySelectorAll('.option').forEach(btn =>{
		btn.disabled = true; //this stops user to select multiple options and disables other options
		if(btn.textContent === correctOption) btn.classList.add('correct');
		if(btn.textContent === selectedOption && selectedOption !== correctOption) btn.classList.add('incorrect');
	})

	if(selectedOption === correctOption) score++;
	setTimeout(() => {
		questionNum++;
		loadQuestion(); //this will envoke the function and again the next question will loaded for the user
	}, 2000);
}

function showCorrectAnswer(){
	document.querySelectorAll('.option').forEach(btn => {
		if(btn.textContent === questions[questionNum].correct_answer) btn.classList.add('correct')
		})

		setTimeout(() => {
			questionNum++;
			loadQuestion();
		}, 2000);
}

function endGame(){
	document.getElementById('gameScreen').classList.add('hidden');
	document.getElementById('endScreen').classList.remove('hidden');
	document.getElementById('score').textContent = score+"/"+15;
}
});
