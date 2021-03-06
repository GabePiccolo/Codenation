package br.com.codenation.calculadora;


public class CalculadoraSalario {

	double salarioBruto;
	double salarioLiquido;
	private double descontoIrrf;
	private double descontoInss;
	
	public long calcularSalarioLiquido(double salarioBase){
		if(salarioBase < 1039.00){
			return (long) 0.0;
		}else{
			salarioBruto = calculaInss(salarioBase);
			salarioLiquido = calculaIrrf();
		}
		return Math.round(salarioLiquido);
	}

	//Construtores
	public double getDescontoInss() {
		return descontoInss;
	}
	public void setDescontoInss(double descontoInss) {
		this.descontoInss = descontoInss;
	}
	public double getDescontoIrrf() {
		return descontoIrrf;
	}

	public void setDescontoIrrf(double descontoIrrf) {
		this.descontoIrrf = descontoIrrf;
	}


	//Método para calcular desconto do INSS
	public double calculaInss(double salarioBase){
		if(salarioBase <= 1500.00){
			descontoInss = salarioBase * (1 - 0.08);
		}else if(salarioBase <= 4000.00){
			descontoInss = salarioBase * (1 - 0.09);
		}else{
			descontoInss = salarioBase * (1 - 0.11);
		}
		return descontoInss;
	}

	//Método para calcular desconto do IRRF
	public double calculaIrrf(){
		if(descontoInss <= 3000.00){
			return descontoInss;
		}else if(descontoInss <= 6000.00){
			descontoIrrf = descontoInss * (1 - 0.075);
		}else{
			descontoIrrf = descontoInss * (1 - 0.15);
		}
		return descontoIrrf;
	}
}