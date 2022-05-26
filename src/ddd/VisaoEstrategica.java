package ddd;


/*
 * 
 * 	ContextMapping
 * 		Qual é o negocio 
 * 			1 - Vendas de ingressos online
 * 			2 - Suporte ao Cliente
 * 			3 - Vendas de Ingressos de parceiros
 * 			4 - Pagamento
 * 
 * 		Existe Relação entre o negocio 1 e 3 podendo fazer uma parceria.
 * 		Existe uma relação de um negocio fornecer serviços para outros negocios (1 consome o 3)
 * 		Suporte ao cliente também precisa de informações da venda de ingressos.
 * 		Existe uma cama anti-corrupção, onde facilita a troca de fornecedores externos (ex: Gateway de pagamento)
 * 
 * 
 * 
 * 	Padrões de ContextMapping
 * 		Partnership
 * 		Shared Kernel
 * 		Customer-Supplier Development
 * 		Conformist
 * 		Anticorruption-layer
 * 		Open host service
 * 		Published Language
 * 		Separate ways
 * 		Big Ball of Mud
 * 		
 * 
 * https://github.com/ddd-crew/context-mapping
 * 
 * 
 */
public class VisaoEstrategica {

	
	public static void main(String[] args) {
		
	}
}
