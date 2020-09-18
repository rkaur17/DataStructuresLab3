import java.util.ArrayList;

public class SortColumns {
    private ArrayList<Integer> indices = new ArrayList<Integer>();
    private boolean ordered = true; // check if strings are in sorted order
    public SortColumns() {}

    ArrayList<Integer> minDeletionSize(String [] A) {
        for(int i=0; i<A.length - 1; i++) { //checks and returns which indices are not in oder
            if(A[i].length() != A[i+1].length()) {
                indices.add(-1); //if there are any errors, -1 is returned
                return indices;
            }
        }

        for(int l=0; l<A[0].length(); l++) { //
            for(int w=0; w<A.length - 1; w++) {
                indices.add(l); //add indices index if it is in sorted order
                ordered = false;
                break;
            }
        }
        if (ordered) {
            return new ArrayList<Integer>(); // if indices are in order, this returns an empty set
        }
        return indices;

    }
    public static void main(String[] args) {
        String[] A = {"cba", "daf", "ghi"};
        SortColumns test = new SortColumns(); //test random strings
        System.out.println(test.minDeletionSize(A));
    }
}

