import android.os.SystemClock;

// 
// Decompiled by Procyon v0.6.0
// 

abstract class nct implements Runnable
{
    final long f;
    final long g;
    final boolean h;
    final /* synthetic */ ndb i;
    
    public nct(final ndb ndb) {
        this(ndb, true);
    }
    
    public nct(final ndb i, final boolean h) {
        this.i = i;
        this.f = System.currentTimeMillis();
        this.g = SystemClock.elapsedRealtime();
        this.h = h;
    }
    
    public abstract void a();
    
    protected void b() {
    }
    
    @Override
    public final void run() {
        if (this.i.d) {
            this.b();
            return;
        }
        try {
            this.a();
        }
        catch (final Exception ex) {
            this.i.a(ex, false, this.h);
            this.b();
        }
    }
}
