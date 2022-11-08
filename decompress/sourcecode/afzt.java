import j$.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afzt
{
    public final int a;
    private final afuz b;
    private final aesy c;
    
    public afzt(final afuz b, final int a, final aesy c, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        this.b = b;
        this.a = a;
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (!(o instanceof afzt)) {
            return false;
        }
        final afzt afzt = (afzt)o;
        return this.b == afzt.b && this.a == afzt.a && this.c.equals(afzt.c);
    }
    
    @Override
    public final int hashCode() {
        return Objects.hash(new Object[] { this.b, this.a, this.c.hashCode() });
    }
    
    @Override
    public final String toString() {
        return String.format("(status=%s, keyId=%s, parameters='%s')", this.b, this.a, this.c);
    }
}
