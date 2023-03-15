package RitikKuril

object LastElementList {
    def Last(a:List[Int]):Int={

        if(a.isEmpty==true)
            {
                return -1;
            }
        else if(a.length==1)
            return a.head;
        else
            Last(a.tail);
    }
}
