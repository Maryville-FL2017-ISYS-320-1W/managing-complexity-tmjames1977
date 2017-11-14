/*
  	ISYS 320
  	Name(s): Timothy James
  	Date: 11/13/2017
*/



/* 2. Create a table below (just using text) that outlines your analysis of the figure. That is, how many
 * of each character on each line? What expression captures the relationship between the line number and
 * how many of the character is printed on each line? Choose your headings based on how you can break down
 * the figure.
  
Line Number		| Bangs		| Slashes		| HEADING		| HEADING		| HEADING		|	
1				|	22		|	0
2				|	18		|	4
3				|	14		|	8
4				|	10		|	12
5				|	6		|	16
6				|	2		|	20

*/

/* 3. Using your analysis from above, in pseudocode describe the algorithm for how to draw the figure
 for {
 print 22 bangs.
 }
 for {
 print 2 slashes.
 print 18 bangs.
 print 2 slashes.
 }
 for {
 print 4 slashes.
 print 14 bangs.
 print 4 slashes.
 }
 for {
 print 6 slashes.
 print 10 bangs.
 print 6 slashes.
 }
 for {
 print 8 slashes.
 print 6 bangs.
 print 8 slashes.
 }
 for {
 print 10 slashes.
 print 2 bangs.
 print 10 slashes.
 }
 
 */

public class P2_SlashesAndBangs {

	public static void main (String[] args) {
		for (int line = 6; line >= 1; line--) {
			for (int i = 1; i <= (2 * (6 - line)); i++) { // write slashes
				System.out.print("/");
			}	
			for (int i = 1; i <= (4 * line - 2); i++) { // write bangs
				System.out.print("!");
			}
			for (int i = 1; i <= (2 * (6 - line)); i++) { // write slashes
				System.out.print("/");
			}
			System.out.println();
		}
	}
}
