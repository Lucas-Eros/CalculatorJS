const Calculator = require("../calculator");
const { expect } = require("chai");

describe("Calculator", () => {
  const calculator = new Calculator();

  it("Somar dois números", () => {
    expect(calculator.add(2, 3)).to.equal(5);
  });

  it("Subtrair dois números", () => {
    expect(calculator.subtract(5, 3)).to.equal(2);
  });

  it("Multiplicar dois números", () => {
    expect(calculator.multiply(2, 3)).to.equal(6);
  });

  it("Dividir dois números", () => {
    expect(calculator.divide(10, 2)).to.equal(5);
  });

  it("Não divisão por zero", () => {
    expect(() => calculator.divide(10, 0)).to.throw("Divisão por zero não é permitida.");
  });
});
