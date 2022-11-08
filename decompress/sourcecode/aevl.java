// 
// Decompiled by Procyon v0.6.0
// 

public final class aevl extends oaw
{
    public final Object f;
    public final Object g;
    
    public aevl(final aexq f, final mrm g, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        this.f = f;
        this.g = g;
    }
    
    public aevl(final arhr f, final arhr g) {
        this.f = f;
        this.g = g;
    }
    
    public static apyz ab(final ajpg ajpg, final long n) {
        final agza builder = ((agzi)apyz.a).createBuilder();
        final ahas b = ajpg.b;
        final Long value = n;
        if (b.containsKey(value)) {
            final ahas b2 = ajpg.b;
            if (!b2.containsKey(value)) {
                throw new IllegalArgumentException();
            }
            final ajph c = b2.get(value);
            builder.copyOnWrite();
            final apyz apyz = (apyz)builder.instance;
            c.getClass();
            apyz.c = c;
            apyz.b |= 0x1;
        }
        return (apyz)builder.build();
    }
}
