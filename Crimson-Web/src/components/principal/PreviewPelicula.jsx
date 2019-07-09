import React from 'react';
import { Link } from 'react-router-dom';

import API from '../../service/api';

import '../../dist/css/principal/PreviewPelicula.css';

export default class PreviewPelicula extends React.Component {
  constructor(props) {
    super(props);
    this.state = {
      nombre: this.props.nombre,
      genero: this.props.genero,
      clasificacion: this.props.clasificacion,
      sinopsis: this.props.sinopsis,
      imagen: this.props.imagen,
    };
  }

  componentDidMount() {
    console.log(this.state.imagen);
  }

  conseguirImagen() {
    API.get('')
      .then(response => this.cargarImagen(response))
      .catch(console.log('imagen no encontrada'));
  }

  cargarImagen() {

  }

  probar() {
    console.log(this.state.imagen);
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
          </p>
          <button type="button" onClick={() => this.probar()}>Probar algo</button>
          <Link
            className="btn btn-primary"
            to={{ pathname: `/pelicula/${this.state.codigo}`, state: { username: this.props.username } }}
          > Ver detalle
          </Link>
        </div>
      </div>);
  }
}
