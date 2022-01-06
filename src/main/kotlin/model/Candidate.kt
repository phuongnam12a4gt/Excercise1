package model

abstract class Candidate() {
    protected var mCandidateID: String =""
    protected var mFullName: String = ""
    protected var mBirthDay: String = ""
    protected var mPhone: String = ""
    protected var mCandidateType: Int = 0
    abstract var mListCertificated: MutableList<Certificated>
    abstract fun showInfo()

    companion object {
        private var mCandidateCount: Int = 0
    }
}
