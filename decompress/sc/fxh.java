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
public final class fxh
{
    private static final Comparator b;
    final Runnable a;
    private final Handler c;
    private final List d;
    private final Runnable e;
    private fxg f;
    private final elx g;
    
    static {
        b = (Comparator)new mm(9);
    }
    
    public fxh(final Handler c, final elx g, final byte[] array) {
        final ArrayList d = new ArrayList();
        this.c = c;
        this.g = g;
        this.d = d;
        this.e = (Runnable)new eym(this, 14);
        this.a = (Runnable)new eym(this, 15);
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
            final fxg f = this.f;
            if (f != null && !f.f()) {
                this.g.i((fxf)this.f);
                this.f = null;
            }
        }
    }
    
    public final void b(final fxg fxg) {
        synchronized (this) {
            if (!this.g(fxg.getClass())) {
                this.d.add(fxg);
                final List d = this.d;
                final Comparator b = fxh.b;
                Collections.sort((List<Object>)d, b);
                final fxg f = this.f;
                if (f == null || b.compare(f, fxg) > 0) {
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
            for (fxg a : this.d) {
                if (a.f()) {
                    final fxg f = this.f;
                    if (f != null && f != a) {
                        this.g.i((fxf)f);
                    }
                    this.f = a;
                    final elx g = this.g;
                    final Object a2 = g.a;
                    if (a2 == null) {
                        g.i((fxf)null);
                        ((fxf)a).e();
                        g.a = a;
                        monitorexit(this);
                        return;
                    }
                    if (((fxf)a).c() >= ((fxf)a2).c()) {
                        fxf fxf;
                        if (a == (fxf = (fxf)a2)) {
                            fxf = null;
                        }
                        g.i(fxf);
                        ((fxf)a).e();
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
    
    public final void f(final fxg fxg) {
        synchronized (this) {
            if (this.d.remove(fxg) && this.f == fxg) {
                this.g.i((fxf)fxg);
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
