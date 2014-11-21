home-work-1
===========

Innehåller tomma filer till inlämningen. Huvudet i filerna är inte korrekta utan anger endast vilken typ av klass det är. Behöver ni lägga till fler filer är det ok. Vill ni döpa om filer görs detta enklast via GUI klienten. Vid användning av shell kör mv kommandot.

Arbetsgång:

- [ ] Gör en fork av denna repo till din github användare.
- [ ] Skriv färdigt projektet (kom ihåg att göra en push ofta i fall det skulle hända något mwed koden).
- [ ] Fyll i logfilen eftersom du skriver projektet
    - Log-filen skrivs enligt:
        - Datum
        - Vad skall jag göra idag.
        - Vad är problemet?
        - Till nästa gång
- [ ] Readme-filen
     - Fyll i under rubrikerna nedan.
- [ ] När projektet är färdigt gör en sista push till din användare.
- [ ] Sista steget är att göra en pull-request till den här repo:n. Se till att göra den till din branch.


---


Inledning
---
Presentation av projektet/programmet
Detta program är ett projektarbete i programmering 2 som är skapat utav mig, Kent Nystedt.
Där jag fick i uppgift att skapa ett simpelt rollspel. Programmer är ett rollspel 
där man kan skapa en namnlös karaktär som sedan slåss mot en boss med random liv 
och attack.

Genomförande
---

Hur gick det?


Slutresultat/Analys/Diskussion
---

- Buggar
- Förbättringar
- Övrigt

rubrik
---

-listor

RolePlayingGame Dagbok
---
-2014-10-15 Idag ska jag jobba på GUI:ets struktur, lagt till arkiv,
jag har intefunnit något hinder.
 Nästa gång ska jag lägga till Paneler och knappar.

-2014-10-17 Idag har jag som jag tidigare sa lagt till paneler och knappar för
att göra en karaktär. Jag har stött på ett problem jag måste åtgärda. Mina JButtons
läggs längs med efter varandra och jag vill ha de "radbrutna". Nästa gång ska jag
åtgärda det problemet och påbärja min andra klasser.

-2014-10-24 Idag har jag lyckats dirigera knapparna till önskande ställen. Jag har
lagt till en konsoll som kommer säga vad som händer när programmet körs. Jag är
färdig med strukturen på GUI:et, det ändå som återstår är att lägga till de övriga
klasserna.

-2014-11-05 Idag har jag lagt till en Boss klass och skapat en attack knapp och
metod som ärver från playern, jag skapade en player som är en elf/human, och elf
/human ärver i sin tur från abstractklasssen. Jag har då problem med att det inte
går att ärva från player. Sen har jag haft problem med att veta vilken ras jag har
valt så nästa lektion är det problemen som jag ska åtgärda.

-2014-11-12 Idag har jag fått hjälp med att efter jag klickat på knapparna 
deklarera playern vilken ras och klass han har. Så jag fixade problemet från tidigare
lektion. Nästa lektion ska jag påbörja "kriget" mellan playern och bossen samt 
få textfältet att skicka ut information om "kriget". Sen ska jag få attack-knappen
att ärva playerns attack.

-2014-11-14 Idag har jag lagt till klasser i modellen osm håller reda på allt som händer
och som skall implementeras i GUI:et, jag har lagt itll en "combat" klass. Det
jag har kvar är att skapa en vinnare innan dess att spelet fungerar komplett.

-2014-11-14 Senare idag märkte jag att min "combat" metod inte fungerade men
jag löste det genom att skapa nya abstrakta klasser där jag kunde sätta livet
så att ifall jag hade blivit attackerad kunde jag säga att det var det nya livet.
Det jag har kvar att göra innan programmet blir godkänd är CompareTo klassen,men
jag funderar på att lägga till ett grafiskt fönster som ritar ut händelserna. Under
helgen ska jag finjustera programmet kanske lägga till namn till karaktären osv.

-2014-11-19 Jag hade en ogodtagbar lösning till min lösning på combat-problemet,
men det löste sig då jag implementera attacken och livet i bossen och inte i modell
klassen. Det jag hade glömt sen tidigare var att skapa en comparable, så jag tog
mig tid att skapa den men har ingen aning ännu hur den används eller var den ska
implementeras.

-2014-11-21 Jag listade ut hur comparable ska användas men använder endast
 den komplett i boss-klassen där jag jämför vem som lever eller dog.
 Den implementeras i boss-klassen. Inlämningen är den 21:a, så nu har jag
 en deadline att hålla. Det jag måste fixa nu är ett klassdiagram och kommentera
koden.
