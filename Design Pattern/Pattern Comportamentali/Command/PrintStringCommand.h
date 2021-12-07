#ifndef PRINTSTRINGCOMMAND_H_
#define PRINTSTRINGCOMMAND_H_

#include "Command.h"
#include <string>
#include <iostream>

class PrintStringCommand : public Command {

    public:
        void esegui() const;
};

#endif