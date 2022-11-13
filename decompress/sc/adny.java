// 
// Decompiled by Procyon v0.6.0
// 

final class adny implements adkx
{
    private final long a;
    private final long b;
    
    public adny(final long a, final long b) {
        this.a = a;
        this.b = b;
    }
    
    public final admv a(final admv admv) {
        if (admv != null) {
            final ahaz builder = ((ahbh)admv).toBuilder();
            final long a = this.a;
            builder.copyOnWrite();
            final admv admv2 = (admv)builder.instance;
            admv2.c |= 0x4;
            admv2.G = a;
            final long b = this.b;
            builder.copyOnWrite();
            final admv admv3 = (admv)builder.instance;
            admv3.c |= 0x8;
            admv3.H = b;
            return (admv)builder.build();
        }
        return null;
    }
}
