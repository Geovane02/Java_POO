package Aula12_Polimorfismo;

public class Programa_Principal {
public static void main(String[] args) {
	

	
	Mamifero m = new Mamifero();
	Repitil r = new Repitil();
	Peixe p = new Peixe();
	Ave a = new Ave();
	
	
	Canguru c = new Canguru();
	Cachorro k = new Cachorro();
	Cobra j = new Cobra();
	Tartaruga t = new Tartaruga();
	Goldfish g= new Goldfish();
	Arara e = new Arara();
	
	
	c.locomover();
	k.locomover();
	c.emitirSom();
	k.emitirSom();
	/*
	m.setPeso(6.4f);
	m.setIdade(7);
	m.setMembros(4);
	m.setCorPelo("Preto e Branco");
	m.alimentar();
	m.emitirSom();
	m.locomover();
	
	
	
	r.setPeso(2.5f);
	r.setIdade(3);
	r.setMembros(4);
	r.setCorEscama("Verde");
	r.alimentar();
	r.emitirSom();
	r.locomover();
	
	
	
	p.setIdade(2);
	p.setPeso(6.7f);
	p.setMembros(1);
	p.setCorScama("prata");
	p.alimentar();
	p.emitirSom();
	p.locomover();
	p.soltarBolha();
	
	
	a.setCorPena("Verde e Amarelo");
	a.setPeso(0.55f);
	a.setIdade(1);
	a.setMembros(2);
	a.alimentar();
	a.emitirSom();
	a.fazerNinho();
	a.locomover();
	*/
}
	
}
