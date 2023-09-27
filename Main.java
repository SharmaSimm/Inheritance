/**
 * Main.java - Driver class to demonstrate revised historical examples
 * 
 * @author ???
 * @version ???
 */

public class Main {
	public static void main(String[] args) {
    
    String earthquakeDescription = "Nepal earthquake of 2015 struck near the capital city Kathmandu on April25,2015. About 9000 people were killed, many thousands more were injured, and more than 600,000 structures in Kathmandu and other nearby towns were damaged or destroyed. The earthquake was felt throughout central and eastern Nepla,much of the Ganges River plain in northern India, and northwestern Bangladesh, as well as in the southern parts of the Plateau of Tibet and western Bhutan.The initial shock which registered a moment magnitude of 7.8, struck shortly before noon local time (about 6:11 AM Greenwich Mean Time). Its epicenter was about 21 miles east southeast of Lamjung and 48 miles northwest of Kathmandu and its focus eas 9.3 miles underground. Two large aftershock occured in the region during the succeeding days. On May12 a magnitude 7.3 aftershock struck some 47 miles east northwest of Kathmandu, killing more than 100 people and injuring nearly 1,900. " ;
    /**
		String tulsaDescription = "A black teenager, who was working as a shoe shiner in downtown Tulsa, Oklahoma, was arrested and accused of assaulting a white woman on a public elevator in broad daylight. A group of white vigilantes, intent on lynching him, and armed black men intent on protecting him gathered at the courthouse. A shot rang out, and the violence began. The riot resulted in 35 square blocks of destruction, including more than 1,250 homes, churches, schools, businesses, a hospital, and a library.";
		Date tulsaDay = new Date(5, 31, 1921);
		HistoricalEvent tulsaRiot = new HistoricalEvent(tulsaDescription, tulsaDay);
**/
    
	 Date earthquakeDay = new Date (4, 25, 2015);
    
  HistoricalEvent NepalShock = new HistoricalEvent( earthquakeDescription, earthquakeDay );
 
    System.out.println("====================================================");
		System.out.println("HISTORICAL EVENT EXAMPLE:");
		System.out.println("====================================================");
		//System.out.println(tulsaRiot);
		System.out.println(NepalShock);
	/**	
		String tulsaRevised = "It started with newspaper reports that a black man had assaulted a white elevator operator. He was arrested, and black World War I vets rushed to the courthouse to prevent a lynching. Whites were deputized and handed weapons, the shooting started and then it got out of hand. It was mob rule for two days, and the result was the complete devastation of the entire black community. The white mobs looted the homes and businesses before they set fire to the community. Planes circled mid-air and bombed what was known as Black Wall Street. The National Guard was called out after the governor declared martial law, and imprisoned all blacks that were not already in jail. More than 35 blocks were destroyed, along with more than 1,200 homes, and some 300 people died, mostly Blacks.",
***/
      
String earthquakeRevised = "The earthquake and its aftershocks were the result of thrust faulting (i.e. compression-driven fracturing) in the Indus-Rarlung suture zone, a thin east west region spanning roughly the length of the Himalayan ranges. The earthquake relieved compressional pressure between the Eurasian tectonic plate and the Indian section of the Indo-Australian Plate, which subducts (underthrusts) the Eurasian Plate. Subduction in the Himalayas occurs at an average rate of 1.6 -2 inches (4-5 cm) annually. Such tectonic activity adds more than 0.4 inch (1 cm) to the height of the Himalayan mountains eery year.";

    System.out.println ("=============================");
String earthquakeCitation = " https://en.wikipedia.org/wiki/April_2015_Nepal_earthquake";


      /**
			tulsaCitation = "https://www.smithsonianmag.com/smithsonian-institution/long-lost-manuscript-contains-searing-eyewitness-account-tulsa-race-massacre-1921-180959251/";
		RevisedHistoricalEvent tulsaMassacre = new RevisedHistoricalEvent(tulsaDescription, tulsaDay,
			tulsaRevised, tulsaCitation);
	 ***/	
RevisedHistoricalEvent event = new RevisedHistoricalEvent(earthquakeRevised, earthquakeCitation, earthquakeDescription, earthquakeDay); 
    System.out.println("\n====================================================");
		System.out.println("REVISED HISTORICAL EVENT EXAMPLE:");
		System.out.println("====================================================");
  event.teach();
	//	tulsaMassacre.teach();
	}
}