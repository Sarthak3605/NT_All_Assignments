document.addEventListener("DOMContentLoaded", function () {
loadEmployees();
//on refresh the page or window it will load this function
});

// Function to load employees from the backend
function loadEmployees() {
    fetch("/employees")
        .then(response => response.json()) //we can also use const response = fetch("/employees") then data = response.json() method as well
        .then(data => {
            const table = document.getElementById("employeeTable");
            table.innerHTML = `
                <tr>
                    <th>ID</th>
                    <th>Name</th>
                    <th>Department</th>
                    <th>Email</th>
                    <th>Salary</th>
                    <th>Actions</th>
                </tr>`;      //it loads the table

            data.forEach(employee => {
                const row = document.createElement("tr"); //created row
                row.innerHTML = `
                    <td>${employee.id}</td>
                    <td>${employee.name}</td>
                    <td>${employee.department}</td>
                    <td>${employee.email}</td>
                    <td>${employee.salary}</td>
                    <td>
                        <button class="edit-btn" onclick="editEmployee(${employee.id}, '${employee.name}', '${employee.department}', '${employee.email}', ${employee.salary})">Edit</button>
                        <button class="delete-btn" onclick="deleteEmployee(${employee.id})">Delete</button>
                    </td>
                `;
                table.appendChild(row); //adds row to the table
            });
        })
        .catch(error => console.error("Error loading employees:", error));
}

// Function to add an employee
document.getElementById("addEmployee").addEventListener("submit", function (event) {
    event.preventDefault(); //restrict the event to happen

  //storing value of each in variable
    const name = document.getElementById("name").value;
    const department = document.getElementById("department").value;
    const email = document.getElementById("email").value;
    const salary = document.getElementById("salary").value;

    const employeeData = { name, department, email, salary };

    fetch("/employees", {
        method: "POST", //https request POST
        headers: { "Content-Type": "application/json" }, //ensures that content is of JSON type
        body: JSON.stringify(employeeData) //converts into string json like {{"xyz" : "xyz"}}
    })
    .then(() => {
        loadEmployees();
        document.getElementById("addEmployee").reset();
    })
    .catch(error => console.error("Error adding employee:", error));
});

// Function to edit an employee using prompts
function editEmployee(id, currentName, currentDepartment, currentEmail, currentSalary) {
    let newName = prompt("Edit Name:", currentName);
    let newDepartment = prompt("Edit Department:", currentDepartment);
    let newEmail = prompt("Edit Email:", currentEmail);
    let newSalary = prompt("Edit Salary:", currentSalary);

    if (newName && newDepartment && newEmail && newSalary) { //procced when all are available
        const updatedEmployee = {
            name: newName,
            department: newDepartment,
            email: newEmail,
            salary: newSalary
        };

        fetch(`/employees/${id}`, {
            method: "PUT",
            headers: { "Content-Type": "application/json" },
            body: JSON.stringify(updatedEmployee)
        })
        .then(() => loadEmployees())
        .catch(error => console.error("Error updating employee:", error));
    }
}

// Function to delete an employee
function deleteEmployee(id) {
    if (confirm("Do you want to delete this employee?")) {
        fetch(`/employees/${id}`, { method: "DELETE" })
            .then(() => loadEmployees())
            .catch(error => console.error("Error deleting employee:", error));
    }
}

// Logout function
function logout() {
    alert("Logged out successfully!");
    window.location.href = "login.html"; //redirect to main page i.e login.html
}
