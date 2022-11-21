import java.util.Iterator;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amyq implements vhc
{
    public static final vhd a;
    private final amyr b;
    
    static {
        a = new amyp();
    }
    
    public amyq(final amyr b) {
        this.b = b;
    }
    
    public final /* bridge */ vgs a() {
        return this.c();
    }
    
    public final afhk b() {
        final afhi afhi = new afhi();
        final aflv d = ((afgh)this.getStreamsProgressModels()).D();
        while (((Iterator)d).hasNext()) {
            final aonw aonw = (aonw)((Iterator)d).next();
            afhi.j(aonw.a());
        }
        return afhi.g();
    }
    
    public final amyo c() {
        return new amyo(((ahcz)this.b).toBuilder());
    }
    
    public final byte[] d() {
        return ((ahbc)this.b).toByteArray();
    }
    
    public final String e() {
        return this.b.d;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof amyq && ((ahcz)this.b).equals(((amyq)o).b);
    }
    
    public List getStreamsProgress() {
        return (List)this.b.e;
    }
    
    public List getStreamsProgressModels() {
        final afgc afgc = new afgc();
        final Iterator<Object> iterator = ((List<Object>)this.b.e).iterator();
        while (iterator.hasNext()) {
            afgc.h(aonw.b((aonx)iterator.next()).q());
        }
        return afgc.g();
    }
    
    public /* bridge */ vgu getType() {
        return (vgu)this.getType();
    }
    
    public vhd getType() {
        return amyq.a;
    }
    
    @Override
    public final int hashCode() {
        return ((ahcz)this.b).hashCode() ^ 0xF6181;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.b);
        final StringBuilder sb = new StringBuilder("OfflineVideoStreamsEntityModel{");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
