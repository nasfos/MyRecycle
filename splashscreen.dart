import 'package:flutter/material.dart';
import 'loginscreen.dart';

void main() => runApp(MySplash());

class MySplash extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      color: Color.fromRGBO(161, 219, 123,1),
      debugShowCheckedModeBanner: false,
      home: Scaffold(
        backgroundColor: Color.fromRGBO(8, 3, 20, 1),
        body: Center(
          child: Column(
            mainAxisAlignment: MainAxisAlignment.center,
            children: <Widget>[
              Image.asset(
                'assets/images/logo.png',
                scale: 2,
              ),
              SizedBox(
                height: 20,
              ),
              new ProgressIndicator(),
            ],
          ),
        ),
      ),
    );
  }
}

class ProgressIndicator extends StatefulWidget {
  @override
  _ProgressIndicatorState createState() =>
      _ProgressIndicatorState();
}

class _ProgressIndicatorState
    extends State<ProgressIndicator>
    with SingleTickerProviderStateMixin {
  AnimationController controller;
  Animation<double> animation;

  @override
  void initState() {
    super.initState();
    controller = AnimationController(
        duration: const Duration(milliseconds: 2000), vsync: this);
    animation = Tween(begin: 0.0, end: 1.0).animate(controller)
      ..addListener(() {
        setState(() {
          if (animation.value > 0.99) {
            //print('Sucess Login');
            Navigator.pushReplacement(
                context,
                MaterialPageRoute(
                    builder: (BuildContext context) => LoginPage()));
          }
        });
      });
    controller.repeat();
  }

  @override
  void dispose() {
    controller.stop();
    super.dispose();
  }

  @override
  Widget build(BuildContext context) {
    return new Center(
      
        child: new Container(
      width: 20,
      height: 20,
      color: Colors.transparent,
      child: CircularProgressIndicator(
        value: animation.value,
        backgroundColor: Colors.transparent,
        valueColor:
            new AlwaysStoppedAnimation<Color>(Color.fromRGBO(161, 219, 123,1)),
      ),
    ));
  }

}
