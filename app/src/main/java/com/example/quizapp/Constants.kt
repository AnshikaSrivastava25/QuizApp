package com.example.quizapp

object Constants{

    fun getQuestions(): ArrayList<Question>{
        val questionList = ArrayList<Question>()
        //1
        val  que1 = Question(1,"What country does this flag belong to?",
            R.drawable.ic_flag_of_argentina, "Argentina", "Australia", "Armenia", "Austria",
            1
            )
        questionList.add(que1)
        //2
        val  que2 = Question(1,"What country does this flag belong to?",
            R.drawable.ic_flag_of_australia, "Argentina", "Australia", "Armenia", "Austria",
            2
        )
        questionList.add(que2)

        //3
        val  que3 = Question(1,"What country does this flag belong to?",
            R.drawable.ic_flag_of_belgium, "Argentina", "Denmark", "Brazil", "belguim",
            4
        )
        questionList.add(que3)

        //4
        val  que4 = Question(1,"What country does this flag belong to?",
            R.drawable.ic_flag_of_brazil, "Argentina", "Denmark", "Brazil", "belguim",
            3
        )
        questionList.add(que4)
        //5
        val  que5 = Question(1,"What country does this flag belong to?",
            R.drawable.ic_flag_of_fiji, "Fiji", "Austrailia", "Armenia", "Austria",
            1
        )
        questionList.add(que5)
        //6
        val  que6 = Question(1,"What country does this flag belong to?",
            R.drawable.ic_flag_of_india, "Denmark", "India", "Germany", "Kuwait",
            2
        )
        questionList.add(que6)
        //7
        val  que7 = Question(1,"What country does this flag belong to?",
            R.drawable.ic_flag_of_kuwait, "Denmark", "India", "Germany", "Kuwait",
            4
        )
        questionList.add(que7)
        //8
        val  que8 = Question(1,"What country does this flag belong to?",
            R.drawable.ic_flag_of_germany, "Denmark", "India", "Germany", "Kuwait",
            3
        )
        questionList.add(que8)
        //9
        val  que9 = Question(1,"What country does this flag belong to?",
            R.drawable.ic_flag_of_new_zealand, "New Zealand", "Germany", "India", "Austria",
            1
        )
        questionList.add(que9)
        //10
        val  que10 = Question(1,"What country does this flag belong to?",
            R.drawable.ic_flag_of_germany, "New Zealand", "Germany", "India", "Austria",
            2
        )
        questionList.add(que10)

        return questionList
    }
}