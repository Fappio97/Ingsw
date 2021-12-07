#include "PrintStringCommand.h"

void PrintStringCommand::esegui() const {
    std::string mystring;
    std::getline(std::cin, mystring);
    std::cout << mystring;

    std::cout << "\n";
}