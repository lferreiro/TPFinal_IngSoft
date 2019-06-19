import React from 'react';

import PreviewPelicula from './PreviewPelicula';

export default class Cartelera extends React.Component {
  constructor(props) {
    super(props);
    this.state = {
      contenido: this.props.contenido !== undefined ? this.props.contenido : [],
    };
  }

  render() {
    return (
      this.props.contenido.map((peli, index) => (
        <PreviewPelicula
          key={index}
          nombre={peli.nombre}
          genero={peli.genero}
          clasificacion={peli.clasificacion}
          sinopsis={peli.sinopsis}
          sala={peli.sala}
        />
      ))
    );
  }
}
