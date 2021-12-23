import React, { useState, useEffect } from "react";
import logo from "./logo.svg";
import "./App.css";
//import axios from "axios";

function App() {
  const [message, setMessage] = useState("");

  useEffect(() => {
    fetch("/mbti-test/hello")
        .then((response) => response.text())
        .then((message) => {
          setMessage(message);
        });
  }, []);

  return (
      <div className="App">
        <header className="App-header">
          <img src={logo} className="App-logo" alt="logo" />
          <h1>{message}</h1>
        </header>
      </div>
  );
}

export default App;