import React from 'react';

import API from '../../service/api';

import '../../dist/css/principal/CreacionPelicula.css';

export default class CreacionPelicula extends React.Component {
  constructor(props) {
    super(props);
    this.state = {
      nombre: '<NO DISPONIBLE>',
      genero: '<NO DISPONIBLE>',
      clasificacion: '<NO DISPONIBLE>',
      sinopsis: '<NO DISPONIBLE>',
      imagen: '<NO DISPONIBLE>',
      trailer: '<NO DISPONIBLE>',
    };
  }

  crear() {
    API.get(`/addPelicula/${this.state.nombre}/${this.state.genero}/${this.state.clasificacion}/${this.state.trailer}/${this.state.imagen}/${this.state.sinopsis}`)
      .then(() => this.felicitar())
      .catch();
  }

  felicitar() {
    alert(`la pelicula ${this.state.nombre} fue creada`);
    this.props.history.push({ pathname: '/' });
  }

  cambiarNombre(evento) {
    this.setState({ nombre: evento.target.value });
  }

  cambiarGenero(evento) {
    this.setState({ genero: evento.target.value });
  }

  cambiarClasificacion(evento) {
    this.setState({ clasificacion: evento.target.value });
  }

  cambiarSinopsis(evento) {
    this.setState({ sinopsis: evento.target.value });
  }

  cambiarImagen(evento) {
    this.setState({ imagen: evento.target.value });
  }

  cambiarTrailer(evento) {
    this.setState({ trailer: evento.target.value });
  }

  render() {
    return (
      <div className="col-8 col-show campos-creacion">
        <div className="col-7 col-show" align="center">
          <h1>Ingrese datos</h1>
        </div>
        <div className="col col-show">
          <input className="form-control" type="text" placeholder="Nombre" onChange={e => this.cambiarNombre(e)} />
        </div>
        <div className="col col-show">
          <input className="form-control" type="text" placeholder="Genero" onChange={e => this.cambiarGenero(e)} />
        </div>
        <div className="col col-show">
          <input className="form-control" type="text" placeholder="Clasificacion" onChange={e => this.cambiarClasificacion(e)} />
        </div>
        <div className="col col-show">
          <input className="form-control" type="text" placeholder="Sinopsis" onChange={e => this.cambiarSinopsis(e)} />
        </div>
        <div className="col col-show">
          <input className="form-control" type="text" placeholder="URL de imagen" onChange={e => this.cambiarImagen(e)} />
        </div>
        <div className="col col-show">
          <input className="form-control" type="text" placeholder="URL de trailer" onChange={e => this.cambiarTrailer(e)} />
        </div>
        <div className="col-7 col-show" align="center">
          <button
            type="button"
            className="btn btn-primary"
            onClick={() => this.crear()}
          >Crear pelicula
          </button>
        </div>
      </div>
    );
  }
}
