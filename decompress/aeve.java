import android.app.ActivityManager;
import android.util.DisplayMetrics;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aeve
{
    public final int a;
    public final int b;
    public final int c;
    
    public aeve(final int a, final int b, final int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public aeve(final int c, final int a, final int b, final byte[] array) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public aeve(final int b, final int c, final int a, final byte[] array, final byte[] array2) {
        this.b = b;
        this.c = c;
        this.a = a;
    }
    
    public aeve(final dhh dhh) {
        int e;
        if (dhh.a.isLowRamDevice()) {
            e = dhh.e >> 1;
        }
        else {
            e = dhh.e;
        }
        this.a = e;
        final ActivityManager a = dhh.a;
        float d = dhh.d;
        final int memoryClass = a.getMemoryClass();
        if (!a.isLowRamDevice()) {
            d = 0.4f;
        }
        final int round = Math.round(memoryClass * 1048576 * d);
        final int widthPixels = ((DisplayMetrics)dhh.f.a).widthPixels;
        final int heightPixels = ((DisplayMetrics)dhh.f.a).heightPixels;
        final float c = dhh.c;
        final float n = (float)(widthPixels * heightPixels * 4);
        final int round2 = Math.round(c * n);
        final int round3 = Math.round(n * dhh.b);
        final int n2 = round - e;
        if (round3 + round2 <= n2) {
            this.c = round3;
            this.b = round2;
            return;
        }
        final float c2 = dhh.c;
        final float b = dhh.b;
        final float n3 = n2 / (c2 + b);
        this.c = Math.round(b * n3);
        this.b = Math.round(n3 * dhh.c);
    }
    
    public final int a() {
        return this.b + this.a;
    }
    
    public final int b() {
        return this.c + this.a;
    }
}
