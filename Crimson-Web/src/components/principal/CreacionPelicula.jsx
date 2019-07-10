import React from 'react';

import API from '../../service/api';

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
      <div className="col col-show">
        <input className="form-control" type="text" placeholder="Nombre" />
        <input className="form-control" type="text" placeholder="Genero" />
        <input className="form-control" type="text" placeholder="Clasificacion" />
        <input className="form-control" type="text" placeholder="Sinopsis" />
        <input className="form-control" type="text" placeholder="URL de imagen" />
        <input className="form-control" type="text" placeholder="URL de trailer" />
      </div>
    );
  }
}
