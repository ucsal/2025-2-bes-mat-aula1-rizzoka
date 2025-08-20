package cms.user;

public class EditorUser extends User{
	
	public EditorUser(int id, String nome, String email, String password) {
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

	public void editContent(int contentId, String body) {
		/* exclusivo do editor */ }
}
