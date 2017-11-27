using System;
using Gtk;

//CLASE
public partial class MainWindow: Gtk.Window
{
	//CONSTRUCTOR
	public MainWindow () : base (Gtk.WindowType.Toplevel)
	{
		Build ();
//		for (int i = 0; i < 10; i++) {
//			Button button = new Button ();
//			button.Label = "Botón " + i;
//			button.Visible = true;
//			vbox1.Add (button);
//		}
//		labelSaludo.Text = "Holaaaaa";

		buttonAceptar.Clicked += delegate {
//			Button button = new Button();
//			button.Label = "Botón creado";
//			button.Visible = true;
//			vbox1.Add(button);
			labelSaludo.Text = "Hola " + entry1.Text;

		};
	}

	protected void OnDeleteEvent (object sender, DeleteEventArgs a)
	{
		Application.Quit ();
		a.RetVal = true;
	}
}

//VARIABLES
//Clase variable
//VBox vbox1
//HBox hbox1
//Label label1
//Entry entryNombre
//Button buttonAceptar
//Label labelSaludo
