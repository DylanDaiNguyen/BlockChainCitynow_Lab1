package transaction.wallet.core.web.command;

public class AbstractCommand<T> {
    protected T pojo;
    private String urlType;
    public T getPojo() {
        return pojo;
    }

    public void setPojo(T pojo) {
        this.pojo = pojo;
    }

    public String getUrlType() {
        return urlType;
    }

    public void setUrlType(String urlType) {
        this.urlType = urlType;
    }
}
