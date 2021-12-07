#include "Strategia.h"

int Strategia::difendi() {
    return rand() % 50 + 0;
}

int Strategia::attacco() {
    return rand() % 50 + 0;
} 

std::string Strategia::tipoStrategiaGioco() {
    return "neutrale";
}