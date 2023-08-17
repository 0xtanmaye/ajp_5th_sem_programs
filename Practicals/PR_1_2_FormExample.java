import java.awt.*;

class FormFrame extends Frame {
	FormFrame() {
		this.setSize(500, 500);
		this.setTitle("Form Application Example");
		this.setLayout(null);
		
		Label title = new Label("Registration Form");
		Label nameLabel = new Label("Name: ");
		Label mobileNoLabel = new Label("Mobile No: ");
		Label addressLabel = new Label("Address: ");
		Label usernameLabel = new Label("Username: ");
		Label passwordLabel = new Label("Password: ");
		
		TextField nameTF = new TextField();
		TextField mobileNoTF = new TextField();
		TextField usernameTF = new TextField();
		TextField passwordTF = new TextField();
		
		TextArea addressTA = new TextArea();
		
		Button registerBtn = new Button("Register");
		
		title.setBounds(175, 30, 150, 40);
		nameLabel.setBounds(20, 70, 100, 25);
		nameTF.setBounds(130, 70, 100, 25);
		mobileNoLabel.setBounds(20, 120, 100, 25);
		mobileNoTF.setBounds(130, 120, 100, 25);
		addressLabel.setBounds(20, 170, 100, 25);
		addressTA.setBounds(130, 170, 150, 60);
		usernameLabel.setBounds(20, 240, 100, 25);
		usernameTF.setBounds(130, 240, 100, 25);
		passwordLabel.setBounds(20, 290, 100, 25);
		passwordTF.setBounds(130, 290, 100, 25);
		registerBtn.setBounds(175, 350, 100, 25);
		this.add(title);
		this.add(nameLabel);
		this.add(nameTF);
		this.add(mobileNoLabel);
		this.add(mobileNoTF);
		this.add(addressLabel);
		this.add(addressTA);
		this.add(usernameLabel);
		this.add(usernameTF);
		this.add(passwordLabel);
		this.add(passwordTF);
		this.add(registerBtn);
		
		this.setVisible(true);
		
	}
}

public class PR_1_2_FormExample {
	public static void main(String[] args) {
		new FormFrame();
	}
}	