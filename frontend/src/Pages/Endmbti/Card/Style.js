import styled from "styled-components";

export const Contents = styled.div``;

export const Card = styled.div`
  width: 260px;
  height: 330px;
  border-radius: 10px;
  margin-left: 10px;
  box-shadow: 0px 0px 10px #b6b6b6;
  margin: 18px;

  a {
    text-decoration: none;
    margin-left: 30px;
  }
  .Music {
    font-family: "Prompt";
    font-size: 1.4rem;
    font-weight: 900;
    color: #6c6f8c;
    margin-bottom: 0px;
  }
  .Artist {
    font-family: "Prompt";
    font-size: 1rem;
    font-weight: 800;
    color: #b6b6b6;
    margin: 0;
  }
`;

export const Img = styled.div`
  padding-top: 20px;
  div {
    background-image: url("${(p) => p.url || null}");
    //background-image: url("https://img.youtube.com/vi/UaaivA6ElmI/0.jpg");
    width: 200px;
    height: 190px;
    border-radius: 25px;
    background-size: 200px 190px;
    background-repeat: no-repeat;
  }
`;
