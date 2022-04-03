// Lab_5_2 add time

class Timedemo
{
	int hour;
	int minutes;
	int seconds;

	public Timedemo(int hour,int minutes,int seconds)
	{
		this.hour = hour;
		this.minutes = minutes;
		this.seconds = seconds;
	}

	void add(Timedemo t)
	{
		this.seconds += t.seconds;
		if(this.seconds>=60)
		{
			this.minutes++;
			this.seconds -= 60;
		}
		this.minutes += t.minutes;
		if(this.minutes>=60)
		{
			this.hour++;
			this.minutes -= 60;
		}
		this.hour += t.hour;
	}
}

public class Time_5_2{
	public static void main(String args[]){
		Timedemo t1 = new Timedemo(23,59,59);
		Timedemo t2 = new Timedemo(23,59,59);


		t1.add(t2);

		System.out.println(t1.hour+":"+t1.minutes+":"+t1.seconds);
	}
}