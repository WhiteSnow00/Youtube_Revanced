import android.graphics.PorterDuff$Mode;
import android.graphics.Rect;
import android.opengl.GLES20;
import android.graphics.Canvas;
import android.graphics.SurfaceTexture;
import android.view.Surface;

// 
// Decompiled by Procyon v0.6.0
// 

public class aatv extends aarh
{
    protected static final float[] m;
    private final Surface i;
    private final SurfaceTexture j;
    private final atnb k;
    public float n;
    private final int[] o;
    private Canvas p;
    private boolean q;
    
    static {
        m = new float[] { 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f };
    }
    
    public aatv(final float n, final float n2, final aave aave, final aavf aavf, final atnb k) {
        super(aave, aavf, k);
        this.k = k;
        final int[] o = { 0 };
        this.o = o;
        GLES20.glActiveTexture(33984);
        GLES20.glGenTextures(1, o, 0);
        aavd.g(o[0]);
        GLES20.glBindTexture(36197, o[0]);
        GLES20.glTexParameterf(36197, 10241, 9729.0f);
        GLES20.glTexParameterf(36197, 10240, 9729.0f);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        final SurfaceTexture j = new SurfaceTexture(o[0]);
        (this.j = j).setDefaultBufferSize(s(n), s(n2));
        this.i = new Surface(j);
        this.n = 1.0f;
    }
    
    public static int s(final float n) {
        return Math.round(n / 0.1f);
    }
    
    protected final boolean l() {
        return true;
    }
    
    public final void m() {
        GLES20.glActiveTexture(33984);
        GLES20.glBlendFunc(770, 771);
        GLES20.glBindTexture(36197, this.o[0]);
        GLES20.glUniform1f(((aaxp)this.k.a()).i, this.n);
        GLES20.glUniform2f(((aaxn)this.k.a()).b, 1.0f, 1.0f);
        GLES20.glUniform2f(((aaxn)this.k.a()).d, 0.0f, 0.0f);
        final Boolean a = aavd.a;
    }
    
    public void p(final foq foq) {
        super.p(foq);
        if (this.q) {
            this.j.updateTexImage();
            this.q = false;
        }
    }
    
    public void rQ() {
        this.i.release();
        this.j.release();
        super.rQ();
    }
    
    public final Canvas t() {
        this.p = null;
        if (this.i.isValid()) {
            (this.p = this.i.lockCanvas((Rect)null)).drawColor(0, PorterDuff$Mode.CLEAR);
        }
        return this.p;
    }
    
    protected final void w(final float n, final float n2) {
        this.j.setDefaultBufferSize(s(n), s(n2));
    }
    
    public final void x() {
        final Canvas p = this.p;
        if (p != null) {
            this.i.unlockCanvasAndPost(p);
            this.q = true;
        }
        this.p = null;
    }
}
