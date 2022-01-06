import styled from "styled-components";

export const ChoiceBtn = styled.button`
  font-family: "NanumBold";
  font-size: 1.125rem;
  width: 450px;
  height: 60px;
  border: 1px solid;
  border-radius: 10px;
  cursor: pointer;
  color: #000000;
  background: #ffffff;
  border-color: #c4c4c4;

  :hover {
    color: ${(p) => p.fontcolor || null};
    background: ${(p) => p.btncolor || null};
    border-color: ${(p) => p.bordercolor || null};
  }
`;

export const Div = styled.div`
  padding-bottom: 10px;
`;
