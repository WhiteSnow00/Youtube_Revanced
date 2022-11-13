import io.grpc.Status;

// 
// Decompiled by Procyon v0.6.0
// 

final class asgs extends asgu
{
    private final Status a;
    
    public asgs(final Status a) {
        a.getClass();
        this.a = a;
    }
    
    public final arvo a() {
        arvo arvo;
        if (this.a.f()) {
            arvo = arvo.a;
        }
        else {
            arvo = arvo.b(this.a);
        }
        return arvo;
    }
    
    @Override
    public final boolean b(final asgu asgu) {
        final boolean b = asgu instanceof asgs;
        boolean b3;
        final boolean b2 = b3 = false;
        if (b) {
            final Status a = this.a;
            final asgs asgs = (asgs)asgu;
            if (!adkp.ae((Object)a, (Object)asgs.a)) {
                b3 = b2;
                if (this.a.f()) {
                    if (asgs.a.f()) {
                        return true;
                    }
                    b3 = b2;
                }
            }
            else {
                b3 = true;
            }
        }
        return b3;
    }
    
    public final String toString() {
        final aezo aa = adkp.aa((Class)asgs.class);
        aa.b("status", (Object)this.a);
        return aa.toString();
    }
}
