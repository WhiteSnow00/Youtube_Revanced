import android.opengl.GLES20;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aawh
{
    private final boolean a;
    private final int b;
    private final int c;
    private final int d;
    
    public aawh(final aavz aavz, final boolean a) {
        this.a = a;
        int f;
        if (a) {
            this.b = aavz.f("uNoiseOffset");
            this.c = aavz.f("uNoiseScale");
            f = aavz.f("uNoiseSeed");
        }
        else {
            f = -1;
            this.b = -1;
            this.c = -1;
        }
        this.d = f;
    }
    
    public static String b(final aanx aanx, final boolean b) {
        String s;
        if (!b) {
            s = "";
        }
        else {
            s = "#define ENABLE_WHITE_NOISE\n";
        }
        return s.concat(aanx.d(2131951676));
    }
    
    public final void a(final float n, final float n2, final float n3) {
        if (this.a) {
            GLES20.glUniform1f(this.b, n3);
            GLES20.glUniform1f(this.c, n2);
            GLES20.glUniform1f(this.d, n);
            final Boolean a = aatt.a;
        }
    }
}
