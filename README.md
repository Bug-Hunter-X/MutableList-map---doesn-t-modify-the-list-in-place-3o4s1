# Kotlin MutableList.map() Behavior

This example demonstrates a common point of confusion for developers coming from languages where `map`-like functions modify the original list in place.  In Kotlin, `map` on a `MutableList` returns a *new* list containing the transformed elements, leaving the original list unchanged.  This is a significant difference and can lead to unexpected behavior.

The `bug.kt` file shows the unexpected outcome. The solution, in `bugSolution.kt`, demonstrates the correct approach using `map` and assignment, or modifying the list directly using an in-place operation.