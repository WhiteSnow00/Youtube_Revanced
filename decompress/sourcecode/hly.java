import java.util.function.Consumer;
import com.google.protos.youtube.api.innertube.ReelNonVideoContentRendererOuterClass;
import j$.util.Optional;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hly implements hlx
{
    public final arhr a;
    public final afts b;
    public Optional c;
    public Optional d;
    public final Object e;
    
    public hly(final arhr a, final afts b) {
        this.c = Optional.empty();
        this.d = Optional.empty();
        this.e = new Object();
        this.a = a;
        this.b = b;
    }
    
    public static Optional d(final Optional optional) {
        if (optional.isPresent()) {
            anss anss;
            if ((anss = ((hml)optional.get()).a().b) == null) {
                anss = anss.a;
            }
            if (((agzd)anss).rs((agyr)ReelNonVideoContentRendererOuterClass.reelNonVideoContentRenderer)) {
                return Optional.of((Object)((agzd)anss).rr((agyr)ReelNonVideoContentRendererOuterClass.reelNonVideoContentRenderer));
            }
        }
        return Optional.empty();
    }
    
    public final void a(final String s, final long n) {
        synchronized (this.e) {
            if (this.d.isPresent()) {
                return;
            }
            monitorexit(this.e);
            d(((hmk)this.a.a()).e()).ifPresent((Consumer)new rpm(this, s, n, 1));
        }
    }
    
    public final void b(final hml hml) {
        final Optional d = d(Optional.of((Object)hml));
        synchronized (this.e) {
            d.ifPresent((Consumer)new fuz(this, hml, 13));
            this.d = Optional.empty();
        }
    }
    
    public final void c(final eul eul) {
        this.c = Optional.of((Object)eul);
    }
}
