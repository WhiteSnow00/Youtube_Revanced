import java.util.Map;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import android.opengl.GLES20;
import java.util.HashMap;
import android.util.SparseArray;
import java.util.UUID;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aewv
{
    public final int a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    
    public aewv(final Context e, final int a, final acig d, final agn c, final xln b) {
        this.e = e;
        this.a = a;
        this.d = d;
        this.c = c;
        this.b = b;
    }
    
    public aewv(final bui d, final avv e, final byte[] b, final agjn[] c, final int a, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.d = d;
        this.e = e;
        this.b = b;
        this.c = c;
        this.a = a;
    }
    
    public aewv(final String b, final UUID c, final aewg d, final SparseArray e, final int a) {
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.a = a;
    }
    
    public aewv(final xjl xjl, final byte[] array, final byte[] array2) {
        final atzq c = new atzq((String)xjl.a, 35633);
        final atzq e = new atzq((String)xjl.b, 35632);
        this.d = new HashMap();
        this.b = new HashMap();
        this.c = c;
        this.e = e;
        final int glCreateProgram = GLES20.glCreateProgram();
        this.a = glCreateProgram;
        adme.T(glCreateProgram != 0);
        GLES20.glAttachShader(glCreateProgram, c.a);
        GLES20.glAttachShader(glCreateProgram, e.a);
        GLES20.glLinkProgram(glCreateProgram);
        final int[] array3 = { 0 };
        GLES20.glGetProgramiv(glCreateProgram, 35714, array3, 0);
        if (array3[0] != 0) {
            return;
        }
        GLES20.glDeleteProgram(glCreateProgram);
        throw new wiz("Program link failed");
    }
    
    public aewv(final bfv[] b, final bqz[] array, final azs e, final Object d) {
        this.b = b;
        this.c = array.clone();
        this.e = e;
        this.d = d;
        this.a = b.length;
    }
    
    @Deprecated
    public aewv(final bfv[] array, final bqz[] array2, final Object o) {
        this(array, array2, azs.a, o);
    }
    
    public static final void g(final int n, final int n2) {
        GLES20.glActiveTexture(33984);
        xny.aK("glActiveTexture");
        GLES20.glBindTexture(n, n2);
        xny.aK("glBindTexture");
    }
    
    public static final void h() {
        GLES20.glBindTexture(36197, 0);
        xny.aK("glBindTexture");
        GLES20.glUseProgram(0);
        xny.aK("glUseProgram");
    }
    
    private final int k(final String s) {
        if (((Map)this.b).containsKey(s)) {
            return ((Map<K, Integer>)this.b).get(s);
        }
        final int glGetAttribLocation = GLES20.glGetAttribLocation(this.a, s);
        xny.aL(glGetAttribLocation, s);
        xny.aK("glGetAttribLocation");
        ((Map<String, Integer>)this.b).put(s, Integer.valueOf(glGetAttribLocation));
        return glGetAttribLocation;
    }
    
    private final int l(final String s) {
        if (((Map)this.d).containsKey(s)) {
            return ((Map<K, Integer>)this.d).get(s);
        }
        final int glGetUniformLocation = GLES20.glGetUniformLocation(this.a, s);
        xny.aL(glGetUniformLocation, s);
        xny.aK("glGetUniformLocation");
        ((Map<String, Integer>)this.d).put(s, Integer.valueOf(glGetUniformLocation));
        return glGetUniformLocation;
    }
    
    public final void a(final int n, final int n2) {
        GLES20.glUseProgram(this.a);
        xny.aK("glUseProgram");
        GLES20.glBindTexture(n, n2);
        xny.aK("glBindTexture");
    }
    
    public final void b(final String s) {
        GLES20.glDisableVertexAttribArray(this.k(s));
        xny.aK("glDisableVertexAttribArray");
    }
    
    public final void c(final String s, final FloatBuffer floatBuffer) {
        final int k = this.k(s);
        GLES20.glEnableVertexAttribArray(k);
        xny.aK("glEnableVertexAttribArray");
        GLES20.glVertexAttribPointer(k, 2, 5126, false, 8, (Buffer)floatBuffer);
        xny.aK("glVertexAttribPointer");
    }
    
    public final void d() {
        GLES20.glDeleteProgram(this.a);
        ((atzq)this.c).b();
        ((atzq)this.e).b();
    }
    
    public final void e(final String s, final float n) {
        GLES20.glUniform1f(this.l(s), n);
    }
    
    public final void f(final String s, final float[] array) {
        GLES20.glUniformMatrix4fv(this.l(s), 1, false, array, 0);
    }
    
    public final boolean i(final int n) {
        return ((bfv[])this.b)[n] != null;
    }
    
    public final boolean j(final aewv aewv, final int n) {
        return aewv != null && (baz.aa(((bfv[])this.b)[n], ((bfv[])aewv.b)[n]) && baz.aa(((bqz[])this.c)[n], ((bqz[])aewv.c)[n]));
    }
}
