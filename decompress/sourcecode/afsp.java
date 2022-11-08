import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afsp implements afrx
{
    final /* synthetic */ Callable a;
    
    public afsp(final Callable a) {
        this.a = a;
    }
    
    public final ListenableFuture a() {
        return afva.m(this.a.call());
    }
    
    @Override
    public final String toString() {
        return this.a.toString();
    }
}
