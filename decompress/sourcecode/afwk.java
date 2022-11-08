import java.nio.ByteBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afwk implements afum
{
    private static final byte[] a;
    private final agbk b;
    private final afum c;
    
    static {
        a = new byte[0];
    }
    
    public afwk(final agbk b, final afum c) {
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final byte[] a(byte[] a, final byte[] array) {
        final byte[] byteArray = afvl.c(this.b).toByteArray();
        final byte[] a2 = this.c.a(byteArray, afwk.a);
        a = ((afum)afvl.g(this.b.b, byteArray, afum.class)).a(a, array);
        final int length = a2.length;
        return ByteBuffer.allocate(length + 4 + a.length).putInt(length).put(a2).put(a).array();
    }
}
