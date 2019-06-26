import React from 'react';
import { Link } from 'react-router-dom';

import API from '../../service/api';

import '../../dist/css/principal/PreviewPelicula.css';

export default class PreviewPelicula extends React.Component {
  constructor(props) {
    super(props);
    this.state = {
      imagen: '/img/placeholder.png',
      nombre: this.props.nombre,
      codigo: this.props.codigo,
      genero: this.props.genero,
      clasificacion: this.props.clasificacion,
      sinopsis: this.props.sinopsis,
      sala: this.props.sala,
    };
  }

  conseguirImagen() {
    API.get('')
      .then(response => this.cargarImagen(response))
      .catch(console.log('imagen no encontrada'));
  }

  cargarImagen() {

  }

  render() {
    return (
      <div className="card peli-card cardPrev">
        <img className="card-img-top imgPrev" src={this.state.imagen} alt={`imagen de ${this.state.nombre}`} />
        <div className="card-body">
          <h5 className="card-title">{this.state.nombre}</h5>
          <p className="card-text">
            <span className="atributo">Genero: </span>{this.state.genero} <br />
            <span className="atributo">Clasificacion: </span>{this.state.clasificacion} <br />
            <span className="atributo">Sinopsis: </span>{this.state.sinopsis} <br />
            <span className="atributo">Numero de sala: </span>{`${this.state.sala}`} <br />
          </p>
          <Link
            className="btn btn-primary"
            to={{ pathname: `/pelicula/${this.state.codigo}`, state: { username: this.props.username } }}
          > Ver detalle
          </Link>
        </div>
      </div>);
  }
}
