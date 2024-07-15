package org.practiceDSA.Collection.list.Vector.Stack;

public class DynamicStack extends CustomStack{

    public DynamicStack() {
        super();            //it will call CustomStack
    }

    public DynamicStack(int size){
        super(size);
    }

    @Override
    public boolean push(int item) {
        //this take care of full
        if (this.isFull()){
            //double the array size
            int[] temp = new int[data.length * 2];

            //copying all the previous data in new array
            System.arraycopy(data, 0, temp, 0, data.length);
            data = temp;
        }
        //at this point we know that array is not full
        //insert items
        return super.push(item);
    }
}
