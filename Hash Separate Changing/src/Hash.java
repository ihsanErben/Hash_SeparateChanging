
public class Hash {

    Node[] hashTable;
    int size;

    public Hash(int size) {
        this.size = size;
        hashTable = new Node[size];
    }

    public void add(int data) {
        Node newNode = new Node(data);
        int index = (data % size);
        if (hashTable[index] == null) {
            hashTable[index] = newNode;
        }else{
            Node tmp = hashTable[index];
            while(tmp.next != null) {
                tmp = tmp.next;
            }
            tmp.next = newNode;
        }
    }
    
    public void printALL(){
        int go = 0;
        while(go != size){
            if(hashTable[go] == null){
                System.out.print("index " + go + "--> ");
                go++;
            }else{
                Node tmp = hashTable[go];
                System.out.print("index " + go + "-->");
                while(tmp != null){
                    System.out.print(tmp.data + ", ");
                    tmp = tmp.next;
                }
                go++;
            }
            System.out.println("");
        }
    }
}
