import React, { useState, useEffect } from "react";
import axios from "axios";
import { useLocation } from "react-router-dom";
import * as S from "./Style";

const Endmbti = () => {
  const [mbtis, setMbtis] = useState(null);
  const [error, setError] = useState(null);

  const location = useLocation();
  const props = location.state.mbti;

  useEffect(() => {
    const holder = async () => {
      try {
        setError(null);
        setMbtis(null);

        console.log(props);
        await axios
          .get(`http://localhost:8080/playlist/${props}`)
          .then((res) => {
            setMbtis(res.data);
            console.log("성공");
          })
          .catch((err) => {
            console.log("실패");
            setError(err);
            throw err;
          });
      } catch (e) {
        if (error) return <div>에러가 발생했습니다.</div>;
      }
    };

    holder();
  }, []);

  var keys = JSON.stringify(mbtis, ["id", "title"], 3);

  return (
    <>
      <h1>{keys}</h1>
    </>
  );
};

export default Endmbti;
