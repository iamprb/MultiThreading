    class RunnableThread2:Runnable{
        override fun run() {
            for(i in 0 until 4) {
                println("RunnableThread2")
                Thread.sleep(500)
            }
        }

    }