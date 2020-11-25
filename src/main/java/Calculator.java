public class    Calculator {
    public int sum(int a,int b){
        return (a+b) ;
    }
    public int minus(int a, int b) {
        return a - b;
    }
    public int divide(int a, int b) {
        return a / b;
    }
    public int multiply(int a, int b) {
        return a * b;
    }
    public int min(int a,int b){
        if( a<b)
        {return a;}
       else
           return b;
    }
    public int max(int a,int b) {
        if( a>b)
        {return a;}
        else
            return b;
    }
    // public int max(int a> int b) ? a : b ;
    /*public int minElement(int[] list){
        arrays.sort(list);
        {return list[0];}
    }
    public int maxElement(int[] list){
        arrays.sort(list);
        {return list[length-1];}
    }*/
    public int minElement(int[] list){
            int mine=list[0];
            for (int i=0;i< list.length;i++) {
                if(list[i]<mine)
                { mine=list[i];}
            }
        return mine;
    }
    public int maxElement(int[] list){
        int maxe=list[0];
        for (int i=0;i< list.length;i++) {
            if(list[i]>maxe)
            { maxe=list[i];}
        }
        return maxe;
    }

}