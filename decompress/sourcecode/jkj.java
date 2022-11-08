import java.lang.ref.WeakReference;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jkj implements acik, jki
{
    final /* synthetic */ tyh a;
    
    public jkj(final tyh a, final byte[] array) {
        this.a = a;
    }
    
    @Override
    public final void a(final acij acij, final achk achk, final int n) {
        final tyh a = this.a;
        if (n == 0) {
            final Object c = achk.c(0);
            if (c instanceof akac && jfi.g((akac)c)) {
                acij.f("refinement_selection_listener", a.a);
                acij.f("refinement_selection_controller", a.d);
            }
        }
    }
    
    public final void l(final anvp c, final int a) {
        final athj athj = (athj)this.a.d;
        final Object c2 = athj.c;
        final int a2 = athj.a;
        athj.c = c;
        athj.a = a;
        if (c2 != null) {
            final anvp anvp = (anvp)c2;
            final jki f = athj.F(anvp);
            if (f != null) {
                f.l(anvp, a2);
            }
        }
        final jki f2 = athj.F(c);
        if (f2 != null) {
            f2.l(c, a);
        }
        final Object e = this.a.e;
        if (e != null) {
            final jki jki = (jki)((WeakReference)e).get();
            if (jki != null) {
                jki.l(c, a);
            }
        }
    }
}
