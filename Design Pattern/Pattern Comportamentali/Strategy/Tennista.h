#ifndef TENNISTA_H_
#define TENNISTA_H_

#include "Strategia.h"

#include <iostream>

class Tennista {
    private:
        Strategia* strategia;
        std::string nome;
    public: 
        Tennista(const std::string&);
        Tennista(const Tennista&);
        ~Tennista();
        void setStrategy(Strategia* strategia);
        Strategia* getStrategia() const;
        std::string getNome() const;
};

#endif