import javax.swing.*;

public class Main {

    public static MainClass mc = new MainClass();

    public static String fullName;
    public static String contactNumber;
    public static String fullAddress;
    public static int $pizzaChoice, $pastaChoice, $meatChoice, $sideDishChoice, $sauceDressingChoice, $desertChoice, $drinksChoice;
    public static double price;
    public static double $total;
    public static String fullOrder = "";
    public static double $tva;

    //Menu
    //Pizza Menu
    public static double $Capriciosa = 21.90;
    public static double $QuattroStagioni = 22.50;
    public static double $Margherita = 18.90;
    public static double $ProsciuttoEFunghi = 20.90;
    public static double $Diavola = 23.00;
    public static double $nimicPizza = 0.00;

    //Pasta Menu
    public static double $Carbonara = 18.90;
    public static double $seaFood = 45.00;
    public static double $Gnocchi = 31.90;
    public static double $quattroFormaggi = 28.90;
    public static double $nimicPaste = 0.00;

    //Meat Menu
    public static double $chickenMeat = 24.50;
    public static double $duckMeat = 39.90;
    public static double $cowHamburger = 29.90;
    public static double $vealSteak = 41.90;
    public static double $porkChops = 34.90;
    public static double $nimicCarne = 0.00;
    
    //Side Dishes
    public static double $frenchFries = 7.90;
    public static double $Rice = 7.50;
    public static double $mashedPotatoes = 5.90;
    public static double $nimicSideDish = 0.00;
    
    //Sauce/Dressing Menu
    public static double $Ketchup = 3.00;
    public static double $Mayo = 3.00;
    public static double $Tzatziki = 4.50;
    public static double $nimicSos = 0.00;
    
    //Desert Menu
    public static double $lavaCake = 14.90;
    public static double $iceCream = 8.90;
    public static double $Cheesecake = 12.90;
    public static double $nimicDesert = 0.00;
    
    //Drinks Menu
    public static double $sparklingWater = 3.90;
    public static double $stillWater = 3.50;
    public static double $Coke = 4.90;
    public static double $Fanta = 4.90;
    public static double $Sprite = 4.90;
    public static double $Lemonade = 9.50;
    public static double $Fresh = 13.90;
    public static double $Coffee = 7.50;
    public static double $nimicBauturi = 0.00;
    
    //Array care contine denumirile tuturor produselor care pot fi comandate
    static String[] pizzaList = {"Pizza Capriciosa", "Pizza Quattro Stagioni", "Pizza Margherita", "Pizza Prosciutto E Funghi", "Pizza Diavola", ""};
    static String[] pastaList = {"Paste Carbonara", "Paste cu fructe de mare", "Gnocchi", "Quattro Formaggi", ""};
    static String[] meatList = {"Carne de pui", "Carne de rata", "Hamburger de vita", "Steak de vitel", "Cotlet de porc", ""};
    static String[] sideDishList = {"Cartofi prajiti", "Orez", "Piure de cartofi", ""};
    static String[] sauceList = {"Ketchup", "Maioneza", "Tzatziki", ""};
    static String[] desertList = {"Lava Cake", "Inghetata", "Cheesecake", ""};
    static String[] drinksList = {"Apa minerala", "Apa plata", "Cola", "Fanta", "Sprite", "Limonada", "Fresh", "Cafea", ""};

    public static void main(String[] args) {
    	
        fullName = JOptionPane.showInputDialog(null, "Numele Complet:");
        mc.setfullName(fullName);

        contactNumber = JOptionPane.showInputDialog(null, "Numarul de telefon:");
        mc.set$contactNumber(contactNumber);
        
        fullAddress = JOptionPane.showInputDialog(null, "Adresa dumneavoastra:");
        mc.setfullAddress(fullAddress);

        $pizzaChoice = Integer.valueOf(JOptionPane.showInputDialog(null, "Pizza: " +
                "\n1. Pizza Capriciosa" + " (" + $Capriciosa + " lei)" +
                "\n2. Pizza Quattro Stagioni" + " (" + $QuattroStagioni + " lei)" +
                "\n3. Pizza Margherita" + " (" + $Margherita + " lei)" +
        		"\n4. Pizza Prosciutto E Funghi" + " (" + $ProsciuttoEFunghi + " lei)" +
        		"\n5. Pizza Diavola" + " (" + $Diavola + " lei)" +
        		"\n6. Nu doresc"));

        $pastaChoice = Integer.valueOf(JOptionPane.showInputDialog(null, "Paste: " +
                "\n1. Paste Carbonara" + " (" + $Carbonara + " lei)" +
                "\n2. Paste cu fructe de mare" + " (" + $seaFood + " lei)" +
                "\n3. Gnocchi" + " (" + $Gnocchi + " lei)" +
                "\n4. Paste Quattro Formaggi" + " (" + $quattroFormaggi + " lei)" +
                "\n5. Nu doresc"));

        $meatChoice = Integer.valueOf(JOptionPane.showInputDialog(null, "Carne: " +
                "\n1. Carne de pui" + " (" + $chickenMeat + " lei)" +
                "\n2. Carne de rata" + " (" + $duckMeat + " lei)" +
                "\n3. Hamburger de vita" + " (" + $cowHamburger + " lei)" +
                "\n4. Steak de vitel" + " (" + $vealSteak + " lei)" +
                "\n5. Cotlet de porc" + " (" + $porkChops + " lei)" +
                "\n6. Nu doresc"));
        
        $sideDishChoice = Integer.valueOf(JOptionPane.showInputDialog(null, "Garnitura: " +
        		"\n1. Cartofi Prajiti" + " (" + $frenchFries + " lei)" +
        		"\n2. Orez" + " (" + $Rice + " lei)" +
        		"\n3. Piure de cartofi" + " (" + $mashedPotatoes + " lei)" + 
        		"\n4. Nu doresc"));
        
        $sauceDressingChoice = Integer.valueOf(JOptionPane.showInputDialog(null, "Sosuri: " +
        		"\n1. Ketchup" + " (" + $Ketchup + " lei)" +
        		"\n2. Maioneza" + " (" + $Mayo + " lei)" +
        		"\n3. Tzatziki" + " (" + $Tzatziki + " lei)" +
        		"\n4. Nu doresc"));
        
        $desertChoice = Integer.valueOf(JOptionPane.showInputDialog(null, "Desert: " +
        		"\n1. Lava Cake" + " (" + $lavaCake + " lei)" +
        		"\n2. Inghetata" + " (" + $iceCream + " lei)" +
        		"\n3. Cheesecake" + " (" + $Cheesecake + " lei)" +
        		"\n4. Nu doresc"));
        
        $drinksChoice = Integer.valueOf(JOptionPane.showInputDialog(null, "Bauturi: " +
        		"\n1. Apa minerala" + " (" + $sparklingWater + " lei)" +
        		"\n2. Apa plata" + " (" + $stillWater + " lei)" +
        		"\n3. Cola" + " (" + $Coke + " lei)" +
        		"\n4. Fanta" + " (" + $Fanta + " lei)" +
        		"\n5. Sprite" + " (" + $Sprite + " lei)" +
        		"\n6. Limonada" + " (" + $Lemonade + " lei)" +
        		"\n7. Fresh" + " (" + $Fresh + " lei)" +
        		"\n8. Cafea" + " (" + $Coffee + " lei)" + 
        		"\n9. Nu doresc"));
        
        
        //Calcul pret total produse comandate
        switch ($pizzaChoice) {
            case 1:
                $total = $total + $Capriciosa;
                break;
            case 2:
                $total = $total + $QuattroStagioni;
                break;
            case 3:
                $total = $total + $Margherita;
                break;
            case 4:
            	$total = $total + $ProsciuttoEFunghi;
            	break;
            case 5:
            	$total = $total + $Diavola;
            	break;
            case 6:
            	$total = $total + $nimicPizza;
            	break;
        }

        switch ($pastaChoice) {
            case 1:
                $total = $total + $Carbonara;
                break;
            case 2:
                $total = $total + $seaFood;
                break;
            case 3:
                $total = $total + $Gnocchi;
                break;
            case 4:
                $total = $total + $quattroFormaggi;
                break;
            case 5:
                $total = $total + $nimicPaste;
                break;
        }

        switch ($meatChoice) {
            case 1:
                $total = $total + $chickenMeat;
                break;
            case 2:
                $total = $total + $duckMeat;
                break;
            case 3:
                $total = $total + $cowHamburger;
                break;
            case 4:
                $total = $total + $vealSteak;
                break;
            case 5:
            	$total = $total + $porkChops;
            	break;
            case 6:
            	$total = $total + $nimicCarne;
            	break;
        }
        
        switch ($sideDishChoice) {
        	case 1:
        		$total = $total + $frenchFries;
        		break;
        	case 2:
        		$total = $total + $Rice;
        		break;
        	case 3:
        		$total = $total + $mashedPotatoes;
        		break;
        	case 4:
        		$total = $total + $nimicSideDish;
        		break;
        }
        
        switch ($sauceDressingChoice) {
        	case 1:
        		$total = $total + $Ketchup;
        		break;
        	case 2:
        		$total = $total + $Mayo;
        		break;
        	case 3:
        		$total = $total + $Tzatziki;
        		break;
        	case 4:
        		$total = $total + $nimicSos;
        		break;
        }
        
        switch ($desertChoice) {
        	case 1:
        		$total = $total + $lavaCake;
        		break;
        	case 2:
        		$total = $total + $iceCream;
        		break;
        	case 3:
        		$total = $total + $Cheesecake;
        		break;
        	case 4:
        		$total = $total + $nimicDesert;
        		break;
        }
        
        switch ($drinksChoice) {
        	case 1:
        		$total = $total + $sparklingWater;
        		break;
        	case 2:
        		$total = $total + $stillWater;
        		break;
        	case 3:
        		$total = $total + $Coke;
        		break;
        	case 4:
        		$total = $total + $Fanta;
        		break;
        	case 5:
        		$total = $total + $Sprite;
        		break;
        	case 6:
        		$total = $total + $Lemonade;
        		break;
        	case 7:
        		$total = $total + $Fresh;
        		break;
        	case 8:
        		$total = $total + $Coffee;
        		break;
        	case 9:
        		$total = $total + $nimicBauturi;
        		break;
        }
        
        mc.setFullPrice($total);
        
        
        //Calcul TVA
        switch ($pizzaChoice) {
        case 1:
            $tva = $tva + (($Capriciosa * 9)/100);
            break;
        case 2:
            $tva = $tva + (($QuattroStagioni * 9)/100);
            break;
        case 3:
            $tva = $tva + (($Margherita * 9)/100);
            break;
        case 4:
        	$tva = $tva + (($ProsciuttoEFunghi * 9)/100);
        	break;
        case 5:
        	$tva = $tva + (($Diavola * 9)/100);
        	break;
        case 6:
        	$tva = $tva + $nimicPizza;
        	break;
        }

        switch ($pastaChoice) {
        case 1:
            $tva = $tva + (($Carbonara * 9)/100);
            break;
        case 2:
            $tva = $tva + (($seaFood * 9)/100);
            break;
        case 3:
            $tva = $tva + (($Gnocchi * 9)/100);
            break;
        case 4:
            $tva = $tva + (($quattroFormaggi * 9)/100);
            break;
        case 5:
            $tva = $tva + $nimicPaste;
            break;
        }

        switch ($meatChoice) {
        case 1:
            $tva = $tva + (($chickenMeat * 9)/100);
            break;
        case 2:
            $tva = $tva + (($duckMeat * 9)/100);
            break;
        case 3:
            $tva = $tva + (($cowHamburger * 9)/100);
            break;
        case 4:
            $tva = $tva + (($vealSteak * 9)/100);
            break;
        case 5:
        	$tva = $tva + (($porkChops * 9)/100);
        	break;
        case 6:
        	$tva = $tva + $nimicCarne;
        	break;
        }

        switch ($sideDishChoice) {
    	case 1:
    		$tva = $tva + (($frenchFries * 9)/100);
    		break;
    	case 2:
    		$tva = $tva + (($Rice * 9)/100);
    		break;
    	case 3:
    		$tva = $tva + (($mashedPotatoes * 9)/100);
    		break;
    	case 4:
    		$tva = $tva + $nimicSideDish;
    		break;
        }

        switch ($sauceDressingChoice) {
    	case 1:
    		$tva = $tva + (($Ketchup * 9)/100);
    		break;
    	case 2:
    		$tva = $tva + (($Mayo * 9)/100);
    		break;
    	case 3:
    		$tva = $tva + (($Tzatziki * 9)/100);
    		break;
    	case 4:
    		$tva = $tva + $nimicSos;
    		break;
        }

        switch ($desertChoice) {
    	case 1:
    		$tva = $tva + (($lavaCake * 10)/100);
    		break;
    	case 2:
    		$tva = $tva + (($iceCream * 10)/100);
    		break;
    	case 3:
    		$tva = $tva + (($Cheesecake * 10)/100);
    		break;
    	case 4:
    		$tva = $tva + $nimicDesert;
    		break;
        }

        switch ($drinksChoice) {
    	case 1:
    		$tva = $tva + (($sparklingWater * 5)/100);
    		break;
    	case 2:
    		$tva = $tva + (($stillWater * 5)/100);
    		break;
    	case 3:
    		$tva = $tva + (($Coke * 12)/100);
    		break;
    	case 4:
    		$tva = $tva + (($Fanta * 12)/100);
    		break;
    	case 5:
    		$tva = $tva + (($Sprite * 12)/100);
    		break;
    	case 6:
    		$tva = $tva + (($Lemonade * 5)/100);
    		break;
    	case 7:
    		$tva = $tva + (($Fresh * 5)/100);
    		break;
    	case 8:
    		$tva = $tva + (($Coffee * 5)/100);
    		break;
    	case 9:
    		$tva = $tva + $nimicBauturi;
    		break;
        }

        mc.setTvaPrice($tva);
    
        
        // Listare produse comandate cu metoda switch
        switch ($pizzaChoice) {
	        case 1:
	            fullOrder = fullOrder + "\n- " + pizzaList[0];
	            break;
	        case 2:
	            fullOrder = fullOrder + "\n- " + pizzaList[1];
	            break;
	        case 3:
	        	fullOrder = fullOrder + "\n- " + pizzaList[2];
	            break;
	        case 4:
	        	fullOrder = fullOrder + "\n- " + pizzaList[3];
	        	break;
	        case 5:
	        	fullOrder = fullOrder + "\n- " + pizzaList[4];
	        	break;
	        case 6:
	        	fullOrder = fullOrder + pizzaList[5];
	        	break;
        }

        switch ($pastaChoice) {
	        case 1:
	            fullOrder = fullOrder + "\n- " + pastaList[0];
	            break;
	        case 2:
	            fullOrder = fullOrder + "\n- " + pastaList[1];
	            break;
	        case 3:
	        	fullOrder = fullOrder + "\n- " + pastaList[2];
	            break;
	        case 4:
	        	fullOrder = fullOrder + "\n- " + pastaList[3];
	            break;
	        case 5:
	            fullOrder = fullOrder + pastaList[4];
	            break;
        }

        switch ($meatChoice) {
	        case 1:
	            fullOrder = fullOrder + "\n- " + meatList[0];
	            break;
	        case 2:
	            fullOrder = fullOrder + "\n- " + meatList[1];
	            break;
	        case 3:
	        	fullOrder = fullOrder + "\n- " + meatList[2];
	            break;
	        case 4:
	        	fullOrder = fullOrder + "\n- " + meatList[3];
	            break;
	        case 5:
	        	fullOrder = fullOrder + "\n- " + meatList[4];
	        	break;
	        case 6:
	        	fullOrder = fullOrder + meatList[5];
	        	break;
        }

        switch ($sideDishChoice) {
	    	case 1:
	    		fullOrder = fullOrder + "\n- " + sideDishList[0];
	    		break;
	    	case 2:
	    		fullOrder = fullOrder + "\n- " + sideDishList[1];
	    		break;
	    	case 3:
	    		fullOrder = fullOrder + "\n- " + sideDishList[2];
	    		break;
	    	case 4:
	    		fullOrder = fullOrder + sideDishList[3];
	    		break;
        }

        switch ($sauceDressingChoice) {
	    	case 1:
	    		fullOrder = fullOrder + "\n- " + sauceList[0];
	    		break;
	    	case 2:
	    		fullOrder = fullOrder + "\n- " + sauceList[1];
	    		break;
	    	case 3:
	    		fullOrder = fullOrder + "\n- " + sauceList[2];
	    		break;
	    	case 4:
	    		fullOrder = fullOrder + sauceList[3];
	    		break;
        }

        switch ($desertChoice) {
	    	case 1:
	    		fullOrder = fullOrder + "\n- " + desertList[0];
	    		break;
	    	case 2:
	    		fullOrder = fullOrder + "\n- " + desertList[1];
	    		break;
	    	case 3:
	    		fullOrder = fullOrder + "\n- " + desertList[2];
	    		break;
	    	case 4:
	    		fullOrder = fullOrder + desertList[3];
	    		break;
        }

        switch ($drinksChoice) {
	    	case 1:
	    		fullOrder = fullOrder + "\n- " + drinksList[0];
	    		break;
	    	case 2:
	    		fullOrder = fullOrder + "\n- " + drinksList[1];
	    		break;
	    	case 3:
	    		fullOrder = fullOrder + "\n- " + drinksList[2];
	    		break;
	    	case 4:
	    		fullOrder = fullOrder + "\n- " + drinksList[3];
	    		break;
	    	case 5:
	    		fullOrder = fullOrder + "\n- " + drinksList[4];
	    		break;
	    	case 6:
	    		fullOrder = fullOrder + "\n- " + drinksList[5];
	    		break;
	    	case 7:
	    		fullOrder = fullOrder + "\n- " + drinksList[6];
	    		break;
	    	case 8:
	    		fullOrder = fullOrder + "\n- " + drinksList[7];
	    		break;
	    	case 9:
	    		fullOrder = fullOrder + drinksList[8];
	    		break;
        }
 
    mc.setfullOrder(fullOrder);

        JOptionPane.showMessageDialog(null, "Comanda dvs." +
                "\n\nNume: " + mc.getfullName() +
                "\nNumar telefon: " + mc.get$contactNumber() +
                "\nAdresa livrare: " + mc.getfullAddress() +
        		"\n\nProduse comandate: " + mc.getfullOrder() +
        		"\n\nTotal comanda cu TVA: " + String.format("%,.2f", mc.getFullPrice()) + " lei" +
        		"\nPret TVA: " + String.format("%,.2f", mc.getTvaPrice()) + " lei");
        }
}