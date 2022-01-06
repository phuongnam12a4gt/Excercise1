package model

class Intern : Candidate {
    private var mMajor: String = ""
    private var mSemester: String = ""
    private var mUniversity: String = ""
    override lateinit var mListCertificated: MutableList<Certificated>

    constructor() {

    }

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
        println("Input Major:")
        this.mMajor = readLine().toString()
        println("Input Semester:")
        this.mSemester = readLine().toString()
        println("Input University:")
        this.mUniversity = readLine().toString()
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
