## 🔠Quiz Trivia

A fun and interactive quiz game that challenges your knowledge with real-time questions from the Open Trivia Database API. Pick a category, choose a difficulty level.

## Features

- Choose categories.
- Select difficulty levels (Easy, Medium, Hard).
- Timed questions to keep things exciting and track otherwise show answer if failed to answer in a given time.
- Tracks your score and lets you replay instantly.
- Fully responsive design for mobile, tablet, and desktop.

## Built With

- **HTML5** for structure.
- **CSS** for styling (including responsive design media queries).
- **JavaScript** for game logic.
- **Open Trivia Database API** for API and fetching the resources.

## Getting Started

1. Clone this repository:
   git clone https://github.com/yourusername/quiz-trivia.git
2. Navigate to the project folder:
Open index.html in your browser, and you're ready to play!

## How to Play
- Select a quiz category and difficulty level.
- Click Start Quiz to begin.
- Answer the multiple-choice questions before the timer runs out.
- Your final score will be displayed at the end.
- Click Play Again to restart the quiz.

## Fixing Special Characters in Questions
we can use below for correcting the API generated questions and answers as sometimes it gives special characters like &quot,#28sa etc...

1. function decodeHTMLEntities(text) {
2.     let parser = new DOMParser();
3.     return parser.parseFromString(text, "text/html").body.textContent;
4. }

And apply it before displaying the text:
1. questionElement.textContent = decodeHTMLEntities(question.question);
2. options.forEach(option => {
3.     btn.textContent = decodeHTMLEntities(option);
4. });


## Screenshots
![Screenshot (111)](https://github.com/user-attachments/assets/ca4a5804-c060-41be-a58d-46f3538260e8)



## About This Assignment  
This project was created as part of my NucleusTeq training. It demonstrates my ability to fetch data from an API, handle UI interactions, and build a responsive web application.  
