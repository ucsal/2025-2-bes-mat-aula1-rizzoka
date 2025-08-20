package cms.user;

public class AdminUser extends User{
	
	public AdminUser(int id, String nome, String email, String password) {
		super(id, nome, email, password);
	}

	public int getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public String getEmail() {
		return email;
	}
	
	public void deleteContent(int contentId) {
		/* exclusivo do admin */ }
}
