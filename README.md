cat > README.md <<'EOF'
# 🧩 Tasca S1.06 - Genèrics

## 📘 Descripció general
Aquesta tasca treballa amb **conceptes de genericitat en Java**, mostrant la diferència entre:
- Una classe **no genèrica**, que només accepta un tipus concret d'objecte.
- Un mètode **genèric**, capaç de treballar amb qualsevol tipus de dades.

El projecte conté **dues parts (nivell 1)** que demostren l'ús de genèrics en diferents contextos.

---

## 📂 Estructura del projecte
```bash
1.6.Generics/
│
├── src/
│   ├── level1/
│   │   ├── exercise1/
│   │   │   ├── app/
│   │   │   │   └── Main.java
│   │   │   └── model/
│   │   │       └── NoGenericMethods.java
│   │   │
│   │   ├── exercise2/
│   │   │   ├── app/
│   │   │   │   └── Main.java
│   │   │   └── model/
│   │   │       ├── Persona.java
│   │   │       └── GenericMethods.java
│   │
│   └── README.md
└── out/ (directori de sortida per a fitxers compilats)
````

---

## 🧠 Nivell 1

### 🧮 Exercici 1 — \`NoGenericMethods\`

**Objectiu:**  
Crear una classe que emmagatzemi tres objectes del **mateix tipus** (en aquest cas, \`String\`), amb constructor, getters, setters i un mètode per mostrar-los.

**Fitxers principals:**
- \`NoGenericMethods.java\`
- \`Main.java\` (per provar la classe)

**Execució esperada:**
\`\`\`
First: Barcelona
Second: Madrid
Third: Sevilla

First: Madrid
Second: Sevilla
Third: Barcelona
\`\`\`

---

### ⚙️ Exercici 2 — \`GenericMethods\`

**Objectiu:**  
Crear una classe amb un **mètode genèric** capaç d’acceptar **tres tipus diferents de paràmetres** i mostrar-los per pantalla.  
També es crea una classe \`Persona\` per demostrar l’ús amb objectes personalitzats.

**Fitxers principals:**
- \`Persona.java\`
- \`GenericMethods.java\`
- \`Main.java\`

**Execució esperada:**
\`\`\`
First: Barcelona
Second: Madrid
Third: Sevilla
---------------------
First: 100
Second: 200
Third: 300
---------------------
First: 45.5
Second: 78.9
Third: 12.3
---------------------
First: Persona: John Doe, 30 years old.
Second: Persona: Jane Smith, 25 years old.
Third: Persona: Emily Johnson, 28 years old.
---------------------
\`\`\`

---

## 💻 Instruccions d’execució des de línia de comandes

Assegura’t que estàs dins del directori arrel del projecte (\`1.6.Generics\`).

### 1️⃣ Compilar els fitxers
\`\`\`bash
javac -d out src/level1/exercise1/model/*.java src/level1/exercise1/app/Main.java
javac -d out src/level1/exercise2/model/*.java src/level1/exercise2/app/Main.java
\`\`\`

### 2️⃣ Executar cada exercici
#### Exercici 1:
\`\`\`bash
java -cp out level1.exercise1.app.Main
\`\`\`

#### Exercici 2:
\`\`\`bash
java -cp out level1.exercise2.app.Main
\`\`\`

---

## 🧾 Notes addicionals
- S’han seguit les **bones pràctiques del Sprint 0**: noms descriptius, paquets organitzats i codi llegible.
- Els programes poden executar-se tant des de l’IDE com des de la línia de comandes.
- No s’han utilitzat característiques avançades de Java fora de l’àmbit dels genèrics.

---

## 👩‍💻 Autor
**Nom:** *Carlos Alberto Garzón Bedoya*  
**Curs:** Java Backend - IT Academy  
**Sprint:** 1. Tasca 6 — Genèrics

