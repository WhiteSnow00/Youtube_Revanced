import java.nio.Buffer;
import android.opengl.GLES20;

// 
// Decompiled by Procyon v0.6.0
// 

public final class axq
{
    public int a;
    public final int b;
    private final boolean c;
    
    public axq(final int a, final int b, final boolean c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public static axq a(final int n) {
        return new axq(n, 3553, false);
    }
    
    public static axq b() {
        return new axq(axl.f(), 3553, true);
    }
    
    public final void c(final int n, final int n2) {
        final int a = this.a;
        final int b = this.b;
        GLES20.glBindTexture(b, a);
        GLES20.glTexImage2D(b, 0, 6408, n, n2, 0, 6408, 5121, (Buffer)null);
        axl.h("glTexImage2D");
        axl.i();
    }
    
    public final void d() {
        if (GLES20.glIsTexture(this.a) && this.c) {
            final int a = this.a;
            axl.g("glDeleteTextures");
            GLES20.glDeleteTextures(1, new int[] { a }, 0);
            axl.h("glDeleteTextures");
        }
        this.a = 0;
    }
    
    @Override
    public final String toString() {
        final int a = this.a;
        final int b = this.b;
        final StringBuilder sb = new StringBuilder("TextureSource(id=");
        sb.append(a);
        sb.append(", target=");
        sb.append(b);
        sb.append(")");
        return sb.toString();
    }
}
