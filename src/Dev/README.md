
# Gioco della Divina Commedia

Console Game in Java (WIP)

## Obiettivo del progetto

Costruire un gioco testuale strutturato sui cerchi dell’Inferno dantesco.
Il giocatore attraversa i cerchi, interagisce con personaggi, legge dialoghi e completa sfide per proseguire.

L’obiettivo del codice attuale è stabilire l’architettura base:
menu di gioco, gestione dei cerchi, sistema dialoghi, personaggi, e struttura modulare delle classi.

---

# Struttura del Progetto

## 1. Main

File centrale che gestisce:

* Menu iniziale
* Avvio nuova partita
* Tutorial iniziale
* Validazione del nome
* Ciclo dei cerchi tramite ENUM
* Routing verso i metodi di ogni cerchio

Funzioni principali:

* `main()` mostra il menu e gestisce le scelte dell’utente
* `nuovaPartita()` richiede il nome e avvia il tutorial
* `printBasicTutorial()` mostra il tutorial base
* `iniziaGioco()` cicla attraverso tutti i cerchi dell'Inferno
* `checkNome(String)` valida gli input del nome

---

## 2. Inferno

Contiene la logica dei cerchi.
Ogni cerchio è rappresentato da un metodo booleano che ritorna:

* `true` se il giocatore completa il cerchio
* `false` se si arrende

Esempio:

```java
public static boolean cerchioLimbo() {  }
```

Attualmente implementati:

* Limbo
* Lussuriosi
* Golosi
* Avari e Prodighi
* Iracondi e Accidiosi
* Eretici
* Violenti
* Fraudolenti
* Traditori

Ogni cerchio per ora stampa solo una frase.
Il Limbo contiene un esempio completo di utilizzo dei dialoghi e personaggi.

---

## 3. Sistema Dialoghi

### Classe `Dialogo`

Rappresenta un singolo dialogo.
Supporta:

* solo testo
* testo + opzioni

Metodi utili:

* `toString()` stampa il testo
* `printOpzioni()` stampa le scelte disponibili

Esempio d’uso:

```
System.out.println(new Dialogo("Benvenuto"));
dialogo.printOpzioni();
```

---

## 4. Personaggi

### Classe `Personaggio`

Ogni personaggio contiene:

* nome
* lista di Dialoghi

Metodi:

* `getNome()`
* `getDialoghi()`
* `printDialogo(int index)`

Esempio:

```java
ArrayList<Dialogo> d = new ArrayList<>();
Personaggio p = new Personaggio("Orazio", d);
```

---

## 5. Enumeratore dei Cerchi

L’ENUM `Cerchi` stabilisce l’ordine dei livelli.
Il Main li cicla automaticamente tramite:

```java
public static final Cerchi[] cerchi = Cerchi.values();
```

Aggiungere un nuovo cerchio richiede solo:

1. Aggiunta nell’ENUM
2. Aggiunta del case nello switch di `iniziaGioco()`
3. Creazione del relativo metodo in `Inferno`

---

# Avanzamento attuale

* Menu base funzionante
* Tutorial introduttivo
* Inserimento nome con validazione
* Ciclo dei nove cerchi
* Sistema dialoghi completo
* Sistema personaggi completo
* Prima implementazione del Limbo con dialoghi di esempio
* Struttura altamente espandibile

---

# Cose da sviluppare (To Do)

Checklist ordinata per priorità:

### 1. Sistema Dialoghi Avanzato

* gestione opzioni interattive
* scelte che cambiano eventi o oggetti
* più personaggi per cerchio

### 2. Sistema Inventario

* oggetti acquisiti dai personaggi
* oggetti richiesti per avanzare
* eventuali trade o scelte

### 3. Struttura unificata dei cerchi

Decidere se:

* mantenere metodi separati
* oppure creare un sistema generico per `giocaCerchio(Cerchio c)`

### 4. Eventi e Mini-Sfide

* enigmi
* quiz
* esplorazione
* rischi e possibilità di arrendersi

### 5. Salvataggi (coming soon nel menu)

* serializzazione dello stato
* caricamento partita

---

# Come contribuire allo sviluppo

1. Creare i dialoghi del tutorial
2. Creare i dialoghi per i cerchi successivi
3. Aggiungere personaggi e logiche interne
4. Creare nuove classi per oggetti, eventi o sfide
5. Espandere gradualmente l’Inferno con nuove meccaniche

---

# Obiettivo finale

Costruire un gioco testuale completamente narrativo, fedele alla struttura dell’Inferno, con logica modulare e gameplay basato su dialoghi, scelte ed enigmi.
