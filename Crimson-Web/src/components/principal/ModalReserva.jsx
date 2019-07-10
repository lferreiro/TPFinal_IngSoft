import React from 'react';

import '../../dist/css/principal/ModalReserva.css';

import API from '../../service/api';

export default class ModalReserva extends React.Component {
  constructor(props) {
    super(props);
    this.state = {
      dni: '',
      email: '',
      funcion: '',
      cantAsientos: 0,
    };
  }

  reservar() {
    API.get(`/reservar/${this.state.funcion}/${this.props.nombrePeli}/${this.state.dni}/${this.state.email}/${this.state.cantAsientos}`)
      .then(() => this.reservaExitosa())
      .catch();
  }

  reservaExitosa() {
    alert('Reserva enviada');
  }

  probar() {
    // console.log(this.props.funciones);
    console.log(this.state);
    console.log(this.props.nombrePeli);
  }

  cambiarDni(evento) {
    this.setState({ dni: evento.target.value });
  }

  cambiarEmail(evento) {
    this.setState({ email: evento.target.value });
  }

  cambiarFuncion(evento) {
    this.setState({ funcion: evento.target.value });
  }

  cambiarAsientos(evento) {
    this.setState({ cantAsientos: evento.target.value });
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

  selectFunciones() {
    return this.props.funciones.map((func, index) => (
      <option key={index} value={func.id}>F{index + 1} a las {this.simpFecha(func)} en sala {func.sala.numeroSala}</option>
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
                  <input className="form-control" type="text" placeholder="DNI" onChange={e => this.cambiarDni(e)} />
                </div>
                <div className="col mod-col col-show">
                  <span className="modal-line">Ingrese su e-mail</span>
                  <input className="form-control" type="text" placeholder="E-mail" onChange={e => this.cambiarEmail(e)} />
                </div>
                <div className="col mod-col col-show">
                  <span className="modal-line">Seleccione una función</span>
                  <select className="form-control" onChange={e => this.cambiarFuncion(e)}>
                    <option value="" />
                    {this.selectFunciones()}
                  </select>
                </div>
                <div className="col mod-col col-show">
                  <span className="modal-line">Cantidad de asientos a reservar</span>
                  <input
                    className="form-control"
                    type="number"
                    min="1"
                    max={this.asientosDisponibles()}
                    placeholder={`(${this.asientosDisponibles()} disponibles)`}
                    onChange={e => this.cambiarAsientos(e)}
                  />
                </div>
              </div>
              <div className="modal-footer">
                <button type="button" className="btn btn-secondary" data-dismiss="modal">Cerrar</button>
                <button type="button" className="btn btn-primary" onClick={() => this.reservar()}>Reservar</button>
                <button type="button" onClick={() => this.probar()}>Probar algo</button>
              </div>
            </div>
          </div>
        </div>
      </React.Fragment>
    );
  }
}
