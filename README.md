### Tutorato_IDS
Materiale didattico per il Tutorato di Ingegneria del Software A.A. 2021/2022

## Installazione ambiente di sviluppo Java
Scegliete una delle tre opzioni sottostanti, dipende da come preferite sviluppare

**Eclipse IDE**
  1. Scaricare l'ambiente di sviluppo Eclipse dal [sito ufficiale](https://www.eclipse.org/downloads/)
  2. Installare l'ambiente di sviluppo (l'installazione dovrebbe essere comprensiva di tutte le dipendenze)

**VsCode**
  1. Scaricare Visual Studio Code dal [sito ufficiale](https://code.visualstudio.com/)
  2. Installare vscode e avviare il programma
  3. Sulla barra di sinistra trovate l'icona delle "estensioni, cliccate su di essa
  4. Nella barra di ricerca cercate "Extension pack for java" e installatelo (vi installerà tutte le componenti principali per poter sviluppare in java)
  5. A questo punto potete tranquillamente sviluppare su vscode e compilare codice Java

**Compilatore java da riga di comando su Windows 10**
  1. Scaricare l'ultima versione della JDK [Java download](https://www.oracle.com/java/technologies/downloads/)
  2. Installare la JDK nel proprio computer
  3. Verificare che l'installazione sia andata a buon fine (controllare se la cartella C:\Program Files\java è presente, all'interno di essa dovrebbe esserci una sottocartella chiamata jdk)
  4. Aggiornare la variabile d'ambiente PATH (bisogna essere amministratori per poterlo fare):
     - Aprire il pannello di controllo, andare su "Sistema e sicurrezza", quindi cliccare su "Sistema"
     - Cliccare nel pannello di destra su "Impostazioni di sistema avanzate"
     - Aprire il pannello "Avanzate" e cliccare su "Variabili d'ambiente.."
     - Sotto la sezione "Variabili di sistema" cliccate su "Nuova"; il nome della variabile sarà "JAVA_HOME" (rispettate le maiuscole) e il valore della variabile sarà il percorso dove avete installato la vostra JDK (ad esempio nel mio computer il percorso è "C:\Program Files\Java\jdk-17.0.1")
     - Sempre nella sezione "Variabili di sistema" selezionate la variabile "Path" (questa variabile può essere scritta anche PATH o path, è indifferente) e cliccate su modifica. All'interno della variabile path cliccate su nuovo ed inserite questo valore "%JAVA_HOME%\bin". Questo percorso indica la posizione del file .exe di java
     - Salvate e chiudete il tutto. Conviene riavviare la macchina per rendere le modifiche valide
     - Per verificare che l'installazione sia adndata a buon fine, aprire un prompt dei comandi (CMD) e scrivete "java -version" e "javac -version", questi comandi dovrebbero darvi delle informazioni riguardanti la vostra installazione di java
