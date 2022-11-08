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

public abstract class aadq extends Service implements aadv
{
    public Executor a;
    public final Map b;
    public boolean c;
    public Set d;
    public aadw e;
    public aaep f;
    protected boolean g;
    private aadp h;
    
    public aadq() {
        this.b = new HashMap();
        this.g = false;
    }
    
    protected abstract aadw a(final aadv p0);
    
    protected void b() {
        throw null;
    }
    
    public void c(final boolean b, final boolean b2) {
        throw null;
    }
    
    public void d(final Map map) {
        throw null;
    }
    
    public void e(final zzo zzo) {
        throw null;
    }
    
    public final void f(final zzo zzo) {
        this.b.put(zzo.a, zzo);
        final Iterator iterator = this.d.iterator();
        while (iterator.hasNext()) {
            ((aadi)iterator.next()).d(zzo);
        }
    }
    
    public void g(final zzo zzo, final boolean b) {
        throw null;
    }
    
    public void h(final zzo zzo) {
        throw null;
    }
    
    public final void i(final zzo zzo) {
        this.b.put(zzo.a, zzo);
        final Iterator iterator = this.d.iterator();
        while (iterator.hasNext()) {
            ((aadi)iterator.next()).h(zzo);
        }
    }
    
    public final void j(final zzo zzo) {
        this.b.put(zzo.a, zzo);
        final Iterator iterator = this.d.iterator();
        while (iterator.hasNext()) {
            ((aadi)iterator.next()).i(zzo);
        }
    }
    
    public final void k(final zzo zzo) {
        this.b.put(zzo.a, zzo);
        final Iterator iterator = this.d.iterator();
        while (iterator.hasNext()) {
            ((aadi)iterator.next()).j(zzo);
        }
    }
    
    public void l(final zzo zzo, final amtj amtj, final zyw zyw) {
        throw null;
    }
    
    public final void m(final zzo zzo) {
        this.b.put(zzo.a, zzo);
        final Iterator iterator = this.d.iterator();
        while (iterator.hasNext()) {
            ((aadi)iterator.next()).l(zzo);
        }
    }
    
    protected abstract void n();
    
    public final void o(final aadi aadi) {
        final Set d = this.d;
        aadi.getClass();
        if (d.add(aadi) && this.c) {
            aadi.g();
        }
    }
    
    public final IBinder onBind(final Intent intent) {
        return (IBinder)this.h;
    }
    
    public void onCreate() {
        super.onCreate();
        this.a = (Executor)new aado(this);
        if (this.e == null) {
            final aaep f = new aaep((aadv)this, this.a);
            this.f = f;
            this.e = this.a((aadv)f);
        }
        this.d = new CopyOnWriteArraySet();
        this.h = new aadp(this);
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
