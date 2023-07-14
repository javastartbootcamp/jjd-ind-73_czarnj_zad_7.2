package pl.javastart.task;

public class BubbleSort {

    // ta metoda powinna sortować inputArray oraz zwracać informację o liczbie porównań, które były do tego potrzebne
    public int sort(int[] inputArray) {
        int checkAmount = 0;
        boolean isSequenceChanged;
        int lengthToCheck = inputArray.length;

        do {
            isSequenceChanged = false;
            for (int i = 0; i < lengthToCheck - 1; i++) {
                if (inputArray[i] > inputArray[i + 1]) {
                    int temp = inputArray[i];
                    inputArray[i] = inputArray[i + 1];
                    inputArray[i + 1] = temp;
                    isSequenceChanged = true;
                }
                checkAmount++;
            }
            lengthToCheck--;
        } while (isSequenceChanged && lengthToCheck > 1);
        return checkAmount;
    }
}
