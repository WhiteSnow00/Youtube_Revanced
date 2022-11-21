import java.nio.ByteBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agac implements afyf
{
    private static final byte[] a;
    private final agfd b;
    private final afyf c;
    
    static {
        a = new byte[0];
    }
    
    public agac(final agfd b, final afyf c) {
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final byte[] a(byte[] a, final byte[] array) {
        final byte[] byteArray = afzd.c(this.b).toByteArray();
        final byte[] a2 = this.c.a(byteArray, agac.a);
        a = ((afyf)afzd.g(this.b.b, byteArray, afyf.class)).a(a, array);
        final int length = a2.length;
        return ByteBuffer.allocate(length + 4 + a.length).putInt(length).put(a2).put(a).array();
    }
}
