package models.exception;

public class DomainException extends RuntimeException{
	
	//implementar versão serializable
	private static final long serialVersionUID = 1L;
	
	//permite que eu possa instanciar uma exceção personalizada
	//passando uma mensagem
	public DomainException(String msg) {
		super(msg);
	}
	
	

}
