import java.util.Iterator;
import java.util.Collection;
import android.os.Looper;
import java.util.Collections;
import java.util.HashSet;
import com.google.android.gms.cast.SessionState;
import android.os.Handler;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mko
{
    public static final mnb a;
    public final Set b;
    public final Handler c;
    public final Runnable d;
    public int e;
    public mjq f;
    public acb g;
    public SessionState h;
    
    static {
        a = new mnb("SessionTransController");
    }
    
    public mko() {
        this.b = Collections.synchronizedSet(new HashSet<Object>());
        this.e = 0;
        this.c = new aeke(Looper.getMainLooper(), (byte[])null);
        this.d = new mkn(this, 0);
    }
    
    public final void a() {
        final mjq f = this.f;
        if (f != null) {
            final mis a = f.a();
            if (a != null) {
                a.d((mko)null);
            }
        }
    }
    
    public final void b(final int n) {
        final acb g = this.g;
        if (g != null) {
            g.b();
        }
        final Iterator iterator = new HashSet(this.b).iterator();
        while (iterator.hasNext()) {
            ((mlc)iterator.next()).a(this.e, n);
        }
        this.c();
    }
    
    public final void c() {
        final Handler c = this.c;
        final Runnable d = this.d;
        kgk.aL((Object)d);
        c.removeCallbacks(d);
        this.e = 0;
        this.h = null;
        this.a();
    }
}
