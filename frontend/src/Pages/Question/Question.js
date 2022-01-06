import React, { useState, useMemo } from "react";
import ChoiceBtn from "./TextBtn/ChoiceBtn";
import * as S from "./Style";

function nextText(number) {
  switch (number) {
    case 1: {
      return "오랜만에 찾아온 휴일, 당신이 원하는 휴식 방법은?";
    }
    case 2: {
      return "파티에 참석한 당신이 위치한 곳은?";
    }
    case 3: {
      return `집에 가기 위해서 버스를 기다리는 당신,
              당신이 지금 하고 있는 생각은?`;
    }
    case 4: {
      return "오늘 알차게 하루를 보내기 위해서 밖에 나온 당신은?";
    }
    case 5: {
      return "오늘은 체육대회 날, 당신의 마음 가짐은?";
    }
    case 6: {
      return "아이스크림을 사러 간 당신이 고른 아이스크림은?";
    }
    case 7: {
      return "계획을 다 세웠는데 엄마가 심부름을 시키신다.";
    }
    case 8: {
      return "내가 미리 찾아본 식당이 오늘 문을 닫았다. 이때 내 선택은?";
    }
    case 9: {
      return `“나 요즘 기분이 우울해서 화분 샀어" 
      라는 말을 들었을 때 당신은?`;
    }
    case 10: {
      return "새로운 사람들과 만난 자리에서 자기소개를 하게 된 당신";
    }
    case 11: {
      return "친구들을 집으로 초대해 음식을 대접 할 때";
    }
    case 12: {
      return "보름달이 떴다는 친구의 전화를 받은 나의 반응은?";
    }
    default: {
      return null;
    }
  }
}

const Question = () => {
  const [number, setNumber] = useState(1);

  const ShowState = useMemo(() => nextText(number), [number]);

  const nextCount = () => {
    setNumber((nextNumber) => nextNumber + 1);
  };

  return (
    <>
      <S.Content>
        <S.Top>
          <S.Number>Q{number}.</S.Number>
          <S.Count>{number} / 12</S.Count>
        </S.Top>

        <S.Questions>{ShowState}</S.Questions>

        <S.Btns onClick={nextCount}>
          <ChoiceBtn number={number} />
        </S.Btns>
      </S.Content>
    </>
  );
};

export default Question;
