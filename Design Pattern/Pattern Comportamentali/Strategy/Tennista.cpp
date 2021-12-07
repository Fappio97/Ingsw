#include "Tennista.h"

Tennista::Tennista(const std::string& _nome): nome(_nome) {
    strategia = new Strategia();
}

Tennista::Tennista(const Tennista& a): strategia(a.strategia), nome(a.nome) {

}

Tennista::~Tennista() {
    delete strategia;
}
        
void Tennista::setStrategy(Strategia* strategia) {
    this->strategia = strategia;
}

Strategia* Tennista::getStrategia() const {
    return strategia;
}

std::string Tennista::getNome() const {
    return nome;
}