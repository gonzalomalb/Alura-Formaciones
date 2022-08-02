import checkComplete from './checkComplete.js';
import deleteIcon from './deleteIcon.js';



const createTask = (evento) => {
  evento.preventDefault();
  const taskList = JSON.parse(localStorage.getItem('tasks')) || [];
  const input = document.querySelector('[data-form-input]');
  const value = input.value;
  const calendar = document.querySelector('[data-form-date]');
  const date = calendar.value;
  const dateFormat = moment(date).format('DD/MM/YYYY');
  const task = document.createElement('li');
  task.classList.add('card');
  input.value = '';
  const taskContent = document.createElement('div');

  const taskObj = {
    value,
    dateFormat
  }

  taskList.push(taskObj);

  localStorage.setItem("tasks", JSON.stringify(taskList));

  const titleTask = document.createElement('span');
  titleTask.classList.add('task');
  titleTask.innerText = value;
  taskContent.appendChild(checkComplete());
  taskContent.appendChild(titleTask);
  const dateElement = document.createElement("span");
  dateElement.innerHTML = dateFormat;
  task.appendChild(taskContent);
  task.appendChild(dateElement);
  task.appendChild(deleteIcon());
  return task;
};

export const addTask = (evento) => {
  const list = document.querySelector('[data-list]');
  const task = createTask(evento);
  list.appendChild(task);
};