#include "Citta.h"

Citta::Citta(const Citta& a): nome(a.nome), recensioni(a.recensioni), folla(a.folla) {} 
        
Citta::Citta(std::string _nome, int _recensioni, int _folla): nome(_nome) {
    this->recensioni = checkRecensioniFolla(_recensioni);
    this->folla = checkRecensioniFolla(_folla);
}

int Citta::checkRecensioniFolla(int x) {
    if(x > 5)
        x = 5;
    else if(x < 0)
        x = 0;
    return x;
}

std::ostream& operator<<(std::ostream& out, const Citta& a) {
    return out << "Città " << a.nome << ", con " << a.recensioni << "/5 stelle e affollamento " << a.folla << "/5" << std::endl;
}
        
std::string Citta::getNome() {
    return nome;
}
        
int Citta::getRecensioni() {
    return recensioni;
}
        
int Citta::getFolla() {
    return folla;
}

Citta::~Citta() {
    
}