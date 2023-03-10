public class Main {
    public static void main(String[] args) {
        /**
         * Encuentra la primera aparición de x en un array ordenado a.
         * @param x int valor a encontrar
         * @param a array de enteros donde se busca x
         * @return lowest i such that a[i]==x, or -1 if x not found in a.
         */
        public int Find (int x, int[] a) {
            for (int i = 0; i < a.length; i++) {
                if (x == a[i]) {
                    return i;
                }
            }
            return -1;
        }
    }
}