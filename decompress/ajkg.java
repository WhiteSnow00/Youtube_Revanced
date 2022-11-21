import java.util.Iterator;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajkg implements vhc
{
    public static final vhd a;
    private final vgx b;
    private final ajkh c;
    
    static {
        a = new ajkf();
    }
    
    public ajkg(final ajkh c, final vgx b) {
        this.c = c;
        this.b = b;
    }
    
    public final /* bridge */ vgs a() {
        return new ajke(this.c.toBuilder());
    }
    
    public final afhk b() {
        final afhi afhi = new afhi();
        final ajkh c = this.c;
        if ((c.c & 0x40) != 0x0) {
            afhi.h(c.j);
        }
        afhi.j(this.getThumbnailModel().a());
        final aflv d = ((afgh)this.getRecommendedDownloadFormatsModels()).D();
        while (((Iterator)d).hasNext()) {
            final ajhs ajhs = (ajhs)((Iterator)d).next();
            afhi.j(ajhs.a());
        }
        return afhi.g();
    }
    
    public final byte[] d() {
        return this.c.toByteArray();
    }
    
    public final String e() {
        return this.c.d;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof ajkg && this.c.equals(((ajkg)o).c);
    }
    
    public String getChannelOwner() {
        return this.c.g;
    }
    
    public List getRecommendedDownloadFormats() {
        return (List)this.c.m;
    }
    
    public List getRecommendedDownloadFormatsModels() {
        final afgc afgc = new afgc();
        final Iterator<Object> iterator = ((List<Object>)this.c.m).iterator();
        while (iterator.hasNext()) {
            afgc.h(ajhs.b(iterator.next()).E());
        }
        return afgc.g();
    }
    
    public ahbt getScoringTrackingParams() {
        return this.c.n;
    }
    
    public aowb getThumbnail() {
        aowb aowb;
        if ((aowb = this.c.e) == null) {
            aowb = aowb.a;
        }
        return aowb;
    }
    
    public aowd getThumbnailModel() {
        aowb aowb;
        if ((aowb = this.c.e) == null) {
            aowb = aowb.a;
        }
        return aowd.b(aowb).p(this.b);
    }
    
    public String getTitle() {
        return this.c.f;
    }
    
    public /* bridge */ vgu getType() {
        return (vgu)this.getType();
    }
    
    public vhd getType() {
        return ajkg.a;
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
