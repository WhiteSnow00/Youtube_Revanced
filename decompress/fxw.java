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
public final class fxw
{
    public Set a;
    public boolean b;
    private final atke c;
    private Set d;
    private Set e;
    
    public fxw(final atke c) {
        this.b = false;
        this.c = c;
    }
    
    public final void a() {
        final Iterator iterator = ((Set)this.c.a()).iterator();
        while (iterator.hasNext()) {
            this.g((fxv)iterator.next());
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
            ((fxv)iterator.next()).a();
        }
    }
    
    public final void c(final Configuration configuration) {
        final Set e = this.e;
        if (e == null) {
            return;
        }
        final Iterator iterator = e.iterator();
        while (iterator.hasNext()) {
            ((fxu)iterator.next()).j(configuration);
        }
    }
    
    public final void d() {
        final Set a = this.a;
        if (a != null) {
            final Iterator iterator = a.iterator();
            while (iterator.hasNext()) {
                final ksi ksi = (ksi)((pvh)iterator.next()).a;
                final fxb d = ksi.d;
                if (d != null) {
                    ksi.a.f((fxg)d);
                }
                final fxb e = ksi.e;
                if (e != null) {
                    ksi.a.f((fxg)e);
                }
                final fxb f = ksi.f;
                if (f != null) {
                    ksi.a.f((fxg)f);
                }
                final fxb g = ksi.g;
                if (g != null) {
                    ksi.a.f((fxg)g);
                }
                final fxb h = ksi.h;
                if (h != null) {
                    ksi.a.f((fxg)h);
                }
                ksi.a.f((fxg)ksi.b);
                final gle c = ksi.c;
                if (c != null) {
                    ksi.a.f((fxg)c);
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
            ((fxv)iterator.next()).c();
        }
    }
    
    public final void f(final fxu fxu) {
        if (this.e == null) {
            this.e = Collections.newSetFromMap((Map<Object, Boolean>)new ConcurrentHashMap());
        }
        this.e.add(fxu);
    }
    
    public final void g(final fxv fxv) {
        if (this.d == null) {
            this.d = Collections.newSetFromMap((Map<Object, Boolean>)new ConcurrentHashMap());
        }
        this.d.add(fxv);
    }
    
    public final void h(final fxu fxu) {
        final Set e = this.e;
        if (e != null) {
            e.remove(fxu);
        }
    }
    
    public final void i(final fxv fxv) {
        final Set d = this.d;
        if (d != null) {
            d.remove(fxv);
        }
    }
}
