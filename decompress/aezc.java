import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aezc extends ocs
{
    public final Object f;
    public final Object g;
    
    public aezc(final afbh f, final med g, final byte[] array) {
        this.f = f;
        this.g = g;
    }
    
    public aezc(final arna f, final arna g) {
        this.f = f;
        this.g = g;
    }
    
    public static aqeb I(final ajtj ajtj, final long n) {
        final ahcr builder = ((ahcz)aqeb.a).createBuilder();
        final ahej b = ajtj.b;
        final Long value = n;
        if (b.containsKey((Object)value)) {
            final ahej b2 = ajtj.b;
            if (!((Map)b2).containsKey(value)) {
                throw new IllegalArgumentException();
            }
            final ajtk c = (ajtk)((Map)b2).get(value);
            builder.copyOnWrite();
            final aqeb aqeb = (aqeb)builder.instance;
            c.getClass();
            aqeb.c = c;
            aqeb.b |= 0x1;
        }
        return (aqeb)builder.build();
    }
}
