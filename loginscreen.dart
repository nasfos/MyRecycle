import 'package:flutter/material.dart';
import 'package:shared_preferences/shared_preferences.dart';
import 'package:toast/toast.dart';
import 'package:flutter/services.dart';

bool isChecked = true;
final TextEditingController emcontroller = TextEditingController();
final TextEditingController passcontroller = TextEditingController();
String email = '';
String password = '';
FocusNode myFocusNode = new FocusNode();

void main() => runApp(MyApp());

class MyApp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      home: LoginPage(),
    );
  }
}

class LoginPage extends StatefulWidget {
  @override
  _LoginPageState createState() => _LoginPageState();
}

class _LoginPageState extends State<LoginPage> {
  @override
  Widget build(BuildContext context) {
    return new Scaffold(
      backgroundColor: Color.fromRGBO(8, 3, 20, 1),
      resizeToAvoidBottomPadding: false,
      body: new Container(
        padding: EdgeInsets.all(30),
        child: Column(
          mainAxisAlignment: MainAxisAlignment.center,
          children: <Widget>[
            Image.asset(
              'assets/images/logo.png',
              scale: 1.7,
            ),
            TextField(
                controller: emcontroller,
                style: TextStyle(color: Colors.white),
                keyboardType: TextInputType.emailAddress,
                focusNode: myFocusNode,
                decoration: InputDecoration(
                    labelText: 'Email',
                    icon: Icon(Icons.email),
                    labelStyle: TextStyle(
                        color: myFocusNode.hasFocus
                            ? Colors.blue
                            : Color.fromRGBO(162, 199, 131, 0.5)))),
            TextField(
              controller: passcontroller,
              style: TextStyle(color: Colors.white),
              //focusNode: myFocusNode,
              decoration: InputDecoration(
                  labelText: 'Password',
                  icon: Icon(Icons.lock),
                  labelStyle: TextStyle(
                      color: myFocusNode.hasFocus
                          ? Colors.blue
                          : Color.fromRGBO(162, 199, 131, 0.5))),
              obscureText: true,
            ),
            Row(
              children: <Widget>[
                Checkbox(
                  value: isChecked,
                  onChanged: (bool value) {
                    onChange(value);
                  },
                ),
                Text('Remember Me',
                    style: TextStyle(
                        fontSize: 16,
                        color: Color.fromRGBO(162, 199, 131, 0.5)))
              ],
            ),
            SizedBox(height: 10),
            MaterialButton(
              shape: RoundedRectangleBorder(
                  borderRadius: BorderRadius.circular(25)),
              minWidth: 200,
              height: 50,
              child: Text('LOGIN', style: TextStyle(fontSize: 14)),
              color: Color.fromRGBO(162, 199, 131, 0.5),
              textColor: Color.fromRGBO(41, 74, 13, 1),
              elevation: 15,
              onPressed: onPress,
            ),
            SizedBox(
              height: 20,
            ),
            GestureDetector(
                onTap: _onRegister,
                child: Text('Register New Account',
                    style: TextStyle(fontSize: 16))),
            SizedBox(
              height: 10,
            ),
            GestureDetector(
                onTap: _onForgot,
                child: Text('Forgot Account', style: TextStyle(fontSize: 16))),
          ],
        ),
      ),
    );
  }

  void onPress() {
    print(emcontroller.text);
    print(passcontroller.text);
  }

  void onChange(bool value) {
    setState(() {
      isChecked = value;
      savepref(value);
    });
  }

  void _onRegister() {
    print('onRegister');
  }

  void _onForgot() {
    print('Forgot');
  }

  Future savepref(bool value) async {
    print('Inside savepref');
    email = emcontroller.text;
    password = passcontroller.text;
    SharedPreferences prefs = await SharedPreferences.getInstance();
    if (value) {
      //true save pref
      if (_isEmailValid(email) && (password.length > 5)) {
        await prefs.setString('email', email);
        await prefs.setString('pass', password);
        print('Save pref $email');
        print('Save pref $password');
        Toast.show("Preferences have been saved", context,
            duration: Toast.LENGTH_SHORT, gravity: Toast.BOTTOM);
      } else {
        print('No email');
        setState(() {
          isChecked = false;
        });
        Toast.show("Check your credentials", context,
            duration: Toast.LENGTH_SHORT, gravity: Toast.BOTTOM);
      }
    } else {
      await prefs.setString('email', '');
      await prefs.setString('pass', '');
      setState(() {
        emcontroller.text = '';
        passcontroller.text = '';
        isChecked = false;
      });
      print('Remove pref');
      Toast.show("Preferences have been removed", context,
          duration: Toast.LENGTH_SHORT, gravity: Toast.BOTTOM);
    }
  }

  bool _isEmailValid(String email) {
    return RegExp(r"^[a-zA-Z0-9.]+@[a-zA-Z0-9]+\.[a-zA-Z]+").hasMatch(email);
  }
}
