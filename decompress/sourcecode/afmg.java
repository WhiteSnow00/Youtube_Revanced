import java.io.Serializable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afmg extends afmh implements Serializable
{
    private static final long serialVersionUID = 0L;
    public final int a;
    
    public afmg(final int a) {
        this.a = a;
    }
    
    public final int a() {
        return this.a;
    }
    
    public final int b() {
        return 32;
    }
    
    public final boolean c(final afmh afmh) {
        return this.a == afmh.a();
    }
    
    public final byte[] d() {
        final int a = this.a;
        return new byte[] { (byte)a, (byte)(a >> 8), (byte)(a >> 16), (byte)(a >> 24) };
    }
}
