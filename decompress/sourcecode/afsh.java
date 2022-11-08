import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

final class afsh extends afsj
{
    final /* synthetic */ afsk a;
    private final afrx c;
    
    public afsh(final afsk a, final afrx c, final Executor executor) {
        this.a = a;
        super(a, executor);
        c.getClass();
        this.c = c;
    }
    
    public final String b() {
        return this.c.toString();
    }
}
