import java.nio.FloatBuffer;
import java.nio.Buffer;
import android.opengl.GLES20;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aatx
{
    private final int a;
    private final int b;
    private int c;
    
    public aatx(final float[] array, int n) {
        this.c = 0;
        array.getClass();
        adkp.H(array.length % n == 0);
        this.b = n;
        this.a = n * 4;
        final FloatBuffer e = aatt.e(array);
        final int[] array2 = { 0 };
        GLES20.glGenBuffers(1, array2, 0);
        aatt.g(array2[0]);
        n = array2[0];
        GLES20.glBindBuffer(34962, this.c = n);
        GLES20.glBufferData(34962, e.capacity() * 4, (Buffer)e, 35044);
        GLES20.glBindBuffer(34962, 0);
        e.clear();
    }
    
    public final void a(final int n) {
        final int c = this.c;
        if (c != 0) {
            GLES20.glBindBuffer(34962, c);
            GLES20.glVertexAttribPointer(n, this.b, 5126, false, this.a, 0);
            GLES20.glBindBuffer(34962, 0);
            final Boolean a = aatt.a;
        }
    }
    
    public final void b() {
        final int c = this.c;
        if (c != 0) {
            GLES20.glDeleteBuffers(1, new int[] { c }, 0);
            this.c = 0;
            final Boolean a = aatt.a;
        }
    }
}
