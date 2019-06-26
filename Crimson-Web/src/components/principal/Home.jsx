import React from 'react';

import API from '../../service/api';

import Cartelera from './Cartelera';

export default class Home extends React.Component {
  constructor(props) {
    super(props);
    this.state = {
      cartelera: [],
    };
  }

  componentDidMount() {
    API.get('/pelicula')
      .then(response => this.cargarCartelera(response));
    // .catch(this.falsificarCartelera());
  }

  cargarCartelera(data) {
    this.setState({ cartelera: data });
  }

  falsificarCartelera() {
    const falsos = [
      {
        nombre: 'Aladdin',
        genero: 'Aventura Romantica',
        clasificacion: 'ATP',
        sinopsis: 'Pasan cosas',
        sala: {
          numeroSala: 3,
          asientosSala: undefined,
          cantidadAsientos: 30,
          asientosOcupados: 0,
          tipoSala: '2D',
        },
      },
    ];
    this.setState({ cartelera: falsos });
  }

  probar() {
    console.log(this.state.cartelera);
  }

  render() {
    return (
      <div>
        <h1>Crimson</h1>
        <button type="button" onClick={() => this.probar()}>Probar algo</button>
        <h2>Cartelera</h2>
        <Cartelera contenido={this.state.cartelera} username={undefined} />
      </div>
    );
  }
}
