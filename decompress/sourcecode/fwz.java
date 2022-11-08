import java.util.Iterator;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;
import android.os.Handler;
import java.util.Comparator;

// 
// Decompiled by Procyon v0.6.0
// 

@Deprecated
public final class fwz
{
    private static final Comparator b;
    final Runnable a;
    private final Handler c;
    private final List d;
    private final Runnable e;
    private fwy f;
    private final elw g;
    
    static {
        b = (Comparator)new mm(9);
    }
    
    public fwz(final Handler c, final elw g, final byte[] array) {
        final ArrayList d = new ArrayList();
        this.c = c;
        this.g = g;
        this.d = d;
        this.e = new exu(this, 15);
        this.a = new exu(this, 16);
    }
    
    private final void h(final boolean b) {
        if (b) {
            this.c.post(this.e);
            return;
        }
        this.c.post(this.a);
        this.c.removeCallbacks(this.e);
        this.c.postDelayed(this.e, 500L);
    }
    
    public final void a() {
        synchronized (this) {
            this.g.getClass();
            final fwy f = this.f;
            if (f != null && !f.f()) {
                this.g.i((fwx)this.f);
                this.f = null;
            }
        }
    }
    
    public final void b(final fwy fwy) {
        synchronized (this) {
            if (!this.g(fwy.getClass())) {
                this.d.add(fwy);
                final List d = this.d;
                final Comparator b = fwz.b;
                Collections.sort((List<Object>)d, b);
                final fwy f = this.f;
                if (f == null || b.compare(f, fwy) > 0) {
                    this.h(true);
                }
            }
        }
    }
    
    public final void c() {
        this.h(false);
    }
    
    public final void d() {
        this.h(true);
    }
    
    public final void e() {
        monitorenter(this);
        try {
            this.a();
            this.g.getClass();
            for (fwy a : this.d) {
                if (a.f()) {
                    final fwy f = this.f;
                    if (f != null && f != a) {
                        this.g.i((fwx)f);
                    }
                    this.f = a;
                    final elw g = this.g;
                    final Object a2 = g.a;
                    if (a2 == null) {
                        g.i((fwx)null);
                        ((fwx)a).e();
                        g.a = a;
                        monitorexit(this);
                        return;
                    }
                    if (((fwx)a).c() >= ((fwx)a2).c()) {
                        fwx fwx;
                        if (a == (fwx = (fwx)a2)) {
                            fwx = null;
                        }
                        g.i(fwx);
                        ((fwx)a).e();
                        g.a = a;
                        monitorexit(this);
                        return;
                    }
                    monitorexit(this);
                    return;
                }
            }
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    public final void f(final fwy fwy) {
        synchronized (this) {
            if (this.d.remove(fwy) && this.f == fwy) {
                this.g.i((fwx)fwy);
                this.f = null;
                this.h(true);
            }
        }
    }
    
    public final boolean g(final Class clazz) {
        monitorenter(this);
        try {
            final Iterator iterator = this.d.iterator();
            while (iterator.hasNext()) {
                if (clazz.isInstance(iterator.next())) {
                    monitorexit(this);
                    return true;
                }
            }
            monitorexit(this);
            return false;
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
}
