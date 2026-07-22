class MyHashSet {
 private ArrayList<Integer> data; 
    public MyHashSet() {
        this.data = new ArrayList<>();
    }

     void add(int key){
        if (!this.data.contains(key)) this.data.add(key);
     }

     boolean contains(int key){
        if (this.data.contains(key)) return true;
        return false;
     }

     void remove(int key){
         if (this.data.contains(key)) {
            int indexRemove = this.data.indexOf(key);
            this.data.remove(indexRemove);
     }
}
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */