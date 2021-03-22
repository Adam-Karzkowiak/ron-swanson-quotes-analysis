import service.Analyzer;
import service.QuotesProvider;

class Run {

    public static void main(String[] args) throws Exception {
        QuotesProvider quotesProvider=new QuotesProvider();
        Analyzer analyzer = new Analyzer();
        String solution = quotesProvider.connectAndGetAmazingQuote();
        System.out.println(solution);
        analyzer.analyse(solution);
    }
}
