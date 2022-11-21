import android.opengl.Matrix;
import android.opengl.GLES20;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aate extends aauk
{
    private final aavi a;
    private final aave b;
    private final aave c;
    private final atnb d;
    private final aavf e;
    private final float[] f;
    private final int g;
    private float h;
    private aavk i;
    private float j;
    
    public aate(final aave b, final aave c, final aavi a, final int g, final aavf e, final atnb d, final aavk i) {
        this.b = b;
        this.c = c;
        a.getClass();
        this.a = a;
        this.d = d;
        this.g = g;
        this.e = e;
        this.f = new float[16];
        this.h = 1.0f;
        this.i = i;
    }
    
    public final void a(final aavk i) {
        this.i = i;
    }
    
    public final void b() {
    }
    
    public final void c(final float n) {
        this.h = 1.0f - n;
    }
    
    public final void k(final float n, final float n2, final float n3) {
        this.e.f(n, n2, n3);
    }
    
    public final void p(final foq foq) {
        if (this.i.a() && !this.i.b()) {
            this.j = (float)Math.random();
        }
        this.a.h();
    }
    
    public final boolean q(final foq foq) {
        return false;
    }
    
    public final void r(final agmq agmq) {
        final Object a = this.d.a();
        final aaxi aaxi = (aaxi)a;
        aaxi.j();
        final int g = this.g;
        if (g != 1) {
            if (g != 2) {
                final aaxo aaxo = (aaxo)a;
                GLES20.glUniform2f(aaxo.e, 1.0f, 1.0f);
                GLES20.glUniform2f(aaxo.f, 0.0f, 0.0f);
            }
            else if (agmq.J() != 0 && agmq.J() != 1) {
                final aaxo aaxo2 = (aaxo)a;
                GLES20.glUniform2f(aaxo2.e, 0.5f, 1.0f);
                GLES20.glUniform2f(aaxo2.f, 0.5f, 0.0f);
            }
            else {
                final aaxo aaxo3 = (aaxo)a;
                GLES20.glUniform2f(aaxo3.e, 0.5f, 1.0f);
                GLES20.glUniform2f(aaxo3.f, 0.0f, 0.0f);
            }
        }
        else if (agmq.J() != 0 && agmq.J() != 1) {
            final aaxo aaxo4 = (aaxo)a;
            GLES20.glUniform2f(aaxo4.e, 1.0f, 0.5f);
            GLES20.glUniform2f(aaxo4.f, 0.0f, 0.0f);
        }
        else {
            final aaxo aaxo5 = (aaxo)a;
            GLES20.glUniform2f(aaxo5.e, 1.0f, 0.5f);
            GLES20.glUniform2f(aaxo5.f, 0.0f, 0.5f);
        }
        final aaxd aaxd = (aaxd)a;
        aaxd.d();
        final aaxo aaxo6 = (aaxo)a;
        GLES20.glUniformMatrix4fv(aaxo6.g, 1, false, this.a.i(), 0);
        this.a.f();
        aaxo6.b.c(this.a);
        final float j = this.j;
        final aavk i = this.i;
        aaxo6.d.a(j, i.a, i.b);
        Matrix.multiplyMM(this.f, 0, (float[])agmq.d, 0, this.e.a, 0);
        GLES20.glUniform1f(((aaxp)a).i, this.h);
        GLES20.glUniform1f(aaxd.a, 1.0f);
        aaxd.l(this.f);
        aaxi.h();
        if (agmq.J() == 2) {
            aaxd.c(this.c);
        }
        else {
            aaxd.c(this.b);
        }
        aaxd.k();
        final Boolean a2 = aavd.a;
    }
    
    public final void rQ() {
        this.b.b();
        final aave c = this.c;
        if (c != this.b) {
            c.b();
        }
    }
    
    public final void rR(final boolean b, final foq foq) {
    }
}
