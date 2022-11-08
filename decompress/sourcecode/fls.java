import j$.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fls
{
    public final vdm a;
    private final String b;
    private final int c;
    
    private fls(final String b, final int c, final vdm a) {
        this.b = b;
        this.c = c;
        this.a = a;
    }
    
    public static fls a(final vdm vdm) {
        final String i = vek.i(vdm.e());
        final boolean b = vdm instanceof apwi;
        int n2;
        final int n = n2 = 1;
        if (!b) {
            n2 = n;
            if (!(vdm instanceof alyn)) {
                if (vdm instanceof alxs) {
                    n2 = n;
                }
                else {
                    final boolean b2 = vdm instanceof apwd;
                    final int n3 = n2 = 2;
                    if (!b2) {
                        n2 = n3;
                        if (!(vdm instanceof alxe)) {
                            if (vdm instanceof alxo) {
                                n2 = n3;
                            }
                            else {
                                n2 = 3;
                            }
                        }
                    }
                }
            }
        }
        return new fls(i, n2, vdm);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof fls)) {
            return false;
        }
        final fls fls = (fls)o;
        return this.b.equals(fls.b) && this.c == fls.c;
    }
    
    @Override
    public final int hashCode() {
        return Objects.hash(new Object[] { this.b, this.c });
    }
}
