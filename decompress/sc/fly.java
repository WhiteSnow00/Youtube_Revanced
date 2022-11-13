import j$.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fly
{
    public final vfn a;
    private final String b;
    private final int c;
    
    private fly(final String b, final int c, final vfn a) {
        this.b = b;
        this.c = c;
        this.a = a;
    }
    
    public static fly a(final vfn vfn) {
        final String i = vgl.i(vfn.e());
        final boolean b = vfn instanceof apys;
        int n2;
        final int n = n2 = 1;
        if (!b) {
            n2 = n;
            if (!(vfn instanceof amar)) {
                if (vfn instanceof alzx) {
                    n2 = n;
                }
                else {
                    final boolean b2 = vfn instanceof apyn;
                    final int n3 = n2 = 2;
                    if (!b2) {
                        n2 = n3;
                        if (!(vfn instanceof alzj)) {
                            if (vfn instanceof alzt) {
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
        return new fly(i, n2, vfn);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof fly)) {
            return false;
        }
        final fly fly = (fly)o;
        return this.b.equals(fly.b) && this.c == fly.c;
    }
    
    @Override
    public final int hashCode() {
        return Objects.hash(new Object[] { this.b, this.c });
    }
}
