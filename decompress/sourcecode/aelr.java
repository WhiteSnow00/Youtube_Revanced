import java.io.Closeable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aelr implements Closeable
{
    public static final aelr a;
    private final /* synthetic */ int b;
    
    static {
        a = new aelr(1);
    }
    
    public aelr(final int b) {
        this.b = b;
    }
    
    @Override
    public final void close() {
        if (this.b != 0) {
            return;
        }
        qcj.s();
        aels.a = false;
    }
}
