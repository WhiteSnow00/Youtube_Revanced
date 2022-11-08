// 
// Decompiled by Procyon v0.6.0
// 

public final class jnt
{
    public final float a;
    public final int b;
    
    public jnt(final uyf uyf) {
        final ains b = uyf.b();
        alvl alvl;
        if ((alvl = b.e) == null) {
            alvl = alvl.a;
        }
        apnb apnb;
        if ((apnb = alvl.t) == null) {
            apnb = apnb.a;
        }
        final int b2 = apnb.b;
        int ai = 2;
        float c;
        if ((b2 & 0x2) != 0x0) {
            alvl alvl2;
            if ((alvl2 = b.e) == null) {
                alvl2 = alvl.a;
            }
            apnb apnb2;
            if ((apnb2 = alvl2.t) == null) {
                apnb2 = apnb.a;
            }
            c = apnb2.c;
        }
        else {
            c = 2.0f;
        }
        this.a = c;
        final alvl e = uyf.b().e;
        alvl a;
        if (e == null) {
            a = alvl.a;
        }
        else {
            a = e;
        }
        apnb apnb3;
        if ((apnb3 = a.t) == null) {
            apnb3 = apnb.a;
        }
        if ((apnb3.b & 0x80) != 0x0) {
            alvl a2;
            if ((a2 = e) == null) {
                a2 = alvl.a;
            }
            apnb apnb4;
            if ((apnb4 = a2.t) == null) {
                apnb4 = apnb.a;
            }
            if ((ai = aqql.ai(apnb4.d)) == 0) {
                ai = 1;
            }
        }
        this.b = ai;
    }
}
