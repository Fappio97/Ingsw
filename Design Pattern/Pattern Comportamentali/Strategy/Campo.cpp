#include "Campo.h"

Campo::Campo(const std::string& _nome, const std::string& player1, const std::string& player2): nome(_nome) {
    this->player1 = new Tennista(player1);
    this->player2 = new Tennista(player2);
}

Campo::~Campo() {
    delete player1;
    delete player2;
}

void Campo::gioca() const {
    std::cout << "Il tennista " << player1->getNome() << " adotta la strategia " << 
    player1->getStrategia()->tipoStrategiaGioco() << '\n';

    std::cout << "Il tennista " << player2->getNome() << " adotta la strategia " << 
    player2->getStrategia()->tipoStrategiaGioco() << '\n';

    std::cout << "\n\n";

    bool score1 = 0;
    bool score2 = 0;
    int scorePlayer1 = 0;
    int scorePlayer2 = 0;

    do {

        int difesa1 = player1->getStrategia()->difendi();
        int difesa2 = player2->getStrategia()->difendi();

        int attacco1 = player1->getStrategia()->attacco();
        int attacco2 = player2->getStrategia()->attacco();

        score1 = attacco1 > difesa2 ? 1 : 0;
        std::cout << "Attacco di " << player1->getNome() << ": " << attacco1 << " " 
             << ". Difesa di " << player2->getNome() << ": "  << difesa2 << ".\n";
        std::string punto = score1 == 1 ? "vinto" : "perso";
        std::cout << "Il tennista " << player1->getNome() << " al servizio ha " 
                << punto << " il punto\n";
        

        score2 = attacco2 > difesa1 ? 1 : 0;
        std::cout << "Attacco di " << player2->getNome() << ": " << attacco2 << " " 
             << ". Difesa di " << player1->getNome() << ": "  << difesa1 << ".\n";
        punto = score2 == 1 ? "vinto" : "perso";
        std::cout << "Il tennista " << player2->getNome() << " al servizio ha " 
                << punto << " il punto\n";

        std::cout << "\n";

        if(score1)
            scorePlayer1 += 1;
        else
            scorePlayer2 += 1;
        if(score2)
            scorePlayer2 += 1;
        else
            scorePlayer1 += 1;

        std::cout << "Punteggio: " << player1->getNome() << " " << scorePlayer1 
                << " - " << player2->getNome() << " " << scorePlayer2 << "\n"; 

        sleep(1);

        if(scorePlayer1 == scorePlayer2 + 2 || scorePlayer1 + 2 == scorePlayer2)
            break;
    } while(1);

    std::string win = score1 > score2 ? player1->getNome() : player2->getNome();

    std::cout << "Vince il tennista " << win << "\n\n";
}

void Campo::cambiaStrategia(bool player1, Strategia* strategia) {
    if(player1)
        this->player1->setStrategy(strategia);
    else
        this->player2->setStrategy(strategia);
}