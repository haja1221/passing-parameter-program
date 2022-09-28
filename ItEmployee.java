class ItEmployee{
        String name;
        int age;
        int empid; 
        void morningWork(int Startingtime,boolean workdone,final int empid){
           System.out.println("Start time ="+Startingtime+"\nfinished work or not "+workdone+"\nempid="+empid);       
        }

       
        double afternoonWork(double closingtime){
        return closingtime;
        }



        public static void main(String[]args){
        ItEmployee haja=new ItEmployee();
        haja.name="Boss haja";
        haja.age=18;
        haja.morningWork(9,false,2345);
        System.out.println(4.30);
        } 



}

