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

public static void main(String[] args)
{
         EmpWageBuilderObject dMart= new EmpWageBuilderObject("DMart",20,2,10);
         int empHrs=0,totalEmpHrs=0,totalWorkingDays=0;
          while(totalEmpHrs<=dMart.maxHoursPerMonth && totalWorkingDays<dMart.numOfWorkingDays)
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
           int totalEmpWage = totalEmpHrs * dMart.empRatePerHour;
           System.out.println("Total Emp Wage for Company: "+dMart.company+ " is : "+totalEmpWage);


        }
}



public class EmpWageBuilderArray1
{

        public static final int IS_PART_TIME=1;
        public static final int IS_FULL_TIME=2;


        private int numOfCompany=0;
        private CompanyEmpWage[] companyEmpWageArray;


            public EmpWageBuilderArray1()
                     {
                        companyEmpWageArray = new CompanyEmpWage[5];
                     }

                        public void addCompanyEmpWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth)
                        {
                                companyEmpWageArray[numOfCompany]=new CompanyEmpWage(company, empRatePerHour,numOfWorkingDays,maxHoursPerMonth);
                                numOfCompany++;
                        }

                        public void computeEmpWage()
                        {
                           for(int i=0;i<numOfCompany;i++)
                            {
                            companyEmpWageArray[i].setTotalEmpWage(this.computeEmpWage(companyEmpWageArray[i]));
                            System.out.println(companyEmpWageArray[i]);
                            }
                        }

 public int computeEmpWage(CompanyEmpWage companyEmpWage)
                {
                //Variables
                int empHrs=0,totalEmpHrs=0,totalWorkingDays=0;
                //Computation
                while(totalEmpHrs <=companyEmpWage.maxHoursPerMonth && totalWorkingDays <= companyEmpWage.numOfWorkingDays)
                        {
                        totalWorkingDays++;
                        int empCheck=(int)Math.floor(Math.random()*10)%3;
                         switch (empCheck)
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
                          System.out.println("Days: "+totalWorkingDays+" Emp Hr: "+empHrs);
                        }
                           return (totalEmpHrs * companyEmpWage.empRatePerHour);
                   }
               public static void main(String[] args)
                {
                EmpWageBuilderArray1 empWageBuilder = new EmpWageBuilderArray1();
                empWageBuilder.addCompanyEmpWage("DMart",20,2,10);
                empWageBuilder.addCompanyEmpWage("BigBasket",30,2,20);
                empWageBuilder.computeEmpWage();

                }

     }

 public class CompanyEmpWage{
        public final String company;
        public final int empRatePerHour;
        public final int numOfWorkingDays;
        public final int maxHoursPerMonth;
        public int totalEmpWage;
        public CompanyEmpWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth){
         this.company=company;
         this.empRatePerHour=empRatePerHour;
         this.numOfWorkingDays=numOfWorkingDays;
         this.maxHoursPerMonth=maxHoursPerMonth;

        }

        public void setTotalEmpWage(int totalEmpWage){
          this.totalEmpWage=totalEmpWage;
        }

        @Override
        public String toString(){
         return "Total Emp Wage for Company: "+company+" is : "+totalEmpWage;
        }
}




import java.util.*;
public class EmpWageBuilderCollection implements IComputeEmpWage
{

             public static final int IS_PART_TIME=1;
        public static final int IS_FULL_TIME=2;


        private int numOfCompany=0;
        private LinkedList<CompanyEmpWage> companyEmpWageList;
        private Map<String,CompanyEmpWage> companyToEmpWageMap;


                         public EmpWageBuilderCollection()
                     {

                        companyEmpWageList = new LinkedList<CompanyEmpWage>();
                        companyToEmpWageMap = new HashMap<String, CompanyEmpWage>();

                                }

                        public void addCompanyEmpWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth)
                        {
                                CompanyEmpWage companyEmpWage=new CompanyEmpWage(company,empRatePerHour,numOfWorkingDays,maxHoursPerMonth);
                                companyEmpWageList.add(companyEmpWage);
                                companyToEmpWageMap.put(company,companyEmpWage);
                        }

                        public void computeEmpWage()
                        {
                           for(int i=0;i< companyEmpWageList.size();i++)
                            {
                            CompanyEmpWage companyEmpWage=companyEmpWageList.get(i);
                            companyEmpWage.setTotalEmpWage(this.computeEmpWage(companyEmpWage));
                                System.out.println(companyEmpWage);
                            }
                        }

@Override
                public int getTotalWage(String company){
                        return companyToEmpWageMap.get(company).totalEmpWage;
                }

                public int computeEmpWage(CompanyEmpWage companyEmpWage)
                {
                //Variables
                int empHrs=0,totalEmpHrs=0,totalWorkingDays=0;
                //Computation
                while(totalEmpHrs <=companyEmpWage.maxHoursPerMonth && totalWorkingDays <= companyEmpWage.numOfWorkingDays)
                        {
                        totalWorkingDays++;
                        int empCheck=(int)Math.floor(Math.random()*10)%3;
                         switch (empCheck)
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
                          System.out.println("Days: "+totalWorkingDays+" Emp Hr: "+empHrs);
                        }
                           return (totalEmpHrs * 20);
                   }
               public static void main(String[] args)
                {
                IComputeEmpWage empWageBuilderCollection=new EmpWageBuilderCollection();
                empWageBuilderCollection.addCompanyEmpWage("DMart",20,2,10);
                empWageBuilderCollection.addCompanyEmpWage("Reliance",10,4,20);
                empWageBuilderCollection.computeEmpWage();
                System.out.println("Total wage for DMart company: "+empWageBuilderCollection.getTotalWage("DMart"));


                }

     }
  public interface IComputeEmpWage{
                public void addCompanyEmpWage(String company,int empRatePerHour, int numOfWorkingDays, int maxhoursPerMonth);
                public void computeEmpWage();
                public int getTotalWage(String company);
   }

        public class CompanyEmpWage{
        public final String company;
        public final int empRatePerHour;
        public final int numOfWorkingDays;
        public final int maxHoursPerMonth;
        public int totalEmpWage;
        public CompanyEmpWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth){
         this.company=company;
         this.empRatePerHour=empRatePerHour;
         this.numOfWorkingDays=numOfWorkingDays;
         this.maxHoursPerMonth=maxHoursPerMonth;
         totalEmpWage=0;
        }

        public void setTotalEmpWage(int totalEmpWage){
          this.totalEmpWage=totalEmpWage;
        }

        @Override
        public String toString(){
         return "Total Emp Wage for Company: "+company+" is : "+totalEmpWage;
        }
}




















