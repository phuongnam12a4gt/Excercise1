package model

abstract class Candidate() {
    protected var mCandidateID: String = ""
    protected var mFullName: String = ""
    protected var mBirthDay: String = ""
    protected var mPhone: String = ""
    protected var mCandidateType: Int = 0
    abstract var mListCertificated: MutableList<Certificated>
    abstract fun showInfo()

    open fun inputInfo() {
        println(":Input CandicatedID")
        this.mCandidateID = readLine().toString()
        println("Input FullName:")
        this.mFullName = readLine().toString()
        println("Input BirthDay:")
        this.mBirthDay = readLine().toString()
        println("Input Phone:")
        this.mPhone = readLine().toString()
    }

    companion object {
        var mCandidateCount: Int = 0
    }
}
