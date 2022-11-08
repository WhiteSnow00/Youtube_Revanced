import java.util.Iterator;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajha implements vdt
{
    public static final vdu a;
    private final vdo b;
    private final ajhb c;
    
    static {
        a = new ajgz();
    }
    
    public ajha(final ajhb c, final vdo b) {
        this.c = c;
        this.b = b;
    }
    
    public final afdu b() {
        final afds afds = new afds();
        final ajhb c = this.c;
        if ((c.c & 0x40) != 0x0) {
            afds.h(c.j);
        }
        afds.j((Iterable)this.getThumbnailModel().a());
        final afif d = ((afcr)this.getBadgeInfoModels()).D();
        while (((Iterator)d).hasNext()) {
            final ahyc ahyc = (ahyc)((Iterator)d).next();
            afds.j((Iterable)ahyc.a());
        }
        return afds.g();
    }
    
    public final byte[] d() {
        return ((agxl)this.c).toByteArray();
    }
    
    public final String e() {
        return this.c.d;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof ajha && ((agzi)this.c).equals(((ajha)o).c);
    }
    
    public List getBadgeInfo() {
        return (List)this.c.r;
    }
    
    public List getBadgeInfoModels() {
        final afcm afcm = new afcm();
        final Iterator<Object> iterator = ((List<Object>)this.c.r).iterator();
        while (iterator.hasNext()) {
            afcm.h(ahyc.b((ahyd)iterator.next()).n());
        }
        return (List)afcm.g();
    }
    
    public String getChannelOwner() {
        return this.c.g;
    }
    
    public Boolean getIsAndroid() {
        return this.c.m;
    }
    
    public Boolean getIsLargeFormFactor() {
        return this.c.n;
    }
    
    public Integer getPlaybackPositionSeconds() {
        return this.c.k;
    }
    
    public String getPublishedTimeText() {
        return this.c.q;
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
        return ajha.a;
    }
    
    public Integer getUiType() {
        return this.c.o;
    }
    
    public String getVideoId() {
        return this.c.l;
    }
    
    public String getVideoLengthAccessibilityText() {
        return this.c.i;
    }
    
    public Integer getVideoLengthSeconds() {
        return this.c.h;
    }
    
    public String getViewCountText() {
        return this.c.p;
    }
    
    @Override
    public final int hashCode() {
        return ((agzi)this.c).hashCode() ^ 0xF6181;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.c);
        final StringBuilder sb = new StringBuilder("DownloadsPageVideoEntityModel{");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
