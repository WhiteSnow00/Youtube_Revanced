import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class atfx implements Runnable
{
    final /* synthetic */ atfy a;
    private final asjk b;
    private final Runnable c;
    
    public atfx(final atfy a, final asjk b, final Runnable c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final void run() {
        asjg.h(this.b, ((ashn)this.a).a(this.c));
    }
}
