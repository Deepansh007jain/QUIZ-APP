package com.example.quizapp

object setData {

    const val name:String="name"
    const val score:String="score"

   fun getQuestion():ArrayList<QuestionData>{
       var que:ArrayList<QuestionData> = arrayListOf()

       var question1 = QuestionData(
           1,
           "Which of the following is the correct way of declaring an array ?",

           "int javatpoint[10];",
           "int javatpoint;",
           "javatpoint{20};",
           "array javatpoint[10];",
           1
       )
       var question2 = QuestionData(
           2,
           "Which of the following principle does Queue use?",

           "LIFO principle",
           "FIFO principle",
           "Linear tree",
           "None of the above",
           2
       )
       var question3 = QuestionData(
           3,
           "Which of the following highly uses the concept of an array?",

           "Binary search tree",
           "Caching",
           "Spatial locality",
           "Scheduling of Processes",
           3
       )
       var question4 = QuestionData(
           4,
           " Which one of the following is the size of int arr[9] assuming that int is of 4 bytes?",

           "8",
           "78",
           "36",
           "10",
           3
       )

       var question5 = QuestionData(
           5,
           " Which one of the following is the process of inserting an element in the stack?",

           "Insert",
           "Add",
           "Push",
           "None of the above",
           3
       )

       que.add(question1)
       que.add(question2)
       que.add(question3)
       que.add(question4)
       que.add(question5)
       return que
   }
}