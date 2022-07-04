package com.example.learnkotlin.npe

import com.example.myapplication.oop.intf.Study

fun main() {
    doStudy(null)

//    Null can not be a value of a non-null type Study
//    doStudyNotNull(null)
}

fun doStudy(study: Study?) {
    if (study != null) {
        study.readBooks()
        study.doHomework()
    }
}

fun doStudyImplicitCheckNull(study: Study?) {
    study?.readBooks()
    study?.doHomework()
}

fun doStudyNotNull(study: Study) {
    study.readBooks()
    study.doHomework()
}