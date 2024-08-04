class Wrap
{
	public static void sendGift(String name, double price, String date,
	boolean urgent )
	{
		Transport.assign(name,price,date,urgent);
	}
}

