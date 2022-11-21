import java.util.Collections;
import java.util.Map;
import java.util.List;
import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqbl implements vhc
{
    public static final vhd a;
    public final vgx b;
    public final aqbn c;
    
    static {
        a = new aqbk();
    }
    
    public aqbl(final aqbn c, final vgx b) {
        this.c = c;
        this.b = b;
    }
    
    public final /* bridge */ vgs a() {
        return new aqbj(this.c.toBuilder());
    }
    
    public final afhk b() {
        final afhi afhi = new afhi();
        final aqbn c = this.c;
        if ((c.c & 0x8) != 0x0) {
            afhi.h(c.f);
        }
        if (this.c.l.size() > 0) {
            afhi.j((Iterable)this.c.l);
        }
        if (this.c.m.size() > 0) {
            afhi.j((Iterable)this.c.m);
        }
        afhi.j(this.getDescriptionModel().a());
        afhi.j(this.getFormattedDescriptionModel().a());
        afhi.j(this.getThumbnailModel().a());
        final Iterator iterator = this.getThumbnailStyleDataMap().values().iterator();
        while (iterator.hasNext()) {
            afhi.j(((anmk)iterator.next()).a());
        }
        return afhi.g();
    }
    
    public final aqax c() {
        final vgv c = this.b.c(this.c.f);
        boolean b = true;
        if (c != null) {
            b = (c instanceof aqax && b);
        }
        adme.U(b, "entityFromStore is not instance of YtMainChannelEntityModel, key=channelOwner");
        return (aqax)c;
    }
    
    public final byte[] d() {
        return this.c.toByteArray();
    }
    
    public final String e() {
        return this.c.d;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof aqbl && this.c.equals(((aqbl)o).c);
    }
    
    public final String f() {
        return this.c.f;
    }
    
    public final List g() {
        return (List)this.c.l;
    }
    
    public aqgs getDescription() {
        aqgs aqgs;
        if ((aqgs = this.c.h) == null) {
            aqgs = aqgs.a;
        }
        return aqgs;
    }
    
    public aqgm getDescriptionModel() {
        aqgs aqgs;
        if ((aqgs = this.c.h) == null) {
            aqgs = aqgs.a;
        }
        return aqgm.b(aqgs).n(this.b);
    }
    
    public ajws getFormattedDescription() {
        ajws ajws;
        if ((ajws = this.c.i) == null) {
            ajws = ajws.a;
        }
        return ajws;
    }
    
    public ajwp getFormattedDescriptionModel() {
        ajws ajws;
        if ((ajws = this.c.i) == null) {
            ajws = ajws.a;
        }
        return ajwp.b(ajws).z(this.b);
    }
    
    public String getPlaylistId() {
        return this.c.e;
    }
    
    public aowb getThumbnail() {
        aowb aowb;
        if ((aowb = this.c.k) == null) {
            aowb = aowb.a;
        }
        return aowb;
    }
    
    public aowd getThumbnailModel() {
        aowb aowb;
        if ((aowb = this.c.k) == null) {
            aowb = aowb.a;
        }
        return aowd.b(aowb).p(this.b);
    }
    
    public Map getThumbnailStyleDataMap() {
        return agpx.K(Collections.unmodifiableMap((Map<?, ?>)this.c.n), (afax)new aemg(this, 16));
    }
    
    public String getTitle() {
        return this.c.g;
    }
    
    public /* bridge */ vgu getType() {
        return (vgu)this.getType();
    }
    
    public vhd getType() {
        return aqbl.a;
    }
    
    public aqbp getVisibility() {
        aqbp aqbp;
        if ((aqbp = aqbp.b(this.c.j)) == null) {
            aqbp = aqbp.a;
        }
        return aqbp;
    }
    
    @Override
    public final int hashCode() {
        return this.c.hashCode() ^ 0xF6181;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.c);
        final StringBuilder sb = new StringBuilder("YtMainPlaylistEntityModel{");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
