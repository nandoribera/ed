using System;

namespace CVector
{
	public class Vector
	{
		public static void Sort(int[] v) {
//			int n = v.Length;
//			for (int positionIndex = 0; positionIndex < n - 1; positionIndex++) {
//				int indexMin = positionIndex;
//				for (int index = indexMin + 1; index < n; index++)
//					if (v [index] < v [indexMin])
//						indexMin = index;
//				int aux = v [positionIndex];
//				v [positionIndex] = v [indexMin];
//				v [indexMin] = aux;
//			}

						int n = v.Length;
						for (int positionIndex = 0; positionIndex < n - 1; positionIndex++) {
							int indexMin = IndexMin (v, positionIndex);
							Swap (v, positionIndex, indexMin);
						}

//			for (int positionIndex = 0; positionIndex < v.Length - 1; positionIndex++)
//				Swap (v, positionIndex, IndexMin(v, positionIndex));

		}

/// <summary>
/// Obtiene el índice del elemento con el valor mínimo.
/// </summary>
/// <returns>El índice del mínimo.</returns>
/// <param name="v">v vector recorrido</param>
/// <param name="initialIndex">Index donde se inicia el recorrido. Si está fuera de rango se lanzará un IndexOutOfRangeException</param>
		public static int IndexMin(int[] v, int initialIndex) {

			if (initialIndex >= v.Length)
				throw new IndexOutOfRangeException ();
			int indexMin = initialIndex;
			for (int index = initialIndex + 1; index < v.Length; index++)
				if (v [index] < v [indexMin])
					indexMin = index;
			return indexMin;
		}

/// <summary>
/// Intercambia en el vector los elementos index y otherIndex 
/// </summary>
/// <param name="v">v vector a modificar</param>
/// <param name="index">El índice de un elemento.</param>
/// <param name="otherIndex">Otro índice.</param>
		public static void Swap(int[] v, int index, int otherIndex) {
			int aux = v [index];
			v [index] = v [otherIndex];
			v [otherIndex] = aux;
		}
	}
}