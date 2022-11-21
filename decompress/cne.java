import java.util.Collections;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class cne
{
    protected cne() {
    }
    
    public abstract cna a(final String p0);
    
    public abstract cna b(final List p0);
    
    public abstract ListenableFuture c(final String p0);
    
    public abstract cna d(final String p0, final int p1, final List p2);
    
    public abstract void e(final String p0);
    
    public abstract ListenableFuture f();
    
    public final cna g(final eg eg) {
        return this.b(Collections.singletonList(eg));
    }
    
    public abstract cna h(final String p0, final int p1, final eg p2);
    
    public final cna i(final String s, final int n, final eg eg) {
        return this.d(s, n, Collections.singletonList(eg));
    }
}
