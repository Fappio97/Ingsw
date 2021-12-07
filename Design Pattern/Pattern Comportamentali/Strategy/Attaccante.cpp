#include "Attaccante.h"

int Attaccante::difendi() {
    return rand() % 25 + 0;
}

int Attaccante::attacco() {
    return rand() % 75 + 20;
} 

std::string Attaccante::tipoStrategiaGioco() {
    return "attaccante";
}