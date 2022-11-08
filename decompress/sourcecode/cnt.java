import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cnt extends cfy
{
    private final Context c;
    
    public cnt(final Context c, final int n, final int n2) {
        super(n, n2);
        this.c = c;
    }
    
    public final void a(final cgl cgl) {
        if (super.b >= 10) {
            cgl.l(new Object[] { "reschedule_needed", 1 });
            return;
        }
        this.c.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
    }
}
