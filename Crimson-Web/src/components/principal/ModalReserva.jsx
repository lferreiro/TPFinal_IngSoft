import React from 'react';

import '../../dist/css/principal/ModalReserva.css';

export default class ModalReserva extends React.Component {
  render() {
    return (
      <React.Fragment>
        <button type="button" className="btn btn-primary" data-toggle="modal" data-target="#reservaModal">
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
                <span className="modal-line">Ingrese su e-mail </span>
                <input type="text" placeholder="E-mail" />
              </div>
              <div className="modal-footer">
                <button type="button" className="btn btn-secondary" data-dismiss="modal">Cerrar</button>
                <button type="button" className="btn btn-primary">Enviar</button>
              </div>
            </div>
          </div>
        </div>
      </React.Fragment>
    );
  }
}
