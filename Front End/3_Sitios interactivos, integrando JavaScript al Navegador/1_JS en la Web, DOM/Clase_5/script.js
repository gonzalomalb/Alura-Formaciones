import checkComplete from "./components/checkComplete.js";
import deleteIcon from "./components/deleteIcon.js";

//Immeditely invoked function expression IIFE
( () => {
const btn = document.querySelector("[data-form-btn]");

//Arrow functions o Funciones anónimas.
const createTask = (event) => {
    event.preventDefault();

    const input = document.querySelector("[data-form-input]");
    const value = input.value;
    input.value = '';

    const list = document.querySelector("[data-list]")
    const task = document.createElement("li");
    task.classList.add("card");
    const taskContent = document.createElement("div");
    const titleTask = document.createElement("span");
    titleTask.classList.add("task");
    titleTask.innerText = value;
    taskContent.appendChild(checkComplete());
    taskContent.appendChild(titleTask);
    //task.innerHTML = content;
    task.appendChild(taskContent);
    task.appendChild(deleteIcon());
    list.appendChild(task);    
};

btn.addEventListener("click", createTask);

})();