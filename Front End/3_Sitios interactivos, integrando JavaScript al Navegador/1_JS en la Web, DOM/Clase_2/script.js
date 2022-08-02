const btn = document.querySelector("[data-form-btn]");


//Arrow functions o Funciones anónimas.

const createTask = (event) => {
    event.preventDefault();
    const input = document.querySelector("[data-form-input]");
    console.log(input.value);
};

btn.addEventListener("click", createTask);