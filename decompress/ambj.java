import java.util.Collections;
import java.util.Map;
import java.util.List;
import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ambj implements vhc
{
    public static final vhd a;
    public final vgx b;
    public final ambl c;
    
    static {
        a = new ambi();
    }
    
    public ambj(final ambl c, final vgx b) {
        this.c = c;
        this.b = b;
    }
    
    public final /* bridge */ vgs a() {
        return new ambh(this.c.toBuilder());
    }
    
    public final afhk b() {
        final afhi afhi = new afhi();
        final ambl c = this.c;
        if ((c.c & 0x8) != 0x0) {
            afhi.h(c.f);
        }
        if (this.c.j.size() > 0) {
            afhi.j((Iterable)this.c.j);
        }
        if (this.c.k.size() > 0) {
            afhi.j((Iterable)this.c.k);
        }
        final ambl c2 = this.c;
        if ((c2.c & 0x80) != 0x0) {
            afhi.h(c2.m);
        }
        afhi.j(this.getFormattedDescriptionModel().a());
        final Iterator iterator = this.getThumbnailStyleDataMap().values().iterator();
        while (iterator.hasNext()) {
            afhi.j(((anmk)iterator.next()).a());
        }
        return afhi.g();
    }
    
    public final ambe c() {
        final vgv c = this.b.c(this.c.m);
        boolean b = true;
        if (c != null) {
            b = (c instanceof ambe && b);
        }
        adme.U(b, "entityFromStore is not instance of MainPlaylistDownloadStateEntityModel, key=downloadState");
        return (ambe)c;
    }
    
    public final byte[] d() {
        return this.c.toByteArray();
    }
    
    public final String e() {
        return this.c.d;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof ambj && this.c.equals(((ambj)o).c);
    }
    
    public final List f() {
        return (List)this.c.j;
    }
    
    public ajws getFormattedDescription() {
        ajws ajws;
        if ((ajws = this.c.h) == null) {
            ajws = ajws.a;
        }
        return ajws;
    }
    
    public ajwp getFormattedDescriptionModel() {
        ajws ajws;
        if ((ajws = this.c.h) == null) {
            ajws = ajws.a;
        }
        return ajwp.b(ajws).z(this.b);
    }
    
    public String getPlaylistId() {
        return this.c.e;
    }
    
    public Map getThumbnailStyleDataMap() {
        return agpx.K(Collections.unmodifiableMap((Map<?, ?>)this.c.l), (afax)new aemg(this, 15));
    }
    
    public String getTitle() {
        return this.c.g;
    }
    
    public /* bridge */ vgu getType() {
        return (vgu)this.getType();
    }
    
    public vhd getType() {
        return ambj.a;
    }
    
    public aqbp getVisibility() {
        aqbp aqbp;
        if ((aqbp = aqbp.b(this.c.i)) == null) {
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
        final StringBuilder sb = new StringBuilder("MainPlaylistEntityModel{");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
