import java.io.File;
import java.util.concurrent.Executor;
import java.util.concurrent.CancellationException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adea implements asif
{
    final acc a;
    
    public adea(final acc a) {
        this.a = a;
    }
    
    @Override
    public final void b(final Throwable t) {
        if (t instanceof CancellationException) {
            this.a.b();
            return;
        }
        this.a.d(t);
    }
    
    @Override
    public final void d(final asir asir) {
        this.a.a((Runnable)new adap(asir, 5), (Executor)afum.a);
    }
    
    @Override
    public final /* bridge */ void ts(Object o) {
        final Integer n = (Integer)o;
        try {
            o = new File("/sys/devices/system/cpu/");
            final File[] listFiles = ((File)o).listFiles();
            if (listFiles == null) {
                this.a.c((Object)afeq.q());
                return;
            }
            this.a.c((Object)adeb.f(listFiles));
        }
        catch (final Exception ex) {
            this.a.c((Object)afeq.q());
        }
    }
}
