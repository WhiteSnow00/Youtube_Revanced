import android.opengl.GLES20;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aawc
{
    private static final float[] a;
    private static final float[] b;
    private static final float[] c;
    private static final String[] d;
    private final int e;
    private final int[] f;
    private final int g;
    private final int h;
    private int i;
    private aauo j;
    private final aavx k;
    
    static {
        a = new float[] { 1.164f, 1.164f, 1.164f, 0.0f, -0.392f, 2.017f, 1.596f, -0.813f, 0.0f };
        b = new float[] { 1.164f, 1.164f, 1.164f, 0.0f, -0.213f, 2.112f, 1.793f, -0.533f, 0.0f };
        c = new float[] { 1.168f, 1.168f, 1.168f, 0.0f, -0.188f, 2.148f, 1.683f, -0.652f, 0.0f };
        d = new String[] { "uTextureY", "uTextureU", "uTextureV" };
    }
    
    public aawc(final aavz aavz, final boolean b) {
        this.f = new int[3];
        this.i = -1;
        if (b) {
            for (int i = 0; i < 3; ++i) {
                this.f[i] = aavz.f(aawc.d[i]);
            }
            this.g = aavz.f("uColorConversion");
            this.e = -1;
        }
        else {
            this.e = aavz.f("uTexture");
            this.g = -1;
        }
        this.h = aavz.f("uCropRight");
        this.k = new aavx(aavz);
    }
    
    public static String e(final aanx aanx, final boolean b) {
        String s;
        if (!b) {
            s = "";
        }
        else {
            s = "#define ENABLE_YUV\n";
        }
        return s.concat(aanx.d(2131951668));
    }
    
    public static String f(final aanx aanx) {
        return aanx.d(2131951669);
    }
    
    public final void a() {
        final aavx k = this.k;
        final int[] l = k.l;
        if (l[0] != 0) {
            GLES20.glDeleteTextures(1, l, 0);
            final Boolean a = aatt.a;
            k.l[0] = 0;
        }
    }
    
    public final void b(final boolean b, final byte[] array, final long n, final long n2) {
        this.k.b(b, array, n, n2);
    }
    
    public final void c(final aaty aaty) {
        Label_0312: {
            if (aaty.j() == 2) {
                for (int i = 0; i < 3; ++i) {
                    GLES20.glUniform1i(this.f[i], i);
                }
                GLES20.glUniform1f(this.h, aaty.a());
                final aauo d = aaty.d();
                final int b = aaty.b();
                Label_0129: {
                    if (this.i == b) {
                        if (d != null) {
                            final aauo j = this.j;
                            if (j == null) {
                                break Label_0129;
                            }
                            if (!d.a.equals((Object)j.a)) {
                                break Label_0129;
                            }
                        }
                        else if (this.j != null) {
                            break Label_0129;
                        }
                        this.k.d(aaty, b, d, false);
                        break Label_0312;
                    }
                }
                float[] array = aawc.b;
                if (b != 1) {
                    if (b == 3) {
                        array = aawc.c;
                    }
                }
                else {
                    array = aawc.a;
                }
                GLES20.glUniformMatrix3fv(this.g, 1, false, array, 0);
                this.i = b;
                this.j = d;
                this.k.d(aaty, b, d, true);
            }
            else {
                GLES20.glUniform1i(this.e, 0);
                GLES20.glUniform1f(this.h, 1.0f);
                final aavx k = this.k;
                k.i = aaty.c();
                if ((k.e == 0 || k.k) && (k.n == 2 || k.o != k.p)) {
                    k.e(null);
                }
                GLES20.glUniform1f(k.d, (float)k.e);
                k.k = false;
                k.a(0, k.a);
                k.a(2, k.c);
                k.a(1, k.b);
                k.c(aaty);
            }
        }
        final Boolean a = aatt.a;
    }
    
    public final void d(final int n, final int o, final int m, final int p4) {
        final aavx k = this.k;
        if (k.n != n || k.o != o || k.p != p4) {
            k.k = true;
        }
        k.n = n;
        k.o = o;
        k.p = p4;
        k.m = m;
    }
}
