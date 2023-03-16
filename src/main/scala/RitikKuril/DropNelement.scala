package RitikKuril

object DropNelement{

  def drop(list:List[Int],n:Int):List[Int]={

  //  list.patch(n-1,Nil,1); (in build method)

   val(x,y)= list.splitAt(n-1);

   val ans=  x++y.tail;
    println(ans);
    ans;




  }


}
