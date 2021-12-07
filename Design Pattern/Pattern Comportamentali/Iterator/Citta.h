#ifndef CITTA_H_
#define CITTA_H_

#include <string>
#include <iostream>

class Citta {
    private:
        std::string nome;
        int recensioni;
        int folla;
        int checkRecensioniFolla(int);
    public:
        Citta(const Citta&);
        Citta(std::string, int, int);
        friend std::ostream& operator<<(std::ostream&, const Citta&);
        std::string getNome();
        int getRecensioni();
        int getFolla();
        ~Citta();
};

#endif