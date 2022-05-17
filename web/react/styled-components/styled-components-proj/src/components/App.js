import React from 'react';
import { Button } from 'components/common';
import { createGlobalStyle, ThemeProvider } from 'styled-components';
import { BrowserRouter, Switch, Route } from 'react-router-dom';
import Login from 'components/pages/Login';
import Home from 'components/pages/Home';

const GlobalStyle = createGlobalStyle`
   body{
     background:white;
     margin:0;
     min-height:100vh;
     color:black;
     font-family:'Kaushan Script'
   }
`;


const theme = {
  primaryColor: '#f8049c',
  secondaryColor: '#fdd54f'
};

function App() {
  return (
    <ThemeProvider theme={theme}>
      <GlobalStyle />
      <BrowserRouter>
        <Switch>
          <Route path="/login" ><Login /></Route>
          <Route path="/" ><Home /></Route>
        </Switch>
      </BrowserRouter>
    </ThemeProvider>
  );
}

export default App;
