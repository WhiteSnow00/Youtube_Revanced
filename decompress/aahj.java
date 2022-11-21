import java.util.concurrent.CopyOnWriteArraySet;
import android.os.IBinder;
import android.content.Intent;
import java.util.Iterator;
import java.util.HashMap;
import java.util.Set;
import java.util.Map;
import java.util.concurrent.Executor;
import android.app.Service;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class aahj extends Service implements aaho
{
    public Executor a;
    public final Map b;
    public boolean c;
    public Set d;
    public aahp e;
    public aaij f;
    protected boolean g;
    private aahi h;
    
    public aahj() {
        this.b = new HashMap();
        this.g = false;
    }
    
    protected abstract aahp a(final aaho p0);
    
    protected void b() {
        throw null;
    }
    
    public void c(final boolean b, final boolean b2) {
        throw null;
    }
    
    public void d(final Map map) {
        throw null;
    }
    
    public void e(final aadf aadf) {
        throw null;
    }
    
    public final void f(final aadf aadf) {
        this.b.put(aadf.a, aadf);
        final Iterator iterator = this.d.iterator();
        while (iterator.hasNext()) {
            ((aahb)iterator.next()).d(aadf);
        }
    }
    
    public void g(final aadf aadf, final boolean b) {
        throw null;
    }
    
    public void h(final aadf aadf) {
        throw null;
    }
    
    public final void i(final aadf aadf) {
        this.b.put(aadf.a, aadf);
        final Iterator iterator = this.d.iterator();
        while (iterator.hasNext()) {
            ((aahb)iterator.next()).h(aadf);
        }
    }
    
    public final void j(final aadf aadf) {
        this.b.put(aadf.a, aadf);
        final Iterator iterator = this.d.iterator();
        while (iterator.hasNext()) {
            ((aahb)iterator.next()).i(aadf);
        }
    }
    
    public final void k(final aadf aadf) {
        this.b.put(aadf.a, aadf);
        final Iterator iterator = this.d.iterator();
        while (iterator.hasNext()) {
            ((aahb)iterator.next()).j(aadf);
        }
    }
    
    public void l(final aadf aadf, final amxs amxs, final aacn aacn) {
        throw null;
    }
    
    public final void m(final aadf aadf) {
        this.b.put(aadf.a, aadf);
        final Iterator iterator = this.d.iterator();
        while (iterator.hasNext()) {
            ((aahb)iterator.next()).l(aadf);
        }
    }
    
    protected abstract void n();
    
    public final void o(final aahb aahb) {
        final Set d = this.d;
        aahb.getClass();
        if (d.add(aahb) && this.c) {
            aahb.g();
        }
    }
    
    public final IBinder onBind(final Intent intent) {
        return (IBinder)this.h;
    }
    
    public void onCreate() {
        super.onCreate();
        this.a = new aahh(this);
        if (this.e == null) {
            final aaij f = new aaij(this, this.a);
            this.f = f;
            this.e = this.a(f);
        }
        this.d = new CopyOnWriteArraySet();
        this.h = new aahi(this);
        this.n();
    }
    
    public void onDestroy() {
        this.e.g();
        super.onDestroy();
    }
    
    public int onStartCommand(final Intent intent, final int n, final int n2) {
        if (intent != null) {
            this.e.f(intent.getAction(), intent.getExtras());
        }
        this.g = false;
        return 1;
    }
}
