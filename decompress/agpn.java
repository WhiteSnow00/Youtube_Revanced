import java.nio.ByteBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class agpn
{
    public static agpn a;
    
    public static agpn d() {
        if (agpn.a == null) {
            agpn.a = (agpn)new agpp();
        }
        return agpn.a;
    }
    
    public abstract int a(final CharSequence p0);
    
    public abstract String b(final ByteBuffer p0, final int p1, final int p2);
    
    public abstract void c(final CharSequence p0, final ByteBuffer p1);
}
