import axios from 'axios';

const server = 'http://localhost:8080'; // Server backend
const fakeDatos = {
  pelicula: {
    nombre: 'Aladdin',
    codigo: 1,
    genero: 'Aventura Romantica',
    clasificacion: 'ATP',
    sinopsis: 'Aladdin (Mena Massoud) es un adorable pero desafortunado ladronzuelo enamorado de la hija del Sultán, la princesa Jasmine (Naomi Scott). Para intentar conquistarla, acepta el desafío de Jafar (Marwan Kenzari), que consiste en entrar a una cueva en mitad del desierto para dar con una lámpara mágica que le concederá todos sus deseos. Allí es donde Aladdín conocerá al Genio (Will Smith), dando inicio a una aventura como nunca antes había imaginado',
    sala: {
      numeroSala: 3,
      asientosSala: null,
      cantidadAsientos: 30,
      asientosOcupados: 0,
      tipoSala: '2D',
    },
  },
  info: {
    vista: true,
    reservada: false,
  },
};

const API = {
  get: path => axios.get(`${server}${path}`).then(response => response.data),
  put: (path, body) => axios.put(`${server}${path}`, body).then(response => response.data),
  post: (path, body) => axios.post(`${server}${path}`, body).then(response => response.data),
  fake: () => fakeDatos,
};

export default API;
