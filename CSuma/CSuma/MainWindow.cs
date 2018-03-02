using System;
using Gtk;

public partial class MainWindow: Gtk.Window
{
	public MainWindow () : base (Gtk.WindowType.Toplevel)
	{
		Build ();

		buttonSuma.Clicked += delegate {
			int numero1 = int.Parse(num1.Text);
			int numero2 = int.Parse(num2.Text);
			int resultado = numero1 + numero2;
			resultadoop.Text = resultado.ToString();
			//Button button = new Button ();
			//button.Visible = true;
			//double resultado = double.Parse (num1.Text) + double.Parse (num2.Text);
			//resultadoop.Text = resultado.ToString ();
		};

		buttonresta.Clicked += delegate {
			Button button2 = new Button ();
			button2.Visible = true;
			double resultado1 = double.Parse (num1.Text) - double.Parse (num2.Text);
			resultadoop.Text = resultado1.ToString ();
		};

		buttonmultiplicacion.Clicked += delegate {
			Button button3 = new Button ();
			button3.Visible = true;
			double resultado3 = double.Parse (num1.Text) * double.Parse (num2.Text);
			resultadoop.Text = resultado3.ToString ();

		};
	}
			protected void OnDeleteEvent (object sender, DeleteEventArgs a)
			{
				Application.Quit ();
				a.RetVal = true;
			}
		}
			
//PASAR INT A STRING
// int val; val.toString()

//CONVERT._ (CONVERTIR TIPOS)

//OPERADORES
//"/" div entera div con decimales
// 7 / 3 = 2
// "%" div.rest (modulo)
// 7 % 3 = 1

//mostrar por consola los números de 10 en 10 hasta 90.
// mas de una manera
// un ciclo for
// mas de un ciclo (for dentro otro for)
