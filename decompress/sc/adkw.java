// 
// Decompiled by Procyon v0.6.0
// 

public final class adkw implements adkx
{
    private final int a;
    
    public adkw(final int a) {
        this.a = a;
    }
    
    @Override
    public final admv a(admv admv) {
        final int a = this.a;
        if (a == 0) {
            return admv;
        }
        if (a != 1 && admv != null) {
            final ahaz builder = ((ahbh)admv).toBuilder();
            builder.copyOnWrite();
            admv = (admv)builder.instance;
            admv.c |= 0x20;
            admv.J = false;
            return (admv)builder.build();
        }
        return null;
    }
}
