import java.nio.ByteOrder;
import java.nio.ByteBuffer;
import java.util.UUID;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arkg extends arkh
{
    private boolean a;
    private byte b;
    private UUID c;
    
    @Override
    public final String a() {
        return "seig";
    }
    
    @Override
    public final ByteBuffer b() {
        final ByteBuffer allocate = ByteBuffer.allocate(20);
        cop.j(allocate, (int)(this.a ? 1 : 0));
        if (this.a) {
            cop.l(allocate, (int)this.b);
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
    
    @Override
    public final void c(ByteBuffer wrap) {
        final int h = coh.h(wrap);
        boolean a = true;
        if (h != 1) {
            a = false;
        }
        this.a = a;
        this.b = (byte)coh.i(wrap);
        final byte[] array = new byte[16];
        wrap.get(array);
        wrap = ByteBuffer.wrap(array);
        wrap.order(ByteOrder.BIG_ENDIAN);
        this.c = new UUID(wrap.getLong(), wrap.getLong());
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        final arkg arkg = (arkg)o;
        if (this.a != arkg.a) {
            return false;
        }
        if (this.b != arkg.b) {
            return false;
        }
        final UUID c = this.c;
        if (c != null) {
            if (c.equals(arkg.c)) {
                return true;
            }
        }
        else if (arkg.c == null) {
            return true;
        }
        return false;
    }
    
    @Override
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
    
    @Override
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
