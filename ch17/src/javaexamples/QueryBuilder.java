package javaexamples;

class QueryBuilder {
    public static void main(String[] args) {
        SearchRequest.Builder builder = new SearchRequest.Builder();
        SearchRequest request = builder
                .queryTerm("Kotlin")
                .resultCount(5)
                .build();
    }
}
