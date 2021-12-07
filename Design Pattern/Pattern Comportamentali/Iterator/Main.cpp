#include "SecondoParametro.h"
#include "TerzoParametro.h"

void stampaElementiIteratore(Iteratore* i, const std::string& s) {
    std::cout << "Visita " + s + ": " << std::endl;

    for(i->primoElemento(); !i->fine(); i->prossimoElemento())
            std::cout << " - " << i->attualeElemento();

    std::cout << '\n';
}

int main() {
    Citta roma = Citta("roma", 5, 5);
    Citta cosenza = Citta("cosenza", 1, 2);
    Citta messina = Citta("messina", 4, 4);
    Citta sanLucido = Citta("san lucido", -10000, -1000);
    Citta firenze = Citta("firenze", 3, 5);
    Citta napoli = Citta("napoli", 0, 5);
    Citta bologna = Citta("bologna", 3, 4);
    Citta pordenone = Citta("pordenone", 4, 2);
    Citta paola = Citta("paola", 2, 3);
    Citta genova = Citta("genova", 4, 3);

    SecondoParametro* sp = new SecondoParametro();
    sp->aggiungiElemento(roma);
    sp->aggiungiElemento(cosenza);
    sp->aggiungiElemento(messina);
    sp->aggiungiElemento(sanLucido);
    sp->aggiungiElemento(firenze);
    sp->aggiungiElemento(napoli);
    sp->aggiungiElemento(bologna);
    sp->aggiungiElemento(pordenone);
    sp->aggiungiElemento(paola);
    sp->aggiungiElemento(genova);

    Iteratore* i = sp->creaIteratore();
    stampaElementiIteratore(i, "dalla meno recensita alla più recensita");

    TerzoParametro* tp = new TerzoParametro();
    tp->aggiungiElemento(roma);
    tp->aggiungiElemento(cosenza);
    tp->aggiungiElemento(messina);
    tp->aggiungiElemento(sanLucido);
    tp->aggiungiElemento(firenze);
    tp->aggiungiElemento(napoli);
    tp->aggiungiElemento(bologna);
    tp->aggiungiElemento(pordenone);
    tp->aggiungiElemento(paola);
    tp->aggiungiElemento(genova);

    i = tp->creaIteratore();
    stampaElementiIteratore(i, "dalla meno affollata alla più affollata");

    delete sp;
    delete tp;
    delete i;

return 0;
}