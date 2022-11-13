import android.opengl.GLES20;
import com.google.vr.sdk.base.GvrViewerParams;
import com.google.vr.sdk.base.Eye;
import android.opengl.Matrix;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class aapi extends aasb implements aapq, aarx, aars
{
    public final aatv a;
    public boolean b;
    public float c;
    public float d;
    public aapp e;
    protected final aatu f;
    public aari g;
    public boolean h;
    private final atke i;
    private final float[] j;
    private final float[] k;
    private boolean m;
    private boolean n;
    private List o;
    private List p;
    
    public aapi(final aatu f, final aatv a, final atke i) {
        this.f = f;
        this.a = a;
        this.i = i;
        this.m = true;
        this.d = 1.0f;
        this.c = 1.0f;
        this.j = new float[16];
        this.k = new float[16];
        this.getClass().getSimpleName();
    }
    
    public final void a(final aaph aaph) {
        if (this.o == null) {
            this.o = new ArrayList();
        }
        this.o.add(aaph);
    }
    
    public final void c(final aaph aaph) {
        if (this.p == null) {
            this.p = new ArrayList();
        }
        this.p.add(aaph);
    }
    
    @Override
    public final void i(final boolean m) {
        this.m = m;
        float d;
        if (m) {
            d = 1.0f;
        }
        else {
            d = this.d;
        }
        this.c = d;
    }
    
    @Override
    public final void j(final float c) {
        this.c = c;
    }
    
    @Override
    public final void k(final float n, final float n2, final float n3) {
        this.a.f(n, n2, n3);
    }
    
    protected boolean l() {
        throw null;
    }
    
    public abstract void m();
    
    public final void n() {
        this.n = true;
    }
    
    @Override
    public void o(final fon fon) {
        if (this.b) {
            final aapp e = this.e;
            if (e != null) {
                e.a();
            }
        }
    }
    
    @Override
    public void p(final fon fon) {
        if (!this.v() && this.m) {
            final List o = this.o;
            if (o != null) {
                for (final aaph aaph : o) {
                    final boolean b = this.b;
                    boolean b2 = true;
                    if (!b) {
                        b2 = (this.h && b2);
                    }
                    aaph.a(b2, fon.a);
                }
            }
            final List p = this.p;
            if (p != null) {
                final Iterator iterator2 = p.iterator();
                while (iterator2.hasNext()) {
                    ((aaph)iterator2.next()).a(this.h, fon.a);
                }
            }
        }
    }
    
    @Override
    public boolean q(final fon fon) {
        if (this.m && !this.v()) {
            final aari g = this.g;
            if (g != null && g.b(fon).c()) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public void r(final agkz agkz) {
        agkz agkz2 = agkz;
        if (this.n) {
            Matrix.setIdentityM(this.k, 0);
            agkz2 = new agkz(this.k, (float[])agkz.b, (aatp)agkz.f, (Eye)agkz.c, (GvrViewerParams)agkz.a);
        }
        final aavu aavu = (aavu)this.i.a();
        aavu.j();
        aavu.d();
        final boolean l = this.l();
        if (l) {
            GLES20.glEnable(3042);
        }
        Matrix.multiplyMM(this.j, 0, (float[])agkz2.d, 0, this.a.a, 0);
        aavu.l(this.j);
        GLES20.glUniform1f(aavu.a, this.c);
        this.m();
        aavu.c(this.f);
        aavu.k();
        if (l) {
            GLES20.glDisable(3042);
        }
        final Boolean a = aatt.a;
    }
    
    @Override
    public void rQ() {
        this.f.b();
    }
    
    @Override
    public final void rR(final boolean b, final fon fon) {
        this.b = b;
    }
    
    @Override
    public final void sZ(final float n, final float n2, final float n3) {
        final aatv a = this.a;
        Matrix.setIdentityM(a.d, 0);
        Matrix.scaleM(a.d, 0, n, n2, n3);
        a.g();
    }
}
