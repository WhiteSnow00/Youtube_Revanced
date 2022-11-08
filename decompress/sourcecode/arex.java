import java.nio.ByteOrder;
import java.nio.ByteBuffer;
import java.util.UUID;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arex extends arey
{
    private boolean a;
    private byte b;
    private UUID c;
    
    public final String a() {
        return "seig";
    }
    
    public final ByteBuffer b() {
        final ByteBuffer allocate = ByteBuffer.allocate(20);
        clm.l(allocate, (int)(this.a ? 1 : 0));
        if (this.a) {
            clm.n(allocate, (int)this.b);
            final UUID c = this.c;
            final long mostSignificantBits = c.getMostSignificantBits();
            final long leastSignificantBits = c.getLeastSignificantBits();
            final byte[] array = new byte[16];
            for (int i = 0; i < 8; ++i) {
                array[i] = (byte)(mostSignificantBits >>> (7 - i) * 8);
            }
            for (int j = 8; j < 16; ++j) {
                array[j] = (byte)(leastSignificantBits >>> (7 - j) * 8);
            }
            allocate.put(array);
        }
        else {
            allocate.put(new byte[17]);
        }
        allocate.rewind();
        return allocate;
    }
    
    public final void c(ByteBuffer wrap) {
        final int u = clm.u(wrap);
        boolean a = true;
        if (u != 1) {
            a = false;
        }
        this.a = a;
        this.b = (byte)clm.v(wrap);
        final byte[] array = new byte[16];
        wrap.get(array);
        wrap = ByteBuffer.wrap(array);
        wrap.order(ByteOrder.BIG_ENDIAN);
        this.c = new UUID(wrap.getLong(), wrap.getLong());
    }
    
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        final arex arex = (arex)o;
        if (this.a != arex.a) {
            return false;
        }
        if (this.b != arex.b) {
            return false;
        }
        final UUID c = this.c;
        if (c != null) {
            if (c.equals(arex.c)) {
                return true;
            }
        }
        else if (arex.c == null) {
            return true;
        }
        return false;
    }
    
    public final int hashCode() {
        int n;
        if (!this.a) {
            n = 19;
        }
        else {
            n = 7;
        }
        final byte b = this.b;
        final UUID c = this.c;
        int hashCode;
        if (c != null) {
            hashCode = c.hashCode();
        }
        else {
            hashCode = 0;
        }
        return (n * 31 + b) * 31 + hashCode;
    }
    
    public final String toString() {
        final boolean a = this.a;
        final byte b = this.b;
        final String value = String.valueOf(this.c);
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 79);
        sb.append("CencSampleEncryptionInformationGroupEntry{isEncrypted=");
        sb.append(a);
        sb.append(", ivSize=");
        sb.append(b);
        sb.append(", kid=");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
