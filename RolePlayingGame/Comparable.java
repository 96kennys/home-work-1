/**
 * @author Kent Nystedt
 */
package RolePlayingGame;
/*By implementing the interface I make the class more formal about the behaviour
it's suppose to provide.
*/
public interface Comparable{
    
    //Compares an inserted player "p" to where the compareTo method is inserted.
    public abstract int compareTo(Player p);

}
