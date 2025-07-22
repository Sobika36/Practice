class Solution {
    public int numUniqueEmails(String[] emails) {
        HashSet<String> set=new HashSet<>();
        for(String email:emails){
            String []split=email.split("@");
            String local=split[0];
            String domain=split[1];
            if(local.contains("+")){
                local=local.substring(0,local.indexOf("+"));
            }
            local=local.replace(".","");
            String res=local+"@"+domain;
            set.add(res);
        }
        return set.size();
    }
}