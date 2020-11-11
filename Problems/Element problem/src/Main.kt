fun solution(first: Set<String>, second: Array<String>): Boolean {
    // put your code here
    return first.containsAll(second.toSet())
}