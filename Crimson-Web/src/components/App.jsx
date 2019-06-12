import 'bootstrap/dist/css/bootstrap.min.css';
import 'bootstrap/dist/js/bootstrap.bundle.min.js';
import '../dist/css/principal/App.css';

import React, { Component } from 'react';
import { Switch, Route } from 'react-router';
import { BrowserRouter } from 'react-router-dom';

import Root from './Root.jsx';
import Home from './principal/Home';
import PreviewPelicula from './principal/PreviewPelicula'

export default class App extends React.Component {
  render() {
    return (
      <BrowserRouter>
        <Root>
          <Switch>
            <Route path="/pelicula" component={PreviewPelicula} />
            {/* <Route path="/login" component={Login} /> */}
            <Route exact path="/" component={Home} />
          </Switch>
        </Root>
      </BrowserRouter>
    );
  }
}
