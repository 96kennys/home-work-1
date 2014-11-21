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
Där jag fick i uppgift att skapa ett simpelt rollspel. I rollspelet kanman skapa
 en namnlös karaktär som sedan slåss mot en boss med random liv och attack. 
Det finns två flikar en där man väljer rasen och sedan väljer klassen.
Där klassen är beroende av vilken ras man väljer. I den andra finns en konsoll i 
form av en textarea, som skriver ut vad som inträffar i spelet när man klickar på
en attack knapp.

Genomförande
---
-I början av utvecklingen gick allting smort när man skulle lägga in komponenter i
MainGUI:et, jag lärde mig väldigt mycket nytt som jag tidigare inte hade kommit
i kontakt med. Det största var nog alla de olika komponenterna som vi var tvugna
att koda fram i jämförelse mot tidigare då vi endast kunde implementera de utan
någon som helst kod överhuvudtaget med hjälp av en JFrame.
-Däremot halvvägs igenom projektet inträffade en rad problem som jag
var tvungen att lösa, bland annat visste jag inte vart allting skulle ske. Jag trodde
att allting skulle köra i gränssnittsklassen. Men tack var min handledare instruktioner
lyckades problem att lösa sig tillslut då han visade mig hur: abstrakta klasser, 
ärvning från filer och initalisera klasser i andra filer fungerade. Tack vare detta
kunde jag förflytta mig frammåt och lyckades konstruera mitt program så som jag ville
att det skulle se ut.
- Men då frammåt slutet av utevecklingstiden kom jag på någonting
"Jag hade glömt Comparable", denna klass hade jag ingen som helst aning om hur den
skulle användas och VARFÖR den skulle användas för organiser så jag var tillbaka 
på ruta ett(kändes det som). Min handledare uppmanade mig till att organisera livet,
vilket jag då tog och gjorde med instruktioner från honom, men av någon anledning
fungerade det inte ännu. Men då gjorde jag om klassen och lyckades då till slut
organisera livet.
Hur gick det?


Slutresultat/Analys/Diskussion
---

- Buggar: Det finns en bugg som jag inte kan hantera. När jag inte valt någon klass
men kör "Attack" skrivs det att jag inte valt någon kallt två gånger istället för 1.
- Förbättringar: Jag skulle kunna vilja rita ut allting som skedde i konsollen, som
exempelvis kunna rita ut attack animationer, bossen och spelaren.
- Övrigt: Jag har lärt mig väldigt mycket från detta arbete mer än något annat
programmeringsarbete, varför? För att nu gjorde jag ett program från grunden?

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
 Den implementeras i boss-klassen. Jag fixade så att ifall jag eller bossen dör
kan programmer inte längre köras. Inlämningen är den 21:a, så nu har jag
 en deadline att hålla. Det jag måste fixa nu är ett klassdiagram och kommentera
koden.
