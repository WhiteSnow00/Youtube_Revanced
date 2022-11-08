import android.app.Notification;
import android.app.NotificationManager;
import android.util.Pair;
import android.text.TextUtils;
import java.util.HashSet;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aaaa
{
    private final aaen a;
    private boolean b;
    private String c;
    private int d;
    private final Set e;
    private final auip f;
    
    public aaaa(final auip f, final aaen a, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.f = f;
        this.a = a;
        this.b = false;
        this.e = new HashSet();
    }
    
    private final void f() {
        this.a.e();
        this.b = false;
    }
    
    private final void g(final String s, final int n) {
        if (this.b && this.d == n && TextUtils.equals((CharSequence)s, (CharSequence)this.c)) {
            this.f();
        }
    }
    
    public final void a(final String s, final int n) {
        synchronized (this) {
            this.g(s, n);
            final Set e = this.e;
            final Integer value = n;
            e.remove(new Pair((Object)s, (Object)value));
            final auip f = this.f;
            synchronized (f.a) {
                ((Set)f.a).remove(new Pair((Object)s, (Object)value));
                monitorexit(f.a);
                ((NotificationManager)f.b).cancel(s, n);
            }
        }
    }
    
    public final void b() {
        synchronized (this) {
            this.f();
            this.e.clear();
            this.f.U();
        }
    }
    
    public final void c(final String s, final int n, final Notification notification) {
        synchronized (this) {
            this.g(s, n);
            this.f.V(s, n, notification);
        }
    }
    
    public final void d(final String s, final int n, final Notification notification) {
        synchronized (this) {
            this.e(s, n, notification, false);
        }
    }
    
    public final void e(final String c, final int d, final Notification notification, final boolean b) {
        synchronized (this) {
            if (this.a.p(notification)) {
                this.d = d;
                this.c = c;
                this.b = true;
                this.e.add(new Pair((Object)c, (Object)d));
                return;
            }
            trn.l("[Offline] ForegroundServiceNotifier: Failed to start foreground notification due to null binder.");
            if (!b) {
                this.f.V(c, d, notification);
            }
        }
    }
}
