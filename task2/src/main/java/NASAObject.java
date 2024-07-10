public class NASAObject {
    public String copyright, date, explanation, hdurl, media_type, service_version, title, url;

    public NASAObject() {

    }

    public NASAObject(String copyright, String date, String explanation, String hdurl, String media_type, String service_version,
                      String title, String url) {
        this.copyright = copyright;
        this.date = date;
        this.explanation = explanation;
        this.hdurl = hdurl;
        this.media_type = media_type;
        this.service_version = service_version;
        this.title = title;
        this.url = url;
    }

    public String getUrl() {
        return url;
    }
}
