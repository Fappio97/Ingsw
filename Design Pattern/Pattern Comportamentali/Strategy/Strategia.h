#ifndef STRATEGIA_H_
#define STRATEGIA_H_

#include <string>
#include <time.h>
#include <stdlib.h>
#include <unistd.h>

class Strategia {
    public:
        virtual int difendi();
        virtual int attacco(); 
        virtual std::string tipoStrategiaGioco();
};

#endif