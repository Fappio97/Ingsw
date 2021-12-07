#ifndef CLEANCOMMAND_H_
#define CLEANCOMMAND_H_

#include "Command.h"
#include <string>
#include <iostream>

class CleanCommand : public Command {
    public:
        void esegui() const;
};

#endif
