package model

class Intern(override var mListCertificated: MutableList<Certificated>) : Candidate() {
    private var mMajor: String = ""
    private var mSemester: String = ""
    private var mUniversity: String = ""

    override fun showInfo() {
        println(
            "STT:${super.mCandidateID}," +
                    "Tên:${super.mFullName}," +
                    "BirthDay:${super.mBirthDay}," +
                    "mPhone:${super.mPhone}," +
                    "CandidateType:${super.mCandidateType}," +
                    "Major:${this.mMajor}," +
                    "Semester:${this.mSemester}," +
                    "University:${this.mUniversity}"
        )
    }
}
