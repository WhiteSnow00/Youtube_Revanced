import java.util.List;
import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class airt implements vdt
{
    public static final vdu a;
    private final vdo b;
    private final airu c;
    
    static {
        a = new airs();
    }
    
    public airt(final airu c, final vdo b) {
        this.c = c;
        this.b = b;
    }
    
    public final afdu b() {
        final afds afds = new afds();
        final airv commerceAcquisitionClientPayloadModel = this.getCommerceAcquisitionClientPayloadModel();
        final afds afds2 = new afds();
        final airy a = commerceAcquisitionClientPayloadModel.a;
        aisa a2;
        if (a.b == 1) {
            a2 = (aisa)a.c;
        }
        else {
            a2 = aisa.a;
        }
        final airw airw = new airw((aisa)((agzi)a2).toBuilder().build());
        final afds afds3 = new afds();
        final afcm afcm = new afcm();
        final Iterator<Object> iterator = ((List<Object>)airw.a.b).iterator();
        while (iterator.hasNext()) {
            afcm.h(new airx((airz)((agzi)iterator.next()).toBuilder().build()));
        }
        final afif d = afcm.g().D();
        while (((Iterator)d).hasNext()) {
            final airx airx = (airx)((Iterator)d).next();
            afds3.j((Iterable)new afds().g());
        }
        afds2.j((Iterable)afds3.g());
        final airy a3 = commerceAcquisitionClientPayloadModel.a;
        aisb a4;
        if (a3.b == 2) {
            a4 = (aisb)a3.c;
        }
        else {
            a4 = aisb.a;
        }
        final aisb aisb = (aisb)((agzi)a4).toBuilder().build();
        afds2.j((Iterable)new afds().g());
        afds.j((Iterable)afds2.g());
        return afds.g();
    }
    
    public final byte[] d() {
        return ((agxl)this.c).toByteArray();
    }
    
    public final String e() {
        return this.c.c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof airt && ((agzi)this.c).equals(((airt)o).c);
    }
    
    public airy getCommerceAcquisitionClientPayload() {
        airy airy;
        if ((airy = this.c.d) == null) {
            airy = airy.a;
        }
        return airy;
    }
    
    public airv getCommerceAcquisitionClientPayloadModel() {
        airy airy;
        if ((airy = this.c.d) == null) {
            airy = airy.a;
        }
        return new airv((airy)((agzi)airy).toBuilder().build());
    }
    
    public vdu getType() {
        return airt.a;
    }
    
    @Override
    public final int hashCode() {
        return ((agzi)this.c).hashCode() ^ 0xF6181;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.c);
        final StringBuilder sb = new StringBuilder("CommerceAcquisitionClientPayloadEntityModel{");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
