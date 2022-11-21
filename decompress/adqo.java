// 
// Decompiled by Procyon v0.6.0
// 

public final class adqo implements admm
{
    public static final adqo a;
    public static final adqo b;
    private final int c;
    
    static {
        b = new adqo(1);
        a = new adqo(0);
    }
    
    private adqo(final int c) {
        this.c = c;
    }
    
    @Override
    public final adoj a(adoj adoj) {
        if (this.c != 0) {
            adoj.getClass();
            if (adoj.x) {
                return adoj;
            }
            final ahcr builder = adoj.toBuilder();
            adgg.x(builder);
            builder.copyOnWrite();
            adoj = (adoj)builder.instance;
            adoj.c &= 0xEFFFFFFF;
            adoj.aj = false;
            return (adoj)builder.build();
        }
        else {
            adoj.getClass();
            if (adoj.x) {
                return adoj;
            }
            final ahcr builder2 = adoj.toBuilder();
            adgg.x(builder2);
            builder2.copyOnWrite();
            final adoj adoj2 = (adoj)builder2.instance;
            adoj2.c &= 0xEFFFFFFF;
            adoj2.aj = false;
            return (adoj)builder2.build();
        }
    }
}
