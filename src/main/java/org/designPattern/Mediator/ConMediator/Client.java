package org.designPattern.Mediator.ConMediator;

/** abbiamo risolto due problemi:
 *  - ogni device conosce solo il Mediator (il mediator conosce tutti)
 *  - la logica di accensione/spegnimento è ora nel mediator
 *    - ogni colleague incarica il mediator di avvisare gli altri colleague
 *    - comportamento globale è più facile da modificare
 */
public class Client {
    public static void main( String[] args ) {
        Mediator m = new Mediator();

        Device tv = new SmartTv(m);
        Device gs = new GameStation(m);
        Device cc = new CronCast(m);

        m.setSmartTv(tv);
        m.setGameStation(gs);
        m.setCronCast(cc);

        gs.turnOn();    // dovrebbe spegnere anche la Tv
        cc.turnOn();    // dovrebbe spegnere anche la Gs
        tv.turnOff();   // dovrebbe spegnere sia la cc che la gs
    }
}
