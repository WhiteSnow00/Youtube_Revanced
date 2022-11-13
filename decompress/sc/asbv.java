import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// 
// Decompiled by Procyon v0.6.0
// 

final class asbv implements asfo
{
    public asbv() {
    }
    
    @Override
    public final /* bridge */ Object a() {
        return Executors.newCachedThreadPool(asby.k("grpc-default-executor-%d"));
    }
    
    @Override
    public final /* bridge */ void b(final Object o) {
        ((ExecutorService)o).shutdown();
    }
    
    @Override
    public final String toString() {
        return "grpc-default-executor";
    }
}
