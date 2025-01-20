package ja0115;

public class Ja0115_08 {

	public static void main(String[] args) {
		//1~10까지 랜덤숫자를 입력받아 동일한 번호가 없도록 저장하시오.
	    int[] num = new int[10];
	    int i = 0;
	    int cnt = 0;
	    int temp = 0;
//	    loop:while(i<10) {
//	    	int ranNum = (int)(Math.random()*10)+1;
//	    	for(int j=0;j<i;j++) {
//	    		if (num[j]==ranNum) {
//	    			System.out.println("중복 숫자가 있습니다."+ranNum);
//	    			continue loop;
//	    		}
//	    	}
//	    	num[i]=ranNum;
//	    	i++;
//	    }
	    
	    for(i=0;i<10;i++) {
	    	num[i]=i+1;
	    }
	    for(cnt=0;cnt<300;cnt++) {
	    	int ranNum = (int)(Math.random()*9)+1;
	    	temp = num[0];
	    	num[0] = num[ranNum];
	    	num[ranNum] = temp;
	    }
	    
	    
	    
	    for(i=0;i<num.length;i++) {
	    	System.out.print(num[i]+" ");    	
	    }
	}

	
	
	
	
	
	
	
}
