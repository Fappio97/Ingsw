#include "PrintStringCommand.h"
#include "CleanCommand.h"
#include "Command.h"

#include <time.h>
#include <unistd.h>

int main() {

    Command* command = new PrintStringCommand();
    command->esegui();

    sleep(2);

    command = new CleanCommand();
    command->esegui();

    std::cout << "Fine\n";

    delete command;

    return 0;
}