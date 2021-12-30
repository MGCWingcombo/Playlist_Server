import React from "react";
import { useNavigate } from "react-router-dom";

const Home = ({ id }) => {
  const navigate = useNavigate();

  function navigateClick() {
    navigate("/Addmbti", { state: { id: id } });
  }

  return (
    <div>
      <button onClick={navigateClick}>playlist 추가 {id}</button>
    </div>
  );
};

export default Home;
