#ifndef STATE_H_
#define STATE_H_

#include "Ascensore.h"

#include <iostream>
#include <time.h>
#include <stdlib.h>
#include <unistd.h>

class State {
    protected:
        Ascensore* ascensore;
    public:
        void setAscensore(Ascensore* a) {
            ascensore = a;
        }
        virtual void operazione() = 0;
};

#endif