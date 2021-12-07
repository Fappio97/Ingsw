#ifndef ATTACCANTE_H_
#define ATTACCANTE_H_

#include "Strategia.h"

class Attaccante : public Strategia {
    public:
        int difendi();
        int attacco(); 
        std::string tipoStrategiaGioco();
};

#endif