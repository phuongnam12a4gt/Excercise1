import model.*
import kotlin.math.exp
import kotlin.system.exitProcess

fun main(args: Array<String>) {
    val manager = ManageCandidate()
    var b1 = true
    do {
        showInformation()
        when (readLine()?.toInt()) {
            1 -> {
                showCandicates()
                var b2 = true
                do {
                    when (readLine()?.toInt()) {
                        1 -> {
                            val intern = Intern()
                            intern.inputInfo()
                            manager.addCandicate(intern)
                            Candidate.mCandidateCount++
                            b2 = false
                        }
                        2 -> {
                            val fresher = Fresher()
                            fresher.inputInfo()
                            manager.addCandicate(fresher)
                            Candidate.mCandidateCount++
                            b2 = false
                        }
                        3 -> {
                            val experience = Experience()
                            experience.inputInfo()
                            manager.addCandicate(experience)
                            Candidate.mCandidateCount++
                            b2 = false
                        }
                        4 -> {
                            b2 = false
                        }
                    }
                } while (b2)
            }
            2 -> {
            }
            3 -> {
                println("Candidates Count:" + Candidate.mCandidateCount)
            }
            4 -> {
                manager.showAllCandidate()
            }
            5 -> {
                b1 = false
            }
        }
    } while (b1)
}

fun showInformation() {
    println("-------------------------------Manager Candicated-----------------------")
    println("1.Add Candicated:")
    println("2.Remove Candicated:")
    println("3.Show Candicated Count.")
    println("4.Show list candicated")
    println("5.Exit")
}

fun showCandicates() {
    println("1.Add Intern:")
    println("2.Add Fsresher:")
    println("3.Add Experience.")
    println("4.Exit.")
}
