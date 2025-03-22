document.getElementById("loginForm").addEventListener("submit", function(event) {
    event.preventDefault(); // stops form to submit or stops the event
    fetch("/api/hr/login", {
        method: "POST",
        headers: { "Content-Type": "application/json" }, /*if header is not used it will not recognize the body,
                                                         because it defines here that the content is in JSON format*/
        body: JSON.stringify({ //this convert into the string json
            email: document.getElementById("email").value,
            password: document.getElementById("password").value
        })
    }).then(response => response.json()).then(isValid => {
        if (isValid) {
            window.location.href = "employees.html"; // if correct redirect to the employees page
        } else {
            alert("Invalid credentials! Try Again!");
        }
    });
});
