import java.util.List;
import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aivw implements vhc
{
    public static final vhd a;
    private final vgx b;
    private final aivx c;
    
    static {
        a = new aivv();
    }
    
    public aivw(final aivx c, final vgx b) {
        this.c = c;
        this.b = b;
    }
    
    public final /* bridge */ vgs a() {
        return new aivu(((ahcz)this.c).toBuilder());
    }
    
    public final afhk b() {
        final afhi afhi = new afhi();
        final aivy commerceAcquisitionClientPayloadModel = this.getCommerceAcquisitionClientPayloadModel();
        final afhi afhi2 = new afhi();
        final aiwb a = commerceAcquisitionClientPayloadModel.a;
        aiwd a2;
        if (a.b == 1) {
            a2 = (aiwd)a.c;
        }
        else {
            a2 = aiwd.a;
        }
        final aivz aivz = new aivz((aiwd)((ahcz)a2).toBuilder().build());
        final afhi afhi3 = new afhi();
        final afgc afgc = new afgc();
        final Iterator<Object> iterator = ((List<Object>)aivz.a.b).iterator();
        while (iterator.hasNext()) {
            afgc.h(new aiwa((aiwc)((ahcz)iterator.next()).toBuilder().build()));
        }
        final aflv d = afgc.g().D();
        while (((Iterator)d).hasNext()) {
            final aiwa aiwa = (aiwa)((Iterator)d).next();
            afhi3.j(new afhi().g());
        }
        afhi2.j(afhi3.g());
        final aiwb a3 = commerceAcquisitionClientPayloadModel.a;
        aiwe a4;
        if (a3.b == 2) {
            a4 = (aiwe)a3.c;
        }
        else {
            a4 = aiwe.a;
        }
        final aiwe aiwe = (aiwe)((ahcz)a4).toBuilder().build();
        afhi2.j(new afhi().g());
        afhi.j(afhi2.g());
        return afhi.g();
    }
    
    public final byte[] d() {
        return ((ahbc)this.c).toByteArray();
    }
    
    public final String e() {
        return this.c.c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof aivw && ((ahcz)this.c).equals(((aivw)o).c);
    }
    
    public aiwb getCommerceAcquisitionClientPayload() {
        aiwb aiwb;
        if ((aiwb = this.c.d) == null) {
            aiwb = aiwb.a;
        }
        return aiwb;
    }
    
    public aivy getCommerceAcquisitionClientPayloadModel() {
        aiwb aiwb;
        if ((aiwb = this.c.d) == null) {
            aiwb = aiwb.a;
        }
        return new aivy((aiwb)((ahcz)aiwb).toBuilder().build());
    }
    
    public /* bridge */ vgu getType() {
        return (vgu)this.getType();
    }
    
    public vhd getType() {
        return aivw.a;
    }
    
    @Override
    public final int hashCode() {
        return ((ahcz)this.c).hashCode() ^ 0xF6181;
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
