import java.util.HashMap;

public class RecursionManager {
    public RecursionManager() {
    }

    public boolean isLinealDescendant(String des, String ans, HashMap<String, String[]> dic) {
        boolean answer = false;
        int i = 0;
        if (!dic.containsKey(des) && !dic.containsKey(ans)) {
            return answer;
        } else if (dic.containsKey(des) && dic.get(des).length > 0) {
            String[] parents = dic.get(des);
            for (String parent : parents) {
                if (parent.equals(ans)) {
                    return true;
                }
            }
            for (String parent : parents) {
                answer = isLinealDescendant(parent, ans, dic);
                if (answer == true) {
                    break;
                }
            }
        }
        return answer;
    }

    public void mayBeIternal(int start, int stop) {
        System.out.println(start);
        if (start == stop + 1) {
            return;
        }
        mayBeIternaCycle(++start, stop);
    }

    public void mayBeIternaCycle(int start, int stop) {
        while (start != stop + 1) {
            System.out.println(start);
            start++;
        }
    }
}
