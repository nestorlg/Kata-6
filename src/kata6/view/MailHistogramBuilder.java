/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kata6.view;

import java.util.List;
import kata6.model.Histogram;
import kata6.model.Mail;

/**
 *
 * @author usuario
 * @param <T>
 */
public class MailHistogramBuilder<T> {

    /**
     *
     * @param mail
     * @return
     */
    public static Histogram<String> buildM(List<Mail> mail) {
        Histogram<String> histo = new Histogram();
        int i = 1;
        for (Mail mail1 : mail) {
            histo.increment(mail1.getDomain(),i);
            i++;
        }
        return histo;
    }
    
    /**
     *
     * @param domains
     * @return
     */
    public static Histogram<String> buildH(List<String> domains) {
        Histogram<String> histo = new Histogram();
        int i = 1;
        for (String domain1 : domains) {
            histo.increment(domain1,i);
            i++;
        }
        return histo;
    }
    
    public static Histogram<Character> buildC(List<Character> characters) {
        Histogram<Character> histo = new Histogram();
        int i = 1;
        for (Character character1 : characters) {
            histo.increment(character1,i);
            i++;
        }
        return histo;
    }
}

