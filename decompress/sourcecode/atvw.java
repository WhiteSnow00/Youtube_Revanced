import android.opengl.GLES20;
import android.app.ActivityManager;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atvw
{
    public final int a;
    
    private atvw() {
        this.a = 1;
    }
    
    public atvw(final int a) {
        this.a = a;
    }
    
    public atvw(final int a, final byte[] array) {
        nwn.a(a >= 0, "Margins can not be negative");
        this.a = a;
    }
    
    public atvw(final int a, final byte[] array, final byte[] array2) {
        this.a = a;
    }
    
    public atvw(final int a, final char[] array) {
        this.a = a;
    }
    
    public atvw(final Context context, final ahqj ahqj) {
        final boolean lowRamDevice = ((ActivityManager)context.getSystemService("activity")).isLowRamDevice();
        float n;
        if (lowRamDevice) {
            n = ahqj.c;
        }
        else {
            n = ahqj.b;
        }
        float n2 = n;
        if (n <= 0.0f) {
            if (!lowRamDevice) {
                n2 = 4.0f;
            }
            else {
                n2 = 2.5f;
            }
        }
        final dhc dhc = new dhc(context);
        dhc.e = 0;
        dhc.a(0.0f);
        dhc.b(n2);
        this.a = dhc.c().c;
    }
    
    public atvw(String glGetShaderInfoLog, int glCreateShader) {
        boolean b = true;
        final int[] array = { 0 };
        glCreateShader = GLES20.glCreateShader(glCreateShader);
        this.a = glCreateShader;
        if (glCreateShader == 0) {
            b = false;
        }
        agot.D(b);
        GLES20.glShaderSource(glCreateShader, glGetShaderInfoLog);
        GLES20.glCompileShader(glCreateShader);
        GLES20.glGetShaderiv(glCreateShader, 35713, array, 0);
        if (array[0] != 0) {
            return;
        }
        glGetShaderInfoLog = GLES20.glGetShaderInfoLog(glCreateShader);
        GLES20.glDeleteShader(glCreateShader);
        throw new wfq(glGetShaderInfoLog);
    }
    
    public atvw(final byte[] array) {
        this.a = 6;
    }
    
    public atvw(final byte[] array, final byte[] array2) {
        this.a = 1;
    }
    
    public static atvw e() {
        return new atvw();
    }
    
    public final boolean a() {
        return (this.a & 0x2) != 0x0;
    }
    
    public final void b() {
        GLES20.glDeleteShader(this.a);
    }
    
    public final boolean c() {
        final int a = this.a;
        return a == 1 || a == 2;
    }
    
    public final boolean d() {
        return this.a == 2;
    }
    
    public final int f(final int n) {
        return Math.min(this.a, n);
    }
}
