import java.util.Arrays;

// 
// Decompiled by Procyon v0.6.0
// 

public final class duh implements dui
{
    public static final int a;
    private static final int b;
    private static final int c;
    private static final int d;
    private long e;
    private float[] f;
    private boolean g;
    
    static {
        egx.c();
        a = 9;
        b = 8;
        c = 6;
        d = 7;
    }
    
    public duh() {
        this.e = -1L;
    }
    
    private final byte f(final int n) {
        return (byte)(this.e >> n * 4 & 0xFL);
    }
    
    public final float b(int f) {
        f = this.f(f);
        if (f == 15) {
            return Float.NaN;
        }
        return this.f[f];
    }
    
    public final float c(int f) {
        if (this.e != -1L) {
            final byte f2 = this.f(f - 1);
            if (f2 != 15) {
                return this.f[f2];
            }
            if (this.g) {
                int n = 7;
                if (f != 2) {
                    if (f == 4) {
                        n = n;
                    }
                    else {
                        n = 6;
                    }
                }
                f = this.f(n);
                if (f != 15) {
                    return this.f[f];
                }
                if (this.f(8) != 15) {
                    return this.f[this.f(8)];
                }
            }
        }
        return 0.0f;
    }
    
    public final float d(int f) {
        f = this.f(f - 1);
        if (f == 15) {
            return Float.NaN;
        }
        return this.f[f];
    }
    
    public final void e(int f, final float n) {
        final int n2 = f - 1;
        final float b = this.b(n2);
        Label_0064: {
            if (!Float.isNaN(b) && !Float.isNaN(n)) {
                if (Math.abs(n - b) >= 1.0E-5f) {
                    break Label_0064;
                }
            }
            else {
                if (!Float.isNaN(b)) {
                    break Label_0064;
                }
                if (!Float.isNaN(n)) {
                    break Label_0064;
                }
            }
            return;
        }
        f = this.f(n2);
        final boolean n3 = epc.N(n);
        boolean g = false;
        if (n3) {
            this.e |= 15L << n2 * 4;
            this.f[f] = Float.NaN;
        }
        else if (f == 15) {
            if (this.f == null) {
                this.f = new float[] { Float.NaN, Float.NaN };
                f = 0;
            }
            else {
                f = 0;
                while (true) {
                    final float[] f2 = this.f;
                    final int length = f2.length;
                    if (f >= length) {
                        System.arraycopy(f2, 0, this.f = new float[Math.min(length + length, duh.a)], 0, length);
                        final float[] f3 = this.f;
                        Arrays.fill(f3, length, f3.length, Float.NaN);
                        f = (byte)length;
                        break;
                    }
                    if (epc.N(f2[f])) {
                        f = (byte)f;
                        break;
                    }
                    ++f;
                }
            }
            if (f >= duh.a) {
                throw new IllegalStateException("The newIndex for the array cannot be bigger than the amount of Yoga Edges.");
            }
            final int n4 = n2 * 4;
            this.e = ((this.e & ~(15L << n4)) | (long)f << n4);
            this.f[f] = n;
        }
        else {
            this.f[f] = n;
        }
        if ((~(int)(this.e >> 24) & 0xFFF) != 0x0) {
            g = true;
        }
        this.g = g;
    }
}
