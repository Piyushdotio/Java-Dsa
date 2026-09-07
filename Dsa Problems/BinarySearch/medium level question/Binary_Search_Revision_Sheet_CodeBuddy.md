# Binary Search Revision Sheet (Code Buddy)

> Goal: Revise every Binary Search pattern in 30–45 minutes before interviews.

## Pattern 1 — Classic Binary Search

**Use when:** Find an exact element in a sorted array.

### Template
- `low = 0`
- `high = n - 1`
- `mid = low + (high - low) / 2`

### Questions
- Binary Search
- Search Insert Position
- Guess Number Higher or Lower

---

## Pattern 2 — Lower Bound

**Definition:** First index where `arr[i] >= x`.

### Questions
- Lower Bound
- Search Insert Position
- Find Row with Maximum 1's

---

## Pattern 3 — Upper Bound

**Definition:** First index where `arr[i] > x`.

### Questions
- Upper Bound
- Count occurrences in sorted array

---

## Pattern 4 — First & Last Occurrence

### Questions
- First and Last Position of Element
- Count Occurrences

---

## Pattern 5 — Binary Search on Answer ⭐

**Use when:** Find minimum/maximum answer satisfying a condition.

### Checklist
- Search space?
- Helper function?
- Monotonic YES/NO?

### Must Solve
1. Square Root (LC 69)
2. Nth Root
3. Koko Eating Bananas (LC 875)
4. Minimum Days to Make Bouquets (LC 1482)
5. Smallest Divisor Given Threshold (LC 1283)
6. Capacity to Ship Packages Within D Days (LC 1011)
7. Allocate Books
8. Split Array Largest Sum (LC 410)
9. Aggressive Cows

---

## Pattern 6 — Peak Element

### Questions
- Peak Element
- Find Peak in Mountain Array

---

## Pattern 7 — Rotated Sorted Array

### Questions
- Search in Rotated Sorted Array
- Find Minimum in Rotated Sorted Array

---

## Pattern 8 — 2D Binary Search

### Questions
- Search a 2D Matrix
- Search a 2D Matrix II
- Row with Maximum 1's

---

## Binary Search Cheat Sheet

| Pattern | Search On |
|--------|-----------|
| Classic | Sorted Array |
| Lower Bound | First >= x |
| Upper Bound | First > x |
| First/Last | Target occurrence |
| Answer BS | Speed / Day / Capacity / Divisor |
| Peak | Peak index |
| Rotated | Sorted half |
| 2D | Rows / Columns |

---

## Binary Search on Answer Formula

```java
while(low <= high){
    int mid = low + (high - low)/2;

    if(valid(mid)){
        ans = mid;
        high = mid - 1;
    }else{
        low = mid + 1;
    }
}
```

---

## Interview Checklist

- [ ] Array sorted?
- [ ] Lower Bound?
- [ ] Upper Bound?
- [ ] First/Last Occurrence?
- [ ] Rotated Array?
- [ ] Peak?
- [ ] Binary Search on Answer?
- [ ] 2D Matrix?
