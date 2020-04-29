package pl.emilsroka.mediator.end;

public class SignUpDialogBox {
    private TextBox username;
    private TextBox password;
    private CheckBox terms;
    private Button submit;

    SignUpDialogBox(TextBox username, TextBox password, CheckBox terms, Button submit){
        this.username = username;
        this.password = password;
        this.terms = terms;
        this.submit = submit;
        username.attach(this::handleButton);
        password.attach(this::handleButton);
        terms.attach(this::handleButton);
    }

    private void handleButton(UIControl _x){
        if(
            username.getContent() != null && !username.getContent().equals("") &&
            password.getContent() != null && !password.getContent().equals("") &&
            terms.isChecked() &&
            !submit.isEnabled())
        {
            submit.setEnabled(true);
        } else if(submit.isEnabled()){
            submit.setEnabled(false);
        }
    }
}
