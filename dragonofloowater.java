import java.util.*;

public class dragonofloowater
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);      
        int headNum=0;
        int knightNum=0;
        int gold=0;
        boolean check=true;    
        ArrayList<Integer> headList = new ArrayList(); 
        ArrayList<Integer> knightList = new ArrayList();         
        
        while(true){         
            gold=0;
            check =true;
            headList.clear();
            knightList.clear();            
            headNum = scanner.nextInt();
            knightNum = scanner.nextInt();
            
            if(headNum ==0 && knightNum==0){
                break;
            }
           
            for(int i=0; i<headNum; i++){
                headList.add(scanner.nextInt());
            }
            
            for(int i=0; i<knightNum; i++){
                knightList.add(scanner.nextInt());
            }
            
            Collections.sort(headList);
            Collections.sort(knightList);
            
            if(headNum> knightNum){
                System.out.println("Loowater is doomed!");
                check=false;
            }
            else if(check){
                int knightPointer =0;
                for(int j=0; j<headNum; j++){
                    
                    while(true){
                        
                        if(knightPointer == knightNum){
                            System.out.println("Loowater is doomed!");
                            gold=0;
                            j=headNum;
                            break;
                        }
                        
                        if(headList.get(j)<= knightList.get(knightPointer)){
                            gold += knightList.get(knightPointer);
                            knightPointer++;
                            break;
                        }
                        knightPointer++;
                    }
    
                }
                
            }
            
            if(gold>0)
            System.out.println(gold);
                        
        } 
    }
}