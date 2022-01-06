import styled from "styled-components";

export const Content = styled.div`
  display: flex;
  .left {
    margin-left: 20px;
  }
  .right {
    margin-right: 20px;
  }
`;

export const Contents = styled.div`
  width: 100%;
  height: 100vh;
  margin-top: 25px;
  display: flex;
  flex-direction: column;
  justify-content: space-evenly;
  align-items: center;
  .btn {
    height: 60px;
    margin-bottom: 300px;
  }
`;

export const Ment = styled.div`
  font-size: 1.8rem;
  font-family: "NanumExtra";
  font-weight: 300;
  text-align: center;
  display: flex;
  flex-direction: column;
  margin-top: 10vh;
`;

export const backImage = styled.div`
  position: relative;

  img {
    width: 250px;
    height: 250px;
  }
  span {
    font-size: 2rem;
    font-family: "Prompt";
    font-weight: 900;
    color: white;
    position: absolute;
    top: 40%;
    left: 35%;
  }
`;

export const Btn = styled.button`
  font-family: "NanumBold";
  background: #6578a7;
  color: white;
  font-size: 1.4rem;
  width: 400px;
  height: 60px;
  border: 1px solid #6578a7;
  border-radius: 50px;
  margin-bottom: 30vh;
`;
