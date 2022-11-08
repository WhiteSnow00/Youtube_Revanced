import android.content.Context;
import android.opengl.EGLContext;

// 
// Decompiled by Procyon v0.6.0
// 

final class epz implements umo
{
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;
    
    public epz(final epq a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public epz(final eqa a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public epz(final eqo a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public final umq d(final umy umy, final EGLContext eglContext, final boolean b, final ukd ukd, final boolean b2, final ulg ulg, final int n, final qwt qwt, final ukd ukd2, final qwt qwt2) {
        final int b3 = this.b;
        if (b3 == 0) {
            final eqv a = ((eqa)this.a).a;
            return vem.ag((Context)a.qg.a, (arud)a.v.a(), (ujg)((eqa)this.a).d.v.a(), umy, eglContext, b, ukd, b2, ulg, n, qwt, ukd2, qwt2);
        }
        if (b3 != 1) {
            final eqv a2 = ((eqo)this.a).a;
            return vem.ag((Context)a2.qg.a, (arud)a2.v.a(), (ujg)((eqo)this.a).b.g.a(), umy, eglContext, b, ukd, b2, ulg, n, qwt, ukd2, qwt2);
        }
        final eqv a3 = ((epq)this.a).a;
        return vem.ag((Context)a3.qg.a, (arud)a3.v.a(), (ujg)((epq)this.a).b.eU.a(), umy, eglContext, b, ukd, b2, ulg, n, qwt, ukd2, qwt2);
    }
}
