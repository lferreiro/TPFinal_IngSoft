import axios from 'axios';

const server = 'http://localhost:8080'; // Server backend

const API = {
  get: path => axios.get(`${server}${path}`).then(response => response.data),
  put: (path, body) => axios.put(`${server}${path}`, body).then(response => response.data),
  post: (path, body) => axios.post(`${server}${path}`, body).then(response => response.data),
};

export default API;
export const fakeDatos = {
  clasificacion: 'ATP',
  genero: 'Aventura Romantica',
  imagen: 'https://pm1.narvii.com/6416/f1f6df48dd32275da37919d11188ff34c1f84cb7_hq.jpg',
  nombre: 'Aladdin',
  sinopsis: 'Aladdin (Mena Massoud) es un adorable pero desafortunado ladronzuelo enamorado de la hija del Sultán, la princesa Jasmine (Naomi Scott). Para intentar conquistarla, acepta el desafío de Jafar (Marwan Kenzari), que consiste en entrar a una cueva en mitad del desierto para dar con una lámpara mágica que le concederá todos sus deseos. Allí es donde Aladdín conocerá al Genio (Will Smith), dando inicio a una aventura como nunca antes había imaginado',
  trailer: 'https://www.youtube.com/watch?v=q84t9ORBf40',
  funciones: [
    {
      sala: {
        asientosOcupados: 25,
        cantidadAsientos: 30,
        numeroSala: 5,
      },
      horayFecha: '15-05-17 19:30:00',
    },
    {
      sala: {
        asientosOcupados: 15,
        cantidadAsientos: 30,
        numeroSala: 5,
      },
      horayFecha: '17-08-17 22:00:00',
    },
  ],
};
