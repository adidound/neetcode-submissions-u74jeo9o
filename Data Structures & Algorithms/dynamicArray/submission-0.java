class DynamicArray {
    private int[] data;
    private int size;
    private int capacity;
    public DynamicArray(int capacity) {
        if (capacity<=0) capacity = 1;
        this.capacity = capacity;
        this.data = new int[capacity];
        this.size =0;  
    }

    public int get(int i) {
        return data[i];
    }

    public void set(int i, int n) {
        data[i] = n;
    }

    public void pushback(int n) {
        if (size==capacity) {
            resize();
        }
        data[size++] = n;
    }

    public int popback() {
        int val = data[--size];
        return val;
    }

    private void resize() {
        capacity *= 2;
        int[] newData = new int[capacity];
        System.arraycopy(data,0,newData,0,size);
        data = newData;
    }

    public int getSize() {
        return size;
    }

    public int getCapacity() {
        return capacity;
    }
}
