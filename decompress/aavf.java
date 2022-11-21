import java.util.Iterator;
import android.opengl.Matrix;
import java.util.LinkedList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aavf
{
    public float[] a;
    public float[] b;
    public float[] c;
    public float[] d;
    private final float[] e;
    private float[] f;
    private float[] g;
    private aavf h;
    private final List i;
    private boolean j;
    
    private aavf() {
        this.j = true;
        this.i = new LinkedList();
        this.e = new float[16];
    }
    
    public static aavf b() {
        final aavf aavf = new aavf();
        aavf.a = new float[16];
        aavf.f = new float[16];
        final float[] b = new float[16];
        aavf.b = b;
        aavf.c = new float[16];
        aavf.d = new float[16];
        aavf.g = new float[16];
        Matrix.setIdentityM(b, 0);
        Matrix.setIdentityM(aavf.a, 0);
        Matrix.setIdentityM(aavf.f, 0);
        Matrix.setIdentityM(aavf.c, 0);
        Matrix.setIdentityM(aavf.d, 0);
        Matrix.setIdentityM(aavf.g, 0);
        return aavf;
    }
    
    public final aavf a() {
        final aavf aavf = new aavf();
        aavf.a = this.a.clone();
        aavf.f = this.f.clone();
        aavf.b = this.b.clone();
        aavf.c = this.c.clone();
        aavf.d = this.d.clone();
        aavf.g = this.g.clone();
        aavf.d(this.h);
        aavf.j = this.j;
        return aavf;
    }
    
    public final void c() {
        Matrix.setIdentityM(this.f, 0);
        this.g();
    }
    
    public final /* bridge */ Object clone() {
        return this.a();
    }
    
    public final void d(final aavf h) {
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
        final aavf h = this.h;
        if (h != null && this.j) {
            Matrix.multiplyMM(this.e, 0, h.a, 0, this.a, 0);
            System.arraycopy(this.e, 0, this.a, 0, 16);
        }
        final Iterator iterator = this.i.iterator();
        while (iterator.hasNext()) {
            ((aavf)iterator.next()).g();
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
