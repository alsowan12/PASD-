package Jobsheet9_Stack;

public class StackTugasMahasiswa04 {
    Mahasiswa04[] stack;
    int top, size;
    public StackTugasMahasiswa04(int size){
        this.size = size;
        stack = new Mahasiswa04[size];
        top = -1;
    }
    public boolean isFull(){
        if (top == size - 1){
            return true;
        } else {
            return false;
        }
    }
    public boolean isEmpty(){
        if (top == -1){
            return true;
        } else {
            return false;
        }
    }
    public void push(Mahasiswa04 mhs){
        if (!isFull()){
            top++;
            stack[top] = mhs;
        } else {
            System.out.println("Stack Penuh! tidak bisa menambahkan tugas lagi");
        }
    }
    public Mahasiswa04 pop(){
        if (!isEmpty()){
            Mahasiswa04 mhs = stack[top];
            top--;
            return mhs;
        } else {
            System.out.println("Stack Kosong! tidak ada tugas untuk dinilai");
            return null;
        }
    }
    public Mahasiswa04 peek(){
        if (!isEmpty()){
            return stack[top];
        } else {
            System.out.println("Stack Kosong! tidak ada tugas yang dikumpulkan");
            return null;
        }
    }
        public void print (){
            for (int i =0; i <= top; i++){
                System.out.println("Nama: " + stack[i].nama + ", NIM: " + stack[i].nim + ", Kelas: " + stack[i].kelas + ", Nilai: " + stack[i].nilai);
            }
                System.out.println("");
        }
        public String konversiDesimalKebiner(int nilai){
            StackKonversi04 stack = new StackKonversi04(32);
            while (nilai > 0){
                int sisa = nilai % 2;
                stack.push(sisa);
                nilai = nilai / 2;

            }
            String biner = new String();
            while (!stack.isEmpty()){
                biner +=  stack.pop();
            }
            return biner;
        }

}  
