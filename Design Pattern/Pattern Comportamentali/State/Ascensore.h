#ifndef ASCENSORE_H_
#define ASCENSORE_H_

//#include "State.h"

#include <iostream>
#include <iostream>
#include <time.h>
#include <stdlib.h>
#include <unistd.h>

class State;

class Ascensore {
    private:
        State* state;
        int personeMax;
        int personeAttuali;
        int volteAllarme;
        int pianoAttuale;
        int pianoDaRaggiungere;
    public:
        //costruttore, costruttore copia, distruttore
        Ascensore(const Ascensore&);
        Ascensore(const int&);
        ~Ascensore();

        int getPersoneMax() const;
        int getPersoneAttuali() const;
        int getVolteAllarme() const;
        int getPianoAttuale() const;
        int getPianoDaRaggiungere() const;
        void setPianoAttuale(const int&);
        void setPersoneAttuali(const int&);
        void setVolteAllarme(const int&);
        void vaiAlPiano(const int&);
        void apriPorta();
        void allarme();
        friend std::ostream& operator<<(std::ostream&, const Ascensore&);
};

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