import java.util.Iterator;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amat implements vhc
{
    public static final vhd a;
    public final vgx b;
    public final amav c;
    
    static {
        a = new amas();
    }
    
    public amat(final amav c, final vgx b) {
        this.c = c;
        this.b = b;
    }
    
    public final /* bridge */ vgs a() {
        return this.c();
    }
    
    public final afhk b() {
        final afhi afhi = new afhi();
        final amav c = this.c;
        if ((c.c & 0x4) != 0x0) {
            afhi.h(c.f);
        }
        final aflv d = ((afgh)this.getDownloadsModels()).D();
        while (((Iterator)d).hasNext()) {
            final amaq amaq = (amaq)((Iterator)d).next();
            final afhi afhi2 = new afhi();
            final amau a = amaq.a;
            if (a.b == 1) {
                afhi2.h(a.c);
            }
            final amau a2 = amaq.a;
            if (a2.b == 2) {
                afhi2.h(a2.c);
            }
            final amau a3 = amaq.a;
            if (a3.b == 3) {
                afhi2.h(a3.c);
            }
            final amau a4 = amaq.a;
            if (a4.b == 4) {
                afhi2.h(a4.c);
            }
            afhi.j(afhi2.g());
        }
        return afhi.g();
    }
    
    public final amar c() {
        return new amar(this.c.toBuilder());
    }
    
    public final byte[] d() {
        return this.c.toByteArray();
    }
    
    public final String e() {
        return this.c.d;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof amat && this.c.equals(((amat)o).c);
    }
    
    public List getDownloads() {
        return (List)this.c.e;
    }
    
    public List getDownloadsModels() {
        final afgc afgc = new afgc();
        final Iterator<Object> iterator = ((List<Object>)this.c.e).iterator();
        while (iterator.hasNext()) {
            afgc.h(new amaq((amau)iterator.next().toBuilder().build(), this.b));
        }
        return afgc.g();
    }
    
    public /* bridge */ vgu getType() {
        return (vgu)this.getType();
    }
    
    public vhd getType() {
        return amat.a;
    }
    
    @Override
    public final int hashCode() {
        return this.c.hashCode() ^ 0xF6181;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.c);
        final StringBuilder sb = new StringBuilder("MainDownloadsListEntityModel{");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
