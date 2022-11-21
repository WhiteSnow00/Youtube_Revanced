import java.nio.charset.Charset;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adrr implements asmi
{
    public final Object a;
    private final int b;
    
    public adrr(final adrt a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public adrr(final Long a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void a(final Object o) {
        final int b = this.b;
        if (b == 0) {
            final Object a = this.a;
            final adoj adoj = (adoj)o;
            final adrt adrt = (adrt)a;
            if (adrt.c.a(adoj)) {
                adrt.b.set(true);
                ((adnf)a).c();
            }
            return;
        }
        if (b == 1) {
            final Object a2 = this.a;
            final ahcr ahcr = (ahcr)o;
            final Charset a3 = adqn.a;
            final long longValue = (long)a2;
            ahcr.copyOnWrite();
            final adoj adoj2 = (adoj)ahcr.instance;
            final adoj a4 = adoj.a;
            adoj2.c |= 0x100;
            adoj2.M = longValue;
            return;
        }
        if (b == 2) {
            final Object a5 = this.a;
            final Throwable t = (Throwable)o;
            final int a6 = ((adnf)a5).a;
            final StringBuilder sb = new StringBuilder("AbstractUploadEntityRequirement Error while observing the requirement ");
            sb.append(a6);
            final String string = sb.toString();
            tut.f("AbstractUploadEntityRequirement", string, t);
            ((adrt)a5).d.D(string, t);
            return;
        }
        if (b != 3) {
            final Object a7 = this.a;
            final Throwable t2 = (Throwable)o;
            final int a8 = ((adnf)a7).a;
            final StringBuilder sb2 = new StringBuilder("AbstractUploadEntityRequirement Error while checking the requirement ");
            sb2.append(a8);
            final String string2 = sb2.toString();
            tut.f("AbstractUploadEntityRequirement", string2, t2);
            ((adrt)a7).d.D(string2, t2);
            return;
        }
        final Object a9 = this.a;
        final adoj adoj3 = (adoj)o;
        final adrt adrt2 = (adrt)a9;
        if (adrt2.c.a(adoj3)) {
            adrt2.b.set(true);
        }
    }
}
