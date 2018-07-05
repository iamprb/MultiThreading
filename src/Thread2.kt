class Thread2:Thread(){
    override fun run() {
        for (i in 0 until 5)
        {
            println("Thread2")
            Thread.sleep(500)
        }
    }
}
