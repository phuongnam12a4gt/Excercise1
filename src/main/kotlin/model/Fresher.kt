package model

class Fresher(override var mListCertificated: MutableList<Certificated>) : Candidate() {
    private var mGraduationDate: String = ""
    private var mGraduationRank: String = ""
    private var mEducation: String = ""
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
}
