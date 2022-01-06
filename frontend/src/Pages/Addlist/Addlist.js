import React from "react";
import * as S from "./Style";
import SideMbti from "../../Components/SideMbti/SideMbti";
import { useNavigate } from "react-router-dom";
import { useLocation } from "react-router-dom";

const Addlist = ({}) => {
  const location = useLocation();

  console.log(location.state.mbti);
  const navigate = useNavigate();
  function navigateClick() {
    navigate("/recommend-list", { state: { mbti: location.state.mbti } });
  }
  return (
    <>
      <S.Content>
        <div className="left">
          <SideMbti />
        </div>
        <S.Contents>
          <S.Ment>
            <div>좋아하는 노래가 그날그날 바뀌는</div>
            <div>당신을 위한 플레이리스트는</div>
          </S.Ment>
          <S.backImage>
            <img
              className="img"
              src={require("../../assets/mbtiImg.png")}
              alt="mbtibackimg"
            />
            <span>{location.state.mbti}</span>
          </S.backImage>
          <div className="btn" onClick={navigateClick}>
            <S.Btn>나의 추천 플레이리스트 보러가기</S.Btn>
          </div>
        </S.Contents>
        <div className="right">
          <SideMbti />
        </div>
      </S.Content>
    </>
  );
};
export default Addlist;
