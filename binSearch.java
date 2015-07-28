import java.util.ArrayList;
class binSearch{
	
	public int bSearch(ArrayList<Character> arr, char key){
		int m = 0;			// Средний индекс
		int ub = arr.size();// Верхняя граница массива
		int lb = 0;         // Нижняя граница массива
		while (true){
			m = (lb+ub)/ 2;
			if (key < arr.get(m)){
				ub = m-1;
			} else if (key > arr.get(m)){
				lb = m+1;
			} else return m;
			if (lb>ub) {
				return -1;
			}
		}
	}
}
