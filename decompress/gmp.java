import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gmp extends adtm
{
    final gmr a;
    
    public gmp(final gmr a) {
        this.a = a;
    }
    
    private final void c(final int n) {
        final ahaz builder = ((ahbh)apuf.a).createBuilder();
        builder.copyOnWrite();
        ((apuf)builder.instance).b = n - 2;
        final apuf apuf = (apuf)builder.build();
        final wxx ak = this.a.ak;
        final aknr d = aknt.d();
        ((ahaz)d).copyOnWrite();
        aknt.u((aknt)d.instance, apuf);
        ak.d((aknt)((ahaz)d).build());
    }
    
    public final void a(final View view, final float n) {
    }
    
    public final void b(final View view, final int n) {
        this.a.aM(n);
        if (n == 5) {
            this.c(5);
            return;
        }
        if (n == 3) {
            this.c(3);
            return;
        }
        if (n == 4) {
            this.c(4);
        }
    }
}
