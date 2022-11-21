import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class atjm implements Runnable
{
    final atjn a;
    private final asmv b;
    private final Runnable c;
    
    public atjm(final atjn a, final asmv b, final Runnable c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final void run() {
        asmr.h(this.b, ((asky)this.a).a(this.c));
    }
}
