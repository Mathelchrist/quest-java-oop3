public class Eagle extends Bird implements Fly{

    private boolean flying;
    private int altitude;

    public Eagle(String name) {
        super(name);
        this.flying = false;
        this.altitude = 0;
    }

    public int getAltitude() {
        return altitude;
    }

    public boolean isFlying() {
        return flying;
    }

    @Override
    public String sing() {
        return "Screech!";
    }

	@Override
	public void takeOff() {
		System.out.println(this.getName() +" takes off in the sky.");
	}

	@Override
	public int ascend(int hauteur) {
		
			this.setAltitude(hauteur+this.getAltitude());
			System.out.println(this.getName() +" flies upward, altitude : " +this.getAltitude());
		
		return 0;
	}

	@Override
	public void glide() {
		System.out.println("It glides into the air.");
		
	}

	@Override
	public int descend(int hauteur) {
		this.setAltitude(this.getAltitude()-hauteur);
		System.out.println(this.getName() +" flies downward, altitude : " +this.getAltitude());
	
			return 0;
	}

	@Override
	public void land() {
		if(this.getAltitude() > 1) {
			System.out.println(this.getName() +" is too high, it can't lands.");
		}else {
			System.out.println(this.getName() +" lands on th ground.");

		}
	}

	public void setFlying(boolean flying) {
		this.flying = flying;
	}

	public void setAltitude(int altitude) {
		this.altitude = altitude;
	}
	
}
