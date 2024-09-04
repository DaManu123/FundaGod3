public class ordenamiento {
    public static class OrdenamientoIndirecto {
        public void mergeSortAscendente(int[] a, int init, int n){
            int n1;
            int n2;
            if (n>1){
                n1 = n/2;
                n2 = n-n1;
                mergeSortAscendente(a, init, n1);
                mergeSortAscendente(a, init+n1, n2);
                mergeAscendente(a, init, n1, n2);
            }
        }
        private void mergeAscendente(int[] a, int init, int n1, int n2){
            int[] buffer = new int[n1+n2];
            int temp = 0;
            int temp1 = 0;
            int temp2 = 0;
            int i;
            while((temp1<n1) && (temp2<n2))
            {
                if(a[init+temp1] < a[init+n1+temp2]){
                    buffer[temp++] = a[init + (temp1++)];
                }
                else{
                    buffer[temp++] = a[init + n1 + (temp2++)];
                }
            }
            while(temp1<n1){
                buffer[temp++] = a[init + (temp1++)];
            }
            while(temp2<n2){
                buffer[temp++] = a[init + n1 + (temp2++)];
            }
            for(i=0; i<n1+n2; i++){
                a[init + i] = buffer[i];
            }
        }
        public void mergeSortDescendente(int[] a, int init, int n){
            int n1;
            int n2;
            if (n>1){
                n1 = n/2;
                n2 = n-n1;
                mergeSortDescendente(a, init, n1);
                mergeSortDescendente(a, init+n1, n2);
                mergeDescendente(a, init, n1, n2);
            }
        }
        private void mergeDescendente(int[] a, int init, int n1, int n2){
            int[] buffer = new int[n1+n2];
            int temp = 0;
            int temp1 = 0;
            int temp2 = 0;
            int i;
            while((temp1<n1) && (temp2<n2))
            {
                if(a[init+temp1] < a[init+n1+temp2]){    //<
                    //buffer[temp++] = a[init + (temp1++)];
                    buffer[temp++] = a[init + n1 + (temp2++)];
                }
                else{
                    buffer[temp++] = a[init + (temp1++)];
                    //buffer[temp++] = a[init + n1 + (temp2++)];
                }
            }
            while(temp1<n1){
                buffer[temp++] = a[init + (temp1++)];
            }
            while(temp2<n2){
                buffer[temp++] = a[init + n1 + (temp2++)];
            }
            for(i=0; i<n1+n2; i++){
                a[init + i] = buffer[i];
            }
        }
    }
    public static class OrdenamientoDirecto {
        public int[] burbujaAscendente(int matriz[])
        {
            int buffer;
            int i,j;
            for(i = 0; i < matriz.length; i++)
            {
                for(j = 0; j < i; j++)
                {
                    if(matriz[i] < matriz[j])
                    {
                        buffer = matriz[j];
                        matriz[j] = matriz[i];
                        matriz[i] = buffer;
                    }
                }
            }
            return matriz;
        }
        public int[] burbujaDescendente(int matriz[])
        {
            int buffer;
            int i,j;
            for(i = 0; i < matriz.length; i++)
            {
                for(j = 0; j < i; j++)
                {
                    if(matriz[i] > matriz[j])
                    {
                        buffer = matriz[j];
                        matriz[j] = matriz[i];
                        matriz[i] = buffer;
                    }
                }
            }
            return matriz;
        }
    }
}
