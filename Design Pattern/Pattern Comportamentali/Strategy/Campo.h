#ifndef CAMPO_H_
#define CAMPO_H_

#include "Tennista.h"

class Campo {
    private:
        Tennista* player1;
        Tennista* player2;
        std::string nome;
    public:
        Campo(const std::string& , const std::string&, const std::string&);
        void gioca() const;
        ~Campo();
        void cambiaStrategia(bool, Strategia*);
};

#endif