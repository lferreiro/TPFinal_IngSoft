import React from 'react';

import API, { fakeDatos } from '../../service/api';
import ModalReserva from './ModalReserva';

import '../../dist/css/principal/DetallePelicula.css';

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
    const falsas = [
      {
        id: 5,
        asientosOcupados: 30,
        date: '2019-06-10T11:00:00.000+0000',
        horayFecha: '10-06-19 11:00:00',
        numeroSala: 1,
        sala: {
          cantidadAsientos: 200,
          numeroSala: 1,
        },
      },
      {
        id: 8,
        asientosOcupados: 30,
        date: '2019-06-10T03:00:00.000+0000',
        horayFecha: '10-06-19 03:00:00',
        numeroSala: 1,
        sala: {
          cantidadAsientos: 200,
          numeroSala: 1,
        },
      }];

    this.setState({
      nombre: datos.nombre,
      genero: datos.genero,
      clasificacion: datos.clasificacion,
      sinopsis: datos.sinopsis,
      trailer: datos.trailer,
      funciones: falsas,
    });
  }

  probar() {
    console.log(this.state);
  }

  codigoVideo() {
    return this.state.trailer.match(/(?<==).*/g);
  }

  renderizarFunciones() {
    return this.state.funciones.map((func, index) => (
      <span className="funciones" key={index}>
        <h2>Función {index + 1}</h2>
        <p>
          <span className="sala">Sala Nº {func.sala.numeroSala} </span>
          |
          <span className="asientos"> asientos {func.asientosOcupados}/{func.sala.cantidadAsientos} </span>
          |
          <span className="hora-fecha"> {func.horayFecha.slice(0, -3)} hs</span>
        </p>
      </span>
    ));
  }

  render() {
    return (
      <div className="row row-show detalle">
        <div className="col-6 col-show det-col">
          <h1>Información</h1>
          <h3><span className="atributo">Nombre: </span>{this.state.nombre}</h3>
          <h3><span className="atributo">Genero: </span>{this.state.genero}</h3>
          <h3><span className="atributo">Clasificacion: </span>{this.state.clasificacion}</h3>
          <h3><span className="atributo">Sinopsis: </span>{this.state.sinopsis}</h3>
          <iframe title={`trailer de ${this.state.nombre}`} width="560" height="315" src={`https://www.youtube.com/embed/${this.codigoVideo()}`} frameBorder="0" allow="accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture" allowFullScreen /> <br />
        </div>
        <div className="col-6 col-show fun-col">
          {this.renderizarFunciones()}
          <div className="col col-show">
            <ModalReserva nombrePeli={this.state.nombre} funciones={this.state.funciones} />
          </div>
          <br /><button type="button" onClick={() => this.probar()}>Probar algo</button>
        </div>
      </div>
    );
  }
}
