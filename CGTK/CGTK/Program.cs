using System;
using Gtk;

namespace CGTK
{
	class MainClass
	{
		public static void Main (string[] args)
		{
			Application.Init ();
			MainWindow mainWindow = new MainWindow (); //OBJETO/INSTANCIA DE CLASE
			mainWindow.Show ();
			Application.Run ();
		}
	}
}

//Variable tip referencia //MainWindow tipoVariablereferenteaobjeto = new Mainwindow();
//Variable tipo valor //int x = 7
//CAMBIAR VARIABLES CON BOTÓN DERECHO REFACTORIZAR -> CAMBIAR NOMBRE
