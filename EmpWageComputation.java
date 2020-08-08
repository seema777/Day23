public class EmpWageComputation
{
	public static void main(String[] args)
	{
		System.out.println("Welcome to Employee Wage Computation Program on Master Branch");
	}
}



public class EmpwageBuilder
{
        public static void main(String[] args)
        {
                int IS_FULL_TIME=1;
                double empcheck=Math.floor(Math.random()*10)%2;
                if(empcheck == IS_FULL_TIME)
                        {
                                System.out.println("Employee is Persent");
                        }
                        else
                                System.out.println("Employee is Absent");
        }
}



public class EmpwageBuilder
{
        public static void main(String[] args)
        {
                 final int IS_FULL_TIME=1;
                 final int EMP_RATE_PER_HOUR=20;
                int empHrs=0;
                int empWage=0;
                        double empcheck=Math.floor(Math.random()*10)%2;
                        if(empcheck == IS_FULL_TIME)
                        {
                                empHrs=8;
                        }
                        else
                                {
                                empHrs=0;
                                }
                                empWage=empHrs*EMP_RATE_PER_HOUR;
                                System.out.println("Employee Wage "+empWage);
        }
}






public class EmpwageBuilder
{
        public static void main(String[] args)
        {
                 final int IS_FULL_TIME=1;
                 final int IS_PART_TIME=2;
                 final int EMP_RATE_PER_HOUR=20;
                int empHrs=0;
                int empWage=0;
                        double empcheck=Math.floor(Math.random()*10)%3;
                        if(empcheck == IS_FULL_TIME)
                        {
                                empHrs=8;
                        }
                        else if(empcheck == IS_PART_TIME)
                                {
                                empHrs=4;
                                }
                                else
                                {
                                empHrs=0;
                                }
                                empWage=empHrs*EMP_RATE_PER_HOUR;
                                System.out.println("Employee Wage "+empWage);
        }
}



public class EmpwageBuilder
{
        public static void main(String[] args)
        {
                 final int IS_FULL_TIME=1;
                 final int IS_PART_TIME=2;

                 final int EMP_RATE_PER_HOUR=20;
                int empHrs=0;
                int empWage=0;
                        double empcheck=Math.floor(Math.random()*10)%3;
                        switch((int)empcheck)
                        {
                        case IS_PART_TIME:
                                empHrs=4;
                                 break;
                        case IS_FULL_TIME:
                                empHrs=8;
                                break;
                         default:
                                empHrs=0;

                                }
                                empWage=empHrs*EMP_RATE_PER_HOUR;
                                System.out.println("Employee Wage "+empWage);
        }
}



public class EmpwageBuilder
{
                public static final int IS_FULL_TIME=1;
                public static final int IS_PART_TIME=2;
                public static final int EMP_RATE_PER_HOUR=20;
                public static final int NUM_OF_WORKING_DAYS=2;
        public static void main(String[] args)
        {
                int empHrs=0;
                int empWage=0;
                int totalEmpwage=0;
                for(int day=1;day<= NUM_OF_WORKING_DAYS;day++)
                {
                        double empcheck=Math.floor(Math.random()*10)%3;
                        switch((int)empcheck)
                        {
                        case IS_PART_TIME:
                                empHrs=4;
                                 break;
                        case IS_FULL_TIME:
                                empHrs=8;
                                break;
                         default:
                                empHrs=0;

                                }
                                empWage=empHrs*EMP_RATE_PER_HOUR;
                                totalEmpwage+=empWage;
                                System.out.println("Emp Wage on day "+day+" is  : "+empWage);
                                }
                                System.out.println("Employee wage"+totalEmpwage);
        }
}



public class EmpwageBuilderUC5
{
                public static final int IS_PART_TIME=1;
                public static final int IS_FULL_TIME=2;
                public static final int EMP_RATE_PER_HOUR=20;
                public static final int NUM_OF_WORKING_DAYS=2;
                public static final int MAX_HRS_IN_MONTH=10;
        public static void main(String[] args)
        {
                int empHrs=0,totalEmpHrs=0;
                int empWage=0,totalEmpWage=0,totalworkingDays=0;
                while(totalEmpHrs<=MAX_HRS_IN_MONTH && totalworkingDays<NUM_OF_WORKING_DAYS){
                        totalworkingDays++;
                        double empcheck=Math.floor(Math.random()*10)%3;
                        switch((int)empcheck)
                        {
                        case IS_PART_TIME:
                                empHrs=4;
                                 break;
                        case IS_FULL_TIME:
                                empHrs=8;
                                break;
                         default:
                                empHrs=0;

                                }
                                empWage=empHrs*EMP_RATE_PER_HOUR;
                                totalEmpWage+=empWage;
                                System.out.println("Emp Wage is : "+empWage);
                                }
                                System.out.println("Employee wage "+totalEmpWage);
        }
}



public class EmpWageBuilderObject
{
        public static final int IS_PART_TIME=1;
        public static final int IS_FULL_TIME=2;

        private final int empRatePerHour;
        private final String company;
        private final int numOfWorkingDays;
        private final int maxHoursPerMonth;
        public EmpWageBuilderObject(String company,int empRatePerHour,int numOfWorkingDays,int maxHoursPerMonth)
         {
                this.company=company;
                this.empRatePerHour=empRatePerHour;
                this.numOfWorkingDays=numOfWorkingDays;
                this.maxHoursPerMonth=maxHoursPerMonth;
        }

        private int computeEmpWage(){
        int empHrs=0,totalEmpHrs=0,totalWorkingDays=0;
        while(totalEmpHrs <= maxHoursPerMonth && totalWorkingDays < numOfWorkingDays)
                {
                totalWorkingDays++;
                double empCheck=Math.floor(Math.random()*10)%3;
                switch((int)empCheck)
                 {
                case IS_PART_TIME:
                         empHrs=4;
                         break;
                case IS_FULL_TIME:
                        empHrs=8;

                         break;
                default:
                        empHrs=0;
                }
               totalEmpHrs+=empHrs;
               System.out.println("Day #: "+ totalWorkingDays + " Emp hr : "+empHrs);
            }
             return totalEmpHrs * empRatePerHour;
        }
        public static void main(String[] args)
        {
         EmpWageBuilderObject dMart= new EmpWageBuilderObject("DMart",20,2,10);
         EmpWageBuilderObject bigBasket= new EmpWageBuilderObject("BigBasket",30,3,15);
         System.out.println("Total Emp Wage for company "+dMart.company+" is: "+dMart.computeEmpWage());
         System.out.println("Total Emp Wage for company "+bigBasket.company+" is: "+bigBasket.computeEmpWage());
        }
}



public class EmpWageBuilderMultiCompany
{
        public static final int IS_PART_TIME=1;
        public static final int IS_FULL_TIME=2;
     public static int computeEmpWage(String company, int empRatePerHour,int numOfWorkingDays,int maxHoursPerMonth)
      {
        int empHrs=0,totalEmpHrs=0,totalWorkingDays=0;

         while(totalEmpHrs<=maxHoursPerMonth && totalWorkingDays<numOfWorkingDays)
                {
                totalWorkingDays++;
                double empCheck=Math.floor(Math.random()*10)%3;
                switch((int)empCheck)
                 {
                case IS_PART_TIME:
                         empHrs=4;
                         break;
                case IS_FULL_TIME:
                        empHrs=8;
                        break;
                default:
                        empHrs=0;
                }
               totalEmpHrs+=empHrs;
               System.out.println("Day #: "+ totalWorkingDays + "Emp hr : "+empHrs);
               System.out.println("Day #: "+ totalWorkingDays + "Emp hr : "+empHrs);
              }
           int totalEmpWage = totalEmpHrs*empRatePerHour;
           System.out.println("Total Emp Wage for Company: "+company+ "is : "+totalEmpWage);
           return totalEmpWage;
       }

        public static void main(String[] args)
        {
         computeEmpWage("DMart",20,2,10);
         computeEmpWage("Reliance",10,4,20);
        }
}














