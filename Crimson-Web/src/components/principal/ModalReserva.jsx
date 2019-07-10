import React from 'react';

import '../../dist/css/principal/ModalReserva.css';

import API from '../../service/api';

export default class ModalReserva extends React.Component {
  constructor(props) {
    super(props);
    this.state = {
      email: '',
      funcion: '',
      cantAsientos: 0,
    };
  }

  reservar() {
    API.put(`/reservar/`)
      .then(() => this.reservaExitosa())
      .catch();
  }

  reservaExitosa() {
    alert('Reserva enviada');
  }

  probar() {
    console.log(this.props.funciones);
  }

  asientosDisponibles() {
    let cant = 0;
    this.props.funciones.forEach((func) => {
      cant = func.sala.cantidadAsientos - func.asientosOcupados;
    });
    return cant;
  }

  simpFecha(funcion) {
    return funcion.horayFecha.slice(-8, -3);
  }

  renderizarFunciones() {
    return this.props.funciones.map((func, index) => (
      <option key={index}>F{index + 1} a las {this.simpFecha(func)} en sala {func.sala.numeroSala}</option>
    ));
  }

  render() {
    return (
      <React.Fragment>
        <button type="button" className="btn btn-primary modal-reserva" data-toggle="modal" data-target="#reservaModal">
          Reservar
        </button>
        <div className="modal fade" id="reservaModal" tabIndex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
          <div className="modal-dialog" role="document">
            <div className="modal-content">
              <div className="modal-header">
                <h5 className="modal-title">Personalice la reserva</h5>
                <button type="button" className="close" data-dismiss="modal" aria-label="Close">
                  <span aria-hidden="true">&times;</span>
                </button>
              </div>
              <div className="modal-body">
                <div className="col mod-col col-show">
                  <span className="modal-line">Ingrese su DNI</span>
                  <input className="form-control" type="text" placeholder="DNI" />
                </div>
                <div className="col mod-col col-show">
                  <span className="modal-line">Ingrese su e-mail</span>
                  <input className="form-control" type="text" placeholder="E-mail" />
                </div>
                <div className="col mod-col col-show">
                  <span className="modal-line">Seleccione una función</span>
                  <select className="form-control">
                    {this.renderizarFunciones()}
                  </select>
                </div>
                <div className="col mod-col col-show">
                  <span className="modal-line">Cantidad de asientos a reservar</span>
                  <input className="form-control" type="number" min="1" max={this.asientosDisponibles()} placeholder={`(${this.asientosDisponibles()} disponibles)`} />
                </div>
              </div>
              <div className="modal-footer">
                <button type="button" className="btn btn-secondary" data-dismiss="modal">Cerrar</button>
                <button type="button" className="btn btn-primary">Reservar</button>
                <button type="button" onClick={() => this.probar()}>Probar algo</button>
              </div>
            </div>
          </div>
        </div>
      </React.Fragment>
    );
  }
}
