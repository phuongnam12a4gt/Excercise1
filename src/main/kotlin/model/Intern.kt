package model

class Intern() : Candidate() {
    private var mMajor: String = ""
    private var mSemester: String = ""
    private var mUniversity: String = ""
    override var mListCertificated: MutableList<Certificated> = mutableListOf()

    override fun showInfo() {
        println(
            "STT:${super.mCandidateID}," +
                    "FullName:${super.mFullName}," +
                    "BirthDay:${super.mBirthDay}," +
                    "mPhone:${super.mPhone}," +
                    "CandidateType:${super.mCandidateType}," +
                    "Major:${this.mMajor}," +
                    "Semester:${this.mSemester}," +
                    "University:${this.mUniversity}"
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
        println("Input Major:")
        this.mMajor = readLine().toString()
        println("Input Semester:")
        this.mSemester = readLine().toString()
        println("Input University:")
        this.mUniversity = readLine().toString()
        addCertificated()
    }

    fun addCertificated() {
        println("1.Input Certificated Count:")
        val sl = readLine()?.toInt()!!
        if (sl > 0) {
            val certificated = Certificated()
            certificated.inputCertificated()
            for (i in 1..sl) {
                mListCertificated.add(certificated)
            }
        }
    }
}
