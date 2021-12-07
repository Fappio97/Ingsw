#include "IteratoreSP.h"

IteratoreSP::IteratoreSP(const SecondoParametro* s): v(s) {
    primoElemento();
}

void IteratoreSP::primoElemento() {
    indice = 0;
}
        
void IteratoreSP::prossimoElemento() {
    ++indice;
}
        
bool IteratoreSP::fine() const {
    return indice >= v->size();
}
        
Citta IteratoreSP::attualeElemento() const {
    return v->getElemento(indice);
}