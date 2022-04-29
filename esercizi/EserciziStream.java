/*
Dati i seguenti frammenti di codice in stile imperativo
si richiede di trascrivere la relativa forma funzionale
sfruttando l'interfaccia Stream di Java
*/

List<Double> stipendi = List.of(1200.50, 1100.24, 1465.23, 1876.21, 1954.23, 1395.1, 2452.87);

for(Double stipendio : stipendi){
	if(stipendio > 1500.00)
		System.out.println("Stipendio: " + stipendio);
}

Double sommaStipendi = 0.0;
for(Double stipendio : stipendi){
	if(stipendio > 0)
		sommaStipendi += stipendio;
}

for(Double stipendio : stipendo){
	if(stipendio > 1500)
		if(stipendio < 2000)
			System.out.println("Stipendio compresi tra 1500 e 2000: " + stipendio);
}


/*
Dato il file libri.csv presentato nella seconda lezione, si prega di generare la libreria richiesta.
A questo punto si richiede di effettuare le seguenti operazioni sfruttando i metodi Stream trattati a lezione:

1) Estrarre i libri che hanno disponibilità minore di 5
2) Estrarre i libri che hanno prezzo inferiore a 10
3) Calcolare il possibile guadagno da tutti i libri (sommare i singoli prezzi)
4) Calcolare il possibile guadagno da tutti i libri considerando le disponibilità (sommare i singoli prezzi per ogni disponibilità)
5) Calcolare i guadagni per ogni genere di libro (sommare i singoli prezzi)
6) Estrarre i libri il cui nome è composto solo da due parole
*/