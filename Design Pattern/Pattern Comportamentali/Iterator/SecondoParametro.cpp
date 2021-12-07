#include "SecondoParametro.h"
#include "IteratoreSP.h"
 
Iteratore* SecondoParametro::creaIteratore() const {
    return new IteratoreSP(this);
}
    
void SecondoParametro::aggiungiElemento(Citta a) {
    if(!vettore.empty()) {
        for(auto it = vettore.begin(); it < vettore.end(); it++) {
            if(it->getRecensioni() >= a.getRecensioni()) {
                vettore.insert(it, a);
                return;
            }
        }
        vettore.push_back(a);
    } else
        vettore.push_back(a);
}
        
Citta SecondoParametro::getElemento(int a) const {
    return vettore[a];
}

int SecondoParametro::size() const {
    return vettore.size();
}