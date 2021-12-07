#ifndef DIFENSIVA_H_
#define DIFENSIVA_H_

#include "Strategia.h"

class Difensiva : public Strategia {
    public:
        int difendi();
        int attacco(); 
        std::string tipoStrategiaGioco();
};

#endif