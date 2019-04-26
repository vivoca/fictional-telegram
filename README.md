# OOP - gyakorlati feladatsorok

### 1. feladat
Definiáljon egy tartalyos.Tarolo nevű osztályt!\
Definiáljon benne a térfogat (egész) tárolásához adattagot!\
Legyen konstruktora, amely paraméterként kapott adattal inicializálja az adattagot!\
Legyen egy absztrakt metódusa, amelynek nincs paramétere és visszaadja, hogy a Tarolo veszélyes-e!\
Legyen metódusa, amely visszaadja a térfogatot!\
Definiáljon egy tartalyos.Tartaly osztályt, amely egy valamilyen gázt tárol nagy nyomáson! Legyen a tartalyos.Tarolo osztály leszármazottja!

Legyen adattagja a tartály nyomásának (valós) tárolására; valamint egy konstruktora, amely paraméterben kapott adatokkal inicializálja az objektumot!\
Definiálja felül a veszélyességet visszaadó metódust úgy, hogy akkor adjon igazat, ha a térfogat*nyomás>100!\
Legyen egy toString felüldefiniálás, amely a tartály térfogatát, nyomását és hogy „veszélyes” vagy „nem veszélyes” adja vissza egy string-be összefűzve!\
Legyen egy metódusa, amely igazat ad, ha a tartály nagyobb nyomású, mint egy paraméterként kapott tartály!\
Legyen egy osztályszintű metódusa, amely két paraméterként kapott tartály közül a nagyobb térfogatút adja vissza!\
Definiáljon egy futtatható osztályt (tartalyos.fut.Proba)!

Ebben hozzon létre 5 Tartaly objektumot beolvasott adatokkal!\
Írja ki az összes tartály adatait!\
Írja ki a legnagyobb nyomású tartályt!\
Írja ki a legnagyobb térfogatú tartályt!

### 2. feladat
Definiáljon egy Diak osztályt, amely képes tárolni egy diák nevét és azt, hogy hány forintja van a zsebében!\
Definiáljon konstruktort, amellyel egy példány adatai beállíthatók!\
Definiáljon egy metódust, amely visszaadja a pénzének a mennyiségét!\
Definiáljon egy sorozik metódust, amely paraméterében kapja meg a sör árát, amivel csökkenti a pénz mennyiségét, ha még kitelik belőle, és ilyenkor igaz értéket ad vissza, egyébként hamisat!

Írjon egy OvatosDiak osztályt a Diak osztály leszármazottjaként, amely képes tárolni azt az összeget, amit a diák a hazaútra útiköltségként félretesz (mert utál gyalogolni)!\
Definiáljon konstruktort, amellyel egy példány adatai beállíthatók!\
Definiálja felül a sorozik metódust úgy, hogy csak akkor csökkenti az ital árával a pénz mennyiségét, ha még marad útiköltségre, és csak ekkor ad vissza igaz értéket!\
(Ha csak részben fedezné a maradék pénz az italt, akkor már ne vonja le, és hamisat adjon vissza.)\
Definiálja az osztályra a toString metódust úgy, hogy a "Pénzmag:" szöveg után kiírja a útiköltségen felül még meglevő pénz mennyiségét!

Definiáljon egy RockWell osztályt, amely futtatható!\
Hozzon létre egy OvatosDiak példányt, tetszőleges adatokkal!\
Itasson meg a példánnyal 300 Ft-os sört annyiszor, ahányszor kitelik a pénzéből! Írja ki a megivott sörök sorszámait és az aktuális pénzmennyiséget!

### 3. feladat
Definiáljon VizsgaZH osztályt amely képes tárolni egy diák nevét és a zh-n elért pontszámát!\
Az osztályhoz tartozzon egy konstans, amely az elérhető maximális pontszámot tartalmazza, értéke 100!\
Definiáljon konstruktort, amellyel egy példány írójának neve beállítható!\
Definiáljon egy metódust, amellyel beállítható az elért pontszám!\
Definiáljon egy metódust, amely visszaadja a diák nevét és az elért pontszám!\
Definiáljon egy megfeleltE metódust, amely igaz értékkel tér vissza, ha a pontszám nagyobb, mint a maximum fele!

Definiáljon InfosVizsgaZH osztályt a VizsgaZH osztály leszármazottjaként, amely képes tárolni a zh-hoz csatolt, elvett puskák számát!\
Definiáljon konstruktort, amellyel egy példány írójának neve beállítható!\
Definiáljon egy metódust, amellyel beállítható az elért pontszám és a puskák száma!\
Definiálja felül a megfeleltE metódust, amely igaz értékkel tér vissza, ha a Vizsgazh megfelelt és a puskák száma 0!\
Definiálja felül a toString metódust, amely egy string-ben visszaadja a diák nevét, az elért pontszámot és hogy a vizsgazh megfelelt-e!

Írjon egy ProbaZH osztályt, amely futtatható!\
Olvassa be a zh-t írók számát, deklaráljon ennek megfelelő méretű InfosVizsgaZH tömböt!\
Töltse fel véletlenszerű adatokkal a tömböt (pontszám 0-100 közötti, puskák száma 0 vagy 1 legyen, a vizsgázók neve: ZHiro1, ZHiro2, ZHiro3, stb.) legyen!\
Írassa ki minden vizsgázó adatait, és hogy a vizsga megfelelt-e!\
Írassa ki a megfeleltek részarányát százalékosan!