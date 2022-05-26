package ddd;


/**
 * 
 * 
 * Divis�o de Dom�nios
 * 	Explorar o dominio e descobrir quais s�o os setores internos
 * 	Core Domain � o cora��o do projeto, a raz�o desse projeto existir
 * 	Support subdomain -> Apoiam o dom�nio; Faz a opera��o do dom�nio poss�vel
 * 	Generic Subdomain -> Softwares auxiliares, sem diferencial competitivo
 * 	
 * 
 * 
 * Problema X Solu��o
 * 	Problema -> Vis�o geral dos dom�nio gera subdom�nios
 * 	Solu��o -> An�lise e modelagem do dom�nio -> Contextos delimitados
 * 	Contextos delimitados ficam mais f�cil de aplicar uma solu��o.
 * 
 * Contexto Delimitado (Bounded Contexts)
 * 	uma divis�o explicita do modelo de dom�nio que estou trabalhando. (linguagar espec�fico de uma area, dentro de um departamento)
 * 
 * Contexto � Rei
 * 	Vai determinar qual �rea da empresa estamos trabalhando (Ticket Vendas de ingresso X Ticket suporte ao cliente)
 * 
 * 
 * Elementos Transversais
 * 	Pode ser que alguns elementos de contextos estar�o em clientes diferentes, pois o cliente do ticket e o cliente do suporte � o mesmo.
 * 	
 */
public class Dominio {

}
