import java.util.Map;
import java.util.Collections;
import j$.util.concurrent.ConcurrentHashMap;
import android.content.res.Configuration;
import java.util.Iterator;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

@Deprecated
public final class fxo
{
    public Set a;
    public boolean b;
    private final atjj c;
    private Set d;
    private Set e;
    
    public fxo(final atjj c) {
        this.b = false;
        this.c = c;
    }
    
    public final void a() {
        final Iterator iterator = ((Set)this.c.a()).iterator();
        while (iterator.hasNext()) {
            this.g((fxn)iterator.next());
        }
    }
    
    public final void b() {
        this.b = false;
        final Set d = this.d;
        if (d == null) {
            return;
        }
        final Iterator iterator = d.iterator();
        while (iterator.hasNext()) {
            ((fxn)iterator.next()).a();
        }
    }
    
    public final void c(final Configuration configuration) {
        final Set e = this.e;
        if (e == null) {
            return;
        }
        final Iterator iterator = e.iterator();
        while (iterator.hasNext()) {
            ((fxm)iterator.next()).j(configuration);
        }
    }
    
    public final void d() {
        final Set a = this.a;
        if (a != null) {
            final Iterator iterator = a.iterator();
            while (iterator.hasNext()) {
                final krh krh = (krh)((qpt)iterator.next()).a;
                final fwt d = krh.d;
                if (d != null) {
                    krh.a.f((fwy)d);
                }
                final fwt e = krh.e;
                if (e != null) {
                    krh.a.f((fwy)e);
                }
                final fwt f = krh.f;
                if (f != null) {
                    krh.a.f((fwy)f);
                }
                final fwt g = krh.g;
                if (g != null) {
                    krh.a.f((fwy)g);
                }
                final fwt h = krh.h;
                if (h != null) {
                    krh.a.f((fwy)h);
                }
                krh.a.f((fwy)krh.b);
                final gkw c = krh.c;
                if (c != null) {
                    krh.a.f((fwy)c);
                }
            }
        }
        this.a = null;
        this.e = null;
        this.d = null;
    }
    
    public final void e() {
        this.b = true;
        final Set d = this.d;
        if (d == null) {
            return;
        }
        final Iterator iterator = d.iterator();
        while (iterator.hasNext()) {
            ((fxn)iterator.next()).c();
        }
    }
    
    public final void f(final fxm fxm) {
        if (this.e == null) {
            this.e = Collections.newSetFromMap((Map<Object, Boolean>)new ConcurrentHashMap());
        }
        this.e.add(fxm);
    }
    
    public final void g(final fxn fxn) {
        if (this.d == null) {
            this.d = Collections.newSetFromMap((Map<Object, Boolean>)new ConcurrentHashMap());
        }
        this.d.add(fxn);
    }
    
    public final void h(final fxm fxm) {
        final Set e = this.e;
        if (e != null) {
            e.remove(fxm);
        }
    }
    
    public final void i(final fxn fxn) {
        final Set d = this.d;
        if (d != null) {
            d.remove(fxn);
        }
    }
}
