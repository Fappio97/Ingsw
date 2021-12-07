#include "ServeAndVolley.h"

int ServeAndVolley::difendi() {
    return rand() % 10 + 0;
}

int ServeAndVolley::attacco() {
    return rand() % 90 + 40;
} 

std::string ServeAndVolley::tipoStrategiaGioco() {
    return "serve and volley";
}