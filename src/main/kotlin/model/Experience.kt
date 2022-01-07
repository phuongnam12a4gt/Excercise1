package model

class Experience : Candidate {
    private var mExpInYear: Int = 0
    private var mProSkill: String = ""
    override var mListCertificated: MutableList<Certificated> = mutableListOf()

    constructor() {}

    override fun showInfo() {
        println(
            "STT:${super.mCandidateID}," +
                    "Tên:${super.mFullName}," +
                    "BirthDay:${super.mBirthDay}," +
                    "mPhone:${super.mPhone}," +
                    "CandidateType:${super.mCandidateType}," +
                    "ExpInYear:${this.mExpInYear}," +
                    "ProSkill:${this.mProSkill}+"
        )
    }

    override fun inputInfo() {
        super.inputInfo()
        this.mPhone = readLine().toString()
        println("Input ExpInYear:")
        this.mExpInYear = readLine()?.toInt()!!
        println("Input Semester:")
        this.mProSkill = readLine().toString()
        addCertificated()
    }

    private fun addCertificated() {
        println("1.Input Certificated Count:")
        val sl = readLine()?.toInt()!!
        if (sl > 0) {
            for (i in 1..sl) {
                println("Certificated:${i}")
                val certificated = Certificated()
                certificated.inputCertificated()
                mListCertificated.add(certificated)
            }
        }
    }
}
