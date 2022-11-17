package egyetem;

import java.util.Collection;

public interface Iskola {
    public void felvesz(Oktató oktató);
    public Collection<Oktató> oktatók();
}
