#include "IteratoreTP.h"

IteratoreTP::IteratoreTP(const TerzoParametro* s): v(s) {
    primoElemento();
}

void IteratoreTP::primoElemento() {
    indice = 0;
}
        
void IteratoreTP::prossimoElemento() {
    ++indice;
}
        
bool IteratoreTP::fine() const{
    return indice == v->size();
}
        
Citta IteratoreTP::attualeElemento() const {
    return v->getElemento(indice);
}