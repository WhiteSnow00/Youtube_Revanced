import android.content.Context;
import android.opengl.EGLContext;

// 
// Decompiled by Procyon v0.6.0
// 

final class eqc implements uol
{
    final Object a;
    private final int b;
    
    public eqc(final eps a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public eqc(final eqd a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public eqc(final eqr a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public final uon a(final uov uov, final EGLContext eglContext, final unc unc) {
        final int b = this.b;
        if (b == 0) {
            return vdh.aa((uol)this, uov, eglContext, unc);
        }
        if (b != 1) {
            return vdh.aa((uol)this, uov, eglContext, unc);
        }
        return vdh.aa((uol)this, uov, eglContext, unc);
    }
    
    public final uon b(final uov uov, final EGLContext eglContext, final unc unc, final int n) {
        final int b = this.b;
        if (b == 0) {
            return vdh.ab((uol)this, uov, eglContext, unc, n);
        }
        if (b != 1) {
            return vdh.ab((uol)this, uov, eglContext, unc, n);
        }
        return vdh.ab((uol)this, uov, eglContext, unc, n);
    }
    
    public final uon c(final uov uov, final EGLContext eglContext, final boolean b, final uly uly, final boolean b2, final unc unc, final int n) {
        final int b3 = this.b;
        if (b3 == 0) {
            return vdh.ac((uol)this, uov, eglContext, b, uly, b2, unc, n);
        }
        if (b3 != 1) {
            return vdh.ac((uol)this, uov, eglContext, b, uly, b2, unc, n);
        }
        return vdh.ac((uol)this, uov, eglContext, b, uly, b2, unc, n);
    }
    
    public final uon d(final uov uov, final EGLContext eglContext, final boolean b, final uly uly, final boolean b2, final unc unc, final int n, final qye qye, final uly uly2, final qye qye2) {
        final int b3 = this.b;
        if (b3 == 0) {
            final eqy a = ((eqd)this.a).a;
            return vdh.al((Context)a.qg.a, (arwh)a.v.a(), ((eqd)this.a).a.a.gG(), (ulc)((eqd)this.a).d.u.a(), uov, eglContext, b, uly, b2, unc, n, qye, uly2, qye2);
        }
        if (b3 != 1) {
            final eqy a2 = ((eqr)this.a).a;
            return vdh.al((Context)a2.qg.a, (arwh)a2.v.a(), ((eqr)this.a).a.a.gG(), (ulc)((eqr)this.a).b.g.a(), uov, eglContext, b, uly, b2, unc, n, qye, uly2, qye2);
        }
        final eqy a3 = ((eps)this.a).a;
        return vdh.al((Context)a3.qg.a, (arwh)a3.v.a(), ((eps)this.a).a.a.gG(), (ulc)((eps)this.a).b.eV.a(), uov, eglContext, b, uly, b2, unc, n, qye, uly2, qye2);
    }
}
