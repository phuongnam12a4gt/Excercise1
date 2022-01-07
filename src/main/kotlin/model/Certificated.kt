package model

class Certificated {
    private var mCertificatedID: String = ""
    private var mCertifcatedName: String = ""
    private var mCertificateRank: String = ""
    private var mCertificatedDate: String = ""

    fun inputCertificated() {
        println(":Input CertificatedID")
        this.mCertificatedID = readLine().toString()
        println("Input CertifcatedName")
        this.mCertifcatedName = readLine().toString()
        println("Input CertificateRank")
        this.mCertificateRank = readLine().toString()
        println("Input CertificatedDate:")
        this.mCertificatedDate = readLine().toString()
    }

    fun showCertificated() {
        println(
            "CertificatedID:${this.mCertificatedID}," +
                    "CertifcatedName:${this.mCertifcatedName}," +
                    "CertificateRank:${this.mCertifcatedName}," +
                    "CertificatedDate:${this.mCertificateRank},"
        )
    }
}
