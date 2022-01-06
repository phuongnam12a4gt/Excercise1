package model

class ManageCandidate {
    private var list = mutableListOf<Candidate>()
    fun addCandicate(candidate: Candidate) {
        list.add(candidate)
    }

    fun showAllCandidate() {
        for (i in 0..list.size - 1) {
            println("---------------------Show candidate 1-------------------------")
            list[i].showInfo()
        }
    }
}
