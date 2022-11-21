import java.util.Iterator;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajld implements vhc
{
    public static final vhd a;
    private final vgx b;
    private final ajle c;
    
    static {
        a = new ajlc();
    }
    
    public ajld(final ajle c, final vgx b) {
        this.c = c;
        this.b = b;
    }
    
    public final /* bridge */ vgs a() {
        return new ajlb(this.c.toBuilder());
    }
    
    public final afhk b() {
        final afhi afhi = new afhi();
        final ajle c = this.c;
        if ((c.c & 0x40) != 0x0) {
            afhi.h(c.j);
        }
        afhi.j(this.getThumbnailModel().a());
        final aflv d = ((afgh)this.getBadgeInfoModels()).D();
        while (((Iterator)d).hasNext()) {
            final aibt aibt = (aibt)((Iterator)d).next();
            afhi.j(aibt.a());
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
        return o instanceof ajld && this.c.equals(((ajld)o).c);
    }
    
    public List getBadgeInfo() {
        return (List)this.c.r;
    }
    
    public List getBadgeInfoModels() {
        final afgc afgc = new afgc();
        final Iterator<Object> iterator = ((List<Object>)this.c.r).iterator();
        while (iterator.hasNext()) {
            afgc.h(aibt.b(iterator.next()).y());
        }
        return afgc.g();
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
        return ajld.a;
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
        return this.c.hashCode() ^ 0xF6181;
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
