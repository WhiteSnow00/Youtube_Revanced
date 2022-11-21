import java.io.Closeable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aepk implements Closeable
{
    public static final aepk a;
    private final int b;
    
    static {
        a = new aepk(1);
    }
    
    public aepk(final int b) {
        this.b = b;
    }
    
    @Override
    public final void close() {
        if (this.b != 0) {
            return;
        }
        qem.r();
        aepl.a = false;
    }
}
