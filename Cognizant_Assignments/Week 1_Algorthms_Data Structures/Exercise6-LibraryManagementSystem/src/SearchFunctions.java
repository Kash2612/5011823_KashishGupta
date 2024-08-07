public class SearchFunctions {
    Book[] arr;
    int noOfBooks;

    public SearchFunctions(int size){
        arr=new Book[size];
        noOfBooks=0;
    }

    public void add(Book book){
        if(noOfBooks<arr.length){
            arr[noOfBooks++]=book;
        }
        else {
            System.out.println("NO Storage");
        }
    }

    public Book LinearSearch(Book[] books, String title){
        for(int i=0;i<noOfBooks;i++){
            if(arr[i].getTitle().equals(title)){
                return arr[i];
            }
        }
        return null;
    }

    public Book binarySearch(Book[] books, String title){
        int low=0;
        int high=noOfBooks-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            int match=books[mid].getTitle().compareToIgnoreCase(title);
            if(match==0){
                return books[mid];
            }else if(match<0){
                low=mid+1;
            }else high=mid-1;
        }
        return null;
    }
}
