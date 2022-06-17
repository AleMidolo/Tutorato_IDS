/*
Dati i seguenti frammenti di codice in stile imperativo
si richiede di trascrivere la relativa forma funzionale
sfruttando l'interfaccia Stream di Java
*/

List<Double> stipendi = List.of(1200.50, 1100.24, 1465.23, 1876.21, 1954.23, 1395.1, 2452.87);

// Esercizio 1
for(Double stipendio : stipendi){
	if(stipendio > 1500.00)
		System.out.println("Stipendio: " + stipendio);
}

// Esercizio 2
Double sommaStipendi = 0.0;
for(Double stipendio : stipendi){
	if(stipendio > 0)
		sommaStipendi += stipendio;
}

// Esercizio 3
List<Double> stipendiMedi = new ArrayList<>();
for(Double stipendio : stipendo){
	if(stipendio > 1500)
		if(stipendio < 2000)
			stipendiMedi.add(stipendio);
}

// Esercizio 4
List<Double> stipendiManager = new ArrayList<>();
for(Impiegato d: registroDipendenti){
	if(d.getRuolo().equals(RUOLO.Manager))
		stipendiManager.add(d.getStipendio());
}

// Esercizio 5
for(Impiegato d : registroDipendenti){
	if(d.getRuolo().equals(RUOLO.Manager)){
		if(d.getStipendio() > 2500)
			return true;
	}
	return false;
}

// Esercizio 6
for(Impiegato d : registroDipendenti){
	if(d.getRuolo().equals(RUOLO.Direttore))
		return d;
}

/*
Dato il file libri.csv presentato nella seconda lezione, si prega di generare la libreria richiesta.
A questo punto si richiede di effettuare le seguenti operazioni sfruttando i metodi Stream trattati a lezione:

1) Estrarre i libri che hanno disponibilità minore di 5
2) Estrarre i libri che hanno prezzo inferiore a 10
3) Estrarre tutti i generi presenti nella libreria
4) Calcolare il possibile guadagno da tutti i libri (sommare i singoli prezzi)
5) Calcolare il possibile guadagno da tutti i libri considerando le disponibilità (sommare i singoli prezzi per ogni disponibilità)
6) Calcolare i guadagni per ogni genere di libro (sommare i singoli prezzi)
7) Estrarre i libri il cui nome è composto solo da due parole
*/

// Soluzione cicli for

// Esercizio 1
stipendi.stream().
	filter(stipendio -> stipendio > 1500).
	forEach(stipendio -> System.out.println("Stipendio: " + stipendio));

// Esercizio 2
Double sommaStipendi = stipendi.stream().
	filter(stipendio -> stipendio > 0).
	reduce(0, Double::sum);
	// reduce(0, (acc, stipendio) -> acc + stipendio);

// Esercizio 3
List<Double> stipendiMedi = stipendi.stream().
	filter(stipendio -> stipendio > 1500 && stipendio < 2000).
	collect(Collectors.toList());

// Esercizio 4
List<Double> stipendiManager = registroDipendenti.stream().
	filter(d -> d.getRuolo().equals(RUOLO.Manager)).
	map(d -> d.getStipendio()).
	collect(Collectors.toList());

// Esercizio 5
return registroDipendenti.stream().
	anyMatch(d.getRuolo.equals(RUOLO.Manager) && d.getStipendio() > 2500);

// Esercizio 6
Optional<Impegato> optImpiegato = registroDipendenti.stream().
	filter(d -> d.getRuolo().equals(RUOLO.Direttore)).
	findFirst();
if(optImpiegato.isPresent())
	return optImpiegato.get();