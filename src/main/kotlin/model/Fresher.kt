package model

class Fresher : Candidate {
    private var mGraduationDate: String = ""
    private var mGraduationRank: String = ""
    private var mEducation: String = ""
    override var mListCertificated: MutableList<Certificated> = mutableListOf()

    constructor() {}

    override fun showInfo() {
        println(
            "STT:${super.mCandidateID}," +
                    "FullName:${super.mFullName}," +
                    "BirthDay:${super.mBirthDay}," +
                    "mPhone:${super.mPhone}," +
                    "CandidateType:${super.mCandidateType}," +
                    "GraduationDate:${this.mGraduationDate}," +
                    "GraduationRank:${this.mGraduationRank}," +
                    "Education:${this.mEducation}"
        )
    }

    fun inputInformation() {
        println(":Input CandicatedID")
        this.mCandidateID = readLine().toString()
        println("Input FullName:")
        this.mFullName = readLine().toString()
        println("Input BirthDay:")
        this.mBirthDay = readLine().toString()
        println("Input Phone:")
        this.mPhone = readLine().toString()
        println("Input GraduationDate:")
        this.mGraduationDate = readLine().toString()
        println("Input Graduation Rank:")
        this.mGraduationRank = readLine().toString()
        println("Input Education:")
        this.mEducation = readLine().toString()
        addCertificated()
    }

    fun addCertificated() {
        println("1.Input Certificated Count:")
        val sl = readLine()?.toInt()!!
        if (sl > 0) {
            for (i in 1..sl) {
                val certificated = Certificated()
                certificated.inputCertificated()
                mListCertificated.add(certificated)
            }
        }
    }
}
