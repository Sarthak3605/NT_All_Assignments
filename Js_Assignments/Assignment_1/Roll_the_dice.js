document.addEventListener('DOMContentLoaded', function() {

    const player1 = document.querySelector('.player1');
    const player2 = document.querySelector('.player2');
    const img =  document.querySelector('.dice');

	//buttons
	const roll = document.getElementById('roll_button');
    const save = document.getElementById('save_button');
    const reset = document.getElementById('reset_button');

//This method can be also use, we can take names from user itself by prompt (Optional Method)

     //let playername1 = prompt("Enter Player 1 Name: ");
     //let playername2 = prompt("Enter Player 2 Name: ");
     //if(playername1) document.getElementById('player1').textContent = playername1; //if player1 name is given it will show
     //if(playername2) document.getElementById('player2').textContent = playername2; //if player2 name is given it will show
    let currentScore,activePlayer,score;


     currentScore = 0;
     activePlayer = 1;
     score = [0,0];

	//here we add class to the active player to show that who is currently playing
    player1.classList.add('active_player');
    player2.classList.remove('active_player');

	//function to switch the players after chance
	function switchChance(){
		document.getElementById(`player${activePlayer}_currScore`).textContent = 0;
		activePlayer = activePlayer === 1 ? 2:1

		currentScore = 0;
		togglePlayer();
	}

	//code for handling the roll of dice

  function rollHandle(){
	img.style.opacity = 0;
	img.src = "./assets/dice.gif";
/*we will use setTimeout function in order to get smooth transition like when we
click on roll then it will dissapear and come again which show more effective transition*/

    const numbers = Math.floor(Math.random()*6) +1; //for random numbers among 1,2,3,4,5,6
	setTimeout(function(){

		img.src = `./assets/dice_${numbers}.png`;
		img.style.opacity = 1;

	},300)

    //case where number is not 1 condition also else
	if(numbers !== 1){
		currentScore += numbers;
		document.getElementById(`player${activePlayer}_currScore`).textContent = currentScore;
	}
	else{

		switchChance();
	}
	save.disabled = false; //This re enables the save button so that it will clickable for the new player(changed player)
}


//here we code for the save button so that score can be saved
   function saveHandle(){

    score[activePlayer -1] += currentScore; //we use -1 because score[0,0] index is 0 and 1 so it will match accordingly

	document.getElementById(`player${activePlayer}_savedScore`).textContent = score[activePlayer -1];

	//winning condition
	if(score[activePlayer -1] >= 100){
	//use for Optional method, in above comments
	/*activePlayer === 1 ? document.querySelector('.winner_info').textContent = `${playername1} Wins!`
	: document.querySelector('.winner_info').textContent = `${playername2} Wins!`*/

		//we will get the player name that is editted dynamically, so it will trim and give us to display
		const playername = document.getElementById(`player${activePlayer}`).textContent.trim();

		document.querySelector('.winner_info').textContent = `💥${playername} Wins!💥`
		document.querySelector(`.player${activePlayer}`).classList.toggle('winner');
		document.querySelector('.winner_info').classList.remove('hidden')
	}

	save.disabled = true; //save button disabled so that the user can not save score multiple times so it's not allowed
}

//reset button code start to reset or restart the game

function resetHandle(){

	document.getElementById(`player1_currScore`).textContent = 0;
	document.getElementById(`player2_currScore`).textContent = 0;
	document.getElementById(`player1_savedScore`).textContent = 0;
	document.getElementById(`player2_savedScore`).textContent = 0;

	score = [0,0]
	currentScore = 0;
	activePlayer = 1;

	player1.classList.add('active_player');
	player2.classList.remove('active_player');

	document.querySelector('.player1').classList.remove('winner');
	document.querySelector('.player2').classList.remove('winner');

	document.querySelector('.winner_info').textContent = '';

}

//here i made a function that switches the players
const togglePlayer = () =>{
	player1.classList.toggle('active_player');
	player2.classList.toggle('active_player');
}

//All the buttons code is here which handle diffrent functionalities

roll.addEventListener('click',rollHandle);
save.addEventListener('click',saveHandle);
reset.addEventListener('click',resetHandle)
})
