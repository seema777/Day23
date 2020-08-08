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








