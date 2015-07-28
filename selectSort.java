import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
class selectSort{

	private  ArrayList<Character> arr=new ArrayList<Character>(); //Массив символов

	public ArrayList<Character> getList(){
		return this.arr;
	}
	public void enterArr(String args[]){

		if (args.length>=1){ //Если есть входные параметры, то берем массив из параметров
			for (int i=0; i<args.length;i++){
				this.arr.add(args[i].charAt(0)); //Первый элемент строки параметра становится элементом массива	
			}
		}
		else { //Если параметров нет, тогда вводим массив руками
			System.out.println("Введите массив символов, символ ! - конец массива");
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			char ch =' ';
			String s="";

			while (ch !='!'){
					try{
					s = reader.readLine();
					ch = s.charAt(0);
					this.arr.add(ch);	
					}
					catch(IOException e){
 					e.printStackTrace();
					}
				
				}
			}
			
		}

	public void printArr(){
		for(char ch:this.arr){
			System.out.println(ch);
		}
	}

	
	public ArrayList<Character> sort(){
		int k=0; //Индекс минимального элемента
		for (int i=0; i<this.arr.size(); i++){
			k = i;
			for (int j=i+1; j<this.arr.size(); j++){
				if(this.arr.get(k)>this.arr.get(j)){
					k = j;
				}
				swap(i,k);
			}
		}
		return this.arr;
	}
	public void swap(int i, int k){
		char temp = this.arr.get(i);
		this.arr.set(i,this.arr.get(k));
		this.arr.set(k,temp);

	}

}
