import java.util.Iterator;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ambx implements vhc
{
    public static final vhd a;
    private final vgx b;
    private final amby c;
    
    static {
        a = new ambw();
    }
    
    public ambx(final amby c, final vgx b) {
        this.c = c;
        this.b = b;
    }
    
    public final /* bridge */ vgs a() {
        return new ambv(this.c.toBuilder());
    }
    
    public final afhk b() {
        final afhi afhi = new afhi();
        final amby c = this.c;
        if ((c.c & 0x4) != 0x0) {
            afhi.h(c.e);
        }
        final amby c2 = this.c;
        if ((c2.c & 0x8) != 0x0) {
            afhi.h(c2.g);
        }
        final aflv d = ((afgh)this.getFormatsModels()).D();
        while (((Iterator)d).hasNext()) {
            final ajhs ajhs = (ajhs)((Iterator)d).next();
            afhi.j(ajhs.a());
        }
        this.getLocalizedStringsModel();
        afhi.j(aqbw.a());
        return afhi.g();
    }
    
    public final aqca c() {
        final vgv c = this.b.c(this.c.g);
        boolean b = true;
        if (c != null) {
            b = (c instanceof aqca && b);
        }
        adme.U(b, "entityFromStore is not instance of YtMainVideoEntityModel, key=video");
        return (aqca)c;
    }
    
    public final byte[] d() {
        return this.c.toByteArray();
    }
    
    public final String e() {
        return this.c.d;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof ambx && this.c.equals(((ambx)o).c);
    }
    
    public List getFormats() {
        return (List)this.c.f;
    }
    
    public List getFormatsModels() {
        final afgc afgc = new afgc();
        final Iterator<Object> iterator = ((List<Object>)this.c.f).iterator();
        while (iterator.hasNext()) {
            afgc.h(ajhs.b(iterator.next()).E());
        }
        return afgc.g();
    }
    
    public aqbx getLocalizedStrings() {
        aqbx aqbx;
        if ((aqbx = this.c.h) == null) {
            aqbx = aqbx.a;
        }
        return aqbx;
    }
    
    public aqbw getLocalizedStringsModel() {
        aqbx aqbx;
        if ((aqbx = this.c.h) == null) {
            aqbx = aqbx.a;
        }
        return aqbw.b(aqbx).o();
    }
    
    public ahbt getScoringTrackingParams() {
        return this.c.i;
    }
    
    public /* bridge */ vgu getType() {
        return (vgu)this.getType();
    }
    
    public vhd getType() {
        return ambx.a;
    }
    
    @Override
    public final int hashCode() {
        return this.c.hashCode() ^ 0xF6181;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.c);
        final StringBuilder sb = new StringBuilder("MainRecommendedDownloadVideoEntityModel{");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
