import java.io.Closeable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aenr implements Closeable
{
    public static final aenr a;
    private final int b;
    
    static {
        a = new aenr(1);
    }
    
    public aenr(final int b) {
        this.b = b;
    }
    
    @Override
    public final void close() {
        if (this.b != 0) {
            return;
        }
        qdt.h();
        aens.a = false;
    }
}
