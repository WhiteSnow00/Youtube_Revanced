import java.nio.charset.Charset;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adpl implements asmi
{
    public static final adpl a;
    public static final adpl b;
    public static final adpl c;
    public static final adpl d;
    private final int e;
    
    static {
        d = new adpl(3);
        c = new adpl(2);
        b = new adpl(1);
        a = new adpl(0);
    }
    
    private adpl(final int e) {
        this.e = e;
    }
    
    @Override
    public final void a(final Object o) {
        final int e = this.e;
        if (e == 0) {
            final ahcr ahcr = (ahcr)o;
            final int d = adpo.d;
            ahcr.copyOnWrite();
            final adoj adoj = (adoj)ahcr.instance;
            final adoj a = adoj.a;
            adoj.c |= 0x2;
            adoj.F = "copy";
            return;
        }
        if (e == 1) {
            tut.f("UpdateCreatorChannelCommandHandler", "UpdateCreatorChannelCommand execution failed", (Throwable)o);
            return;
        }
        if (e != 2) {
            final ahcr ahcr2 = (ahcr)o;
            ahcr2.copyOnWrite();
            final adoj adoj2 = (adoj)ahcr2.instance;
            final adoj a2 = adoj.a;
            adoj2.v = 0;
            adoj2.b |= 0x100000;
            return;
        }
        final ahcr ahcr3 = (ahcr)o;
        final Charset a3 = adqn.a;
        ahcr3.copyOnWrite();
        final adoj adoj3 = (adoj)ahcr3.instance;
        final adoj a4 = adoj.a;
        adoj3.b |= Integer.MIN_VALUE;
        adoj3.D = false;
    }
}
