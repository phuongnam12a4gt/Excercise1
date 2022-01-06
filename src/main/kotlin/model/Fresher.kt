package model

class Fresher : Candidate {
    private var mGraduationDate: String = ""
    private var mGraduationRank: String = ""
    private var mEducation: String = ""
    override lateinit var mListCertificated: MutableList<Certificated>

    constructor() {}

    override fun showInfo() {
        println(
            "STT:${super.mCandidateID}," +
                    "Tên:${super.mFullName}," +
                    "BirthDay:${super.mBirthDay}," +
                    "mPhone:${super.mPhone}," +
                    "CandidateType:${super.mCandidateType}," +
                    "GraduationDate:${this.mGraduationDate}," +
                    "GraduationRank:${this.mGraduationRank}," +
                    "Education:${this.mEducation}"
        )
    }

    fun inputInformation() {
        println("Input GraduationDate:")
        this.mGraduationDate = readLine().toString()
        println("Input Graduation Rank:")
        this.mGraduationRank = readLine().toString()
        println("Input Education:")
        this.mEducation = readLine().toString()
        println(":Input CandicatedID")
        this.mCandidateID = readLine().toString()
        println("Input FullName:")
        this.mFullName = readLine().toString()
        println("Input BirthDay:")
        this.mBirthDay = readLine().toString()
        println("Input Phone:")
        this.mPhone = readLine().toString()
    }
}
