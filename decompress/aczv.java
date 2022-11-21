import android.os.SystemClock;
import java.util.concurrent.TimeUnit;
import android.text.TextUtils;
import java.util.ArrayList;
import android.net.Uri;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aczv
{
    public long a;
    public final Object b;
    public Object c;
    
    aczv() {
        this((Uri)null);
    }
    
    public aczv(final Uri c) {
        this.c = c;
        this.b = new ymr();
    }
    
    public aczv(final oco b) {
        b.getClass();
        this.b = b;
        this.c = null;
        this.a = -1L;
    }
    
    public aczv(final yrr b) {
        this.c = null;
        this.b = b;
        this.a = -1000L;
    }
    
    public aczv(final byte[] array) {
        this.b = new ArrayList();
    }
    
    public final long a() {
        if (TextUtils.isEmpty((CharSequence)this.c)) {
            return -1L;
        }
        return TimeUnit.MILLISECONDS.toSeconds(((oco)this.b).c() - this.a);
    }
    
    public final void b() {
        this.c = null;
        this.a = -1L;
    }
    
    public final void c(final Object c, final String s) {
        synchronized (this) {
            final long elapsedRealtime = SystemClock.elapsedRealtime();
            if (this.c == c && elapsedRealtime - this.a < 1000L) {
                return;
            }
            ((yrr)this.b).p("lcdi", s);
            this.c = c;
            this.a = elapsedRealtime;
        }
    }
}
