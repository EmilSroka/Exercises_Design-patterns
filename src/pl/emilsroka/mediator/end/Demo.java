package pl.emilsroka.mediator.end;

public class Demo {
    public static void main(String[] args){
        var username = new TextBox();
        var password = new TextBox();
        var terms = new CheckBox();
        var submit = new Button();

        var dialogBox = new SignUpDialogBox(username, password, terms, submit);

        username.setContent("admin");
        password.setContent("1234");
        terms.setChecked(true);

        terms.setChecked(false);

        terms.setChecked(true);

        password.setContent("");
    }
}
