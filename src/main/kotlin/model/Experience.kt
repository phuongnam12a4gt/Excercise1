package model

class Experience(override var mListCertificated: MutableList<Certificated>) : Candidate() {
    private var mExpInYear: Int = 0
    private var mProSkill: String = ""
    override fun showInfo() {
        println(
            "STT:${super.mCandidateID}," +
                    "Tên:${super.mFullName}," +
                    "BirthDay:${super.mBirthDay}," +
                    "mPhone:${super.mPhone}," +
                    "CandidateType:${super.mCandidateType}," +
                    "ExpInYear:${this.mExpInYear}," +
                    "ProSkill:${this.mProSkill}"
        )
    }
}
