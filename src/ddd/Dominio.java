package ddd;


/**
 * 
 * 
 * Divisão de Domínios
 * 	Explorar o dominio e descobrir quais são os setores internos
 * 	Core Domain é o coração do projeto, a razão desse projeto existir
 * 	Support subdomain -> Apoiam o domínio; Faz a operação do domínio possível
 * 	Generic Subdomain -> Softwares auxiliares, sem diferencial competitivo
 * 	
 * 
 * 
 * Problema X Solução
 * 	Problema -> Visão geral dos domínio gera subdomínios
 * 	Solução -> Análise e modelagem do domínio -> Contextos delimitados
 * 	Contextos delimitados ficam mais fácil de aplicar uma solução.
 * 
 * Contexto Delimitado (Bounded Contexts)
 * 	uma divisão explicita do modelo de domínio que estou trabalhando. (linguagar específico de uma area, dentro de um departamento)
 * 
 * Contexto é Rei
 * 	Vai determinar qual área da empresa estamos trabalhando (Ticket Vendas de ingresso X Ticket suporte ao cliente)
 * 
 * 
 * Elementos Transversais
 * 	Pode ser que alguns elementos de contextos estarão em clientes diferentes, pois o cliente do ticket e o cliente do suporte é o mesmo.
 * 	
 */
public class Dominio {

}
