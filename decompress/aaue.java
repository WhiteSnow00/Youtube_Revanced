import android.opengl.GLUtils;
import android.opengl.GLES20;
import android.graphics.Bitmap;

// 
// Decompiled by Procyon v0.6.0
// 

public class aaue extends aarh
{
    public Bitmap i;
    public boolean j;
    public float k;
    private final atnb m;
    private final int[] n;
    private boolean o;
    
    public aaue(final Bitmap i, final aave aave, final aavf aavf, final atnb m) {
        super(aave, aavf, m);
        this.i = i;
        this.m = m;
        final int[] n = { 0 };
        this.n = n;
        this.k = 1.0f;
        this.j = true;
        GLES20.glGenTextures(1, n, 0);
        aavd.g(n[0]);
        GLES20.glBindTexture(3553, n[0]);
        GLES20.glTexParameterf(3553, 10241, 9729.0f);
        GLES20.glTexParameterf(3553, 10240, 9729.0f);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        GLUtils.texImage2D(3553, 0, this.i, 0);
    }
    
    public final void g() {
        this.o = true;
    }
    
    protected final boolean l() {
        return true;
    }
    
    public final void m() {
        if (this.i != null) {
            if (this.n[0] != 0) {
                GLES20.glActiveTexture(33984);
                GLES20.glBlendFunc(770, 771);
                GLES20.glUniform1f(((aaxp)this.m.a()).i, this.k);
                GLES20.glBindTexture(3553, this.n[0]);
                if (this.o) {
                    if (this.j) {
                        GLUtils.texImage2D(3553, 0, this.i, 0);
                    }
                    else {
                        GLUtils.texSubImage2D(3553, 0, 0, 0, this.i);
                    }
                    this.o = false;
                }
                final Boolean a = aavd.a;
                this.f.e.a(((aaxp)this.m.a()).h);
            }
        }
    }
}
