#include "Ascensore.h"
#include "ApriPorta.h"
#include "VaiAlPiano.h"
#include "Allarme.h"

Ascensore::Ascensore(const Ascensore& a): state(a.state), personeMax(a.personeMax), 
                                        personeAttuali(a.personeAttuali), volteAllarme(a.volteAllarme),
                                        pianoAttuale(a.pianoAttuale), pianoDaRaggiungere(a.pianoDaRaggiungere) {
}

Ascensore::Ascensore(const int& max): personeMax(max) {
    personeAttuali = 0;
    volteAllarme = 0;
    pianoAttuale = 0;
    state = new ApriPorta();
}
  
Ascensore::~Ascensore() {
    delete state;
}

    
int Ascensore::getPersoneMax() const {
    return personeMax;
}
        
int Ascensore::getPersoneAttuali() const {
    return personeAttuali;
}
        
int Ascensore::getVolteAllarme() const {
    return volteAllarme;
}
        
int Ascensore::getPianoAttuale() const {
    return pianoAttuale;
}
        
int Ascensore::getPianoDaRaggiungere() const {
    return pianoDaRaggiungere;
}
        
void Ascensore::setPianoAttuale(const int& a) {
    pianoAttuale = a;
} 

void Ascensore::setPersoneAttuali(const int& a) {
    personeAttuali = a;
}
        
void Ascensore::setVolteAllarme(const int& a) {
    volteAllarme = a;
} 
        
void Ascensore::vaiAlPiano(const int& a) {
    pianoDaRaggiungere = a;
    delete state;
    state = new VaiAlPiano();
    state->setAscensore(this);
    state->operazione();
}
        
void Ascensore::apriPorta() {
    delete state;
    state = new ApriPorta();
    state->setAscensore(this);
    state->operazione();
}

void Ascensore::allarme() {
    delete state;
    state = new Allarme();
    state->setAscensore(this);
    state->operazione();
}
        
std::ostream& operator<<(std::ostream& out, const Ascensore& a) {
    return out << "Ascensore al piano " << a.pianoAttuale << " con capienza " << a.personeAttuali << "/" << a.personeMax << "\n";
}