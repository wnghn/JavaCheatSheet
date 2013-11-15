import java.util.*;

/**
 * Data Structure Cheat Sheet
 * User: Han Wang
 * Date: 11/15/13
 * Time: 11:22 AM
 */
public class DataStructure {

    public void DataStructureCheatSheet(String[] args) {
        /**
         * Character
         */
        char ch = 'a';
        Character.isDigit(ch);
        Character.isLetter(ch);
        /**
         * String
         */
        String ss = "abcde";
        ss.charAt(0);
        ss.compareTo("ab");
        ss.indexOf("bc", 1);
        ss.endsWith("de");
        ss.contains("d");
        ss.replace('a', 'e');
        ss.toCharArray();
        ss.toLowerCase();
        ss.toUpperCase();
        ss.startsWith("ab");
        ss.substring(1, 3);
        ss.trim();

        /**
         * Array
         */
        String [] arr1 = {"a","b","c"};
        Arrays.sort(arr1);
        Arrays.binarySearch(arr1, "b");
        Arrays.fill(arr1, 0);
        Arrays.copyOfRange(arr1, 0, 1);
        String [] arr2 = {"c","d"};
        Arrays.equals(arr1, arr2)  ;
        //public static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
        System.arraycopy(arr1, 0, arr2, 0, 2);
        String inStr = Arrays.toString(arr1);
        List<String> list = Arrays.asList(arr1);

        /**
         *  Collection<E>
         *  subinterfaces: Set<E>, List<E>, Queue<E>, Deque<E> ,...
         */

        /**
         *  Set<E> contains only methods from Collection.
         *  Implementation: HashSet (, TreeSet, LinkedHashSet)
         */
        Collection<String> intset = new HashSet<String>();
        boolean added = intset.add("a");
        boolean belongTo = intset.contains("a");
        boolean removed = intset.remove("a");
        boolean isEmpty = intset.isEmpty();
        intset.clear();
        int size = intset.size();
        //Bulk Operations
        intset.addAll(list);
        boolean superset = intset.containsAll( list );
        intset.removeAll( list );
        intset.retainAll( list ); //modify to intersection
        //iterator and conver to Array
        Iterator<String> itr = intset.iterator();
        while( itr.hasNext() ){
            String curStr = itr.next();
        }
        String[] arr = intset.toArray(new String[0]);
        /**
         * List<E>
         * Implementations: ArrayList (, LinkedList)
         */
        //Positional access
        list.add(2, "d");
        list.get(1); //index
        list.set(2, "e");
        list.remove(2);//index
        //Search
        list.indexOf("e");
        list.lastIndexOf("a");
        //range
        List subList = list.subList(0,2);
        //Collection Algorithms
        Collections.sort(list);  //can customize a comparator
        Collections.shuffle(list);//can provide a rand
        int index = Collections.binarySearch( list, "e");
        int count = Collections.frequency(list, "a");
        //Routine Data Manipulation
        Collections.reverse(list);
        Collections.fill(list, "hello");
        List destination = new LinkedList<String>();
        Collections.copy(list, destination);
        boolean disjoint = Collections.disjoint(list,destination);
        Collections.swap(list, 0, 2 );

        /**
         * Map<E>
         * Implementations: HashMap (, TreeMap, LinkedHashMap)
         */
        HashMap<String,Integer> countmap = new HashMap<String, Integer>();
        countmap.put( "hello", 1);
        count = countmap.containsKey("hello")? countmap.get("hello"):0;
        boolean nonduplicate = countmap.containsValue(1);
        countmap.put("hello", 2);//override
        countmap.remove("hello");
        HashMap<String,Integer> newmap = new HashMap<String, Integer>();
        newmap.putAll(countmap);
        //Collection Views
        Set<String> allWords = countmap.keySet();
        Collection<Integer> allCounts = countmap.values();
        Set<Map.Entry<String,Integer>> entries = countmap.entrySet();
        //Multi Map
        Map<String, List<String>> m = new HashMap<String, List<String>>();

        /**
         * Queue<E>
         * Implementations: LinkedList (,ArrayDeque)
         */
        Queue<Integer> que = new LinkedList<Integer>();
        //insert
        boolean addValue = que.offer(1); //false if full
        addValue = que.add(1); //exception if full
        //examine
        int a = que.peek();  //null if empty
        a = que.element(); // exception if empty
        //remove
        a =que.poll();   //null if empty
        a = que.remove();//exception if empty
        /**
         * Heap
         */
        PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();
        minHeap.add(1);
        a = minHeap.peek();
        a = minHeap.remove();

        /**
         * Dequeue, Stack
         * Implementations: ArrayDequeue (,LinkedList)
         */
        Deque<Integer> stack = new ArrayDeque<Integer>();
        //Insert: offerFirst, offerLast, addFirst, addLast
        //Remove: pollFirst, pollLast, removeFirst, removeLast
        //Examine: peekFirst, peekLast,  getFirst, getLast
        stack.offerLast(1);
        a = stack.peekLast();
        a = stack.pollLast();
    }
}
