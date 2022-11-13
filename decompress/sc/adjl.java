// 
// Decompiled by Procyon v0.6.0
// 

public final class adjl implements adkx
{
    public final zme a;
    
    public adjl(final zme a) {
        this.a = a;
    }
    
    @Override
    public final admv a(final admv admv) {
        final zme a = this.a;
        final int t = adjv.t;
        admv.getClass();
        final ahaz builder = ((ahbh)admv).toBuilder();
        final String d = a.d();
        builder.copyOnWrite();
        final admv admv2 = (admv)builder.instance;
        admv2.b |= 0x1;
        admv2.e = d;
        builder.copyOnWrite();
        final admv admv3 = (admv)builder.instance;
        admv3.b |= 0x2000000;
        admv3.x = true;
        return (admv)builder.build();
    }
}
