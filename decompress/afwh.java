import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afwh implements afvp
{
    final Callable a;
    
    public afwh(final Callable a) {
        this.a = a;
    }
    
    @Override
    public final ListenableFuture a() {
        return afxr.l(this.a.call());
    }
    
    @Override
    public final String toString() {
        return this.a.toString();
    }
}
