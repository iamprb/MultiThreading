fun main(args:Array<String>){

    //With Runnable
    val runnableThread1= RunnableThread1()
    val runnableThread2 = RunnableThread2()

    val t1 =Thread(runnableThread1)
    val t2 = Thread(runnableThread2)
    t1.start()
    Thread.sleep(10)
    t2.start()

   // Lambda expression
    val lambda1=Thread{
        for(i in 0 until 4){
        println("Lambda 1")
        Thread.sleep(400)
        }
    }

    val lambda2= Thread{
        for(i in 0 until 4){
            println("Lambda 2")
            Thread.sleep(400)
        }
    }

    lambda1.start()
    lambda2.start()

    lambda1.join()
    lambda2.join()

    println("Threads Sleeping")

}