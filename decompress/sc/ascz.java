import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

final class ascz extends arty
{
    final asdc a;
    
    public ascz(final asdc a) {
        this.a = a;
    }
    
    public final arua a(final arwo arwo, final artx artx) {
        final Executor d = this.a.c.d(artx);
        final asdf c = this.a.c;
        final xra u = c.U;
        ScheduledExecutorService b;
        if (c.D) {
            b = null;
        }
        else {
            b = this.a.c.j.b();
        }
        final asab asab = new asab(arwo, d, artx, u, b, this.a.c.E, null);
        asab.g = this.a.c.o;
        return asab;
    }
    
    public final String b() {
        return this.a.b;
    }
}
