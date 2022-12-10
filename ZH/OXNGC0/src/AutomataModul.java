import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AutomataModul implements Iterable<Automata>{
    private List<Automata> automatak = new ArrayList<>();

    public void telepit(Automata a){
        automatak.add(a);
    }

    public List<Automata> aktivAutomata() throws CloneNotSupportedException {
        List<Automata> aktivAutomata = new ArrayList<>();

        for(Automata a : automatak){
            if (a.isAktiv()){
                aktivAutomata.add((Automata) a.clone());
            }
        }
        return aktivAutomata;
    }

    @Override
    public Iterator<Automata> iterator() {
        List<Automata> aktivAutomata = new ArrayList<>();
        for(int i = automatak.size()-1; i>0;i--){
            if(automatak.get(i).isAktiv()){
                try {
                    automatak.add((Automata) automatak.get(i).clone());
                } catch (CloneNotSupportedException e) {
                    e.printStackTrace();
                }
            }
        }

        return aktivAutomata.iterator();
    }


}
