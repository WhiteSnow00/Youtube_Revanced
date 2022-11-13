// 
// Decompiled by Procyon v0.6.0
// 

public final class hyp implements wzt
{
    private final heo a;
    
    public hyp(final heo a, final byte[] array, final byte[] array2) {
        this.a = a;
    }
    
    public final void a(final algd algd) {
        appm appm;
        if ((appm = algd.d) == null) {
            appm = appm.a;
        }
        ahab ahab;
        if ((appm.b & 0x1) != 0x0) {
            appm appm2;
            if ((appm2 = algd.d) == null) {
                appm2 = appm.a;
            }
            ahab = appm2.c;
        }
        else {
            final appm d = algd.d;
            appm a;
            if (d == null) {
                a = appm.a;
            }
            else {
                a = d;
            }
            appm appm3;
            if ((appm3 = a.g) == null) {
                appm3 = appm.a;
            }
            if ((appm3.b & 0x1) != 0x0) {
                appm a2;
                if ((a2 = d) == null) {
                    a2 = appm.a;
                }
                appm appm4;
                if ((appm4 = a2.g) == null) {
                    appm4 = appm.a;
                }
                ahab = appm4.c;
            }
            else {
                ahab = null;
            }
        }
        if (ahab != null) {
            this.a.t(ahab);
        }
    }
}
