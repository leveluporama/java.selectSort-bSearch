
class run{
	public static void main(String args[]){
		selectSort ss = new selectSort();
		ss.enterArr(args);
		ss.sort();
		ss.printArr();
		binSearch bs = new binSearch();
		System.out.println(bs.bSearch(ss.getList(), 'q'));
	}
}
