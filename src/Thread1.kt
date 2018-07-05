class Thread1:Thread(){
    override fun run():Unit{
      for(i in 0 until 5){
          println("Thread 1")
          Thread.sleep(500)
      }
    }
}