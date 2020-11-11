fun solution(numbers1: Set<Int>, numbers2: Set<Int>): Int {
    // put your code here
    val result = numbers1 - numbers2
    return result.size
}