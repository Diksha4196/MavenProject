from flask import Flask, render_template
app=Flask(__name__,template_folder="../template")
@app.route("/")
def greet():
    return render_template("homepage.html")

@app.route("/f")
def wel():
    return render_template("flogin.html")
app.run(debug=True)