import React from 'react';

import PreviewPelicula from './PreviewPelicula';

export default class Cartelera extends React.Component {
  componentDidUpdate() {
    console.log(this.props);
  }

  render() {
    return (
      <div>
        {this.props.contenido.map((peli, index) => (
          <div className="d-inline-flex" key={index}>
            <PreviewPelicula
              nombre={peli.nombre}
              codigo={peli.codigo}
              genero={peli.genero}
              clasificacion={peli.clasificacion}
              sinopsis={peli.sinopsis}
              sala={peli.sala}
            />
          </div>
        ))}
      </div>
    );
  }
}
