<?php
namespace CalculatorBundle\Entity;
class Calculator{
    /**
    * @var float
    */
    private $leftOperand;
    /**
     * @var float
     */
    private $rightOperand;
    /**
     * @var string
     */
    private $operator;


    /**
     * Get left operator
     * @return float
     */
    public function getLeftOperand()
    {
        return $this->leftOperand;
    }
    /**
     * Set left operand
     * @param float $operand
     * @return Calculator
     */
    public function setLeftOperand(float $leftOperand)
    {
        $this->leftOperand = $leftOperand;
        return $this;
    }

    /**
     * Get right operand
     * @return float
     */
    public function getRightOperand()
    {
        return $this->rightOperand;
    }

    /**
     * @param float $operand
     * @return Calculator
     */
    public function setRightOperand($operand)
    {
        $this->rightOperand = $operand;
        return $this;
    }

    /**
     * @return float
     */
    public function getOperator()
    {
        return $this->operator;
    }

    /**
     * @param string $operator
     * @return Calculator
     */
    public function setOperator(string $operator)
    {
        $this->operator = $operator;
        return $this;
    }
}
?>