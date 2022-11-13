import androidx.core.graphics.drawable.IconCompat;
import android.app.PendingIntent;
import android.os.Bundle;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afi
{
    final Bundle a;
    public final agq[] b;
    public boolean c;
    boolean d;
    @Deprecated
    public int e;
    public CharSequence f;
    public PendingIntent g;
    private IconCompat h;
    
    public afi(final int n, final CharSequence charSequence, final PendingIntent pendingIntent) {
        IconCompat e;
        if (n == 0) {
            e = null;
        }
        else {
            e = IconCompat.e(n);
        }
        this(e, charSequence, pendingIntent, new Bundle(), null);
    }
    
    public afi(final IconCompat h, final CharSequence charSequence, final PendingIntent g, final Bundle a, final agq[] b) {
        this.d = true;
        this.h = h;
        if (h != null && h.b() == 2) {
            this.e = h.a();
        }
        this.f = afq.c(charSequence);
        this.g = g;
        this.a = a;
        this.b = b;
        this.c = true;
        this.d = true;
    }
    
    public final IconCompat a() {
        if (this.h == null) {
            final int e = this.e;
            if (e != 0) {
                this.h = IconCompat.e(e);
            }
        }
        return this.h;
    }
}
