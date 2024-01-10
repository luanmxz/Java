package Keywords;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReservedKeywords {

    public static void main(String... args) {

        System.out.println("These keywords below are reserved in Java: \n");

        String reservedKeyword = "Abstract, assert, boolean, break, byte, case, catch, char, class, const, continue, default, do, double"
                +
                " else, enum, extends, final, finally, float, for, if, goto, implements, import, instanceof, int, interface, long, native,"
                +
                " new, package, private, protected, public, return, short, static, strictfp, super, switch, synchronized, this, throw, throws,"
                +
                " transient, try, void, volatile, while";

        String contextualKeywords = "exports, module, non-sealed, open, opens, permits, provides, record, requires, sealed, to, transitive,"
                +
                " uses, var, with, yield";

        List<String> reservedKeywordList = addKeywordsToList(reservedKeyword);
        List<String> contextualKeywordsList = addKeywordsToList(contextualKeywords);

        Map<String, List<String>> reservedKeywordsMap = createKeywordsMap(reservedKeywordList, contextualKeywordsList);

        System.out.println("Reserved Keywords Java: " + reservedKeywordsMap.get("Reserved Keywords Java"));
        System.out.println("\n------------------------------------------\n");
        System.out.println("Contextual Keywords Java: " + reservedKeywordsMap.get("Contextual Keywords Java"));
    }

    private static List<String> addKeywordsToList(String keywords) {
        List<String> keywordList = new ArrayList<>();
        for (String keyword : keywords.replaceAll("\\s", "").split(",")) {
            keywordList.add(keyword);
        }
        return keywordList;
    }

    private static Map<String, List<String>> createKeywordsMap(List<String> reservedKeywords,
            List<String> contextualKeywords) {
        Map<String, List<String>> keywordsMap = new HashMap<>();
        keywordsMap.put("Reserved Keywords Java", reservedKeywords);
        keywordsMap.put("Contextual Keywords Java", contextualKeywords);
        return keywordsMap;
    }
}
