import java.nio.Buffer;
import android.opengl.GLES20;
import java.nio.FloatBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aula implements aulr
{
    private static final FloatBuffer a;
    private static final FloatBuffer b;
    private final String c;
    private final aukz d;
    private aulc e;
    private int f;
    private int g;
    private int h;
    private int i;
    
    static {
        a = aucl.c(new float[] { -1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f });
        b = aucl.c(new float[] { 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f });
    }
    
    public aula() {
        this("void main() {\n  gl_FragColor = sample(tc);\n}\n", (aukz)new aulb());
    }
    
    public aula(final String c, final aukz d) {
        this.c = c;
        this.d = d;
    }
    
    public final void a(final int n, final float[] array, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7) {
        this.d(1, array, n2);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, n);
        GLES20.glViewport(n4, n5, n6, n7);
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glBindTexture(36197, 0);
    }
    
    public final void b(final int n, final float[] array, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7) {
        this.d(2, array, n2);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, n);
        GLES20.glViewport(n4, n5, n6, n7);
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glBindTexture(3553, 0);
    }
    
    public final void c() {
        final aulc e = this.e;
        if (e != null) {
            e.c();
            this.e = null;
            this.i = 0;
        }
    }
    
    public final void d(final int i, final float[] array, final int n) {
        aulc e;
        if (i == this.i) {
            e = this.e;
        }
        else {
            this.i = 0;
            final aulc e2 = this.e;
            if (e2 != null) {
                e2.c();
                this.e = null;
            }
            final String c = this.c;
            final StringBuilder sb = new StringBuilder();
            if (i == 1) {
                sb.append("#extension GL_OES_EGL_image_external : require\n");
            }
            sb.append("precision mediump float;\nvarying vec2 tc;\n");
            if (i == 3) {
                sb.append("uniform sampler2D y_tex;\nuniform sampler2D u_tex;\nuniform sampler2D v_tex;\nvec4 sample(vec2 p) {\n  float y = texture2D(y_tex, p).r * 1.16438;\n  float u = texture2D(u_tex, p).r;\n  float v = texture2D(v_tex, p).r;\n  return vec4(y + 1.59603 * v - 0.874202,\n    y - 0.391762 * u - 0.812968 * v + 0.531668,\n    y + 2.01723 * u - 1.08563, 1);\n}\n");
                sb.append(c);
            }
            else {
                sb.append("uniform ");
                String s;
                if (i == 1) {
                    s = "samplerExternalOES";
                }
                else {
                    s = "sampler2D";
                }
                sb.append(s);
                sb.append(" tex;\n");
                sb.append(c.replace("sample(", "texture2D(tex, "));
            }
            e = new aulc(sb.toString());
            this.i = i;
            (this.e = e).d();
            if (i == 3) {
                GLES20.glUniform1i(e.b("y_tex"), 0);
                GLES20.glUniform1i(e.b("u_tex"), 1);
                GLES20.glUniform1i(e.b("v_tex"), 2);
            }
            else {
                GLES20.glUniform1i(e.b("tex"), 0);
            }
            aucl.d("Create shader");
            this.d.a(e);
            this.h = e.b("tex_mat");
            this.f = e.a("in_pos");
            this.g = e.a("in_tc");
        }
        e.d();
        GLES20.glEnableVertexAttribArray(this.f);
        GLES20.glVertexAttribPointer(this.f, 2, 5126, false, 0, (Buffer)aula.a);
        GLES20.glEnableVertexAttribArray(this.g);
        GLES20.glVertexAttribPointer(this.g, 2, 5126, false, 0, (Buffer)aula.b);
        GLES20.glUniformMatrix4fv(this.h, 1, false, array, 0);
        this.d.b(array, n);
        aucl.d("Prepare shader");
    }
}
