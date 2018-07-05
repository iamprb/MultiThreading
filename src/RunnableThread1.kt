class RunnableThread1:Runnable{
    override fun run() {
        for(i in 0 until 4){
            println("Runnable thread")
            Thread.sleep(500)
        }
    }
}