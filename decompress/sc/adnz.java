// 
// Decompiled by Procyon v0.6.0
// 

final class adnz implements adkx
{
    private final long a;
    
    public adnz(final long a) {
        this.a = a;
    }
    
    public final admv a(final admv admv) {
        if (admv != null) {
            final ahaz builder = ((ahbh)admv).toBuilder();
            final long a = this.a;
            builder.copyOnWrite();
            final admv admv2 = (admv)builder.instance;
            admv2.c |= 0x10;
            admv2.I = a;
            return (admv)builder.build();
        }
        return null;
    }
}
