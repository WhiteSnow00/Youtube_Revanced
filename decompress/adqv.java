// 
// Decompiled by Procyon v0.6.0
// 

final class adqv extends admh
{
    final apkx a;
    
    public adqv(final adnd adnd, final apkx a) {
        this.a = a;
        super(adnd);
    }
    
    @Override
    public final void c(final ahcr ahcr) {
        adoi adoi;
        if ((adoi = adoi.a(((adoj)ahcr.instance).ad)) == null) {
            adoi = adoi.a;
        }
        if (adoi != adoi.a) {
            return;
        }
        int ar;
        if ((ar = aqvq.ar(this.a.c)) == 0) {
            ar = 1;
        }
        if (--ar == 1) {
            final adoi c = adoi.c;
            ahcr.copyOnWrite();
            final adoj adoj = (adoj)ahcr.instance;
            adoj.ad = c.g;
            adoj.c |= 0x400000;
            return;
        }
        if (ar == 2) {
            final adoi d = adoi.d;
            ahcr.copyOnWrite();
            final adoj adoj2 = (adoj)ahcr.instance;
            adoj2.ad = d.g;
            adoj2.c |= 0x400000;
            return;
        }
        if (ar == 3) {
            final adoi e = adoi.e;
            ahcr.copyOnWrite();
            final adoj adoj3 = (adoj)ahcr.instance;
            adoj3.ad = e.g;
            adoj3.c |= 0x400000;
            return;
        }
        if (ar != 4) {
            return;
        }
        final adoi f = adoi.f;
        ahcr.copyOnWrite();
        final adoj adoj4 = (adoj)ahcr.instance;
        adoj4.ad = f.g;
        adoj4.c |= 0x400000;
    }
}
