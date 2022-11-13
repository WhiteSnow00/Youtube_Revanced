import android.content.Context;
import android.app.ActivityManager;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dhd
{
    public final ActivityManager a;
    public float b;
    public float c;
    public float d;
    public int e;
    public final cya f;
    
    public dhd(final Context context) {
        this.b = 2.0f;
        this.c = 1.0f;
        this.d = 0.33f;
        this.e = 4194304;
        final ActivityManager a = (ActivityManager)context.getSystemService("activity");
        this.a = a;
        this.f = new cya(context.getResources().getDisplayMetrics());
        if (a.isLowRamDevice()) {
            this.c = 0.0f;
        }
    }
    
    public final void a(final float c) {
        clm.i(c >= 0.0f, "Bitmap pool screens must be greater than or equal to 0");
        this.c = c;
    }
    
    public final void b(final float b) {
        clm.i(b >= 0.0f, "Memory cache screens must be greater than or equal to 0");
        this.b = b;
    }
    
    public final aetm c() {
        return new aetm(this);
    }
}
