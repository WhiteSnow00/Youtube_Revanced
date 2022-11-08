import android.app.PendingIntent;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adyz
{
    public final int a;
    public final int b;
    public boolean c;
    private final PendingIntent d;
    private final PendingIntent e;
    
    public adyz(final int a, final int b, final PendingIntent d, final PendingIntent e) {
        this.c = false;
        this.a = a;
        this.b = b;
        this.d = d;
        this.e = e;
    }
    
    public final PendingIntent a(final adze adze) {
        final int a = adze.a;
        if (a != 0) {
            if (a == 1) {
                final PendingIntent d = this.d;
                if (d != null) {
                    return d;
                }
            }
            return null;
        }
        final PendingIntent e = this.e;
        if (e != null) {
            return e;
        }
        return null;
    }
}
