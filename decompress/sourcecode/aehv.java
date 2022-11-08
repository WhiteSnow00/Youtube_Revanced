import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aehv implements afry
{
    public final List a;
    public final int b;
    public final Executor c;
    public int d;
    private final aext e;
    private final afry f;
    
    public aehv(final List a, final aext e, final Executor c) {
        this.d = -1;
        this.a = a;
        this.b = a.size();
        this.e = e;
        this.c = c;
        this.f = aesm.d((afry)this);
    }
    
    public final ListenableFuture a(final Object o) {
        if (this.e.a(o)) {
            return afva.m(o);
        }
        return this.b();
    }
    
    public final ListenableFuture b() {
        final int d = this.d + 1;
        this.d = d;
        if (d < this.b) {
            return afrp.f((ListenableFuture)this.a.get(d), this.f, this.c);
        }
        return afva.m((Object)null);
    }
}
