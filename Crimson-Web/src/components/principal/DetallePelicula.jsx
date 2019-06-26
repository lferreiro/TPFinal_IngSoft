import React from 'react';

import API from '../../service/api';

export default class DetallePelicula extends React.Component {
  constructor(props) {
    super(props);
    this.state = {
      pelicula: {
        imagen: '/img/placeholder.png',
        nombre: '<NO DISPONIBLE>',
        codigo: -1,
        genero: '<NO DISPONIBLE>',
        clasificacion: '<NO DISPONIBLE>',
        sinopsis: '<NO DISPONIBLE>',
        sala: undefined,
      },
      info: {
        vista: false,
        reservada: false,
      },
      reservas: [],
    };
    this.username = this.props.location.state !== undefined ? this.props.location.state.username : undefined;
    this.codigo = parseInt(this.props.match.params.id, 10);
  }

  componentWillMount() {
    // this.traerDatos();
    // this.traerTruchos();
  }

  componentDidMount() {
    console.log(this.props.match.params.id);
  }

  traerDatos() {
    API.get(`/${this.username}/peli/${this.codigo}`)
      .then(response => this.cargarDatos(response))
      .catch();
  }

  traerTruchos() {
    API.fake()
      .then(response => this.cargarDatos(response))
      .catch();
  }

  cargarDatos(datos) {
    this.setState({ pelicula: datos.pelicula, info: datos.info });
  }

  render() {
    return (
      <div>
        <h1>EEEOOO</h1>
        <p>{this.state.pelicula.nombre}</p>
      </div>
    );
  }
}
