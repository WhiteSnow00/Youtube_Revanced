import java.util.Iterator;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajgd implements vdt
{
    public static final vdu a;
    private final vdo b;
    private final ajge c;
    
    static {
        a = new ajgc();
    }
    
    public ajgd(final ajge c, final vdo b) {
        this.c = c;
        this.b = b;
    }
    
    public final afdu b() {
        final afds afds = new afds();
        final ajge c = this.c;
        if ((c.c & 0x40) != 0x0) {
            afds.h(c.j);
        }
        afds.j((Iterable)this.getThumbnailModel().a());
        final afif d = ((afcr)this.getRecommendedDownloadFormatsModels()).D();
        while (((Iterator)d).hasNext()) {
            final ajdp ajdp = (ajdp)((Iterator)d).next();
            afds.j((Iterable)ajdp.a());
        }
        return afds.g();
    }
    
    public final byte[] d() {
        return this.c.toByteArray();
    }
    
    public final String e() {
        return this.c.d;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof ajgd && this.c.equals(((ajgd)o).c);
    }
    
    public String getChannelOwner() {
        return this.c.g;
    }
    
    public List getRecommendedDownloadFormats() {
        return (List)this.c.m;
    }
    
    public List getRecommendedDownloadFormatsModels() {
        final afcm afcm = new afcm();
        final Iterator<Object> iterator = ((List<Object>)this.c.m).iterator();
        while (iterator.hasNext()) {
            afcm.h(ajdp.b(iterator.next()).x());
        }
        return (List)afcm.g();
    }
    
    public agyc getScoringTrackingParams() {
        return this.c.n;
    }
    
    public aorm getThumbnail() {
        aorm aorm;
        if ((aorm = this.c.e) == null) {
            aorm = aorm.a;
        }
        return aorm;
    }
    
    public aoro getThumbnailModel() {
        aorm aorm;
        if ((aorm = this.c.e) == null) {
            aorm = aorm.a;
        }
        return aoro.b(aorm).J(this.b);
    }
    
    public String getTitle() {
        return this.c.f;
    }
    
    public vdu getType() {
        return ajgd.a;
    }
    
    public String getVideoId() {
        return this.c.k;
    }
    
    public String getVideoLengthAccessibilityText() {
        return this.c.i;
    }
    
    public Integer getVideoLengthSeconds() {
        return this.c.h;
    }
    
    public String getViewCountText() {
        return this.c.l;
    }
    
    @Override
    public final int hashCode() {
        return this.c.hashCode() ^ 0xF6181;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.c);
        final StringBuilder sb = new StringBuilder("DownloadsPageRecommendedVideoEntityModel{");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
