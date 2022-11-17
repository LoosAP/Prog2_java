package mikulás;

public interface AjándékCsomag
{
    // visszaadja az ajándékok összértékét
    int összÉrték();
    // visszaadja a t-nél nehezebb ajándékok számát
    int nehezekSzáma(double t);
    // visszaadja a gyerekjátékokat a természetes rendezettségük sorrendjében úgy,
    // hogy az egyenlő gyerekjátékok közül csak egy szerepel a kollekcióban
    java.util.Collection<GyerekJáték> gyerekjátékok();
}
