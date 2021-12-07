#ifndef SERVEANDVOLLEY_H_
#define SERVEANDVOLLEY_H_

#include "Strategia.h"

class ServeAndVolley : public Strategia {
    public:
        int difendi();
        int attacco(); 
        std::string tipoStrategiaGioco();
};

#endif