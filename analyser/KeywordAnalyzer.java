package analyser;

abstract class KeywordAnalyzer implements TextAnalyzer {

    protected abstract String[] getKeywords();

    protected abstract Label getLabel();

    public Label processText(String text) {
        String[] keywords = getKeywords();

        for (String word : keywords) {
            if (text.lastIndexOf(word) != -1) {
                return getLabel();
            }
        }

        return Label.OK;
    }
}
