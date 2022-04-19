public class MagicNum {
	public static void main(String[] args) {

		int myNumber = 400;
// myNum = original number
    int magicNumber= myNumber * myNumber;

    magicNumber = magicNumber + myNumber;

    magicNumber = magicNumber/myNumber;

    magicNumber = magicNumber + 17;

    magicNumber = magicNumber - myNumber;

    magicNumber = magicNumber / 6;

    System.out.println(magicNumber);

	}
}