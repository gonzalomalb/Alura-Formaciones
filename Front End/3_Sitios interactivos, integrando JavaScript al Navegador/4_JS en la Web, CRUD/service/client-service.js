//Fetch API
const listaClientes = () => fetch("http://localhost:3000/perfil").then(respuesta => respuesta.json());

//Create CRUD API
const crearCliente = (nombre, email) => {
    return fetch("http://localhost:3000/perfil", {
        method: "POST",
        headers: {
            "Content-type": "application/json",
        },
        body: JSON.stringify({nombre,email, id: uuid.v4() })
    });
}

const eliminarCliente = (id) => {
    return fetch(`http://localhost:3000/perfil/${id}`, {
        method: "DELETE",
    })
}

export const detalleCliente = (id) => {
    return fetch(`http://localhost:3000/perfil/${id}`).then(respuesta => respuesta.json());
} 

const actualizarCliente = (nombre, email, id) => {
    return fetch(`http://localhost:3000/perfil/${id}`, {
        method: "PUT",
        headers: {
            "Content-type": "application/json"
        },
        body: JSON.stringify({nombre,email}),
    })
    .then(respuesta => respuesta)
    .catch(err => console.log(err))
}

export const clientServices = {
    listaClientes,
    crearCliente,
    eliminarCliente,
    detalleCliente,
    actualizarCliente,
}



//CRUD - Métodos HTTP
//Create - POST
//Read - GET
//Update - PUT/PATCH
//Delete - DELETE

//Abrir HTTP (método, url) con Promise()
/*
const promise = new Promise((resolve, reject) => {
    const http = new XMLHttpRequest();
    http.open("GET", "http://localhost:3000/perfil");
    http.send();
    http.onload = () => {
        const response = JSON.parse(http.response);
        if (http >= 400) {
            reject(response);
        } else {
            resolve(response);
        }
    };
});
return promise;
*/