import java.nio.ByteBuffer;
import java.security.MessageDigest;

// 
// Decompiled by Procyon v0.6.0
// 

final class dga implements ddk
{
    private static final dpd b;
    private final dge c;
    private final ddk d;
    private final ddk e;
    private final int f;
    private final int g;
    private final Class h;
    private final ddp i;
    private final ddt j;
    
    static {
        b = new dpd(50L);
    }
    
    public dga(final dge c, final ddk d, final ddk e, final int f, final int g, final ddt j, final Class h, final ddp i) {
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.j = j;
        this.h = h;
        this.i = i;
    }
    
    public final void a(final MessageDigest messageDigest) {
        final byte[] array = (byte[])this.c.e((Class)byte[].class);
        ByteBuffer.wrap(array).putInt(this.f).putInt(this.g).array();
        this.e.a(messageDigest);
        this.d.a(messageDigest);
        messageDigest.update(array);
        final ddt j = this.j;
        if (j != null) {
            j.a(messageDigest);
        }
        this.i.a(messageDigest);
        final dpd b = dga.b;
        byte[] bytes;
        if ((bytes = (byte[])b.f((Object)this.h)) == null) {
            bytes = this.h.getName().getBytes(dga.a);
            b.g((Object)this.h, (Object)bytes);
        }
        messageDigest.update(bytes);
        this.c.c((Object)array);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o instanceof dga) {
            final dga dga = (dga)o;
            if (this.g == dga.g && this.f == dga.f && dph.m((Object)this.j, (Object)dga.j) && this.h.equals(dga.h) && this.d.equals(dga.d) && this.e.equals(dga.e) && this.i.equals(dga.i)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final int n = ((this.d.hashCode() * 31 + this.e.hashCode()) * 31 + this.f) * 31 + this.g;
        final ddt j = this.j;
        int n2 = n;
        if (j != null) {
            n2 = n * 31 + j.hashCode();
        }
        return (n2 * 31 + this.h.hashCode()) * 31 + this.i.hashCode();
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.d);
        final String value2 = String.valueOf(this.e);
        final int f = this.f;
        final int g = this.g;
        final String value3 = String.valueOf(this.h);
        final String value4 = String.valueOf(this.j);
        final String value5 = String.valueOf(this.i);
        final StringBuilder sb = new StringBuilder("ResourceCacheKey{sourceKey=");
        sb.append(value);
        sb.append(", signature=");
        sb.append(value2);
        sb.append(", width=");
        sb.append(f);
        sb.append(", height=");
        sb.append(g);
        sb.append(", decodedResourceClass=");
        sb.append(value3);
        sb.append(", transformation='");
        sb.append(value4);
        sb.append("', options=");
        sb.append(value5);
        sb.append("}");
        return sb.toString();
    }
}
