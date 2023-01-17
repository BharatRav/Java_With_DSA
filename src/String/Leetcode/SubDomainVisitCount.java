package String.Leetcode;
//Leetcode Link:-https://leetcode.com/problems/subdomain-visit-count/description/
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SubDomainVisitCount {
    public List<String> subdomainVisits(String[] cpdomains) {
        List<String> result= new ArrayList<>();
        Map<String,Integer> hm = new HashMap<>();
        StringBuilder sb = new StringBuilder();

        for (int i=0;i<cpdomains.length;i++) {
            String str = cpdomains[i];
            int indexSpace= str.indexOf(' ');
            int numClick = Integer.parseInt(str.substring(0,indexSpace));
            String domain= str.substring(indexSpace+1);

            sb.setLength(0);
            sb.append(domain);

            while(true) {
                hm.put(sb.toString(),hm.getOrDefault(sb.toString(),0)+numClick);
                int dotPosition = sb.indexOf(".");
                if(dotPosition==-1) {
                    break;
                }
                sb.delete(0,dotPosition+1);
            }
        }

        for(String domain: hm.keySet()) {
            result.add(hm.get(domain)+" "+domain);
        }
        return result;
    }

}
