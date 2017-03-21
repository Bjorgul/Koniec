
import java.util.Random;

public class Room {

	static void room1() {
		System.out.println(Var.row);
		System.out.println("Z daleka nie widzisz szczegó³ów. Jakaœ le¿¹ca osoba i zniszczony samochód.");
		System.out.println("Dzwonisz po pomoc.\n");
		System.out.println("wyjdz > Wychodzisz na zewn¹trz, aby udzieliæ pomocy poszkodowanym. ");
		System.out.println("zostan > Pozostajesz w domu i czekasz na rozwój wydarzeñ. Ogl¹dasz telewizjê (swój");
		System.out.println("\tulubiony serial), aby nie myœleæ o wypadku.");
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
		System.out.println("Siêgasz po swoj¹ lornetkê. Widzisz le¿¹ce zw³oki Pana Mariana (pracuje jako");
		System.out.println("sprz¹tacz w bazie wojskowej) z widocznym z³amaniem w podudziu. Kierowca siedzi");
		System.out.println("nieprzytomny w samochodzie. Chwytasz za telefon i wzywasz pomoc.\n");
		System.out.println("zostan > Zostajesz w domu i rozgl¹dasz siê dok³adniej przez lornetkê.");
		System.out.println("wyjdz > Wychodzisz udzieliæ pomocy.");
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
			System.out.println("Na dworze panuje lekki, ale nieprzyjemny ch³ód. Zbli¿asz siê do miejsca ");
			System.out.println("wypadku. Wœród ofiar rozpoznajesz s¹siada - Pana Mariana - cywilnego pracownika ");
			System.out.println("bazy wojskowej. Ma z³amane podudzie. W samochodzie siedzi obca, nieprzytomna");
			System.out.println("osoba. Podchodzisz do potr¹conego. W chwili gdy próbujesz nawi¹zaæ kontakt, ");
			System.out.println("zostajesz ugryziona w przedramiê. Wszelka miara zaskoczenia zostaje przekroczona. ");
			System.out.println(
					"Uciekasz z krzykiem przed siebie, potykaj¹c siê po drodze. Bolesna, rozleg³a rana krwawi");
			System.out.println("intensywnie. Nie mo¿esz dojœæ do siebie. ");
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
			System.out.println("Na dworze panuje lekki ch³ód. Zbli¿asz siê do miejsca wypadku. Podchodzisz ");
			System.out.println("do potr¹conego Pana Mariana. W chwili, gdy próbujesz nawi¹zaæ kontakt, zostajesz ");
			System.out.println("ugryziony w bark. Nie ma s³ów, by opisaæ Twoje zdumienie. Bolesna, rozleg³a rana");
			System.out.println("krwawi intensywnie. Uciekasz. PóŸniej tamujesz prowizorycznie wyciek p³ynu");
			System.out.println("ustrojowego za pomoc¹ zdjêtej i porwanej podkoszulki.\n");
			System.out.println("szpital > Jeœli chcesz iœæ do szpitala.");
			System.out.println("dom > Jeœli chcesz wróciæ do domu.");
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
		System.out.println("Ogl¹danie Twojego serialu przerwa³a seria strza³ów. Wygl¹dasz przez okno. ");
		System.out.println("Przyby³ radiowóz policyjny i ambulans. Trudno poj¹æ, to co widzisz. Jeden z sanitariuszy ");
		System.out.println("le¿y martwy poœród ka³u¿y krwi. Obok niego ofiara wypadku. Równie¿ we krwi. ");
		System.out.println("Najwidoczniej ranny w wypadku zosta³ zastrzelony przez policjantów. Tylko dlaczego?");
		System.out.println("Co siê sta³o? Policjanci nerwowo rozmawiaj¹ przez radio. Sanitariusz odje¿d¿a. Na ulicy ");
		System.out.println("doœæ pusto. Nie widzisz przechodniów. Przypominasz sobie o zamkniêciu drzwi ");
		System.out.println("do mieszkania i siadasz przed telewizorem. Dzisiaj ju¿ nie zaœniesz.\n");
		System.out.println("wez > Jeœli chcesz wzi¹æ dla lepszego samopoczucia nó¿ kuchenny.");
		System.out.println("zostaw > Jeœli nie chcesz braæ no¿a.");
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
		System.out.println("Stoisz przy oknie przez dobre piêæ minut i czekasz na przybycie s³u¿b. Jeszcze");
		System.out.println("raz patrzysz przez lornetkê. Niespodziewanie zmasakrowane zw³oki starszego Pana ");
		System.out.println("Mariana, le¿¹ce na jezdni, zaczynaj¹ siê poruszaæ. Po chwili wstaj¹ i chybotliwym");
		System.out.println("krokiem poruszaj¹ siê bez³adnie. Co to?! Martwy powsta³?! Czy ja dobrze widzê?! ");
		if (Var.event3 == true) {
			System.out.println("A mo¿e oszala³em?");
		}
		if (Var.event3 == false) {
			System.out.println("A mo¿e oszala³am?");
		}
		System.out.println("Po 25 minutach przyje¿d¿a policja i pogotowie. Nie zauwa¿y³eœ przechodniów - mo¿e ");
		System.out.println("dlatego ¿e mecz nied³ugo siê zacznie. Policjanci zaczêli ogl¹daæ miejsce wypadku. ");
		System.out.println("Sanitariusze natomiast próbowali udzieliæ pomocy poszkodowanym. Jeden z nich ");
		System.out.println("podszed³ do dziwnie wygl¹daj¹cej ofiary z przetr¹con¹ nog¹. Niespodziewanie");
		System.out.println(
				"nast¹pi³ atak i zosta³ œmiertelnie i krwisto ugryziony w szyjê. Upad³. Drugi s³ysz¹c krzyki ");
		System.out.println("swojego kolegi, przerwa³ badanie stanu kierowcy. Obejrza³ siê za siebie i zobaczy³ ");
		System.out.println("makabrê. Pobieg³ do zdezorientowanych stró¿ów prawa. Marian, a w³aœciwie jego ");
		System.out.println("zw³oki zajê³y siê konsumpcj¹ cia³a ratownika. Pad³y strza³y, choæ zdawa³o");
		System.out.println("by siê, ¿e nie wyrz¹dzi³y znacznej szkody. Dopiero celne trafienie w g³owê powali³o ");
		System.out.println("przeciwnika. Policjanci wezwali pomoc drog¹ radiow¹. Sanitariusz wsiad³ ");
		System.out.println("do ambulansu i odjecha³. ");
		System.out.println("Postanawiasz zostaæ w domu. K³adziesz siê spaæ.\n");
		System.out.println("noz > Jeœli chcesz schowaæ pod poduszkê nó¿ kuchenny.");
		System.out.println("zostaw > Jeœli chcesz zostawiæ nó¿ w kuchni.");
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
		System.out.println("Nasta³ kolejny dzieñ. Nieprzyjemne wspomnienia wydarzeñ sprzed kilku godzin ");
		System.out.println("ci¹gle powracaj¹. Przez okno widzisz, ¿e miejsce zdarzenia nie zosta³o uprz¹tniête. ");
		System.out.println("Nad zw³okami ¿eruj¹ miêso¿ercy. Jest ich wiêcej. Czêœæ wa³êsa siê bezcelowo. Jakby ");
		System.out.println("czekaj¹c na ¿ywych ludzi. Ktoœ w oddali wo³a o pomoc. Jednak jest poza zasiêgiem ");
		System.out.println("wzroku. Ktoœ wali do drzwi. Nie otwierasz. Patrzysz przez wizjer. To oni! Zastawiasz drzwi ");
		System.out.println("szafk¹.");
		System.out.println("Zabanda¿owana rana nadal krwawi. Chocia¿ mniej ni¿ poprzednio. \n");
		System.out.println("rana > Jeœli chcesz profilaktycznie ponownie j¹ odkaziæ, a potem przypaliæ ogniem.");
		System.out.println("zostaw > Jeœli chcesz j¹ zostawiæ jak jest.");
		Var.choice = Var.scanner.nextLine();
		if (Var.choice.equals("rana")) {
			Var.event4 = true;
			System.out.println("\n Rana wygl¹da trochê lepiej.");
			room6_C();
					}
		if (Var.choice.equals("zostaw")) {
			System.out.println("\nRana wygl¹da Ÿle.");
			room6_C();
		} else {
			room6_B();
		}
	}

	static void room6_C() {

		System.out.println("szpital > Postanawiasz udaæ siê do szpitala. Nie mo¿na zaniedbaæ rany.");
		System.out.println("policja > Wymykasz siê przez okno i kierujesz siê na posterunek policji.");
		System.out.println("ucieczka > Wymykasz siê przez okno i uciekasz poza miasto. ");
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
		System.out.println("Nasta³ kolejny dzieñ. Nieprzyjemne wspomnienia wydarzeñ sprzed kilku godzin ");
		System.out.println("ci¹gle powracaj¹. Przez okno widzisz, ¿e miejsce zdarzenia nie zosta³o uprz¹tniête. ");
		System.out.println("Nad zw³okami ¿eruj¹ padlino¿ercy (i nie tylko). Jest ich wiêcej. Czêœæ wa³êsa");
		System.out.println("siê bezcelowo. Jakby czekaj¹c na ¿ywych ludzi. Ktoœ w oddali wo³a o pomoc. Jednak ");
		System.out.println("jest poza zasiêgiem wzroku. Ktoœ wali do drzwi. Nie otwierasz. Patrzysz przez wizjer. ");
		System.out.println("To oni! Zastawiasz drzwi szafk¹.\n");
		System.out.println("policja >  Wymykasz siê przez okno i kierujesz siê na posterunek policji.");
		System.out.println("ucieczka > Wymykasz siê przez okno i uciekasz poza miasto.");
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
		System.out.println("Szok by³ silniejszy od Ciebie. Stanê³aœ, gdzieœ na ulicy, nie zwracaj¹c ");
		System.out.println("na nic uwagi. Up³yw krwi, by³ zbyt intensywny. Co raz bardziej stawa³aœ siê ospa³a");
		System.out.println("Usiad³aœ na chodniku. Dopad³a Ciê ciemnoœæ i skoñczy³ siê Twój byt. Twoje cia³o le¿y ");
		System.out.println("zanurzone we krwi.");
		Menu.death();

	}

	static void room8() {
		System.out.println(Var.row);
		System.out.println("Bieg³aœ, gdzieœ przez chwilê. Jednak nie da³ o sobie zapomnieæ ból rêki. ");
		System.out.println("Zatrzyma³aœ siê, by zatamowaæ krwawienie tkanin¹ z sukienki.\n");
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
			System.out.println("Jest ju¿ zmrok. Panuje nieprzyjemna cisza. Idziesz niepewnym krokiem przed ");
			System.out
					.println("siebie. W drodze na przystanek autobusowy atakuje Ciê kolejny, niezbyt ¿ywy paralityk.");
			System.out.println(
					"Nie potrafisz wyjaœniæ zaistnia³ej sytuacji. Wa¿ne jest przetrwanie. Walczysz. Uderzasz. ");
			System.out.println("Nie wiele to daje. Odpychasz mamrocz¹cego wroga, który usi³uje gryŸæ. Uciekasz. ");
			System.out.println("Niestety potykasz siê na nierówno po³o¿onym chodniku. Dopada Ciê. K¹sa. Rwie miêso. ");
			System.out.println("Odgryza palec. Dosiêga têtnicy szyjnej. Krew szybko ucieka z Ciebie. To ju¿ koniec. ");
			System.out.println("Makabryczna œmieræ w nagrodê za niewinnoœæ. Giniesz w mêczarniach. Ktoœ z oddali");
			System.out.println("patrzy na Twoje zw³oki. Cieszy siê, ¿e nie podzieli³ tego samego losu. Nie udzieli³ ");
			System.out.println("pomocy. Po co siê nara¿aæ?");
			Menu.death();

		}

	}

	static void room10() {
		System.out.println(Var.row);
		System.out.println("Nasta³ nowy dzieñ. Widaæ delikatn¹ mg³ê. Nie jesteœ jednak ju¿ sob¹. Rana ");
		System.out.println("okaza³a siê groŸniejsza, ni¿ mo¿na by³o przypuszczaæ. Do³¹czasz do grona swoich");
		System.out.println("miêso¿ernych braci i sióstr, których przybywa z ka¿d¹ chwil¹. Pastwisz siê nad cia³ami. ");
		System.out.println("Te, które nie zosta³y ca³kowicie zjedzone, \"o¿ywaj¹\".");
		Menu.death();
	}

	static void room11() {
		System.out.println(Var.row);
		System.out.println("W drodze do najbli¿szego szpitala zauwa¿asz opuszczony radiowóz.\n");
		System.out.println("zobacz > Zagl¹dasz do œrodka pojazdu.");
		System.out.println("odejdz > Omijasz samochód i idziesz dalej do szpitala.");
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
				System.out.println("Przed wyjœciem wypuœci³eœ swojego kota. Nastêpnie ukrad³eœ porzucony");
				System.out.println("samochód - opuszczony w poœpiechu. Paliwa wystarczy na podró¿ w jedn¹ stronê. ");
				System.out.println("Gdy prawie uda³o Ci siê opuœciæ to koszmarne miasto, zatrzymuje Ciê ma³y patrol");
				System.out.println("¿o³nierzy. Blokuj¹ drogê przejazdu. Posadzono Ciê z ty³u ciê¿arówki z paskami ");
				System.out.println("zaciskowym na rêkach i nogach.\n");
				room13_A();

			}
		}
		if (Var.event3 == false) {
			System.out.println(Var.row);
			System.out.println("Ukrad³aœ porzucony samochód - opuszczony w poœpiechu. Wziê³aœ ze sob¹ ");
			System.out.println("swojego psa. Wybra³aœ d³u¿sz¹ drogê omijaj¹c¹ stary, chybotliwy most.  Paliwa ");
			System.out.println("wystarczy na podró¿ w jedn¹ stronê. Gdy prawie uda³o Ci siê opuœciæ to koszmarne ");
			System.out.println("miasto, zatrzymuje Ciê ma³y patrol ¿o³nierzy. Blokuj¹ drogê przejazdu.\n");
			System.out.println("odpusc > Poddajesz siê");
			System.out.println("walcz > Opierasz siê.");
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
			System.out.println("czekaj > Nie podejmujesz dalszych dzia³añ i czekasz na dalszy postêp wydarzeñ.");
			System.out.println("tnij - Próbujesz przeci¹æ wiêzy za pomoc¹ no¿a kuchennego.");
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
			System.out.println("Nie podejmujesz dalszych dzia³añ i czekasz na dalszy postêp wydarzeñ.");
			room22();
		}

	}

	static void room14() {
		System.out.println(Var.row);
		if (Var.event3 == true) {

			System.out.println("Barykadujesz swój niedu¿y dom. Zabijasz lichymi deskami i krzywymi gwoŸdŸmi");
			System.out.println("drzwi i okna. Dodatkowo stawiasz ciê¿kie dêbowe meble z litego drewna - stanowi¹");
			System.out.println("niez³¹ przeszkodê (przyda³y siê miêœnie wyrobione na si³owni). Nie bêdzie ³atwo");
			System.out.println("wtargn¹æ do œrodka. Powiedzenie \"Twój dom, twoja twierdza\" nabiera nowego");
			System.out.println("znaczenia. Dopóki nie zanika pr¹d, ogl¹dasz awaryjny przekaz telewizyjny. Dowiadujesz");
			System.out.println("siê, ¿e sytuacja pogarsza siê z godziny na godzinê, a na ulicach panuje chaos. Problem");
			System.out.println("nieumar³ych rozszerza siê. Telefony nie dzia³aj¹. ¯ywnoœæ w lodówce szybko siê psuje.");
			System.out.println("Pijesz deszczówkê z wystawionych wiader na lekko skoœnym dachu. ¯ywisz siê surowymi");
			System.out.println("warzywami i cukrem. W nocy Ÿród³em œwiat³a jest ma³a œwieczka. ¯yjesz z dnia na dzieñ,");
			System.out.println("zachowuj¹c ciszê. Od czasu do czasu s³ychaæ dobijanie siê do drzwi lub okien. Czasem");
			System.out.println("ktoœ wo³a o pomoc, ale udajesz, ¿e nie s³yszysz. Pomoc nie nadchodzi. Mo¿e za tydzieñ");
			System.out.println("- powtarzasz sobie. Masz nadziejê, ¿e wojsko wkroczy i opanuje sytuacjê. Ale czy nie");
			System.out.println("zabraknie Ci ¿ywnoœci do tego czasu? ");
			System.out.println("Wypuszczasz kota. Nie chcesz dzieliæ ");
			System.out.println("siê resztkami. £udzisz siê, ¿e ma szansê na prze¿ycie.");
			Menu.win();
		}
		if (Var.event3 == false) {
			System.out.println("Barykadujesz swój niedu¿y dom. Zabijasz lichymi deskami i krzywymi gwoŸdŸmi");
			System.out.println("drzwi i okna. Dodatkowo stawiasz ciê¿kie dêbowe meble z litego drewna - stanowi¹");
			System.out.println("niez³¹ przeszkodê (przyda³y siê miêœnie wyrobione na si³owni). Nie bêdzie ³atwo");
			System.out.println("wtargn¹æ do œrodka. Powiedzenie \"Twój dom, twoja twierdza\" nabiera nowego");
			System.out.println("znaczenia. Dopóki nie zanika pr¹d, ogl¹dasz awaryjny przekaz telewizyjny. Dowiadujesz");
			System.out.println("siê, ¿e sytuacja pogarsza siê z godziny na godzinê, a na ulicach panuje chaos. Problem");
			System.out.println("nieumar³ych rozszerza siê. Telefony nie dzia³aj¹. ¯ywnoœæ w lodówce szybko siê psuje.");
			System.out.println("Pijesz deszczówkê z wystawionych wiader na lekko skoœnym dachu. ¯ywisz siê surowymi");
			System.out.println("warzywami i cukrem. W nocy Ÿród³em œwiat³a jest ma³a œwieczka. ¯yjesz z dnia na dzieñ,");
			System.out.println("zachowuj¹c ciszê. Od czasu do czasu s³ychaæ dobijanie siê do drzwi lub okien. Czasem");
			System.out.println("ktoœ wo³a o pomoc, ale udajesz, ¿e nie s³yszysz. Pomoc nie nadchodzi. Mo¿e za tydzieñ");
			System.out.println("- powtarzasz sobie. Masz nadziejê, ¿e wojsko wkroczy i opanuje sytuacjê. Ale czy nie");
			System.out.println("zabraknie Ci ¿ywnoœci do tego czasu? ");
			System.out.println("Albo czy barykada wytrzyma?");
			Menu.win();

		}

	}

	static void room15() {
		System.out.println(Var.row);
		if (Var.event4 == false) {
			System.out.println("Stan rany siê pogorszy³. Zaczê³a gniæ, a swêdzenie wraz z czuciem zanik³y. Jest ");
			System.out.println("ju¿ za póŸno. Chwilê póŸniej iloœæ (¿ywych) mieszkañców pomniejszy³a siê o jedn¹ ");
			System.out.println("osobê. Ciebie!");
			Menu.death();
		}
		if (Var.event4 == true) {
			System.out.println("Stan rany siê pogorszy³. Zaczê³a gniæ, a swêdzenie wraz z czuciem zanik³y. Masz ");
			System.out.println("jeszcze niewielk¹ szansê na ¿ycie. Twoja lewa koñczyna jest ju¿ martwa. Zaciskasz ");
			System.out.println("j¹ bardzo ciasno paskiem i próbujesz dostaæ siê do szpitala.");
			Var.event5 = true;
			room11();

		}

	}

	static void room16() {
		System.out.println(Var.row);
		System.out.println("Barykadujesz swój niedu¿y dom. Zabijasz lichymi deskami i krzywymi gwoŸdŸmi ");
		System.out.println("drzwi i okna. Dopóki nie zanika pr¹d, ogl¹dasz awaryjny przekaz telewizyjny.");
		System.out.println("Dowiadujesz siê, ¿e sytuacja pogarsza siê z godziny na godzinê, a na ulicach panuje ");
		System.out.println("chaos. Problem nieumar³ych rozszerza siê. Telefony nie dzia³aj¹. ");
		System.out.println("Miêso¿erni paralitycy wyczuli Twoje perfumy. Dobijaj¹ siê. Przybijasz w chaosie kolejne ");
		System.out.println("deski. Czêœæ nie chce siê trzymaæ i odpada. Przypadkiem uderzasz siê m³otkiem w d³oñ. ");
		System.out.println("Pchasz ca³¹ si³¹ drzwi. Dom jest otoczony. Nie masz jak uciec.\n");
		System.out.println("walcz > Walczysz do koñca.");
		System.out.println("tnij > Podcinasz sobie ¿y³y");
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
		System.out.println("Ostrym no¿em nacinasz pod³u¿nie arterie. Czujesz zimno, smutek i ból. Zapadasz ");
		System.out.println("w wieczny sen. Szybka œmieræ (przynajmniej dla Ciebie). Pies nie mia³ tyle szczêœcia. ");
		System.out.println("Kilka minut i barykada zostaje sforsowana. Nie cierpisz, gdy Twoje cia³o rozszarpuje");
		System.out.println("ksi¹dz i s¹siadka.");
		Menu.death();

	}

	static void room18() {
		System.out.println(Var.row);
		System.out.println("Nie poddajesz siê. Kilka minut i barykada zostaje sforsowana. Zostajesz po¿arta ");
		System.out.println("¿ywcem. Twój pies rzuca siê na ratunek, ale równie Ÿle koñczy. Nie giniesz od razu.");
		System.out.println("Bardzo cierpisz. Na resztkach ¿eruj¹ ksi¹dz i s¹siadka.\n");
		Menu.death();

	}

	static void room19() {
		System.out.println(Var.row);
		System.out.print("Uda³o Ci siê dotrzeæ do posterunku policji");
		if (Var.event3 == true) {
			System.out.print(" z psem");
		}
		System.out.print(". Czeœæ mieszkañców\n");
		System.out.print("zabarykadowa³o siê tam (równie¿ jeden policjant). Zatai³");
		if (Var.event3 == true) {
			System.out.print("eœ");
		}
		if (Var.event3 == false) {
			System.out.print("aœ");
		}
		System.out.print(" fakt ugryzienia. Udawa³");
		if (Var.event3 == true) {
			System.out.print("eœ");
		}
		if (Var.event3 == false) {
			System.out.print("aœ");
		}
		System.out.print(", ¿e to objawy\n");
		if (Var.event3 == true) {
			System.out.print("zatrucia pokarmowego");
		}
		if (Var.event3 == false) {
			System.out.print("grypy");
		}
		System.out.print(". Infekcja zrobi³a swoje. Po zmianie ");
		if (Var.event3 == true) {
			System.out.print("zaatakowa³eœ i pogryz³eœ");
		}
		if (Var.event3 == false) {
			System.out.print("rzuci³aœ siê w szale na innych");
			System.out.print("i pogryz³aœ");
		}
		System.out.print("\nkilkoro ludzi (trzeba by³o ich zastrzeliæ)");
		if (Var.event3 == true) {
			System.out.print(", zanim dosta³eœ metalowym kijem bejsbolowym\npo g³owie. ");
		}
		if (Var.event3 == false) {

			System.out.println(".\nTwój mózg zosta³ zniszczony metalow¹ rur¹. ");
		}
		Menu.death();

	}

	static void room20() {
		System.out.println(Var.row);
		System.out.println("Stan rany siê pogorszy³. Zaczê³a gniæ, a swêdzenie wraz z czuciem zanik³y. Masz ");
		System.out.println("jeszcze niewielk¹ szansê na ¿ycie. Twoja lewa koñczyna jest ju¿ martwa. Zaciskasz ");
		System.out.println("j¹ bardzo ciasno paskiem i próbujesz dostaæ siê do szpitala.");
		Var.event5 = true;
		room11();

	}

	static void room21() {
		System.out.println(Var.row);
		System.out.println("Uda³o siê! Wiêzy przeciête. Nie ma czasu. Wyskakujesz z rozpêdzonej ciê¿arówki.");
		System.out.println("£amiesz sobie nadgarstek, ale ¿yjesz. Uciekasz do lasu.");
		if (Var.event1 == true) {
			System.out.println("Mija godzina i zmieniasz siê w zombie. To ju¿ koniec walki o przetrwanie. ");
			System.out.println("Twoim priorytetem jest miêso! Du¿o miêsa! ");
			Menu.death();
		}
		if (Var.event1 == false) {
			System.out.println("Masz szansê. Strze¿ siê nieznanego!");
			System.out.println("W oddali, miêdzy drzewami widzisz sylwetkê cz³owieka...");
			Menu.win();
		}

	}

	static void room22() {
		System.out.println(Var.row);
		if (Var.event4 == false) {
			System.out.println("Po drodze zmieniasz siê w zombie. Dostajesz kulkê w g³owê. Twoje cia³o zostaje");
			System.out.println("porzucone przy drodze. Zlatuj¹ siê ptaki i ¿ywi¹ siê Twoim miêsem.");
			Menu.death();

		}
		if (Var.event4 == true) {
			System.out.println("Po 15 minutach doje¿d¿asz do bazy wojskowej. Dostajesz surowicê ");
			System.out.println("odpornoœciow¹. Mo¿e prze¿yjesz. Masz szanse pó³ na pó³. Odka¿enie i przypalenie rany ");
			System.out.println("da³o Ci trochê wiêcej czasu. Jako ¿ywy mo¿e dostaniesz karabin i do³¹czysz do armii ");
			System.out
					.println("(nie dobrowolnie). Jeœli nie zachowasz ¿ycia, to staniesz siê królikiem doœwiadczalnym.");
			System.out.println("Bêd¹ Twoj¹ pó³-martw¹ wersjê truæ, raziæ pr¹dem, podpalaæ i kroiæ. Dostarczysz");
			System.out.println("przydatnych informacji dotycz¹cych tej plagi.");
			Menu.win();

		}

	}

	static void room23() {
		System.out.println(Var.row);
		System.out.print("Uda³o Ci siê dotrzeæ do posterunku policji");
		if (Var.event3 == true) {
			System.out.print(" ze swoim psem");
		}
		System.out.print(". ");
		System.out.println("Czeœæ mieszkañców zabarykadowa³o siê tam (równie¿ jeden policjant).");
		System.out.println(
				"Jest zapas wody, ¿ywnoœci, broni i amunicji. Nie ma ³¹cznoœci, ale jest nadzieja na przetrwanie.");
		System.out
				.println("Zmêczeni i zestresowani oczekujecie lepszego jutra. Mo¿e nadejdzie pomoc ze strony wojska? ");
		Menu.win();

	}

	static void room24() {
		System.out.println(Var.row);
		System.out.println("Prze¿y³aœ! Ale co to za ¿ycie. Trzymaj¹ Ciê, gdzieœ na drugim podziemnym ");
		System.out.println("poziomie kompleksu badawczo-militarnego. Trafi³aœ do specjalnej, przytulnej");
		System.out.println("(czerwonej) celi z telewizorem, prysznicem i wygodnym ³ó¿kiem. Jesteœ narzêdziem ");
		System.out.println("do zaspokajania potrzeb niemytych ¿o³nierzy. Czêsto kilka razy dziennie. Czasem wiêcej");
		System.out.println("ni¿ jeden klient na raz. Twoja uroda, jest teraz Twoim przekleñstwem. D³ugie nogi, du¿e ");
		System.out.println("i jêdrne piersi oraz ponêtne oczy - wielu ¿o³daków lubie¿nie siê nimi zachwyca.");
		System.out.println("Nie masz si³y siê ju¿ opieraæ. Popad³aœ w depresjê i apatiê.");
		System.out.println("Na os³odê masz dobre jedzenie. W wolnych chwilach ogl¹dasz zapêtlone nagrania ");
		System.out.println("na szklanym ekranie lub czytasz ksi¹¿ki. Czasem z têsknot¹ wspominasz swoje ¿ycie ");
		System.out.println("i wolnoœæ. Zastanawiasz siê nad skoñczeniem ze sob¹.");
		System.out.println("Twój pies podobno s³u¿y jako stró¿ na wartowni.");
		Menu.win();

	}

	static void room25() {
		if (Var.event1 == true) {

			System.out.println(Var.row);
			if (Var.event4 == true) {
				System.out.println("Po 15 minutach doje¿d¿asz do bazy wojskowej. Pozwolono Ci zabraæ ");
				System.out.println("psa. Dostajesz surowicê odpornoœciow¹. Mo¿e prze¿yjesz. Masz szanse pó³ na pó³. ");
				System.out.println("Odka¿enie i przypalenie rany da³o Ci trochê wiêcej czasu.");
				room24();
			}

			if (Var.event4 == false) {
				System.out.println("Po drodze zmieniasz siê w zombie. Dostajesz kulkê w g³owê. Twoje cia³o zostaje ");
				System.out.println("porzucone przy drodze. Zlatuj¹ siê ptaki i ¿ywi¹ siê Twoj¹ padlin¹.");
				Menu.death();

			}
		}
		if (Var.event1==false) {
			room24();
		}

	}

	static void room26() {
		System.out.println(Var.row);
		System.out.println("Falkon staje w Twojej obronie. Przyp³aca to ¿yciem.");
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
		System.out.println("W trakcie ucieczki zosta³aœ zastrzelona. Szybka œmieræ koñczy Twoje ¿ycie.");
		Menu.death();

	}

	static void room28() {
		System.out.println(Var.row);
		if (Var.event1 == true) {
			System.out.println("Uciek³aœ od ¿o³nierzy, ale los nie by³ ³askawy. Infekcja zrobi³a swoje - zmieniasz ");
			System.out.println("siê w zombie. Nie zachowa³aœ swego istnienia. Przynajmniej nie w po¿¹danej formie. ");
			Menu.death();
		}
		if (Var.event1 == false) {
			System.out.println("Korzystasz z zaskoczenia i uciekasz do lasu. Bieg³aœ ile si³ w nogach. Uda³o ");
			System.out
					.println("siê! Masz szansê prze¿yæ. W oddali, miêdzy drzewami spostrzegasz sylwetkê cz³owieka...");
			Menu.win();
		}

	}

	static void room29() {
		System.out.println(Var.row);
		System.out.println("Minê³o 10 minut. Jesteœ niedaleko starego szpitala (który od dziesiêciu ");
		System.out.println("lat nie mo¿e doczekaæ siê remontu. Nagle s³yszysz wo³anie o pomoc. Co robisz?\n");
		System.out.println("ignoruj > Ignorujesz. Nie ma czasu do stracenia.");
		System.out.println("pomoz > Idziesz z pomoc¹. Ka¿da dodatkowa osoba zwiêksza Twoje szanse na prze¿ycie.");
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
		System.out.println("Rozgl¹dasz siê uwa¿nie. Znajdujesz w œrodku (pod siedzeniem) na³adowany ");
		System.out.println("rewolwer. Zabierasz go ze sob¹. Idziesz w kierunku szpitala. Ju¿ niedaleko. ");
		Var.event7 = true;
		room29();
	}

	static void room31() {
		System.out.println(Var.row);
		System.out.println("W po³owie drogi, w czasie jazdy zaczynasz bardzo Ÿle siê czuæ. Wychodzisz ");
		System.out.println("z pojazdu, aby nie wymiotowaæ w œrodku. Infekcja zrobi³a swoje. Zmieniasz ");
		System.out
				.println("siê w zombie. Jesteœ wolny.  Teraz Twoj¹ rodzin¹ jest plaga. Zabijasz niewinnych i ¿ywisz ");
		System.out.println("siê ich miêsem. ");
		Menu.death();

	}

	static void room32() {
		System.out.println(Var.row);
		System.out.println("Minê³o 10 minut. Jesteœ niedaleko starego szpitala (który od dziesiêciu");
		System.out.println("lat nie mo¿e doczekaæ siê remontu). W oddali spostrzegasz grupkê zombie");
		System.out.println("pastwi¹cych siê nad jakimiœ zw³okami. Skradasz siê. Chowasz siê za porzuconymi");
		System.out.println("pojazdami lub innymi przeszkodami. Szybko, ale równoczeœnie ostro¿nie wchodzisz");
		System.out.println("do szpitala g³ównym wejœciem.");
		room35();

	}

	static void room33() {
		System.out.println(Var.row);
		System.out.println("Unikasz kontaktu. Skradasz siê. Chowasz siê za porzuconymi pojazdami lub innymi ");
		System.out.println("przeszkodami. Szybko, ale równoczeœnie ostro¿nie wchodzisz do szpitala g³ównym ");
		System.out.println("wejœciem.");
		room35();

	}

	static void room34() {
		System.out.println(Var.row);
		System.out.println("Podbiegasz. To mê¿czyzna. Jest atakowany przez grupê (trio) zombie! ");
		System.out.println("Wymachuje i bije brzydali metalow¹ rur¹. Jeszcze chwila i go pogryz¹!");
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
				System.out.println("Szpital wygl¹da na opuszczony. Widaæ ba³agan. Co nieco œmieci rozrzuconych ");
				System.out
						.println("na posadce. Przewrócony wózek inwalidzki przy wejœciu. Krew na œcianach, pod³odze ");
				System.out.println(
						"i suficie! Nie widzisz ju¿ zombie. Mo¿e sobie posz³y. A mo¿e gdzieœ siê czaj¹. Nie masz ");
				System.out.println("zamiaru ich szukaæ.");
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
		System.out.println("Uda³o siê! Nowo poznany mê¿czyzna, który nie chcia³ siê przedstawiæ, dotrzyma³ ");
		System.out.println("s³owa i zaprowadzi³ Ciê do sk³adu, gdzie trzymana by³a eksperymentalna surowica ");
		System.out.println("odpornoœciowa. Zna³ kod do zamka cyfrowego na drzwiach. Szczêœcie Ci dopisa³o. ");
		System.out.println("Surowica zadzia³a³a i zwalczy³a infekcjê. Chocia¿ zastrzyk by³ bardzo bolesny. ");
		System.out.println("Ból powali³ siê na chwilê na pod³ogê. Zachowasz rêkê, jeœli rana siê zaleczy. ");
		System.out.println("Nieznajomy zabra³ jakieœ próbki do przenoœnej lodówki i wezwa³ pomoc. Pozwoli³ ");
		System.out.println("iœæ ze sob¹ pod warunkiem, ¿e nie bêdziesz zadawaæ ¿adnych pytañ. Udaliœcie ");
		System.out.println("siê wind¹ na dach. Po kwadransie przylecia³ czarny helikopter. ");
		if (Var.event3 == true) {
			Menu.win();
		}
		if (Var.event3 == false) {
			room45();
		}

	}

	static void room37() {
		System.out.println(Var.row);
		System.out.println("Uda³o siê! Celne strza³y w g³owê powali³y przeciwników. Zaatakowany");
		System.out.println("mê¿czyzna prze¿y³. Cudem. Nie zosta³ równie¿ pogryziony. Czy aby na pewno?.");
		System.out.println("Uratowany okaza³ siê byæ pracownikiem szpitala. Nie chcia³ jednak za du¿o ");
		System.out.println("opowiadaæ o swojej pracy. Zauwa¿y³ Twoj¹ ranê. Masz szansê. Obieca³, ¿e zaprowadzi");
		System.out.println("Ciê do sk³adu, gdzie znajdziesz eksperymentalne lekarstwo. Czas jest kluczowy. ");
		System.out.println("Wchodzicie poœpiesznie do szpitala przez g³ówne wejœcie.");
		Var.event6 = true;
		room35();

	}

	static void room38() {
		System.out.println(Var.row);
		System.out.println("Wyci¹gasz szeœciokomorowy, b³yszcz¹cy rewolwer. Celujesz i strzelasz.");
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
			System.out.println("Trzeba mierzyæ si³y na zamiary. Nie masz ju¿ okazji siê nad tym zastanowiæ. ");
			System.out.println("Rzucasz siê na grupkê zombie. Nie odnosi to w³aœciwego skutku. Lepiej mieæ broñ ");
			System.out.println(
					"paln¹, ni¿ j¹ nie mieæ. Koñczysz tak, jak zaatakowany mê¿czyzna (czyli marnie). Stajesz ");
			System.out.println(
					"siê karm¹ dla brzydali. Nie jest to mi³y los, szczególnie gdy jeszcze ¿yjesz podczas uczty.\n");
			System.out.println("¯yj. Nie umieraj! Nie b¹dŸ bohaterem. Lepszy ¿ywy woŸny, ni¿ groŸny i martwy Rambo. ");
			System.out.println("Drobna uwaga - czerwona sukienka dzia³a jak p³achta na byka.");
			Menu.room_Start2(); // przegrana
		}
		if (Var.event3 == true) {
			room42();
		}

	}

	static void room40() {
		System.out.println(Var.row);
		System.out.println("Zadr¿a³a Ci rêka. Spud³owa³eœ. Mê¿czyzna z³apany w pu³apkê, zosta³ pogryziony. ");
		System.out.println("Musia³eœ go zastrzeliæ. Tak samo uczyni³eœ z miêso¿ernymi paralitykami. Wchodzisz ");
		System.out.println("poœpiesznie do szpitala przez g³ówne wejœcie.");
		room35();

	}

	static void room41() {
		Random random = new Random();
		Var.luck = random.nextInt(2) + 1;
		if (Var.luck == 2) {
			System.out.println(Var.row);
			System.out.println("Uda³o siê! Nowo poznany mê¿czyzna, który nie chcia³ siê przedstawiæ, dotrzyma³ ");
			System.out.println("s³owa i zaprowadzi³ Ciê do sk³adu, gdzie trzymana by³a eksperymentalna surowica ");
			System.out.println("odpornoœciowa. Zna³ kod do zamka cyfrowego na drzwiach. Szczêœcie Ci dopisa³o. ");
			System.out.println("Surowica zadzia³a³a i zwalczy³a infekcjê. Chocia¿ zastrzyk by³ bardzo bolesny. ");
			System.out.println("Ból powali³ siê na chwilê na pod³ogê. Koñczynê trzeba by³o prowizorycznie i boleœnie ");
			System.out.println("amputowaæ. Nieznajomy zabra³ jakieœ próbki do przenoœnej lodówki i wezwa³ pomoc. ");
			System.out.println("Pozwoli³ iœæ ze sob¹ pod warunkiem, ¿e nie bêdziesz zadawaæ ¿adnych pytañ. Udaliœcie ");
			System.out.println("siê wind¹ na dach. Po kwadransie przylecia³ czarny helikopter. ");
			if (Var.event3 == false) {
				room46();
			}
			Menu.win();
		}
		if (Var.luck < 2) {
			System.out.println(Var.row);
			System.out.println("Nowo poznany mê¿czyzna, który nie chcia³ siê przedstawiæ, dotrzyma³ s³owa ");
			System.out.println("i zaprowadzi³ Ciê do sk³adu, gdzie trzymana by³a eksperymentalna surowica ");
			System.out.println("odpornoœciowa. Zna³ kod do zamka cyfrowego na drzwiach. Zastrzyk by³ bardzo ");
			System.out.println("bolesny. Ból powali³ Ciê na chwilê na pod³ogê. Szczêœcie Ci nie dopisa³o. Surowica ");
			System.out
					.println("nie zadzia³a³a i nie zwalczy³a infekcji.  Nieznajomy Ÿle oceni³ Twój stan. Nie bêdzie ");
			System.out
					.println("ju¿ niczego wiêcej bada³. Jesteœ czêœci¹ plagi, a on jest jedzeniem. Jakie to proste! ");
			Menu.death();

		}

	}

	static void room42() {
		System.out.println(Var.row);
		System.out.println("Trzeba mierzyæ si³y na zamiary. Chcesz siê rzucaæ na zombie bez broni palnej? ");
		System.out.println("Zwróci³eœ na siebie uwagê, ale zm¹drza³eœ w ostatniej chwili i wzi¹³eœ nogi za pas. ");
		System.out.println("Ta walka by³a przegrana. Zaatakowany mê¿czyzna sta³ siê karm¹ dla zombie. O ma³y");
		System.out.println("w³os nie zgin¹³eœ. Uratowa³y Ciê d³ugie nogi i dobra wydolnoœæ fizyczna. Biegiem ");
		System.out.println("wpadasz przez g³ówne wejœcie do szpitala.");
		room35();

	}

	static void room43() {
		System.out.println(Var.row);
		System.out.println("Wa³êsasz siê po starym szpitalu. Obraz jak z horroru. Masz nadziejê. Szukasz ");
		System.out.println("ratunku. Skrêcasz w prawo i zauwa¿asz zmasakrowane zw³oki przed wejœciem ");
		System.out.println("do zamkniêtego magazynu. Lekarz czy lekarka? Trudno stwierdziæ. Przeszukujesz ");
		System.out.println("kieszenie. Znajdujesz zakrwawion¹ notatkê. Czytasz:\n");
		System.out.println("\"24.08.13 - zmiana kodu do sk³adu surowic z 4568 na 3211.\"");
		System.out.println("\nPo drugiej stronie:\n");
		System.out
				.println("\"Nowa surowica zdaje siê dzia³aæ. Pacjent 23 prze¿y³ infekcjê. Konieczne dalsze badania\".");
		System.out.println(
				"\nOtwierasz sk³ad lekarstw. Na pu³kach pe³no pomarañczowych pude³ek z napisem: \"Surowica #18\".\n");
		System.out.println("Nie masz nic do stracenia. Wyjmujesz ampu³ko-strzykawkê. Wstrzykujesz nieznan¹ ");
		System.out.println("substancjê. Ból jest nie do wytrzymania. Upadasz na posadzkê. ");
		room47();
	}

	static void room44() {
		System.out.println(Var.row);
		System.out.println("Weszliœcie do szpitala. Byæ bohaterem nie zawsze pop³aca. Uratowany ");
		System.out.println("nieznajomy zmieni³ siê za Twoimi plecami, gdy przygl¹da³eœ siê krwi na suficie. Musia³ ");
		System.out.println("byæ zara¿ony. Niektórzy mo¿e s¹ bardziej podatni i maj¹ mniej czasu. ");
		System.out.println("Niespodziewanego ataku nie mog³eœ unikn¹æ. Krwawisz i to mocno. Ucieka z Ciebie");
		System.out.println("woda ¿ycia. Umierasz zanim zombie zaczyna ucztê. Nie cierpisz. ");
		Menu.death();
	}

	static void room45() {
		System.out.println(Var.row);
		System.out.println("Prze¿y³aœ! Ale co to za ¿ycie. Trzymaj¹ Ciê, gdzieœ na drugim podziemnym");
		System.out.println("poziomie kompleksu badawczo-militarnego. Trafi³aœ do specjalnej, przytulnej ");
		System.out.println("(czerwonej) celi z telewizorem, prysznicem i wygodnym ³ó¿kiem. Jesteœ narzêdziem ");
		System.out.println("do zaspokajania potrzeb niemytych ¿o³nierzy. Czêsto kilka razy dziennie. Czasem wiêcej ");
		System.out.println("ni¿ jeden klient na raz. Twoja uroda, jest teraz Twoim przekleñstwem. D³ugie nogi, du¿e ");
		System.out.println("i jêdrne piersi oraz ponêtne oczy - wielu ¿o³daków lubie¿nie siê nimi zachwyca. ");
		System.out.println("Nie masz si³y siê ju¿ opieraæ. Popad³aœ w depresjê i apatiê. ");
		System.out.println("Na os³odê masz dobre jedzenie. W wolnych chwilach ogl¹dasz zapêtlone nagrania ");
		System.out.println("na szklanym ekranie lub czytasz ksi¹¿ki. Czasem z têsknot¹ wspominasz swoje ¿ycie ");
		System.out.println("i wolnoœæ. Zastanawiasz siê nad skoñczeniem ze sob¹.");
		Menu.win();
	}

	static void room46() {
		System.out.println(Var.row);
		System.out.println("Prze¿y³aœ! Ale co to za ¿ycie. Trzymaj¹ Ciê, gdzieœ na drugim podziemnym");
		System.out.println("poziomie kompleksu badawczo-militarnego. Trafi³aœ do specjalnej, przytulnej ");
		System.out.println("(czerwonej) celi z telewizorem, prysznicem i wygodnym ³ó¿kiem. Jesteœ narzêdziem ");
		System.out.println("do zaspokajania potrzeb niemytych ¿o³nierzy. Czêsto kilka razy dziennie. Czasem wiêcej ");
		System.out.println("ni¿ jeden klient na raz. Bez rêki Twoja uroda straci³a na blasku. Jednak niektórych");
		System.out.println("¿o³daków bardzo to krêci.  Nie masz si³y siê ju¿ opieraæ. Popad³aœ w depresjê i apatiê.");
		System.out.println("Na os³odê masz dobre jedzenie. W wolnych chwilach ogl¹dasz zapêtlone nagrania");
		System.out.println("na szklanym ekranie lub czytasz ksi¹¿ki. Czasem z têsknot¹ wspominasz swoje ¿ycie ");
		System.out.println("i wolnoœæ. Zastanawiasz siê nad skoñczeniem ze sob¹.");
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
			System.out.println("Zdaje siê, ze surowica zadzia³a³a. Masz szczêœcie. ¯yjesz. Chowasz siê, gdzieœ");
			System.out.println("na drugim piêtrze szpitala. Nie jest to najbezpieczniejsze miejsce, ale na teraz musi");
			System.out.println("wystarczyæ. Zasypiasz ze zmêczenia. Jaka bêdzie przysz³oœæ? Nie wiadomo.");
			Menu.win();

		}

	}

	static void room48() {
		System.out.println(Var.row);
		System.out.println("Surowica nie zadzia³a. Umar³eœ, ale nie powsta³eœ. Zrobi³o siê ponuro. Na dworze ");
		System.out.println("zacz¹³ padaæ deszcz.  S³oñce zasz³o za chmurami.");
		Menu.death();

	}

	static void room49() {
		System.out.println(Var.row);
		System.out.println("Zdaje siê, ze surowica zadzia³a³a. Masz szczêœcie. ¯yjesz. Przynajmniej wiêkszoœæ");
		System.out.println("Twojego cia³a. Rêki nie da siê uratowaæ. Z wielkim trudem znajdujesz anestetyk");
		System.out.println("(morfinê). Po 10 minutach odcinasz koñczynê znalezion¹ pi³¹. Chowasz siê, gdzieœ");
		System.out.println("na drugim piêtrze szpitala. Nie jest to najbezpieczniejsze miejsce, ale na teraz musi");
		System.out.println("wystarczyæ. Zasypiasz ze zmêczenia. Jaka bêdzie przysz³oœæ? Nie wiadomo. Musisz");
		System.out.println("poszukaæ antybiotyków, by uchroniæ siê przed zaka¿eniem bakteryjnym. Mo¿e");
		System.out.println("zabarykadujesz siê i pozostaniesz. A mo¿e ostro¿nie opuœcisz placówkê medyczn¹");
		System.out
				.println("i ruszysz przed siebie. Nigdy nie wiadomo, czy w obiekcie nie zosta³y jakieœ martwe dusze.");
		Menu.win();

	}

	static void room50() {
		if (Var.event1 == true) {
			room31();
		}
		if (Var.event1 == false) {
			System.out.println(Var.row);
			System.out.println("Przed wyjœciem wypuœci³eœ swojego kota. Zabra³eœ zapas wody, ¿ywnoœci i ubrañ.");
			System.out.println("Nastêpnie ukrad³eœ porzucony samochód - opuszczony w poœpiechu; jeszcze");
			System.out.println("z kluczami w stacyjce. Paliwa wystarczy na podró¿ w jedn¹ stronê. Wybra³eœ drogê");
			System.out
					.println("przez stary, chybotliwy most. Po godzinie doje¿d¿asz do miejsca, gdzie kiedyœ zabiera³");
			System.out.println("Ciê ojciec, a póŸniej wuj Józek. Doje¿d¿asz do sztucznego jeziora z wysepk¹. Pakujesz");
			System.out.println("zapasy i wsiadasz do starej ³ódki. Dop³ywasz do wysepki nim przeciekaj¹ca ³ódka");
			System.out.println("zatonie. Jesteœ ju¿ bezpieczny. Widzisz nieocieplon¹, ma³¹ chatkê z nie najlepszym");
			System.out.println("dachem i jednym oknem. W œrodku znajdujesz trochê przedmiotów codziennego");
			System.out.println("u¿ytku, narzêdzia i wêdki.");
			System.out.println("Mijaj¹ dni. Œpisz na kocu, przykryty drugim kocem. Doskwiera Ci zimno i nuda.");
			System.out.println("Racjonowane zapasy powoli siê koñcz¹. Od czasu do czasu ³apiesz deszczówkê");
			System.out.println("lub ³owisz ryby. Oczekujesz lepszego jutra.");
			Menu.win();

		}

	}
}
