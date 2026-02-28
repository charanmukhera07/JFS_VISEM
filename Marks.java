public class SieveofEratosthenes{
    public static void main(String args[]){
	int start=10,end=50;
	boolean status[]=new boolean[end+1];
	for(int i=0;i<=end;i++){
	    status[i]=true;
	}
	for(int i=0;i<=status.length;i++){
	    if(status[i]==true){
		for(int j=i*i;j<Math.sqrt(i);j+=i){
		    status[i]=false;
		}
	    }
	}
	for(int i=0;i<status.length;i++){
	    if(status[i]==true){
		System.out.println(i);
	    }
	}
    }
}