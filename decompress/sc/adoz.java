// 
// Decompiled by Procyon v0.6.0
// 

public final class adoz implements adkx
{
    public static final adoz a;
    public static final adoz b;
    private final int c;
    
    static {
        b = new adoz(1);
        a = new adoz(0);
    }
    
    private adoz(final int c) {
        this.c = c;
    }
    
    public final admv a(final admv admv) {
        if (this.c != 0) {
            admv.getClass();
            if (admv.x) {
                return admv;
            }
            final ahaz builder = ((ahbh)admv).toBuilder();
            adet.C(builder);
            builder.copyOnWrite();
            final admv admv2 = (admv)builder.instance;
            admv2.c &= 0xEFFFFFFF;
            admv2.aj = false;
            return (admv)builder.build();
        }
        else {
            admv.getClass();
            if (admv.x) {
                return admv;
            }
            final ahaz builder2 = ((ahbh)admv).toBuilder();
            adet.C(builder2);
            builder2.copyOnWrite();
            final admv admv3 = (admv)builder2.instance;
            admv3.c &= 0xEFFFFFFF;
            admv3.aj = false;
            return (admv)builder2.build();
        }
    }
}
