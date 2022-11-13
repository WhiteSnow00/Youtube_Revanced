import java.nio.ByteBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class agnv
{
    public static agnv a;
    
    public static agnv d() {
        if (agnv.a == null) {
            agnv.a = new agnx();
        }
        return agnv.a;
    }
    
    public abstract int a(final CharSequence p0);
    
    public abstract String b(final ByteBuffer p0, final int p1, final int p2);
    
    public abstract void c(final CharSequence p0, final ByteBuffer p1);
}
