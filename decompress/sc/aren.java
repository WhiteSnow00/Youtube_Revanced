import java.nio.Buffer;
import android.opengl.GLES20;
import java.nio.FloatBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aren implements aulr
{
    private static final FloatBuffer a;
    private static final FloatBuffer b;
    private final String c;
    private aulc d;
    private int e;
    private int f;
    private int g;
    private int h;
    private final arem i;
    
    static {
        a = aucl.c(new float[] { -1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f });
        b = aucl.c(new float[] { 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f });
    }
    
    public aren(final String c, final arem i) {
        this.c = c;
        this.i = i;
    }
    
    private final void d(int a, final float[] array, int c, final int n) {
        aulc d;
        if (a == this.h) {
            d = this.d;
            d.getClass();
        }
        else {
            this.h = 0;
            final aulc d2 = this.d;
            if (d2 != null) {
                d2.c();
                this.d = null;
            }
            final String c2 = this.c;
            final StringBuilder sb = new StringBuilder();
            if (a == 1) {
                sb.append("#extension GL_OES_EGL_image_external : require\n");
            }
            sb.append("precision mediump float;\nvarying vec2 tc;\nuniform ");
            String s;
            if (a == 1) {
                s = "samplerExternalOES";
            }
            else {
                s = "sampler2D";
            }
            sb.append(s);
            sb.append(" tex;\n");
            sb.append(c2.replace("sample(", "texture2D(tex, "));
            d = new aulc(sb.toString());
            this.h = a;
            (this.d = d).d();
            GLES20.glUniform1i(d.b("tex"), 0);
            aucl.d("Create shader");
            final arem i = this.i;
            i.b = d.b("xUnit");
            i.c = d.b("yUnit");
            if (i.a > 2) {
                GLES20.glUniform1i(d.b("samplingFactor"), i.a);
            }
            this.g = d.b("tex_mat");
            this.e = d.a("in_pos");
            this.f = d.a("in_tc");
        }
        d.d();
        GLES20.glEnableVertexAttribArray(this.e);
        GLES20.glVertexAttribPointer(this.e, 2, 5126, false, 0, (Buffer)aren.a);
        GLES20.glEnableVertexAttribArray(this.f);
        GLES20.glVertexAttribPointer(this.f, 2, 5126, false, 0, (Buffer)aren.b);
        GLES20.glUniformMatrix4fv(this.g, 1, false, array, 0);
        final arem j = this.i;
        a = j.a;
        final int b = j.b;
        final float n2 = array[0];
        final float n3 = 1.0f / (c * a);
        GLES20.glUniform2f(b, n2 * n3, array[1] * n3);
        c = j.c;
        final float n4 = array[4];
        final float n5 = 1.0f / (a * n);
        GLES20.glUniform2f(c, n4 * n5, array[5] * n5);
        aucl.d("Prepare shader");
    }
    
    public final void a(final int n, final float[] array, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7) {
        this.d(1, array, n6, n7);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, n);
        GLES20.glViewport(n4, n5, n6, n7);
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glBindTexture(36197, 0);
    }
    
    public final void b(final int n, final float[] array, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7) {
        this.d(2, array, n6, n7);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, n);
        GLES20.glViewport(n4, n5, n6, n7);
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glBindTexture(3553, 0);
    }
    
    public final void c() {
        final aulc d = this.d;
        if (d != null) {
            d.c();
            this.d = null;
            this.h = 0;
        }
    }
}
