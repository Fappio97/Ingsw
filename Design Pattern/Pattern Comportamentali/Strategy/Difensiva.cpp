#include "Difensiva.h"

int Difensiva::difendi() {
    return rand() % 75 + 20;
}

int Difensiva::attacco() {
    return rand() % 50 + 0;
} 

std::string Difensiva::tipoStrategiaGioco() {
    return "difensiva";
}