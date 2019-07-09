import axios from 'axios';

const server = 'http://localhost:8080'; // Server backend

const API = {
  get: path => axios.get(`${server}${path}`).then(response => response.data),
  put: (path, body) => axios.put(`${server}${path}`, body).then(response => response.data),
  post: (path, body) => axios.post(`${server}${path}`, body).then(response => response.data),
};

export default API;
export const fakeDatos = {
  nombre: 'Aladdin',
  genero: 'Aventura Romantica',
  clasificacion: 'ATP',
  sinopsis: 'Aladdin (Mena Massoud) es un adorable pero desafortunado ladronzuelo enamorado de la hija del Sultán, la princesa Jasmine (Naomi Scott). Para intentar conquistarla, acepta el desafío de Jafar (Marwan Kenzari), que consiste en entrar a una cueva en mitad del desierto para dar con una lámpara mágica que le concederá todos sus deseos. Allí es donde Aladdín conocerá al Genio (Will Smith), dando inicio a una aventura como nunca antes había imaginado',
  trailer: 'https://www.youtube.com/watch?v=q84t9ORBf40',
  funciones: [
    {
      sala: {
        numero: 5,
        cantAsientos: 30,
        asientosOcupados: 25,
        tipo: '2D',
      },
      date: '15-05-17 19:30:00',
    },
    {
      sala: {
        numero: 5,
        cantAsientos: 30,
        asientosOcupados: 15,
        tipo: '2D',
      },
      date: '17-08-17 22:00:00',
    },
  ],
};
