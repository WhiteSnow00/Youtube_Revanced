import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aekz implements aeky
{
    private final /* synthetic */ int a;
    private final Object b;
    
    public aekz(final cna b, final int a) {
        this.a = a;
        this.b = b;
    }
    
    public aekz(final cto b, final int a) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final ListenableFuture a(final String s, final List list) {
        if (this.a != 0) {
            return ((cto)this.b).b();
        }
        return agnj.L((ListenableFuture)((cnq)((cna)this.b).d(s, 1, list)).c);
    }
    
    @Override
    public final ListenableFuture b(final eg eg) {
        if (this.a != 0) {
            return ((cto)this.b).a();
        }
        return agnj.L((ListenableFuture)((cnq)((cna)this.b).g(eg)).c);
    }
}
