// 
// Decompiled by Procyon v0.6.0
// 

public final class aswi extends asgy
{
    final ashb[] a;
    final asjc b;
    
    public aswi(final ashb[] a, final asjc b) {
        this.a = a;
        this.b = b;
    }
    
    protected final void ah(final asgz asgz) {
        final ashb[] a = this.a;
        final aswg aswg = new aswg(asgz, this.b);
        asgz.d((asic)aswg);
        for (int i = 0; i < 2; ++i) {
            if (aswg.tx()) {
                return;
            }
            final ashb ashb = a[i];
            if (ashb == null) {
                aswg.b(new NullPointerException("One of the sources is null"), i);
                return;
            }
            ashb.ag((asgz)aswg.c[i]);
        }
    }
}
