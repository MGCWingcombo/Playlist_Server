import React from "react";
import * as S from "./Style";

const Card = ({ keys }) => {
  const thumbnail = keys.urlImg;
  // for (let i = 0; i < 10; i++) {
  //   console.log(thumbnail[i]);
  // }
  console.log(thumbnail);
  return (
    <>
      <S.Card>
        <a href={keys.url} target="_blank">
          <S.Img url={keys.urlImg}>
            <div></div>
          </S.Img>
          <p className="Music">{keys.Music}</p>
          <p className="Artist">{keys.Artist}</p>
        </a>
      </S.Card>
    </>
  );
};

export default Card;
