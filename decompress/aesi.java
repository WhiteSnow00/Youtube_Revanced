import java.util.Iterator;
import java.util.Map;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aesi
{
    private long a;
    private final long b;
    private final List c;
    
    public aesi() {
        this.b = TimeUnit.MILLISECONDS.convert(3L, TimeUnit.MINUTES);
        this.c = new ArrayList();
    }
    
    public final aesj a() {
        adme.U(this.a != 0L, "You must specify a minimum sync interval for all syncs.");
        final afgj h = afgm.h();
        for (final aesk aesk : this.c) {
            h.g(aesk.a, aesk);
        }
        return new aesj(this.a, this.b, h.c());
    }
    
    public final void b(final aesk aesk) {
        this.c.add(aesk);
    }
    
    public final void c(final long n, final TimeUnit timeUnit) {
        this.a = TimeUnit.MILLISECONDS.convert(n, timeUnit);
    }
}
