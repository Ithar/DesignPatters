package memento.domain;

public class Article {

    private int id;
    private String title;
    private String content;

    public Article(int id, String title) {
        this.id = id;
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Article{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }

    public ArticleMemento save() {
        ArticleMemento m = new ArticleMemento(id, title, content);
        return m;
    }

    public void restore(ArticleMemento m) {
        this.id = m.getId();
        this.title = m.getTitle();
        this.content = m.getContent();
    }
}
