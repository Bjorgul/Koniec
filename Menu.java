import java.util.Random;

public class Menu {

	static void room_Start1() {
		System.out.println("Witaj w grze \"Koniec\".");
		System.out.println(Var.row);
		Menu.room_Start2();
	}

	static void room_Start2() {

		System.out.println(Var.row);
		System.out.println("By rozpocz¹æ grê wpisz - start");
		System.out.println("By wyjœ z gry wpisz - koniec");
		System.out.println("By przeczytaæ o twórcach gry wpisz - autor");
		System.out.println(Var.row);

		Var.choice = Var.scanner.nextLine();

		if (Var.choice.equals("autor")) {
			System.out.println(Var.row);
			System.out.println("Grê paragrafow¹ \"Koniec\" stworzy³ Dominik Matusiak.");
			System.out.println("Grê na formê z której w³aœnie korzystasz przerobi³ Bart³omiej Szczêœniak.");
			System.out.println(Var.row);
		}
		if (Var.choice.equals("koniec")) {
			System.out.println(Var.row);
			System.out.println("Dziêkujê za grê :)");
			System.out.println(Var.row);
			System.exit(0);
		}
		if (Var.choice.equals("start")) {
			Var.event1 = false;
			Var.event2 = false;
			Var.event3 = false;
			Var.event4 = false;
			Var.event5 = false;
			Var.event6 = false;
			Var.event7 = false;
			Menu.room_Start3();
		} else {
			Menu.room_Start2();
		}

	}

	static void room_Start3() {
		System.out.println(Var.row);
		System.out.println("Wybierz postaæ i kieruj jej losami:");
		System.out.println(
				"\nAnna - mniejsza si³a i wydolnoœæ fizyczna. Jako dziecko tonê³a w jeziorze, przez co ma hydrofobiê. Trzyma w domu psa Falkona.");
		System.out.println(
				"\nPawe³ - od urodzenia nieco trzês¹ siê mu rêce. Umiarkowana si³a i wydolnoœæ fizyczna. Lubi podgl¹daæ s¹siadkê.");
		System.out.println("Jego pupilem w domu jest czarny kot Obama.");
		System.out.println("\nWpisz anna lub pawel by wybraæ postaæ.");
		System.out.println(Var.row);
		Var.choice = Var.scanner.nextLine();
		if (Var.choice.equals("anna")) {
			Menu.room_Start4();
		}
		if (Var.choice.equals("pawel")) {
			Var.event3 = true;
			Menu.room_Start4();
		} else {
			Menu.room_Start3();
		}
	}

	static void room_Start4() {
		System.out.println(Var.row);
		System.out.println("ROK 2013, MIASTO P");
		System.out.println(Var.row);
		System.out.println("Masz 33 lata. Mieszkach w P od urodzenia. ");
		if (Var.event3 == true) {
			System.out.print("Skoñczy³eœ ");
		}
		if (Var.event3 == false) {
			System.out.print("Skoñczy³aœ ");
		}
		System.out.print("tutaj studia ");
		System.out.println("(z wyró¿nieniem) i ");
		if (Var.event3 == true) {
			System.out.print("podje³eœ ");
		}
		if (Var.event3 == false) {
			System.out.print("podje³aœ ");
		}
		System.out.println("zdaln¹ pracê jako architekt. Projektujesz budynki");
		System.out.println("u¿ytecznoœci publicznej. Twoim aktualnym przedsiêwziêciem jest plan nowego szpitala ");
		System.out.println("wojskowego. Bêdzie to du¿y obiekt o wiêkszych mo¿liwoœciach ni¿ zapotrzebowanie.");
		System.out.println("Twoi rodzice zginêli w wypadku drogowym. Z pêdz¹cym autokarem samochód ");
		System.out.println("osobowy nie ma du¿ych szans. Szczególnie, gdy kierowca pozbawiony zmiennika");
		System.out.println("zasypia za kierownic¹. Jedyn¹ rodzin¹ pozostaje brat matki i pupil domowy. W wolnym");
		System.out.println("czasie rozwi¹zujesz krzy¿ówki i czytasz ksi¹¿ki.");
		System.out.println(Var.row);
		System.out.println("Jest wieczór. Siedzisz sobie przed komputerem i dopracowujesz szczegó³y izolatek");
		System.out.println("dla nowo projektowanego szpitala. S³yszysz wielki ha³as za oknem. Wygl¹dasz i widzisz");
		System.out.println("wypadek samochodowy. Rozwalony pojazd o œwiat³a sygnalizacyjne, œlady hamowania");
		System.out.println("i potr¹conego pieszego.");
		if (Var.event3 == true) {
			Room.room2();
		}
		if (Var.event3 == false) {
			Room.room1();
		}

	}

	static void death() {
		Random random = new Random();
		Var.luck = random.nextInt(8);
		if (Var.luck == 0) {
			System.out.println("\n\nKoniec ¿ycia i szans na przysz³oœæ. Spróbuj jeszcze raz.");
		}
		if (Var.luck == 1) {
			System.out.println("\n\nSpróbuj jeszcze raz cz³owieku! Zombie czekaj¹.");
		}
		if (Var.luck == 2) {
			System.out.println("\n\nKoniec zabawy. Mo¿e spróbujesz jeszcze raz? Mia³eœ pecha.");
		}
		if (Var.luck == 3) {
			System.out.println("\n\nMo¿e nastêpnym razem lepiej skoñczysz. Nie poddawaj siê. Próbuj dalej.");
		}
		if (Var.luck == 4) {
			System.out.println("\n\nNie ka¿demu dane jest przetrwaæ. Tobie siê nie uda³o. Mo¿e innym razem.");
		}
		if (Var.luck == 5) {
			System.out.println("\n\nMo¿e nastêpnym razem lepiej skoñczysz. Nie poddawaj siê.");
		}
		if (Var.luck == 6) {
			System.out.println("\n\nMo¿e nastêpnym razem uda Ci siê do¿yæ staroœci. Nie zniechêcaj siê.");
		}
		if (Var.luck == 7) {
			System.out.println("\n\nMo¿e nastêpnym razem uda Ci siê prze¿yæ. Nie poddawaj siê.");
		}
		Menu.room_Start2();

	}

	static void win() {
		System.out.println("\n\nJest to jedno z mo¿liwych zakoñczeñ. Zagraj jeszcze raz, jeœli chcesz poznaæ inne.");
		Menu.room_Start2();
	}

}
