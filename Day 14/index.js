import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
import App from './App';
import { CounterClock } from './CounterClock';
import { CounterClock2 } from './useStatewithArroeFunc';
import { UseEffectHook } from './UseEffectHook';
import  Effecthook  from './Effecthook';
import { Image } from './Image';
import { ImageChange } from './ImageChange';
import { DependencyCheck1 } from './DependencyCheck1';
import { WithoutDependency } from './WithoutDependency';
import reportWebVitals from './reportWebVitals';

const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
  <React.StrictMode>
    
    <CounterClock />
    <CounterClock2 />
    <DependencyCheck1 />
    <UseEffectHook />
    <Effecthook />
    <WithoutDependency />
    <Image />
    <ImageChange />
  </React.StrictMode>
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
