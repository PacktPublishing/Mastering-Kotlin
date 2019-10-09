package javaexamples;

public class SearchRequest {

    private String queryTerm;
    private String[] categories;
    private int resultCount;

    private SearchRequest() { }

    private SearchRequest(String queryTerm, String[] categories, int resultCount) {
        this.queryTerm = queryTerm;
        this.categories = categories;
        this.resultCount = resultCount;
    }

    public String getQueryTerm() {
        return queryTerm;
    }

    public String[] getCategories() {
        return categories;
    }

    public int getResultCount() {
        return resultCount;
    }

    public static class Builder {

        private String queryTerm;
        private String[] categories;
        private int resultCount;

        public Builder queryTerm(String queryTerm) {
            this.queryTerm = queryTerm;
            return this;
        }

        public Builder categories(String[] categories) {
            this.categories = categories;
            return this;
        }

        public Builder resultCount(int resultCount) {
            this.resultCount = resultCount;
            return this;
        }

        public SearchRequest build() {
            return new SearchRequest(queryTerm, categories, resultCount);
        }
    }
}

