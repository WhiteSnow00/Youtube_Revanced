import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abls implements thj
{
    public FormatStreamModel a;
    private final thg b;
    private Throwable c;
    private ablr d;
    
    public abls(final thg b) {
        this.b = b;
    }
    
    public final int a() {
        synchronized (this) {
            return this.b().b.get();
        }
    }
    
    public final ablr b() {
        synchronized (this) {
            final ablr d = this.d;
            if (d != null) {
                return d;
            }
            throw new RuntimeException("PlaybackMonitor queried outside playback sequence", this.c);
        }
    }
    
    public final String c() {
        return this.b().a;
    }
    
    public final void d() {
        synchronized (this) {
            final ablr d = this.d;
            if (d != null) {
                this.b.m((Object)d);
                this.d = null;
                this.c = new Throwable("currentPlaybackSequenceMonitor became null here");
            }
        }
    }
    
    public final void f(final boolean g) {
        this.b().g = g;
    }
    
    public final void g(final boolean f) {
        this.b().f = f;
    }
    
    public final void h(final boolean e) {
        this.b().e = e;
    }
    
    public final void i(final String a) {
        this.b().a = a;
    }
    
    public final void j() {
        synchronized (this) {
            this.d();
            this.c = null;
            final ablr d = new ablr();
            this.d = d;
            this.b.g((Object)d);
        }
    }
    
    public final boolean k() {
        final ablr d = this.d;
        return d != null && d.g;
    }
    
    public final boolean l() {
        synchronized (this) {
            final ablr b = this.b();
            return b.e || b.a();
        }
    }
    
    public final boolean m() {
        synchronized (this) {
            final ablr d = this.d;
            monitorexit(this);
            return d != null;
        }
    }
    
    public final Class[] mr(final Class clazz, final Object o, final int n) {
        Class[] array;
        if (n != -1) {
            if (n != 0) {
                final StringBuilder sb = new StringBuilder("unsupported op code: ");
                sb.append(n);
                throw new IllegalStateException(sb.toString());
            }
            this.a = ((yre)o).f();
            array = null;
        }
        else {
            array = new Class[] { yre.class };
        }
        return array;
    }
    
    public final boolean n() {
        if (this.m()) {
            final String c = this.c();
            if (c != null && !c.isEmpty()) {
                return true;
            }
        }
        return false;
    }
    
    public final boolean o() {
        synchronized (this) {
            return this.b().a();
        }
    }
}
