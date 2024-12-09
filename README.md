# **Fordonsuthyrningssystem**

## **Projektbeskrivning**
Detta projekt är ett fordonsuthyrningssystem utvecklat i Java. Programmet erbjuder en meny där användare kan:
- Visa tillgängliga fordon.
- Hyra ett fordon.
- Returnera ett fordon.
- Få information om hyreskostnader.

Projektet använder objektorienterade principer som arv, inkapsling, abstraktion och interfaces för att skapa en skalbar och flexibel kodstruktur.

---

## **Krav**
För att köra detta projekt behöver du:
- Java Development Kit (JDK) version 8 eller högre.
- En IDE som IntelliJ IDEA, Eclipse, eller NetBeans (valfritt).
- Git för versionskontroll (valfritt).

---

## **Hur man kör programmet**
1. Klona eller ladda ner projektet från [GitHub-repositoriet](#).
2. Öppna projektet i din IDE eller kör det direkt via kommandoraden.
3. Kompilera och kör filen `RentalServices.java` som innehåller huvudmetoden.
4. Följ instruktionerna i den konsolbaserade menyn för att interagera med applikationen.

---

## **Projektarkitektur**
Projektet består av följande komponenter:

### 1. **Klasser och interface**
- **`Vehicle` (Abstrakt klass):**  
  Basklass som definierar gemensamma attribut och metoder för alla fordon.
- **`Car` (Subklass):**  
  En specifik klass för bilar, med ett attribut för att indikera om bilen är elektrisk.
- **`Rentable` (Interface):**  
  Standardiserar uthyrningslogiken med metoder för att hyra, returnera och beräkna hyreskostnad.

### 2. **Huvudprogram**
- **`RentalServices`:**  
  Hanterar användarinteraktionen genom en meny där fordon kan visas, hyras eller returneras.

---

## **Exempel på Användning**
### Starta programmet:
```text
--- Vehicle Rental Service ---
1. View available vehicles
2. Rent a vehicle
3. Return a vehicle
4. Exit
Enter your choice: 
