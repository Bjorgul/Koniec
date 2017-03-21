import java.util.Random;

public class Menu {

	static void room_Start1() {
		System.out.println("Witaj w grze \"Koniec\".");
		System.out.println(Var.row);
		Menu.room_Start2();
	}

	static void room_Start2() {

		System.out.println(Var.row);
		System.out.println("By rozpocz�� gr� wpisz - start");
		System.out.println("By wyj� z gry wpisz - koniec");
		System.out.println("By przeczyta� o tw�rcach gry wpisz - autor");
		System.out.println(Var.row);

		Var.choice = Var.scanner.nextLine();

		if (Var.choice.equals("autor")) {
			System.out.println(Var.row);
			System.out.println("Gr� paragrafow� \"Koniec\" stworzy� Dominik Matusiak.");
			System.out.println("Gr� na form� z kt�rej w�a�nie korzystasz przerobi� Bart�omiej Szcz�niak.");
			System.out.println(Var.row);
		}
		if (Var.choice.equals("koniec")) {
			System.out.println(Var.row);
			System.out.println("Dzi�kuj� za gr� :)");
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
		System.out.println("Wybierz posta� i kieruj jej losami:");
		System.out.println(
				"\nAnna - mniejsza si�a i wydolno�� fizyczna. Jako dziecko ton�a w jeziorze, przez co ma hydrofobi�. Trzyma w domu psa Falkona.");
		System.out.println(
				"\nPawe� - od urodzenia nieco trz�s� si� mu r�ce. Umiarkowana si�a i wydolno�� fizyczna. Lubi podgl�da� s�siadk�.");
		System.out.println("Jego pupilem w domu jest czarny kot Obama.");
		System.out.println("\nWpisz anna lub pawel by wybra� posta�.");
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
			System.out.print("Sko�czy�e� ");
		}
		if (Var.event3 == false) {
			System.out.print("Sko�czy�a� ");
		}
		System.out.print("tutaj studia ");
		System.out.println("(z wyr�nieniem) i ");
		if (Var.event3 == true) {
			System.out.print("podje�e� ");
		}
		if (Var.event3 == false) {
			System.out.print("podje�a� ");
		}
		System.out.println("zdaln� prac� jako architekt. Projektujesz budynki");
		System.out.println("u�yteczno�ci publicznej. Twoim aktualnym przedsi�wzi�ciem jest plan nowego szpitala ");
		System.out.println("wojskowego. B�dzie to du�y obiekt o wi�kszych mo�liwo�ciach ni� zapotrzebowanie.");
		System.out.println("Twoi rodzice zgin�li w wypadku drogowym. Z p�dz�cym autokarem samoch�d ");
		System.out.println("osobowy nie ma du�ych szans. Szczeg�lnie, gdy kierowca pozbawiony zmiennika");
		System.out.println("zasypia za kierownic�. Jedyn� rodzin� pozostaje brat matki i pupil domowy. W wolnym");
		System.out.println("czasie rozwi�zujesz krzy��wki i czytasz ksi��ki.");
		System.out.println(Var.row);
		System.out.println("Jest wiecz�r. Siedzisz sobie przed komputerem i dopracowujesz szczeg�y izolatek");
		System.out.println("dla nowo projektowanego szpitala. S�yszysz wielki ha�as za oknem. Wygl�dasz i widzisz");
		System.out.println("wypadek samochodowy. Rozwalony pojazd o �wiat�a sygnalizacyjne, �lady hamowania");
		System.out.println("i potr�conego pieszego.");
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
			System.out.println("\n\nKoniec �ycia i szans na przysz�o��. Spr�buj jeszcze raz.");
		}
		if (Var.luck == 1) {
			System.out.println("\n\nSpr�buj jeszcze raz cz�owieku! Zombie czekaj�.");
		}
		if (Var.luck == 2) {
			System.out.println("\n\nKoniec zabawy. Mo�e spr�bujesz jeszcze raz? Mia�e� pecha.");
		}
		if (Var.luck == 3) {
			System.out.println("\n\nMo�e nast�pnym razem lepiej sko�czysz. Nie poddawaj si�. Pr�buj dalej.");
		}
		if (Var.luck == 4) {
			System.out.println("\n\nNie ka�demu dane jest przetrwa�. Tobie si� nie uda�o. Mo�e innym razem.");
		}
		if (Var.luck == 5) {
			System.out.println("\n\nMo�e nast�pnym razem lepiej sko�czysz. Nie poddawaj si�.");
		}
		if (Var.luck == 6) {
			System.out.println("\n\nMo�e nast�pnym razem uda Ci si� do�y� staro�ci. Nie zniech�caj si�.");
		}
		if (Var.luck == 7) {
			System.out.println("\n\nMo�e nast�pnym razem uda Ci si� prze�y�. Nie poddawaj si�.");
		}
		Menu.room_Start2();

	}

	static void win() {
		System.out.println("\n\nJest to jedno z mo�liwych zako�cze�. Zagraj jeszcze raz, je�li chcesz pozna� inne.");
		Menu.room_Start2();
	}

}
