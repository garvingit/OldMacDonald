
void setup()
{
	Cow mo = new cow();
	//your variable declarations here
	Animal[] herd = new Animal[2];
	Animal[0] = mo;
	System.out.println(Animal[0].getType() + "goes " + Animal[0].getsSound());


}

