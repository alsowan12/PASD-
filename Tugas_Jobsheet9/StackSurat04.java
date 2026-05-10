package Tugas_Jobsheet9;

public class StackSurat04 {
    int size, top;
    Surat04[] data;

    public StackSurat04(int size) {
        this.size = size;
        this.data = new Surat04[size];
        this.top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public void push(Surat04 s) {
        if (!isFull()) {
            top++;
            data[top] = s;
        } else {
            System.out.println("Stack penuh! Tidak dapat menerima surat lagi.");
        }
    }

    public Surat04 pop() {
        if (!isEmpty()) {
            Surat04 s = data[top];
            top--;
            return s;
        } else {
            System.out.println("Stack kosong!");
            return null;
        }
    }

    public Surat04 peek() {
        if (!isEmpty()) {
            return data[top];
        } else {
            return null;
        }
    }

    public void cariSurat(String nama) {
        boolean ditemukan = false;
        if (isEmpty()) {
            System.out.println("Stack kosong.");
            return;
        }
        for (int i = top; i >= 0; i--) {
            if (data[i].namaMahasiswa.equalsIgnoreCase(nama)) {
                System.out.print("Surat ditemukan: ");
                data[i].tampilData();
                ditemukan = true;
            }
        }
        if (!ditemukan) {
            System.out.println("Surat atas nama " + nama + " tidak ditemukan.");
        }
    }
}