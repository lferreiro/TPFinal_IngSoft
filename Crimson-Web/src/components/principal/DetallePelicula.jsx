import React from 'react';

import API, { fakeDatos } from '../../service/api';
import ModalReserva from './ModalReserva';

export default class DetallePelicula extends React.Component {
  constructor(props) {
    super(props);
    this.state = {
      nombre: '<NO DISPONIBLE>',
      genero: '<NO DISPONIBLE>',
      clasificacion: '<NO DISPONIBLE>',
      sinopsis: '<NO DISPONIBLE>',
      trailer: 'https://www.youtube.com/watch?v=tOlh-g2dxrI',
      funciones: [],
    };
    this.nombre = this.props.match.params.nombre;
  }

  componentWillMount() {
    API.get(`/pelicula/${this.nombre}`)
      .then(response => this.cargarDatos(response))
      .catch();
  }

  componentDidMount() {
    console.log(this.props.match.params.nombre);
  }

  traerTruchos() {
    this.cargarDatos(fakeDatos);
  }

  cargarDatos(datos) {
    this.setState({
      nombre: datos.nombre,
      genero: datos.genero,
      clasificacion: datos.clasificacion,
      sinopsis: datos.sinopsis,
      trailer: datos.trailer,
      funciones: datos.funciones,
    });
  }

  probar() {
    console.log(this.state);
  }

  codigoVideo() {
    return this.state.trailer.match(/(?<==).*/g);
  }

  render() {
    return (
      <div>
        <div className="col col-show">
          <div className="col col-show">
            <h3><span className="atributo">Nombre: </span>{this.state.nombre}</h3>
            <h3><span className="atributo">Genero: </span>{this.state.genero}</h3>
            <h3><span className="atributo">Clasificacion: </span>{this.state.clasificacion}</h3>
            <h3><span className="atributo">Sinopsis: </span>{this.state.sinopsis}</h3>
            <iframe title={`trailer de ${this.state.nombre}`} width="560" height="315" src={`https://www.youtube.com/embed/${this.codigoVideo()}`} frameBorder="0" allow="accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture" allowFullScreen /> <br />
            <ModalReserva funciones={this.state.funciones} />
            <button type="button" onClick={() => this.probar()}>Probar algo</button>
          </div>
        </div>
      </div>
    );
  }
}
