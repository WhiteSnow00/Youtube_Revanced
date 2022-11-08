// 
// Decompiled by Procyon v0.6.0
// 

public final class kvm implements foa
{
    public final boolean a;
    public uum b;
    public final qv c;
    public final eg d;
    
    public kvm(final eg d, final qv c, final uyf uyf, final byte[] array, final byte[] array2, final byte[] array3) {
        this.d = d;
        this.c = c;
        aior aior;
        if ((aior = uyf.b().v) == null) {
            aior = aior.a;
        }
        this.a = aior.h;
    }
    
    @Override
    public final void lV() {
        final uum b = this.b;
        if (b != null && b.c) {
            b.b = true;
            ((acms)b).ab();
        }
    }
    
    @Override
    public final void qB() {
        final uum b = this.b;
        if (b != null && b.c) {
            b.b = false;
            b.k();
        }
    }
}
