import { createTask } from "./addTask.js";
import { uniqueDates, orderDates } from "../services/date.js";
import dateElement from "./dateElement.js";

export const displayTasks = () => {
    const list = document.querySelector("[data-list]");
    const taskList = JSON.parse(localStorage.getItem("tasks")) || [];
    const dates = uniqueDates(taskList);
    const order = orderDates(dates);
    
    dates.forEach(date => {
        list.appendChild(dateElement(date));
        const dateMoment = moment(date, "DD/MM/YYYY");
        taskList.forEach((task) => {
            const taskDate = moment(task.dateFormat, "DD/MM/YYYY");
            const diff = dateMoment.diff(taskDate);
            if(diff == 0){
                list.appendChild(createTask(task));  
            };
        });
    });
};