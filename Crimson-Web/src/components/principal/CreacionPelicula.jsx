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

  render() {
    return (
      <div className="col-8 col-show campos-creacion">
        <div className="col col-show">
          <input className="form-control" type="text" placeholder="Nombre" />
        </div>
        <div className="col col-show">
          <input className="form-control" type="text" placeholder="Genero" />
        </div>
        <div className="col col-show">
          <input className="form-control" type="text" placeholder="Clasificacion" />
        </div>
        <div className="col col-show">
          <input className="form-control" type="text" placeholder="Sinopsis" />
        </div>
        <div className="col col-show">
          <input className="form-control" type="text" placeholder="URL de imagen" />
        </div>
        <div className="col col-show">
          <input className="form-control" type="text" placeholder="URL de trailer" />
        </div>
      </div>
    );
  }
}
