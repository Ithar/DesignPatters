package memento.client;

import memento.domain.Article;
import memento.domain.ArticleMemento;

public class Client {

    public static void main(String[] args) {

        Article article = new Article(1, "Design patterns");
        article.setContent("Design patterns are great to learn for any language.");
        ArticleMemento savedArticle = article.save();
        System.out.println("State #1:  " + article.toString());

        article.setContent("Design patterns are overrated.");

        System.out.println("State #2:  " + article.toString());

        article.restore(savedArticle);

        System.out.println("State #3:  " + article.toString());
    }
}
