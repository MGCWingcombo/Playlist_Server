import styled from "styled-components";

export const Content = styled.div`
  display: flex;
`;

export const LeftImg = styled.div`
  position: fixed;
  bottom: 0px;
  left: 0px;
  img {
    width: 270px;
    height: 470px;
  }
`;
export const RightImg = styled.div`
  position: fixed;
  top: 0px;
  right: 0px;
  img {
    width: 320px;
    height: 650px;
  }
`;

export const Contents = styled.div`
  width: 100%;
  height: 100vh;
  margin-top: 70px;

  display: flex;
  flex-direction: column;
  justify-content: space-evenly;
  align-items: center;
`;
export const Ment = styled.div`
  font-size: 2.2rem;
  font-family: "NanumExtra";
  font-weight: 300;
  text-align: center;
  display: flex;
  flex-direction: column;
  margin-top: 10vh;
  white-space: nowrap;
  display: inline;
  div {
    display: inline;
  }
  .mbti {
    font-family: "Prompt";
  }
  .playlist {
    font-family: "Prompt";
    color: #6578a7;
  }
`;

export const backImage = styled.image`
  position: relative;

  img {
    width: 470px;
    height: 350px;
  }
`;

export const Btn = styled.button`
  font-family: "NanumBold";
  background: #6578a7;
  color: white;
  font-size: 1.4rem;
  width: 450px;
  height: 70px;
  border: 1px solid #6578a7;
  border-radius: 50px;
  margin-bottom: 30vh;
`;
