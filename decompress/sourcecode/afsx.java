import java.util.concurrent.Future;
import com.google.common.util.concurrent.ListenableFuture;

// 
// Decompiled by Procyon v0.6.0
// 

public class afsx extends afsw
{
    public final ListenableFuture b;
    
    protected afsx(final ListenableFuture b) {
        b.getClass();
        this.b = b;
    }
    
    @Override
    protected final ListenableFuture ru() {
        return this.b;
    }
}
