public class Matrix {
    double[][] numbers;
    int r,c;
    public void addition(double[][] matrix){
        for (int i = 0; i < r; i++){
            for (int j = 0; j < c; j++){
                this.numbers[i][j] += matrix[i][j];
            }
        }
    }
    public void multiplication(int n){
        for (int i = 0; i < r; i++){
            for (int j = 0; j < c; j++){
                this.numbers[i][j] *= n;
            }
        }
    }
    public void printout(){
        for (int i = 0; i < r; i++){
            for (int j = 0; j < c; j++){
                System.out.println(this.numbers[i][j] + " ");
            }
            System.out.println('\n');
        }
    }
    public double[][] multiplication(double matrix[][]){
        double[][] result = this.numbers;
        for (int i = 0; i < r; i++){
            for (int j = 0; j < c; j++){
                result[i][j] *= matrix[j][i];
            }
        }
        return result;
    }
}
