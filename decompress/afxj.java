import java.util.concurrent.Callable;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutorService;

// 
// Decompiled by Procyon v0.6.0
// 

public interface afxj extends ExecutorService
{
    ListenableFuture j(final Runnable p0, final Object p1);
    
    ListenableFuture rC(final Runnable p0);
    
    ListenableFuture rz(final Callable p0);
}
