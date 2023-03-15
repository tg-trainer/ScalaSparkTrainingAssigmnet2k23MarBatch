package RitikKuril

object LastElementList {
    def Last(list:List[Int]):Int={

        if(list.isEmpty==true)
            {
                return -1;
            }
        else if(list.length==1)
            return list.head;
        else
            Last(list.tail);
    }
}
