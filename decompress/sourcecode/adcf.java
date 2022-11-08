import com.google.common.util.concurrent.ListenableFuture;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adcf implements adcg
{
    public final ListenableFuture a(final adcb adcb) {
        return afva.l(new IllegalStateException("Unable to clear the value."));
    }
    
    public final ListenableFuture b(final adcb adcb, final adcn adcn) {
        return afva.l(new IllegalStateException("Unable to read the value from the disk."));
    }
    
    public final ListenableFuture c(final adcb adcb, final Object o, final adcm adcm) {
        return afva.l(new IllegalStateException("Unable to store the value in disk."));
    }
}
