// Last updated: 7/16/2026, 9:14:52 AM
class MyHashSet {

    private boolean[] storage;

    public MyHashSet() {
        storage = new boolean[1_000_001]; }

    public void add(int key) {
        storage[key] = true; 
        }

    public void remove(int key) {
        storage[key] = false;
    }

    public boolean contains(int key) {
        return storage[key]; 
    }
}