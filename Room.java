
import java.util.Random;

public class Room {

	static void room1() {
		System.out.println(Var.row);
		System.out.println("Z daleka nie widzisz szczeg��w. Jaka� le��ca osoba i zniszczony samoch�d.");
		System.out.println("Dzwonisz po pomoc.\n");
		System.out.println("wyjdz > Wychodzisz na zewn�trz, aby udzieli� pomocy poszkodowanym. ");
		System.out.println("zostan > Pozostajesz w domu i czekasz na rozw�j wydarze�. Ogl�dasz telewizj� (sw�j");
		System.out.println("\tulubiony serial), aby nie my�le� o wypadku.");
		Var.choice = Var.scanner.nextLine();
		if (Var.choice.equals("wyjdz")) {
			Var.event1 = true;
			room3();
		}
		if (Var.choice.equals("zostan")) {
			room4();
		} else {
			room1();
		}

	}

	static void room2() {
		System.out.println(Var.row);
		System.out.println("Si�gasz po swoj� lornetk�. Widzisz le��ce zw�oki Pana Mariana (pracuje jako");
		System.out.println("sprz�tacz w bazie wojskowej) z widocznym z�amaniem w podudziu. Kierowca siedzi");
		System.out.println("nieprzytomny w samochodzie. Chwytasz za telefon i wzywasz pomoc.\n");
		System.out.println("zostan > Zostajesz w domu i rozgl�dasz si� dok�adniej przez lornetk�.");
		System.out.println("wyjdz > Wychodzisz udzieli� pomocy.");
		Var.choice = Var.scanner.nextLine();
		if (Var.choice.equals("wyjdz")) {
			Var.event1 = true;
			room3();
		}
		if (Var.choice.equals("zostan")) {
			room5();
		} else {
			room2();
		}

	}

	static void room3() {
		System.out.println(Var.row);
		if (Var.event3 == false) {
			System.out.println("Na dworze panuje lekki, ale nieprzyjemny ch��d. Zbli�asz si� do miejsca ");
			System.out.println("wypadku. W�r�d ofiar rozpoznajesz s�siada - Pana Mariana - cywilnego pracownika ");
			System.out.println("bazy wojskowej. Ma z�amane podudzie. W samochodzie siedzi obca, nieprzytomna");
			System.out.println("osoba. Podchodzisz do potr�conego. W chwili gdy pr�bujesz nawi�za� kontakt, ");
			System.out.println("zostajesz ugryziona w przedrami�. Wszelka miara zaskoczenia zostaje przekroczona. ");
			System.out.println(
					"Uciekasz z krzykiem przed siebie, potykaj�c si� po drodze. Bolesna, rozleg�a rana krwawi");
			System.out.println("intensywnie. Nie mo�esz doj�� do siebie. ");
			Random random = new Random();
			Var.luck = random.nextInt(4) + 1;
			if (Var.luck == 4) {
				room7();
			}
			if (Var.luck < 4) {
				room8();

			}
		}
		if (Var.event3 == true) {
			System.out.println("Na dworze panuje lekki ch��d. Zbli�asz si� do miejsca wypadku. Podchodzisz ");
			System.out.println("do potr�conego Pana Mariana. W chwili, gdy pr�bujesz nawi�za� kontakt, zostajesz ");
			System.out.println("ugryziony w bark. Nie ma s��w, by opisa� Twoje zdumienie. Bolesna, rozleg�a rana");
			System.out.println("krwawi intensywnie. Uciekasz. P�niej tamujesz prowizorycznie wyciek p�ynu");
			System.out.println("ustrojowego za pomoc� zdj�tej i porwanej podkoszulki.\n");
			System.out.println("szpital > Je�li chcesz i�� do szpitala.");
			System.out.println("dom > Je�li chcesz wr�ci� do domu.");
			Var.choice = Var.scanner.nextLine();
			if (Var.choice.equals("szpital")) {
				room9();
			}
			if (Var.choice.equals("dom")) {
				room6();
			} else {
				room3();
			}

		}

	}

	static void room4() {
		System.out.println(Var.row);
		System.out.println("Ogl�danie Twojego serialu przerwa�a seria strza��w. Wygl�dasz przez okno. ");
		System.out.println("Przyby� radiow�z policyjny i ambulans. Trudno poj��, to co widzisz. Jeden z sanitariuszy ");
		System.out.println("le�y martwy po�r�d ka�u�y krwi. Obok niego ofiara wypadku. R�wnie� we krwi. ");
		System.out.println("Najwidoczniej ranny w wypadku zosta� zastrzelony przez policjant�w. Tylko dlaczego?");
		System.out.println("Co si� sta�o? Policjanci nerwowo rozmawiaj� przez radio. Sanitariusz odje�d�a. Na ulicy ");
		System.out.println("do�� pusto. Nie widzisz przechodni�w. Przypominasz sobie o zamkni�ciu drzwi ");
		System.out.println("do mieszkania i siadasz przed telewizorem. Dzisiaj ju� nie za�niesz.\n");
		System.out.println("wez > Je�li chcesz wzi�� dla lepszego samopoczucia n� kuchenny.");
		System.out.println("zostaw > Je�li nie chcesz bra� no�a.");
		Var.choice = Var.scanner.nextLine();
		if (Var.choice.equals("wez")) {
			Var.event2 = true;
			room6();
		}
		if (Var.choice.equals("zostaw")) {
			room6();
		} else {
			room4();
		}
	}

	static void room5() {
		System.out.println(Var.row);
		System.out.println("Stoisz przy oknie przez dobre pi�� minut i czekasz na przybycie s�u�b. Jeszcze");
		System.out.println("raz patrzysz przez lornetk�. Niespodziewanie zmasakrowane zw�oki starszego Pana ");
		System.out.println("Mariana, le��ce na jezdni, zaczynaj� si� porusza�. Po chwili wstaj� i chybotliwym");
		System.out.println("krokiem poruszaj� si� bez�adnie. Co to?! Martwy powsta�?! Czy ja dobrze widz�?! ");
		if (Var.event3 == true) {
			System.out.println("A mo�e oszala�em?");
		}
		if (Var.event3 == false) {
			System.out.println("A mo�e oszala�am?");
		}
		System.out.println("Po 25 minutach przyje�d�a policja i pogotowie. Nie zauwa�y�e� przechodni�w - mo�e ");
		System.out.println("dlatego �e mecz nied�ugo si� zacznie. Policjanci zacz�li ogl�da� miejsce wypadku. ");
		System.out.println("Sanitariusze natomiast pr�bowali udzieli� pomocy poszkodowanym. Jeden z nich ");
		System.out.println("podszed� do dziwnie wygl�daj�cej ofiary z przetr�con� nog�. Niespodziewanie");
		System.out.println(
				"nast�pi� atak i zosta� �miertelnie i krwisto ugryziony w szyj�. Upad�. Drugi s�ysz�c krzyki ");
		System.out.println("swojego kolegi, przerwa� badanie stanu kierowcy. Obejrza� si� za siebie i zobaczy� ");
		System.out.println("makabr�. Pobieg� do zdezorientowanych str��w prawa. Marian, a w�a�ciwie jego ");
		System.out.println("zw�oki zaj�y si� konsumpcj� cia�a ratownika. Pad�y strza�y, cho� zdawa�o");
		System.out.println("by si�, �e nie wyrz�dzi�y znacznej szkody. Dopiero celne trafienie w g�ow� powali�o ");
		System.out.println("przeciwnika. Policjanci wezwali pomoc drog� radiow�. Sanitariusz wsiad� ");
		System.out.println("do ambulansu i odjecha�. ");
		System.out.println("Postanawiasz zosta� w domu. K�adziesz si� spa�.\n");
		System.out.println("noz > Je�li chcesz schowa� pod poduszk� n� kuchenny.");
		System.out.println("zostaw > Je�li chcesz zostawi� n� w kuchni.");
		Var.choice = Var.scanner.nextLine();
		if (Var.choice.equals("noz")) {
			Var.event2 = true;
			room6();
		}
		if (Var.choice.equals("zostaw")) {
			room6();
		} else {
			room5();
		}
	}

	static void room6() {
		if (Var.event1 == true) {
			Random random = new Random();
			Var.luck = random.nextInt(2) + 1;
			if (Var.luck == 2) {
				room10();
			}
			if (Var.luck < 2) {
				room6_B();

			}
		}
		if (Var.event1 == false) {
			room6_1();

		}

	}

	static void room6_B() {
		System.out.println(Var.row);
		System.out.println("Nasta� kolejny dzie�. Nieprzyjemne wspomnienia wydarze� sprzed kilku godzin ");
		System.out.println("ci�gle powracaj�. Przez okno widzisz, �e miejsce zdarzenia nie zosta�o uprz�tni�te. ");
		System.out.println("Nad zw�okami �eruj� mi�so�ercy. Jest ich wi�cej. Cz�� wa��sa si� bezcelowo. Jakby ");
		System.out.println("czekaj�c na �ywych ludzi. Kto� w oddali wo�a o pomoc. Jednak jest poza zasi�giem ");
		System.out.println("wzroku. Kto� wali do drzwi. Nie otwierasz. Patrzysz przez wizjer. To oni! Zastawiasz drzwi ");
		System.out.println("szafk�.");
		System.out.println("Zabanda�owana rana nadal krwawi. Chocia� mniej ni� poprzednio. \n");
		System.out.println("rana > Je�li chcesz profilaktycznie ponownie j� odkazi�, a potem przypali� ogniem.");
		System.out.println("zostaw > Je�li chcesz j� zostawi� jak jest.");
		Var.choice = Var.scanner.nextLine();
		if (Var.choice.equals("rana")) {
			Var.event4 = true;
			System.out.println("\n Rana wygl�da troch� lepiej.");
			room6_C();
					}
		if (Var.choice.equals("zostaw")) {
			System.out.println("\nRana wygl�da �le.");
			room6_C();
		} else {
			room6_B();
		}
	}

	static void room6_C() {

		System.out.println("szpital > Postanawiasz uda� si� do szpitala. Nie mo�na zaniedba� rany.");
		System.out.println("policja > Wymykasz si� przez okno i kierujesz si� na posterunek policji.");
		System.out.println("ucieczka > Wymykasz si� przez okno i uciekasz poza miasto. ");
		System.out.println("dom > Pozostajesz u siebie.");
		Var.choice = Var.scanner.nextLine();
		if (Var.choice.equals("szpital")) {
			room11();
		}
		if (Var.choice.equals("policja")) {
			room12();
		}
		if (Var.choice.equals("ucieczka")) {
			room13();
		}
		if (Var.choice.equals("dom")) {
			room15();
		} else {
			room6_C();
		}

	}

	static void room6_1() {
		System.out.println(Var.row);
		System.out.println("Nasta� kolejny dzie�. Nieprzyjemne wspomnienia wydarze� sprzed kilku godzin ");
		System.out.println("ci�gle powracaj�. Przez okno widzisz, �e miejsce zdarzenia nie zosta�o uprz�tni�te. ");
		System.out.println("Nad zw�okami �eruj� padlino�ercy (i nie tylko). Jest ich wi�cej. Cz�� wa��sa");
		System.out.println("si� bezcelowo. Jakby czekaj�c na �ywych ludzi. Kto� w oddali wo�a o pomoc. Jednak ");
		System.out.println("jest poza zasi�giem wzroku. Kto� wali do drzwi. Nie otwierasz. Patrzysz przez wizjer. ");
		System.out.println("To oni! Zastawiasz drzwi szafk�.\n");
		System.out.println("policja >  Wymykasz si� przez okno i kierujesz si� na posterunek policji.");
		System.out.println("ucieczka > Wymykasz si� przez okno i uciekasz poza miasto.");
		System.out.println("dom > Pozostajesz w domu.");
		Var.choice = Var.scanner.nextLine();
		if (Var.choice.equals("policja")) {
			room12();
		}
		if (Var.choice.equals("ucieczka")) {
			room13();
		}
		if (Var.choice.equals("dom")) {
			room14();
		} else {
			room6_1();
		}

	}

	static void room7() {
		System.out.println(Var.row);
		System.out.println("Szok by� silniejszy od Ciebie. Stan�a�, gdzie� na ulicy, nie zwracaj�c ");
		System.out.println("na nic uwagi. Up�yw krwi, by� zbyt intensywny. Co raz bardziej stawa�a� si� ospa�a");
		System.out.println("Usiad�a� na chodniku. Dopad�a Ci� ciemno�� i sko�czy� si� Tw�j byt. Twoje cia�o le�y ");
		System.out.println("zanurzone we krwi.");
		Menu.death();

	}

	static void room8() {
		System.out.println(Var.row);
		System.out.println("Bieg�a�, gdzie� przez chwil�. Jednak nie da� o sobie zapomnie� b�l r�ki. ");
		System.out.println("Zatrzyma�a� si�, by zatamowa� krwawienie tkanin� z sukienki.\n");
		System.out.println("dom > Wracasz do domu.");
		System.out.println("szpital > Zmierzasz do szpitala");
		Var.choice = Var.scanner.nextLine();
		if (Var.choice.equals("dom")) {
			room6();
		}
		if (Var.choice.equals("szpital")) {
			room9();
		} else {
			room8();
		}

	}

	static void room9() {
		Random random = new Random();
		Var.luck = random.nextInt(2) + 1;
		if (Var.luck == 2) {
			room11();
		}
		if (Var.luck < 2) {
			System.out.println(Var.row);
			System.out.println("Jest ju� zmrok. Panuje nieprzyjemna cisza. Idziesz niepewnym krokiem przed ");
			System.out
					.println("siebie. W drodze na przystanek autobusowy atakuje Ci� kolejny, niezbyt �ywy paralityk.");
			System.out.println(
					"Nie potrafisz wyja�ni� zaistnia�ej sytuacji. Wa�ne jest przetrwanie. Walczysz. Uderzasz. ");
			System.out.println("Nie wiele to daje. Odpychasz mamrocz�cego wroga, kt�ry usi�uje gry��. Uciekasz. ");
			System.out.println("Niestety potykasz si� na nier�wno po�o�onym chodniku. Dopada Ci�. K�sa. Rwie mi�so. ");
			System.out.println("Odgryza palec. Dosi�ga t�tnicy szyjnej. Krew szybko ucieka z Ciebie. To ju� koniec. ");
			System.out.println("Makabryczna �mier� w nagrod� za niewinno��. Giniesz w m�czarniach. Kto� z oddali");
			System.out.println("patrzy na Twoje zw�oki. Cieszy si�, �e nie podzieli� tego samego losu. Nie udzieli� ");
			System.out.println("pomocy. Po co si� nara�a�?");
			Menu.death();

		}

	}

	static void room10() {
		System.out.println(Var.row);
		System.out.println("Nasta� nowy dzie�. Wida� delikatn� mg��. Nie jeste� jednak ju� sob�. Rana ");
		System.out.println("okaza�a si� gro�niejsza, ni� mo�na by�o przypuszcza�. Do��czasz do grona swoich");
		System.out.println("mi�so�ernych braci i si�str, kt�rych przybywa z ka�d� chwil�. Pastwisz si� nad cia�ami. ");
		System.out.println("Te, kt�re nie zosta�y ca�kowicie zjedzone, \"o�ywaj�\".");
		Menu.death();
	}

	static void room11() {
		System.out.println(Var.row);
		System.out.println("W drodze do najbli�szego szpitala zauwa�asz opuszczony radiow�z.\n");
		System.out.println("zobacz > Zagl�dasz do �rodka pojazdu.");
		System.out.println("odejdz > Omijasz samoch�d i idziesz dalej do szpitala.");
		Var.choice = Var.scanner.nextLine();
		if (Var.choice.equals("zobacz")) {
			room30();
		}
		if (Var.choice.equals("odejdz")) {
			room29();
		} else {
			room11();
		}
	}

	static void room12() {
		if (Var.event1 == false) {
			room23();
		}
		if (Var.event1 == true) {
			if (Var.event4 == true) {
				room20();
			}
			if (Var.event4 == false) {
				room19();
			}

		}
	}

	static void room13() {
		if (Var.event3 == true) {

			Random random = new Random();
			Var.luck = random.nextInt(4) + 1;
			if (Var.luck == 4) {
				room50();
			}
			if (Var.luck < 4) {
				System.out.println(Var.row);
				System.out.println("Przed wyj�ciem wypu�ci�e� swojego kota. Nast�pnie ukrad�e� porzucony");
				System.out.println("samoch�d - opuszczony w po�piechu. Paliwa wystarczy na podr� w jedn� stron�. ");
				System.out.println("Gdy prawie uda�o Ci si� opu�ci� to koszmarne miasto, zatrzymuje Ci� ma�y patrol");
				System.out.println("�o�nierzy. Blokuj� drog� przejazdu. Posadzono Ci� z ty�u ci�ar�wki z paskami ");
				System.out.println("zaciskowym na r�kach i nogach.\n");
				room13_A();

			}
		}
		if (Var.event3 == false) {
			System.out.println(Var.row);
			System.out.println("Ukrad�a� porzucony samoch�d - opuszczony w po�piechu. Wzi�a� ze sob� ");
			System.out.println("swojego psa. Wybra�a� d�u�sz� drog� omijaj�c� stary, chybotliwy most.  Paliwa ");
			System.out.println("wystarczy na podr� w jedn� stron�. Gdy prawie uda�o Ci si� opu�ci� to koszmarne ");
			System.out.println("miasto, zatrzymuje Ci� ma�y patrol �o�nierzy. Blokuj� drog� przejazdu.\n");
			System.out.println("odpusc > Poddajesz si�");
			System.out.println("walcz > Opierasz si�.");
			Var.choice = Var.scanner.nextLine();
			if (Var.choice.equals("odpusc")) {
				room25();
			}
			if (Var.choice.equals("walcz")) {
				room26();
			} else {
				room13();
			}

		}
	}

	static void room13_A() {
		if (Var.event2 == true) {
			System.out.println("czekaj > Nie podejmujesz dalszych dzia�a� i czekasz na dalszy post�p wydarze�.");
			System.out.println("tnij - Pr�bujesz przeci�� wi�zy za pomoc� no�a kuchennego.");
			Var.choice = Var.scanner.nextLine();
			if (Var.choice.equals("czekaj")) {
				room22();
			}
			if (Var.choice.equals("tnij")) {
				room21();
			} else {
				room13_A();
			}

		}
		if (Var.event2 == false) {
			System.out.println("Nie podejmujesz dalszych dzia�a� i czekasz na dalszy post�p wydarze�.");
			room22();
		}

	}

	static void room14() {
		System.out.println(Var.row);
		if (Var.event3 == true) {

			System.out.println("Barykadujesz sw�j niedu�y dom. Zabijasz lichymi deskami i krzywymi gwo�d�mi");
			System.out.println("drzwi i okna. Dodatkowo stawiasz ci�kie d�bowe meble z litego drewna - stanowi�");
			System.out.println("niez�� przeszkod� (przyda�y si� mi�nie wyrobione na si�owni). Nie b�dzie �atwo");
			System.out.println("wtargn�� do �rodka. Powiedzenie \"Tw�j dom, twoja twierdza\" nabiera nowego");
			System.out.println("znaczenia. Dop�ki nie zanika pr�d, ogl�dasz awaryjny przekaz telewizyjny. Dowiadujesz");
			System.out.println("si�, �e sytuacja pogarsza si� z godziny na godzin�, a na ulicach panuje chaos. Problem");
			System.out.println("nieumar�ych rozszerza si�. Telefony nie dzia�aj�. �ywno�� w lod�wce szybko si� psuje.");
			System.out.println("Pijesz deszcz�wk� z wystawionych wiader na lekko sko�nym dachu. �ywisz si� surowymi");
			System.out.println("warzywami i cukrem. W nocy �r�d�em �wiat�a jest ma�a �wieczka. �yjesz z dnia na dzie�,");
			System.out.println("zachowuj�c cisz�. Od czasu do czasu s�ycha� dobijanie si� do drzwi lub okien. Czasem");
			System.out.println("kto� wo�a o pomoc, ale udajesz, �e nie s�yszysz. Pomoc nie nadchodzi. Mo�e za tydzie�");
			System.out.println("- powtarzasz sobie. Masz nadziej�, �e wojsko wkroczy i opanuje sytuacj�. Ale czy nie");
			System.out.println("zabraknie Ci �ywno�ci do tego czasu? ");
			System.out.println("Wypuszczasz kota. Nie chcesz dzieli� ");
			System.out.println("si� resztkami. �udzisz si�, �e ma szans� na prze�ycie.");
			Menu.win();
		}
		if (Var.event3 == false) {
			System.out.println("Barykadujesz sw�j niedu�y dom. Zabijasz lichymi deskami i krzywymi gwo�d�mi");
			System.out.println("drzwi i okna. Dodatkowo stawiasz ci�kie d�bowe meble z litego drewna - stanowi�");
			System.out.println("niez�� przeszkod� (przyda�y si� mi�nie wyrobione na si�owni). Nie b�dzie �atwo");
			System.out.println("wtargn�� do �rodka. Powiedzenie \"Tw�j dom, twoja twierdza\" nabiera nowego");
			System.out.println("znaczenia. Dop�ki nie zanika pr�d, ogl�dasz awaryjny przekaz telewizyjny. Dowiadujesz");
			System.out.println("si�, �e sytuacja pogarsza si� z godziny na godzin�, a na ulicach panuje chaos. Problem");
			System.out.println("nieumar�ych rozszerza si�. Telefony nie dzia�aj�. �ywno�� w lod�wce szybko si� psuje.");
			System.out.println("Pijesz deszcz�wk� z wystawionych wiader na lekko sko�nym dachu. �ywisz si� surowymi");
			System.out.println("warzywami i cukrem. W nocy �r�d�em �wiat�a jest ma�a �wieczka. �yjesz z dnia na dzie�,");
			System.out.println("zachowuj�c cisz�. Od czasu do czasu s�ycha� dobijanie si� do drzwi lub okien. Czasem");
			System.out.println("kto� wo�a o pomoc, ale udajesz, �e nie s�yszysz. Pomoc nie nadchodzi. Mo�e za tydzie�");
			System.out.println("- powtarzasz sobie. Masz nadziej�, �e wojsko wkroczy i opanuje sytuacj�. Ale czy nie");
			System.out.println("zabraknie Ci �ywno�ci do tego czasu? ");
			System.out.println("Albo czy barykada wytrzyma?");
			Menu.win();

		}

	}

	static void room15() {
		System.out.println(Var.row);
		if (Var.event4 == false) {
			System.out.println("Stan rany si� pogorszy�. Zacz�a gni�, a sw�dzenie wraz z czuciem zanik�y. Jest ");
			System.out.println("ju� za p�no. Chwil� p�niej ilo�� (�ywych) mieszka�c�w pomniejszy�a si� o jedn� ");
			System.out.println("osob�. Ciebie!");
			Menu.death();
		}
		if (Var.event4 == true) {
			System.out.println("Stan rany si� pogorszy�. Zacz�a gni�, a sw�dzenie wraz z czuciem zanik�y. Masz ");
			System.out.println("jeszcze niewielk� szans� na �ycie. Twoja lewa ko�czyna jest ju� martwa. Zaciskasz ");
			System.out.println("j� bardzo ciasno paskiem i pr�bujesz dosta� si� do szpitala.");
			Var.event5 = true;
			room11();

		}

	}

	static void room16() {
		System.out.println(Var.row);
		System.out.println("Barykadujesz sw�j niedu�y dom. Zabijasz lichymi deskami i krzywymi gwo�d�mi ");
		System.out.println("drzwi i okna. Dop�ki nie zanika pr�d, ogl�dasz awaryjny przekaz telewizyjny.");
		System.out.println("Dowiadujesz si�, �e sytuacja pogarsza si� z godziny na godzin�, a na ulicach panuje ");
		System.out.println("chaos. Problem nieumar�ych rozszerza si�. Telefony nie dzia�aj�. ");
		System.out.println("Mi�so�erni paralitycy wyczuli Twoje perfumy. Dobijaj� si�. Przybijasz w chaosie kolejne ");
		System.out.println("deski. Cz�� nie chce si� trzyma� i odpada. Przypadkiem uderzasz si� m�otkiem w d�o�. ");
		System.out.println("Pchasz ca�� si�� drzwi. Dom jest otoczony. Nie masz jak uciec.\n");
		System.out.println("walcz > Walczysz do ko�ca.");
		System.out.println("tnij > Podcinasz sobie �y�y");
		Var.choice = Var.scanner.nextLine();
		if (Var.choice.equals("walcz")) {
			room18();
		}
		if (Var.choice.equals("tnij")) {
			room17();
		} else {
			room16();
		}

	}

	static void room17() {
		System.out.println(Var.row);
		System.out.println("Ostrym no�em nacinasz pod�u�nie arterie. Czujesz zimno, smutek i b�l. Zapadasz ");
		System.out.println("w wieczny sen. Szybka �mier� (przynajmniej dla Ciebie). Pies nie mia� tyle szcz�cia. ");
		System.out.println("Kilka minut i barykada zostaje sforsowana. Nie cierpisz, gdy Twoje cia�o rozszarpuje");
		System.out.println("ksi�dz i s�siadka.");
		Menu.death();

	}

	static void room18() {
		System.out.println(Var.row);
		System.out.println("Nie poddajesz si�. Kilka minut i barykada zostaje sforsowana. Zostajesz po�arta ");
		System.out.println("�ywcem. Tw�j pies rzuca si� na ratunek, ale r�wnie �le ko�czy. Nie giniesz od razu.");
		System.out.println("Bardzo cierpisz. Na resztkach �eruj� ksi�dz i s�siadka.\n");
		Menu.death();

	}

	static void room19() {
		System.out.println(Var.row);
		System.out.print("Uda�o Ci si� dotrze� do posterunku policji");
		if (Var.event3 == true) {
			System.out.print(" z psem");
		}
		System.out.print(". Cze�� mieszka�c�w\n");
		System.out.print("zabarykadowa�o si� tam (r�wnie� jeden policjant). Zatai�");
		if (Var.event3 == true) {
			System.out.print("e�");
		}
		if (Var.event3 == false) {
			System.out.print("a�");
		}
		System.out.print(" fakt ugryzienia. Udawa�");
		if (Var.event3 == true) {
			System.out.print("e�");
		}
		if (Var.event3 == false) {
			System.out.print("a�");
		}
		System.out.print(", �e to objawy\n");
		if (Var.event3 == true) {
			System.out.print("zatrucia pokarmowego");
		}
		if (Var.event3 == false) {
			System.out.print("grypy");
		}
		System.out.print(". Infekcja zrobi�a swoje. Po zmianie ");
		if (Var.event3 == true) {
			System.out.print("zaatakowa�e� i pogryz�e�");
		}
		if (Var.event3 == false) {
			System.out.print("rzuci�a� si� w szale na innych");
			System.out.print("i pogryz�a�");
		}
		System.out.print("\nkilkoro ludzi (trzeba by�o ich zastrzeli�)");
		if (Var.event3 == true) {
			System.out.print(", zanim dosta�e� metalowym kijem bejsbolowym\npo g�owie. ");
		}
		if (Var.event3 == false) {

			System.out.println(".\nTw�j m�zg zosta� zniszczony metalow� rur�. ");
		}
		Menu.death();

	}

	static void room20() {
		System.out.println(Var.row);
		System.out.println("Stan rany si� pogorszy�. Zacz�a gni�, a sw�dzenie wraz z czuciem zanik�y. Masz ");
		System.out.println("jeszcze niewielk� szans� na �ycie. Twoja lewa ko�czyna jest ju� martwa. Zaciskasz ");
		System.out.println("j� bardzo ciasno paskiem i pr�bujesz dosta� si� do szpitala.");
		Var.event5 = true;
		room11();

	}

	static void room21() {
		System.out.println(Var.row);
		System.out.println("Uda�o si�! Wi�zy przeci�te. Nie ma czasu. Wyskakujesz z rozp�dzonej ci�ar�wki.");
		System.out.println("�amiesz sobie nadgarstek, ale �yjesz. Uciekasz do lasu.");
		if (Var.event1 == true) {
			System.out.println("Mija godzina i zmieniasz si� w zombie. To ju� koniec walki o przetrwanie. ");
			System.out.println("Twoim priorytetem jest mi�so! Du�o mi�sa! ");
			Menu.death();
		}
		if (Var.event1 == false) {
			System.out.println("Masz szans�. Strze� si� nieznanego!");
			System.out.println("W oddali, mi�dzy drzewami widzisz sylwetk� cz�owieka...");
			Menu.win();
		}

	}

	static void room22() {
		System.out.println(Var.row);
		if (Var.event4 == false) {
			System.out.println("Po drodze zmieniasz si� w zombie. Dostajesz kulk� w g�ow�. Twoje cia�o zostaje");
			System.out.println("porzucone przy drodze. Zlatuj� si� ptaki i �ywi� si� Twoim mi�sem.");
			Menu.death();

		}
		if (Var.event4 == true) {
			System.out.println("Po 15 minutach doje�d�asz do bazy wojskowej. Dostajesz surowic� ");
			System.out.println("odporno�ciow�. Mo�e prze�yjesz. Masz szanse p� na p�. Odka�enie i przypalenie rany ");
			System.out.println("da�o Ci troch� wi�cej czasu. Jako �ywy mo�e dostaniesz karabin i do��czysz do armii ");
			System.out
					.println("(nie dobrowolnie). Je�li nie zachowasz �ycia, to staniesz si� kr�likiem do�wiadczalnym.");
			System.out.println("B�d� Twoj� p�-martw� wersj� tru�, razi� pr�dem, podpala� i kroi�. Dostarczysz");
			System.out.println("przydatnych informacji dotycz�cych tej plagi.");
			Menu.win();

		}

	}

	static void room23() {
		System.out.println(Var.row);
		System.out.print("Uda�o Ci si� dotrze� do posterunku policji");
		if (Var.event3 == true) {
			System.out.print(" ze swoim psem");
		}
		System.out.print(". ");
		System.out.println("Cze�� mieszka�c�w zabarykadowa�o si� tam (r�wnie� jeden policjant).");
		System.out.println(
				"Jest zapas wody, �ywno�ci, broni i amunicji. Nie ma ��czno�ci, ale jest nadzieja na przetrwanie.");
		System.out
				.println("Zm�czeni i zestresowani oczekujecie lepszego jutra. Mo�e nadejdzie pomoc ze strony wojska? ");
		Menu.win();

	}

	static void room24() {
		System.out.println(Var.row);
		System.out.println("Prze�y�a�! Ale co to za �ycie. Trzymaj� Ci�, gdzie� na drugim podziemnym ");
		System.out.println("poziomie kompleksu badawczo-militarnego. Trafi�a� do specjalnej, przytulnej");
		System.out.println("(czerwonej) celi z telewizorem, prysznicem i wygodnym ��kiem. Jeste� narz�dziem ");
		System.out.println("do zaspokajania potrzeb niemytych �o�nierzy. Cz�sto kilka razy dziennie. Czasem wi�cej");
		System.out.println("ni� jeden klient na raz. Twoja uroda, jest teraz Twoim przekle�stwem. D�ugie nogi, du�e ");
		System.out.println("i j�drne piersi oraz pon�tne oczy - wielu �o�dak�w lubie�nie si� nimi zachwyca.");
		System.out.println("Nie masz si�y si� ju� opiera�. Popad�a� w depresj� i apati�.");
		System.out.println("Na os�od� masz dobre jedzenie. W wolnych chwilach ogl�dasz zap�tlone nagrania ");
		System.out.println("na szklanym ekranie lub czytasz ksi��ki. Czasem z t�sknot� wspominasz swoje �ycie ");
		System.out.println("i wolno��. Zastanawiasz si� nad sko�czeniem ze sob�.");
		System.out.println("Tw�j pies podobno s�u�y jako str� na wartowni.");
		Menu.win();

	}

	static void room25() {
		if (Var.event1 == true) {

			System.out.println(Var.row);
			if (Var.event4 == true) {
				System.out.println("Po 15 minutach doje�d�asz do bazy wojskowej. Pozwolono Ci zabra� ");
				System.out.println("psa. Dostajesz surowic� odporno�ciow�. Mo�e prze�yjesz. Masz szanse p� na p�. ");
				System.out.println("Odka�enie i przypalenie rany da�o Ci troch� wi�cej czasu.");
				room24();
			}

			if (Var.event4 == false) {
				System.out.println("Po drodze zmieniasz si� w zombie. Dostajesz kulk� w g�ow�. Twoje cia�o zostaje ");
				System.out.println("porzucone przy drodze. Zlatuj� si� ptaki i �ywi� si� Twoj� padlin�.");
				Menu.death();

			}
		}
		if (Var.event1==false) {
			room24();
		}

	}

	static void room26() {
		System.out.println(Var.row);
		System.out.println("Falkon staje w Twojej obronie. Przyp�aca to �yciem.");
		Random random = new Random();
		Var.luck = random.nextInt(2) + 1;
		if (Var.luck == 2) {
			room28();
		}
		if (Var.luck < 2) {
			room27();

		}

	}

	static void room27() {
		System.out.println(Var.row);
		System.out.println("W trakcie ucieczki zosta�a� zastrzelona. Szybka �mier� ko�czy Twoje �ycie.");
		Menu.death();

	}

	static void room28() {
		System.out.println(Var.row);
		if (Var.event1 == true) {
			System.out.println("Uciek�a� od �o�nierzy, ale los nie by� �askawy. Infekcja zrobi�a swoje - zmieniasz ");
			System.out.println("si� w zombie. Nie zachowa�a� swego istnienia. Przynajmniej nie w po��danej formie. ");
			Menu.death();
		}
		if (Var.event1 == false) {
			System.out.println("Korzystasz z zaskoczenia i uciekasz do lasu. Bieg�a� ile si� w nogach. Uda�o ");
			System.out
					.println("si�! Masz szans� prze�y�. W oddali, mi�dzy drzewami spostrzegasz sylwetk� cz�owieka...");
			Menu.win();
		}

	}

	static void room29() {
		System.out.println(Var.row);
		System.out.println("Min�o 10 minut. Jeste� niedaleko starego szpitala (kt�ry od dziesi�ciu ");
		System.out.println("lat nie mo�e doczeka� si� remontu. Nagle s�yszysz wo�anie o pomoc. Co robisz?\n");
		System.out.println("ignoruj > Ignorujesz. Nie ma czasu do stracenia.");
		System.out.println("pomoz > Idziesz z pomoc�. Ka�da dodatkowa osoba zwi�ksza Twoje szanse na prze�ycie.");
		Var.choice = Var.scanner.nextLine();
		if (Var.choice.equals("ignoruj")) {
			room33();
		}
		if (Var.choice.equals("pomoz")) {
			room34();
		} else {
			room29();
		}

	}

	static void room30() {
		System.out.println(Var.row);
		System.out.println("Rozgl�dasz si� uwa�nie. Znajdujesz w �rodku (pod siedzeniem) na�adowany ");
		System.out.println("rewolwer. Zabierasz go ze sob�. Idziesz w kierunku szpitala. Ju� niedaleko. ");
		Var.event7 = true;
		room29();
	}

	static void room31() {
		System.out.println(Var.row);
		System.out.println("W po�owie drogi, w czasie jazdy zaczynasz bardzo �le si� czu�. Wychodzisz ");
		System.out.println("z pojazdu, aby nie wymiotowa� w �rodku. Infekcja zrobi�a swoje. Zmieniasz ");
		System.out
				.println("si� w zombie. Jeste� wolny.  Teraz Twoj� rodzin� jest plaga. Zabijasz niewinnych i �ywisz ");
		System.out.println("si� ich mi�sem. ");
		Menu.death();

	}

	static void room32() {
		System.out.println(Var.row);
		System.out.println("Min�o 10 minut. Jeste� niedaleko starego szpitala (kt�ry od dziesi�ciu");
		System.out.println("lat nie mo�e doczeka� si� remontu). W oddali spostrzegasz grupk� zombie");
		System.out.println("pastwi�cych si� nad jakimi� zw�okami. Skradasz si�. Chowasz si� za porzuconymi");
		System.out.println("pojazdami lub innymi przeszkodami. Szybko, ale r�wnocze�nie ostro�nie wchodzisz");
		System.out.println("do szpitala g��wnym wej�ciem.");
		room35();

	}

	static void room33() {
		System.out.println(Var.row);
		System.out.println("Unikasz kontaktu. Skradasz si�. Chowasz si� za porzuconymi pojazdami lub innymi ");
		System.out.println("przeszkodami. Szybko, ale r�wnocze�nie ostro�nie wchodzisz do szpitala g��wnym ");
		System.out.println("wej�ciem.");
		room35();

	}

	static void room34() {
		System.out.println(Var.row);
		System.out.println("Podbiegasz. To m�czyzna. Jest atakowany przez grup� (trio) zombie! ");
		System.out.println("Wymachuje i bije brzydali metalow� rur�. Jeszcze chwila i go pogryz�!");
		if (Var.event7 == true) {
			room38();
		}
		if (Var.event7 == false) {
			room39();
		}

	}

	static void room35() {
		if (Var.event6 == false) {
			room43();

		}
		if (Var.event6 == true) {
			Random random = new Random();
			Var.luck = random.nextInt(2) + 1;
			if (Var.luck == 2) {
				room44();
			}
			if (Var.luck < 2) {
				System.out.println(Var.row);
				System.out.println("Szpital wygl�da na opuszczony. Wida� ba�agan. Co nieco �mieci rozrzuconych ");
				System.out
						.println("na posadce. Przewr�cony w�zek inwalidzki przy wej�ciu. Krew na �cianach, pod�odze ");
				System.out.println(
						"i suficie! Nie widzisz ju� zombie. Mo�e sobie posz�y. A mo�e gdzie� si� czaj�. Nie masz ");
				System.out.println("zamiaru ich szuka�.");
				if (Var.event5 == false) {
					room36();
				}
				if (Var.event5 == true) {
					room41();
				}

			}
		}

	}

	static void room36() {
		System.out.println(Var.row);
		System.out.println("Uda�o si�! Nowo poznany m�czyzna, kt�ry nie chcia� si� przedstawi�, dotrzyma� ");
		System.out.println("s�owa i zaprowadzi� Ci� do sk�adu, gdzie trzymana by�a eksperymentalna surowica ");
		System.out.println("odporno�ciowa. Zna� kod do zamka cyfrowego na drzwiach. Szcz�cie Ci dopisa�o. ");
		System.out.println("Surowica zadzia�a�a i zwalczy�a infekcj�. Chocia� zastrzyk by� bardzo bolesny. ");
		System.out.println("B�l powali� si� na chwil� na pod�og�. Zachowasz r�k�, je�li rana si� zaleczy. ");
		System.out.println("Nieznajomy zabra� jakie� pr�bki do przeno�nej lod�wki i wezwa� pomoc. Pozwoli� ");
		System.out.println("i�� ze sob� pod warunkiem, �e nie b�dziesz zadawa� �adnych pyta�. Udali�cie ");
		System.out.println("si� wind� na dach. Po kwadransie przylecia� czarny helikopter. ");
		if (Var.event3 == true) {
			Menu.win();
		}
		if (Var.event3 == false) {
			room45();
		}

	}

	static void room37() {
		System.out.println(Var.row);
		System.out.println("Uda�o si�! Celne strza�y w g�ow� powali�y przeciwnik�w. Zaatakowany");
		System.out.println("m�czyzna prze�y�. Cudem. Nie zosta� r�wnie� pogryziony. Czy aby na pewno?.");
		System.out.println("Uratowany okaza� si� by� pracownikiem szpitala. Nie chcia� jednak za du�o ");
		System.out.println("opowiada� o swojej pracy. Zauwa�y� Twoj� ran�. Masz szans�. Obieca�, �e zaprowadzi");
		System.out.println("Ci� do sk�adu, gdzie znajdziesz eksperymentalne lekarstwo. Czas jest kluczowy. ");
		System.out.println("Wchodzicie po�piesznie do szpitala przez g��wne wej�cie.");
		Var.event6 = true;
		room35();

	}

	static void room38() {
		System.out.println(Var.row);
		System.out.println("Wyci�gasz sze�ciokomorowy, b�yszcz�cy rewolwer. Celujesz i strzelasz.");
		if (Var.event3 == true) {
			Random random = new Random();
			Var.luck = random.nextInt(2) + 1;
			if (Var.luck == 2) {
				room37();
			}
			if (Var.luck < 2) {
				room40();

			}
		}
		if (Var.event3 == false) {
			room37();

		}

	}

	static void room39() {
		if (Var.event3 == false) {
			System.out.println(Var.row);
			System.out.println("Trzeba mierzy� si�y na zamiary. Nie masz ju� okazji si� nad tym zastanowi�. ");
			System.out.println("Rzucasz si� na grupk� zombie. Nie odnosi to w�a�ciwego skutku. Lepiej mie� bro� ");
			System.out.println(
					"paln�, ni� j� nie mie�. Ko�czysz tak, jak zaatakowany m�czyzna (czyli marnie). Stajesz ");
			System.out.println(
					"si� karm� dla brzydali. Nie jest to mi�y los, szczeg�lnie gdy jeszcze �yjesz podczas uczty.\n");
			System.out.println("�yj. Nie umieraj! Nie b�d� bohaterem. Lepszy �ywy wo�ny, ni� gro�ny i martwy Rambo. ");
			System.out.println("Drobna uwaga - czerwona sukienka dzia�a jak p�achta na byka.");
			Menu.room_Start2(); // przegrana
		}
		if (Var.event3 == true) {
			room42();
		}

	}

	static void room40() {
		System.out.println(Var.row);
		System.out.println("Zadr�a�a Ci r�ka. Spud�owa�e�. M�czyzna z�apany w pu�apk�, zosta� pogryziony. ");
		System.out.println("Musia�e� go zastrzeli�. Tak samo uczyni�e� z mi�so�ernymi paralitykami. Wchodzisz ");
		System.out.println("po�piesznie do szpitala przez g��wne wej�cie.");
		room35();

	}

	static void room41() {
		Random random = new Random();
		Var.luck = random.nextInt(2) + 1;
		if (Var.luck == 2) {
			System.out.println(Var.row);
			System.out.println("Uda�o si�! Nowo poznany m�czyzna, kt�ry nie chcia� si� przedstawi�, dotrzyma� ");
			System.out.println("s�owa i zaprowadzi� Ci� do sk�adu, gdzie trzymana by�a eksperymentalna surowica ");
			System.out.println("odporno�ciowa. Zna� kod do zamka cyfrowego na drzwiach. Szcz�cie Ci dopisa�o. ");
			System.out.println("Surowica zadzia�a�a i zwalczy�a infekcj�. Chocia� zastrzyk by� bardzo bolesny. ");
			System.out.println("B�l powali� si� na chwil� na pod�og�. Ko�czyn� trzeba by�o prowizorycznie i bole�nie ");
			System.out.println("amputowa�. Nieznajomy zabra� jakie� pr�bki do przeno�nej lod�wki i wezwa� pomoc. ");
			System.out.println("Pozwoli� i�� ze sob� pod warunkiem, �e nie b�dziesz zadawa� �adnych pyta�. Udali�cie ");
			System.out.println("si� wind� na dach. Po kwadransie przylecia� czarny helikopter. ");
			if (Var.event3 == false) {
				room46();
			}
			Menu.win();
		}
		if (Var.luck < 2) {
			System.out.println(Var.row);
			System.out.println("Nowo poznany m�czyzna, kt�ry nie chcia� si� przedstawi�, dotrzyma� s�owa ");
			System.out.println("i zaprowadzi� Ci� do sk�adu, gdzie trzymana by�a eksperymentalna surowica ");
			System.out.println("odporno�ciowa. Zna� kod do zamka cyfrowego na drzwiach. Zastrzyk by� bardzo ");
			System.out.println("bolesny. B�l powali� Ci� na chwil� na pod�og�. Szcz�cie Ci nie dopisa�o. Surowica ");
			System.out
					.println("nie zadzia�a�a i nie zwalczy�a infekcji.  Nieznajomy �le oceni� Tw�j stan. Nie b�dzie ");
			System.out
					.println("ju� niczego wi�cej bada�. Jeste� cz�ci� plagi, a on jest jedzeniem. Jakie to proste! ");
			Menu.death();

		}

	}

	static void room42() {
		System.out.println(Var.row);
		System.out.println("Trzeba mierzy� si�y na zamiary. Chcesz si� rzuca� na zombie bez broni palnej? ");
		System.out.println("Zwr�ci�e� na siebie uwag�, ale zm�drza�e� w ostatniej chwili i wzi��e� nogi za pas. ");
		System.out.println("Ta walka by�a przegrana. Zaatakowany m�czyzna sta� si� karm� dla zombie. O ma�y");
		System.out.println("w�os nie zgin��e�. Uratowa�y Ci� d�ugie nogi i dobra wydolno�� fizyczna. Biegiem ");
		System.out.println("wpadasz przez g��wne wej�cie do szpitala.");
		room35();

	}

	static void room43() {
		System.out.println(Var.row);
		System.out.println("Wa��sasz si� po starym szpitalu. Obraz jak z horroru. Masz nadziej�. Szukasz ");
		System.out.println("ratunku. Skr�casz w prawo i zauwa�asz zmasakrowane zw�oki przed wej�ciem ");
		System.out.println("do zamkni�tego magazynu. Lekarz czy lekarka? Trudno stwierdzi�. Przeszukujesz ");
		System.out.println("kieszenie. Znajdujesz zakrwawion� notatk�. Czytasz:\n");
		System.out.println("\"24.08.13 - zmiana kodu do sk�adu surowic z 4568 na 3211.\"");
		System.out.println("\nPo drugiej stronie:\n");
		System.out
				.println("\"Nowa surowica zdaje si� dzia�a�. Pacjent 23 prze�y� infekcj�. Konieczne dalsze badania\".");
		System.out.println(
				"\nOtwierasz sk�ad lekarstw. Na pu�kach pe�no pomara�czowych pude�ek z napisem: \"Surowica #18\".\n");
		System.out.println("Nie masz nic do stracenia. Wyjmujesz ampu�ko-strzykawk�. Wstrzykujesz nieznan� ");
		System.out.println("substancj�. B�l jest nie do wytrzymania. Upadasz na posadzk�. ");
		room47();
	}

	static void room44() {
		System.out.println(Var.row);
		System.out.println("Weszli�cie do szpitala. By� bohaterem nie zawsze pop�aca. Uratowany ");
		System.out.println("nieznajomy zmieni� si� za Twoimi plecami, gdy przygl�da�e� si� krwi na suficie. Musia� ");
		System.out.println("by� zara�ony. Niekt�rzy mo�e s� bardziej podatni i maj� mniej czasu. ");
		System.out.println("Niespodziewanego ataku nie mog�e� unikn��. Krwawisz i to mocno. Ucieka z Ciebie");
		System.out.println("woda �ycia. Umierasz zanim zombie zaczyna uczt�. Nie cierpisz. ");
		Menu.death();
	}

	static void room45() {
		System.out.println(Var.row);
		System.out.println("Prze�y�a�! Ale co to za �ycie. Trzymaj� Ci�, gdzie� na drugim podziemnym");
		System.out.println("poziomie kompleksu badawczo-militarnego. Trafi�a� do specjalnej, przytulnej ");
		System.out.println("(czerwonej) celi z telewizorem, prysznicem i wygodnym ��kiem. Jeste� narz�dziem ");
		System.out.println("do zaspokajania potrzeb niemytych �o�nierzy. Cz�sto kilka razy dziennie. Czasem wi�cej ");
		System.out.println("ni� jeden klient na raz. Twoja uroda, jest teraz Twoim przekle�stwem. D�ugie nogi, du�e ");
		System.out.println("i j�drne piersi oraz pon�tne oczy - wielu �o�dak�w lubie�nie si� nimi zachwyca. ");
		System.out.println("Nie masz si�y si� ju� opiera�. Popad�a� w depresj� i apati�. ");
		System.out.println("Na os�od� masz dobre jedzenie. W wolnych chwilach ogl�dasz zap�tlone nagrania ");
		System.out.println("na szklanym ekranie lub czytasz ksi��ki. Czasem z t�sknot� wspominasz swoje �ycie ");
		System.out.println("i wolno��. Zastanawiasz si� nad sko�czeniem ze sob�.");
		Menu.win();
	}

	static void room46() {
		System.out.println(Var.row);
		System.out.println("Prze�y�a�! Ale co to za �ycie. Trzymaj� Ci�, gdzie� na drugim podziemnym");
		System.out.println("poziomie kompleksu badawczo-militarnego. Trafi�a� do specjalnej, przytulnej ");
		System.out.println("(czerwonej) celi z telewizorem, prysznicem i wygodnym ��kiem. Jeste� narz�dziem ");
		System.out.println("do zaspokajania potrzeb niemytych �o�nierzy. Cz�sto kilka razy dziennie. Czasem wi�cej ");
		System.out.println("ni� jeden klient na raz. Bez r�ki Twoja uroda straci�a na blasku. Jednak niekt�rych");
		System.out.println("�o�dak�w bardzo to kr�ci.  Nie masz si�y si� ju� opiera�. Popad�a� w depresj� i apati�.");
		System.out.println("Na os�od� masz dobre jedzenie. W wolnych chwilach ogl�dasz zap�tlone nagrania");
		System.out.println("na szklanym ekranie lub czytasz ksi��ki. Czasem z t�sknot� wspominasz swoje �ycie ");
		System.out.println("i wolno��. Zastanawiasz si� nad sko�czeniem ze sob�.");
		Menu.win();

	}

	static void room47() {
		if (Var.event5 == true) {
			Random random = new Random();
			Var.luck = random.nextInt(2) + 1;
			if (Var.luck == 2) {
				room48();
			}
			if (Var.luck < 2) {
				room49();

			}
		}
		if (Var.event5 == false) {
			System.out.println(Var.row);
			System.out.println("Zdaje si�, ze surowica zadzia�a�a. Masz szcz�cie. �yjesz. Chowasz si�, gdzie�");
			System.out.println("na drugim pi�trze szpitala. Nie jest to najbezpieczniejsze miejsce, ale na teraz musi");
			System.out.println("wystarczy�. Zasypiasz ze zm�czenia. Jaka b�dzie przysz�o��? Nie wiadomo.");
			Menu.win();

		}

	}

	static void room48() {
		System.out.println(Var.row);
		System.out.println("Surowica nie zadzia�a. Umar�e�, ale nie powsta�e�. Zrobi�o si� ponuro. Na dworze ");
		System.out.println("zacz�� pada� deszcz.  S�o�ce zasz�o za chmurami.");
		Menu.death();

	}

	static void room49() {
		System.out.println(Var.row);
		System.out.println("Zdaje si�, ze surowica zadzia�a�a. Masz szcz�cie. �yjesz. Przynajmniej wi�kszo��");
		System.out.println("Twojego cia�a. R�ki nie da si� uratowa�. Z wielkim trudem znajdujesz anestetyk");
		System.out.println("(morfin�). Po 10 minutach odcinasz ko�czyn� znalezion� pi��. Chowasz si�, gdzie�");
		System.out.println("na drugim pi�trze szpitala. Nie jest to najbezpieczniejsze miejsce, ale na teraz musi");
		System.out.println("wystarczy�. Zasypiasz ze zm�czenia. Jaka b�dzie przysz�o��? Nie wiadomo. Musisz");
		System.out.println("poszuka� antybiotyk�w, by uchroni� si� przed zaka�eniem bakteryjnym. Mo�e");
		System.out.println("zabarykadujesz si� i pozostaniesz. A mo�e ostro�nie opu�cisz plac�wk� medyczn�");
		System.out
				.println("i ruszysz przed siebie. Nigdy nie wiadomo, czy w obiekcie nie zosta�y jakie� martwe dusze.");
		Menu.win();

	}

	static void room50() {
		if (Var.event1 == true) {
			room31();
		}
		if (Var.event1 == false) {
			System.out.println(Var.row);
			System.out.println("Przed wyj�ciem wypu�ci�e� swojego kota. Zabra�e� zapas wody, �ywno�ci i ubra�.");
			System.out.println("Nast�pnie ukrad�e� porzucony samoch�d - opuszczony w po�piechu; jeszcze");
			System.out.println("z kluczami w stacyjce. Paliwa wystarczy na podr� w jedn� stron�. Wybra�e� drog�");
			System.out
					.println("przez stary, chybotliwy most. Po godzinie doje�d�asz do miejsca, gdzie kiedy� zabiera�");
			System.out.println("Ci� ojciec, a p�niej wuj J�zek. Doje�d�asz do sztucznego jeziora z wysepk�. Pakujesz");
			System.out.println("zapasy i wsiadasz do starej ��dki. Dop�ywasz do wysepki nim przeciekaj�ca ��dka");
			System.out.println("zatonie. Jeste� ju� bezpieczny. Widzisz nieocieplon�, ma�� chatk� z nie najlepszym");
			System.out.println("dachem i jednym oknem. W �rodku znajdujesz troch� przedmiot�w codziennego");
			System.out.println("u�ytku, narz�dzia i w�dki.");
			System.out.println("Mijaj� dni. �pisz na kocu, przykryty drugim kocem. Doskwiera Ci zimno i nuda.");
			System.out.println("Racjonowane zapasy powoli si� ko�cz�. Od czasu do czasu �apiesz deszcz�wk�");
			System.out.println("lub �owisz ryby. Oczekujesz lepszego jutra.");
			Menu.win();

		}

	}
}
