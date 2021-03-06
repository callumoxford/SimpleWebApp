package com.develogical.app;

public class QueryProcessor {
    public String process(String query) {
        if (query.toLowerCase().contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        }
        else if(query.toLowerCase().contains("nietzsche")){
            return "Nietzsche was a German philosopher, cultural critic, composer, poet, philologist, and scholar of Latin and Greek whose work has exerted a profound influence on modern intellectual history";
        }
        else if(query.toLowerCase().contains("murakami")){
            return "Haruki Murakami is a Japanese writer. His books and stories have been bestsellers in Japan as well as internationally, with his work being translated into 50 languages and selling millions of copies outside his native country.";
        }
        else if(query.toLowerCase().contains("Harrison")){
            return "Josh Harrison. Legend.";
        }
        return "";
    }
}
