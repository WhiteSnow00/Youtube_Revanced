import java.util.Iterator;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajlu implements vhc
{
    public static final vhd a;
    public final ajlx b;
    
    static {
        a = new ajlt();
    }
    
    public ajlu(final ajlx b) {
        this.b = b;
    }
    
    public static ajls c(final ajlx ajlx) {
        return new ajls(ajlx.toBuilder());
    }
    
    public final /* bridge */ vgs a() {
        return new ajls(this.b.toBuilder());
    }
    
    public final afhk b() {
        final afhi afhi = new afhi();
        final ajlx b = this.b;
        if ((b.c & 0x8) != 0x0) {
            afhi.h(b.h);
        }
        final aflv d = ((afgh)this.getLicensesModels()).D();
        while (((Iterator)d).hasNext()) {
            final ajlv ajlv = (ajlv)((Iterator)d).next();
            afhi.j(new afhi().g());
        }
        this.getErrorModel();
        afhi.j(new afhi().g());
        return afhi.g();
    }
    
    public final byte[] d() {
        return this.b.toByteArray();
    }
    
    public final String e() {
        return this.b.d;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof ajlu && this.b.equals(((ajlu)o).b);
    }
    
    public ajlw getError() {
        ajlw ajlw;
        if ((ajlw = this.b.i) == null) {
            ajlw = ajlw.a;
        }
        return ajlw;
    }
    
    public ajlr getErrorModel() {
        ajlw ajlw;
        if ((ajlw = this.b.i) == null) {
            ajlw = ajlw.a;
        }
        return new ajlr((ajlw)ajlw.toBuilder().build());
    }
    
    public Long getLicenseExpirySeconds() {
        return this.b.g;
    }
    
    public List getLicenses() {
        return (List)this.b.e;
    }
    
    public List getLicensesModels() {
        final afgc afgc = new afgc();
        final Iterator<Object> iterator = ((List<Object>)this.b.e).iterator();
        while (iterator.hasNext()) {
            afgc.h(new ajlv((ajly)iterator.next().toBuilder().build()));
        }
        return afgc.g();
    }
    
    public Long getPlaybackStartSeconds() {
        return this.b.f;
    }
    
    public /* bridge */ vgu getType() {
        return (vgu)this.getType();
    }
    
    public vhd getType() {
        return ajlu.a;
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() ^ 0xF6181;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.b);
        final StringBuilder sb = new StringBuilder("DrmLicenseEntityModel{");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
