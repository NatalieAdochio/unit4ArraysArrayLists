import java.util.ArrayList;

public class ArrayListRunner
{

    public static void main(String[] args)
    {
        // initialise instance variables
        ArrayList<String> names = new ArrayList<String>();
        System.out.println(names);
        names.add("Alice");
        names.add("Bob");
        names.add("Connie");
        names.add("David");
        names.add("Edward");
        names.add("Fran");
        names.add("Gomez");
        names.add("Harry");
        System.out.println(names);
        System.out.println(names.get(0));
        System.out.println(names.get(names.size()-1));
        System.out.println(names.size());
        int indexOfLast= names.size()-1;
        System.out.println(names.get(indexOfLast));
        for (int i = names.size()-1; i >= 0; i--)
        {
            String name = names.get(i);
            if(names.equals("Alice"))
            {
                String change = "Alice B. Toklas";
                names.set(i, change); 
            }
        }
        System.out.println(names);
        names.add(4,"Doug");
        System.out.println(names);
        for( String i: names)
        {
            System.out.println(i);
        }

        ArrayList<String> names2 = new ArrayList<String>();
        for (int i = 0;i < names.size() - 1; i++)
        {
            names2.add(i, names.get(i));
        }
        
        names.remove(0);
        System.out.println(names);
        System.out.println(names2);

    }
    }
