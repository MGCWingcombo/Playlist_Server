import React from "react";
import * as S from "./Style";
// import SideMbti from "../../Components/SideMbti/SideMbti";
import { useNavigate } from "react-router-dom";

const MbtiTest = () => {
  const navigate = useNavigate();
  function navigateClick() {
    navigate("/mbti-test");
  }

  return (
    <>
      <S.Content>
        <S.LeftImg>
          <img src={require("../../assets/leftbuble.png")} alt="leftbuble" />
        </S.LeftImg>
        <S.Contents>
          <S.Ment>
            <div className="mbti">MBTI</div>
            <div>로 알아보는 나의</div>
            <div className="playlist"> PLAYLIST</div>
          </S.Ment>
          <S.backImage>
            <img
              className="img"
              src={require("../../assets/TheBandShow.png")}
              alt="teststartimg"
            />
          </S.backImage>
          <div onClick={navigateClick}>
            <S.Btn>나와 맞는 플레이리스트 찾으러 가기</S.Btn>
          </div>
        </S.Contents>
        <S.RightImg>
          <img src={require("../../assets/rightbuble.png")} alt="rightbuble" />
        </S.RightImg>
      </S.Content>
    </>
  );
};

export default MbtiTest;
