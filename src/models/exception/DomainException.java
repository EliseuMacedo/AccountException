package models.exception;

public class DomainException extends RuntimeException{
	
	//implementar vers�o serializable
	private static final long serialVersionUID = 1L;
	
	//permite que eu possa instanciar uma exce��o personalizada
	//passando uma mensagem
	public DomainException(String msg) {
		super(msg);
	}
	
	

}
