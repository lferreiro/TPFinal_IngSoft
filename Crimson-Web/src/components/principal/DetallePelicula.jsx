import React from 'react';

import API, { fakeDatos } from '../../service/api';
import ModalReserva from './ModalReserva';

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
    this.traerTruchos();
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
    this.cargarDatos(fakeDatos);
  }

  cargarDatos(datos) {
    this.setState({ pelicula: datos.pelicula, info: datos.info });
  }

  renderizarProlijo(lista) {
    return lista.map(item => (
      <span>{item}</span>
    ));
  }

  render() {
    return (
      <div>
        <div className="col col-show">
          <div className="col col-show">
            <h3><span className="atributo">Nombre: </span>{this.state.pelicula.nombre}</h3>
            <h3><span className="atributo">Genero: </span>{this.state.pelicula.genero}</h3>
            <h3><span className="atributo">Clasificacion: </span>{this.state.pelicula.clasificacion}</h3>
            <h3><span className="atributo">Sinopsis: </span>{this.state.pelicula.sinopsis}</h3>
            <ModalReserva />
          </div>
        </div>
      </div>
    );
  }
}
