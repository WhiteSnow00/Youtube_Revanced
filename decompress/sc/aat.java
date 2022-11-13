import com.google.common.util.concurrent.ListenableFuture;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aat implements aab
{
    public final Object a;
    private final int b;
    
    public aat(final sc a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public aat(final ye a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public final ListenableFuture a(final Object o) {
        if (this.b != 0) {
            return sg.d(((sc)this.a).a(o));
        }
        final Object a = this.a;
        final Void void1 = (Void)o;
        final aax a2 = aax.a;
        return ((ye)a).g;
    }
}
