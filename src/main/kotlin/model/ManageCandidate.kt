package model

class ManageCandidate {
    private var list = mutableListOf<Candidate>()
    fun addCandicate(candidate: Candidate) {
        list.add(candidate)
    }

    fun showAllCandidate() {
        for (i in 0 until list.size) {
            println("---------------------Show candidate ${i}-------------------------")
            list[i].showInfo()
        }
    }
}
