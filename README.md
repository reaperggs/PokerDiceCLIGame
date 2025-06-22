# 🎲 Poker Dice CLI Game — Java Console Game  

A fun little terminal-based dice battle game built in Java where two players roll five dice, and their combinations are ranked based on classic poker-style rules. The player with the stronger hand (or higher total in case of a tie) wins the round!

---

## 📌 Features  
- 🎲 Roll 5 random dice for each player  
- 🏆 Detect classic dice combinations:
  - Five of a Kind  
  - Four of a Kind  
  - Full House  
  - Three of a Kind  
  - Two Pairs  
  - One Pair  
  - Unique Hand  
- ⚖️ Compare rankings to decide the winner  
- 📝 In case of equal ranking, total dice values determine the winner  
- 🔁 Replay option with exit control  

---

## 📺 Game Demo (Sample Output)

```
Press 0 to exit
Press anything else to play

Player 1's Hand: [1 5 5 1 6]
Two Pairs

Player 2's Hand: [2 4 5 5 6]
One Pair

Player 1 Wins!
```

---

## 📦 How to Run  

1. **Clone the Repository**
```bash
git clone https://github.com/reaperggs/PokerDiceCLIGame.git
cd PokerDiceCLIGame
```

2. **Compile the Java Code**
```bash
javac Main.java
```

3. **Run the Game**
```bash
java Main
```

---

## 📜 Game Rules  
| Rank               | Description                         |
|:------------------|:------------------------------------|
| Five of a Kind     | All 5 dice show same number          |
| Four of a Kind     | 4 dice show same number              |
| Full House         | 3 of one number, 2 of another        |
| Three of a Kind    | 3 dice show same number              |
| Two Pairs          | Two pairs of different numbers       |
| One Pair           | Two of the same number               |
| Unique Hand        | No matching numbers                  |

---

## 📚 What I Learned  
- Using Java collections like `ArrayList` and `HashMap`  
- Implementing ranking logic for combinations  
- Using random number generation in Java  
- Console-based user interaction and input validation  

---

## 🛠️ Tech Stack  
- Java 21  
- Console / Terminal based  

---

## 🚀 Future Improvements  
- Add ASCII dice art for better visual appeal  
- Allow reroll of selected dice  
- Track score over multiple rounds  
- Build a GUI version with JavaFX / Swing  

---

## 📄 License  
This project is open source and free to use under the MIT License.

---

## 🙌 Acknowledgements  
Inspired by classic dice poker games and beginner Java projects.

---

## ✨ Author  
**Aakash Chauhan**  
[GitHub](https://github.com/reaperggs) | [YouTube](https://www.youtube.com/@Aakashchauhan2385)

---

## 🔗 Repository Link  
[Poker Dice CLI Game Repo](https://github.com/reaperggs/PokerDiceCLIGame)
