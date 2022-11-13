import java.util.concurrent.ScheduledExecutorService;
import java.net.SocketAddress;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

final class arzr implements asah
{
    public final Executor a;
    private final asah b;
    
    public arzr(final asah b, final Executor a) {
        b.getClass();
        this.b = b;
        a.getClass();
        this.a = a;
    }
    
    public final asan a(final SocketAddress socketAddress, final asag asag, final artz artz) {
        return (asan)new arzq(this, this.b.a(socketAddress, asag, artz), asag.a);
    }
    
    public final ScheduledExecutorService b() {
        return this.b.b();
    }
    
    public final void close() {
        this.b.close();
    }
}
