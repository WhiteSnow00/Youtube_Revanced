import java.util.Iterator;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ambt implements vhc
{
    public static final vhd a;
    private final ambu b;
    
    static {
        a = new ambs();
    }
    
    public ambt(final ambu b) {
        this.b = b;
    }
    
    public final /* bridge */ vgs a() {
        return new ambr(this.b.toBuilder());
    }
    
    public final afhk b() {
        final afhi afhi = new afhi();
        final ambu b = this.b;
        if ((b.b & 0x4) != 0x0) {
            afhi.h(b.d);
        }
        if (this.b.e.size() > 0) {
            afhi.j((Iterable)this.b.e);
        }
        final ambu b2 = this.b;
        if ((b2.b & 0x8) != 0x0) {
            afhi.h(b2.g);
        }
        final aflv d = ((afgh)this.getFormatsModels()).D();
        while (((Iterator)d).hasNext()) {
            final ajhs ajhs = (ajhs)((Iterator)d).next();
            afhi.j(ajhs.a());
        }
        return afhi.g();
    }
    
    public final byte[] d() {
        return this.b.toByteArray();
    }
    
    public final String e() {
        return this.b.c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof ambt && this.b.equals(((ambt)o).b);
    }
    
    public List getFormats() {
        return (List)this.b.f;
    }
    
    public List getFormatsModels() {
        final afgc afgc = new afgc();
        final Iterator<Object> iterator = ((List<Object>)this.b.f).iterator();
        while (iterator.hasNext()) {
            afgc.h(ajhs.b(iterator.next()).E());
        }
        return afgc.g();
    }
    
    public /* bridge */ vgu getType() {
        return (vgu)this.getType();
    }
    
    public vhd getType() {
        return ambt.a;
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() ^ 0xF6181;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.b);
        final StringBuilder sb = new StringBuilder("MainRecommendedDownloadPlaylistEntityModel{");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
