#include "TerzoParametro.h"
#include "IteratoreTP.h"

Iteratore* TerzoParametro::creaIteratore() const {
    return new IteratoreTP(this);
}
    
void TerzoParametro::aggiungiElemento(Citta a) {
    if(!vettore.empty()) {
        for(auto it = vettore.begin(); it < vettore.end(); it++) {
            if(it->getFolla() >= a.getFolla()) {
                vettore.insert(it, a);
                return;
            }
        }
        vettore.push_back(a);
    } else
        vettore.push_back(a);
}
        
Citta TerzoParametro::getElemento(int a) const {
    return vettore[a];
}

int TerzoParametro::size() const {
    return vettore.size();
}