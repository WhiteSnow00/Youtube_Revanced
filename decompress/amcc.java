import java.util.Iterator;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amcc implements vhc
{
    public static final vhd a;
    public final vgx b;
    public final amce c;
    
    static {
        a = new amcb();
    }
    
    public amcc(final amce c, final vgx b) {
        this.c = c;
        this.b = b;
    }
    
    public final /* bridge */ vgs a() {
        return this.c();
    }
    
    public final afhk b() {
        final afhi afhi = new afhi();
        final amce c = this.c;
        if ((c.c & 0x4) != 0x0) {
            afhi.h(c.f);
        }
        final aflv d = ((afgh)this.getItemsModels()).D();
        while (((Iterator)d).hasNext()) {
            final ambz ambz = (ambz)((Iterator)d).next();
            final afhi afhi2 = new afhi();
            final amcd a = ambz.a;
            if (a.b == 1) {
                afhi2.h(a.c);
            }
            final amcd a2 = ambz.a;
            if (a2.b == 2) {
                afhi2.h(a2.c);
            }
            afhi.j(afhi2.g());
        }
        return afhi.g();
    }
    
    public final amca c() {
        return new amca(((ahcz)this.c).toBuilder());
    }
    
    public final byte[] d() {
        return ((ahbc)this.c).toByteArray();
    }
    
    public final String e() {
        return this.c.d;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof amcc && ((ahcz)this.c).equals(((amcc)o).c);
    }
    
    public List getItems() {
        return (List)this.c.e;
    }
    
    public List getItemsModels() {
        final afgc afgc = new afgc();
        final Iterator<Object> iterator = ((List<Object>)this.c.e).iterator();
        while (iterator.hasNext()) {
            afgc.h(new ambz((amcd)iterator.next().toBuilder().build(), this.b));
        }
        return afgc.g();
    }
    
    public /* bridge */ vgu getType() {
        return (vgu)this.getType();
    }
    
    public vhd getType() {
        return amcc.a;
    }
    
    @Override
    public final int hashCode() {
        return ((ahcz)this.c).hashCode() ^ 0xF6181;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.c);
        final StringBuilder sb = new StringBuilder("MainRecommendedDownloadsListEntityModel{");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
