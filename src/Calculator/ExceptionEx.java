package Calculator;

public class ExceptionEx {
	private Employee employee;

	public static void main(String[] args) {
		ExceptionEx ex = new ExceptionEx();
		try {
			ex.execute();
		} catch (IncorrectException exception) {
			System.out.println("Wrong id");
		} catch (Exception e) {
			System.out.println("Something went wrong");
		}

		finally {
			System.out.println("Finally block");
		}
	}

	public void execute() throws Exception{
		if (employee.getId() < 0) {
			RuntimeException exception = new IncorrectException("wrong");
			throw exception;
		}
	}
}