import model.*
import kotlin.math.exp
import kotlin.system.exitProcess

fun main(args: Array<String>) {
    val manager = ManageCandidate()
    showInformation()
    var i = readLine()?.toInt()
    when (i) {
        1 -> {
            showCandicates()
            var i1 = readLine()?.toInt()
            when (i) {
                1 -> {
                    val intern = Intern()
                    intern.inputInformation()
                    manager.addCandicate(intern)
                    manager.showAllCandidate()
                }
                2 -> {
                    val fresher = Fresher()
                    fresher.inputInformation()
                    manager.addCandicate(fresher)
                }
                3 -> {
                    val experience = Experience()
                    experience.inputInformation()
                    manager.addCandicate(experience)
                }
            }
        }
        2 -> {
        }
        3 -> {
        }
        4 -> {
        }
    }
}

fun showInformation() {
    println("-------------------------------Manager Candicated-----------------------")
    println("1.Add Candicated:")
    println("2.Remove Candicated:")
    println("3.Show Candicated Count.")
    println("4.Show list candicated")
}

fun showCandicates() {
    println("1.Add Intern:")
    println("2.Add Fresher:")
    println("3.Add Experience.")
}
