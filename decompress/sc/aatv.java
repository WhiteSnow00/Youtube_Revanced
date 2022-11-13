import java.util.Iterator;
import android.opengl.Matrix;
import java.util.LinkedList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aatv
{
    public float[] a;
    public float[] b;
    public float[] c;
    public float[] d;
    private final float[] e;
    private float[] f;
    private float[] g;
    private aatv h;
    private final List i;
    private boolean j;
    
    private aatv() {
        this.j = true;
        this.i = new LinkedList();
        this.e = new float[16];
    }
    
    public static aatv b() {
        final aatv aatv = new aatv();
        aatv.a = new float[16];
        aatv.f = new float[16];
        final float[] b = new float[16];
        aatv.b = b;
        aatv.c = new float[16];
        aatv.d = new float[16];
        aatv.g = new float[16];
        Matrix.setIdentityM(b, 0);
        Matrix.setIdentityM(aatv.a, 0);
        Matrix.setIdentityM(aatv.f, 0);
        Matrix.setIdentityM(aatv.c, 0);
        Matrix.setIdentityM(aatv.d, 0);
        Matrix.setIdentityM(aatv.g, 0);
        return aatv;
    }
    
    public final aatv a() {
        final aatv aatv = new aatv();
        aatv.a = this.a.clone();
        aatv.f = this.f.clone();
        aatv.b = this.b.clone();
        aatv.c = this.c.clone();
        aatv.d = this.d.clone();
        aatv.g = this.g.clone();
        aatv.d(this.h);
        aatv.j = this.j;
        return aatv;
    }
    
    public final void c() {
        Matrix.setIdentityM(this.f, 0);
        this.g();
    }
    
    public final /* bridge */ Object clone() {
        return this.a();
    }
    
    public final void d(final aatv h) {
        if (h == null) {
            return;
        }
        this.h = h;
        h.i.add(this);
        this.g();
    }
    
    public final void e(final boolean j) {
        this.j = j;
        this.g();
    }
    
    public final void f(final float n, final float n2, final float n3) {
        Matrix.translateM(this.b, 0, n, n2, n3);
        this.h();
        this.g();
    }
    
    public final void g() {
        Matrix.multiplyMM(this.e, 0, this.f, 0, this.g, 0);
        Matrix.multiplyMM(this.a, 0, this.e, 0, this.d, 0);
        final aatv h = this.h;
        if (h != null && this.j) {
            Matrix.multiplyMM(this.e, 0, h.a, 0, this.a, 0);
            System.arraycopy(this.e, 0, this.a, 0, 16);
        }
        final Iterator iterator = this.i.iterator();
        while (iterator.hasNext()) {
            ((aatv)iterator.next()).g();
        }
    }
    
    public final void h() {
        Matrix.multiplyMM(this.g, 0, this.b, 0, this.c, 0);
        this.g();
    }
    
    public final void i(final float n, final float n2, final float n3) {
        Matrix.rotateM(this.f, 0, n, n2, n3, 0.0f);
        this.g();
    }
    
    public final void j(final float n) {
        Matrix.setIdentityM(this.f, 0);
        Matrix.rotateM(this.f, 0, n, 0.0f, 1.0f, 0.0f);
        this.g();
    }
}
