# Open/Closed Principle

Het **Open/Closed Principle (OCP)** is waar de "O" in **SOLID** voor staat. Dit principe bewaakt de **kwaliteit, onderhoudbaarheid en flexibiliteit** van objectgeoriënteerde code.

## Wat is het Open/Closed Principle?

Het **Open/Closed Principle** richt zich voornamelijk op het maken van **onderhoudbare code**. Dit komt doordat het wil voorkomen dat bestaande code die al goed werkt, aangepast of aangevuld moet worden bij nieuwe functionaliteit.

Dit wordt bereikt door **abstractie** toe te voegen en **verantwoordelijkheid** te verleggen. Hierdoor kan de code eenvoudig worden uitgebreid zonder wijzigingen aan de bestaande code.

**Samengevat:**
- **Open** voor uitbreiding: Nieuwe functionaliteit kan worden toegevoegd.
- **Closed** voor aanpassing: Bestaande code blijft onaangetast.

Dit sluit direct aan bij de naam **Open/Closed**:  
❌ **Niet aanpassen** | ✅ **Altijd uitbreiden**

## Hoe pas je OCP toe?

Voor het maken van **Open/Closed code** zijn er een paar belangrijke aspecten:

1. **Encapsulatie & Abstractie**
    - Door directe code achter **abstracties** te verbergen, kun je nieuwe functionaliteit toevoegen zonder bestaande code te wijzigen.

2. **Polymorfisme**
    - Maak gebruik van **polymorfisme** door klassen te laten erven van een **abstracte klasse** of **interface**.
    - Hierdoor kunnen methodes verschillend worden geïmplementeerd per klasse, terwijl de aanroep gelijk blijft.

3. **Separation of Concerns**
    - Denk goed na over wie waarvoor verantwoordelijk is.
    - Een methode zoals `geefKortingAanKlant()` in een `Rekening`-klasse hoeft niet te weten hoe elke klant korting krijgt. Dit kunnen de klanten zelf bepalen.

## Voorbeeld

Met het voorbeeld in punt 3 is duidelijk te zien dat het eenvoudig is om een **nieuw klanttype** toe te voegen aan de codebase.

- We maken een nieuwe klasse `Klant` en definiëren daarin hoe de korting werkt.
- Als we dit in `geefKortingAanKlant()` zouden verwerken, moeten we deze methode aanpassen bij elke nieuwe klant.
- **En dat willen we juist niet!**

We **breiden** de code uit met een nieuwe klant in plaats van de bestaande code aan te passen.  
