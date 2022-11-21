import java.util.concurrent.Executor;
import com.google.common.util.concurrent.ListenableFuture;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aewx extends afwp
{
    private aewx(final ListenableFuture listenableFuture) {
        super(listenableFuture);
    }
    
    public static aewx d(final ListenableFuture listenableFuture) {
        aewx aewx;
        if (listenableFuture instanceof aewx) {
            aewx = (aewx)listenableFuture;
        }
        else {
            aewx = new aewx(listenableFuture);
        }
        return aewx;
    }
    
    public final aewx b(final Class clazz, final afax afax, final Executor executor) {
        return new aewx(agra.S(super.b, clazz, afax, executor));
    }
    
    public final aewx c(final Class clazz, final afvq afvq, final Executor executor) {
        return new aewx(agra.T(super.b, clazz, afvq, executor));
    }
    
    public final aewx g(final afax afax, final Executor executor) {
        return new aewx(agra.X(super.b, afax, executor));
    }
    
    public final aewx h(final afvq afvq, final Executor executor) {
        return new aewx(agra.Y(super.b, afvq, executor));
    }
}
