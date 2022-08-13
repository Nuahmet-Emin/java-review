public class ArraySorting {
    public static void main(String[] args) {

        ArraySorting as = new ArraySorting();
       // as.sort();

        QuickSort qs = new QuickSort();
        BubbleSort bs = new BubbleSort();
        as.sort(qs);
        as.sort(bs);

     /*   MyLambda myLambda = () -> System.out.println("Sorting the array");
        Sorting myLambda2 = () -> System.out.println("Sorting the array");*/
        Sorting noLambda = new QuickSort();
        noLambda.sort();

        Sorting quickSort = () -> System.out.println("Quick Sorting");
        as.sort(quickSort);

        Sorting bubbleSort = () -> System.out.println("Bubble Sorting");
        as.sort(bubbleSort);

    }
    private void sort(Sorting sorting){
        sorting.sort();
    }

}


/*interface MyLambda{
    void print();
}*/
