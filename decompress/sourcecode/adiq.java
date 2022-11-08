// 
// Decompiled by Procyon v0.6.0
// 

public final class adiq extends adiy
{
    private final adcr a;
    
    public adiq(final adcr a, final adjo adjo, final byte[] array, final byte[] array2) {
        super(adjo);
        this.a = a;
    }
    
    private final adkr c(final adkr adkr) {
        int c;
        if ((c = adio.C(adkr.c)) == 0) {
            c = 1;
        }
        if (c - 1 != 1) {
            return this.a.t();
        }
        return adkr.a;
    }
    
    private static final adkr d(final adkr adkr) {
        final int c = adio.C(adkr.c);
        if (c != 0) {
            if (c == 2) {
                return adkr;
            }
        }
        return adkr.a;
    }
    
    public final adku b(final adku adku) {
        if (adku == null) {
            return null;
        }
        if (adku.Y) {
            final agza builder = adku.toBuilder();
            builder.copyOnWrite();
            final adku adku2 = (adku)builder.instance;
            adku2.c |= 0x10000000;
            adku2.aj = false;
            builder.copyOnWrite();
            final adku adku3 = (adku)builder.instance;
            adku3.c |= 0x8000000;
            adku3.ai = true;
            adkr adkr;
            if ((adkr = adku.ar) == null) {
                adkr = adkr.a;
            }
            final adkr d = d(adkr);
            builder.copyOnWrite();
            final adku adku4 = (adku)builder.instance;
            d.getClass();
            adku4.ar = d;
            adku4.d |= 0x10;
            adkr adkr2;
            if ((adkr2 = adku.S) == null) {
                adkr2 = adkr.a;
            }
            final adkr c = this.c(adkr2);
            builder.copyOnWrite();
            final adku adku5 = (adku)builder.instance;
            c.getClass();
            adku5.S = c;
            adku5.c |= 0x4000;
            adkr adkr3;
            if ((adkr3 = adku.ae) == null) {
                adkr3 = adkr.a;
            }
            final adkr c2 = this.c(adkr3);
            builder.copyOnWrite();
            final adku adku6 = (adku)builder.instance;
            c2.getClass();
            adku6.ae = c2;
            adku6.c |= 0x800000;
            adkr adkr4;
            if ((adkr4 = adku.C) == null) {
                adkr4 = adkr.a;
            }
            final adkr c3 = this.c(adkr4);
            builder.copyOnWrite();
            final adku adku7 = (adku)builder.instance;
            c3.getClass();
            adku7.C = c3;
            adku7.b |= 0x40000000;
            adkr adkr5;
            if ((adkr5 = adku.C) == null) {
                adkr5 = adkr.a;
            }
            final adkr c4 = this.c(adkr5);
            builder.copyOnWrite();
            final adku adku8 = (adku)builder.instance;
            c4.getClass();
            adku8.ag = c4;
            adku8.c |= 0x2000000;
            adkr adkr6;
            if ((adkr6 = adku.ao) == null) {
                adkr6 = adkr.a;
            }
            final adkr c5 = this.c(adkr6);
            builder.copyOnWrite();
            final adku adku9 = (adku)builder.instance;
            c5.getClass();
            adku9.ao = c5;
            adku9.d |= 0x2;
            adkr adkr7;
            if ((adkr7 = adku.R) == null) {
                adkr7 = adkr.a;
            }
            final adkr c6 = this.c(adkr7);
            builder.copyOnWrite();
            final adku adku10 = (adku)builder.instance;
            c6.getClass();
            adku10.R = c6;
            adku10.c |= 0x2000;
            adkr adkr8;
            if ((adkr8 = adku.O) == null) {
                adkr8 = adkr.a;
            }
            final adkr c7 = this.c(adkr8);
            builder.copyOnWrite();
            final adku adku11 = (adku)builder.instance;
            c7.getClass();
            adku11.O = c7;
            adku11.c |= 0x400;
            adkr adkr9;
            if ((adkr9 = adku.N) == null) {
                adkr9 = adkr.a;
            }
            final adkr c8 = this.c(adkr9);
            builder.copyOnWrite();
            final adku adku12 = (adku)builder.instance;
            c8.getClass();
            adku12.N = c8;
            adku12.c |= 0x200;
            adkr adkr10;
            if ((adkr10 = adku.Q) == null) {
                adkr10 = adkr.a;
            }
            final adkr c9 = this.c(adkr10);
            builder.copyOnWrite();
            final adku adku13 = (adku)builder.instance;
            c9.getClass();
            adku13.Q = c9;
            adku13.c |= 0x1000;
            adkr adkr11;
            if ((adkr11 = adku.ah) == null) {
                adkr11 = adkr.a;
            }
            final adkr c10 = this.c(adkr11);
            builder.copyOnWrite();
            final adku adku14 = (adku)builder.instance;
            c10.getClass();
            adku14.ah = c10;
            adku14.c |= 0x4000000;
            adkr adkr12;
            if ((adkr12 = adku.am) == null) {
                adkr12 = adkr.a;
            }
            final adkr c11 = this.c(adkr12);
            builder.copyOnWrite();
            final adku adku15 = (adku)builder.instance;
            c11.getClass();
            adku15.am = c11;
            adku15.c |= Integer.MIN_VALUE;
            if (adku15.w) {
                adkr adkr13;
                if ((adkr13 = adku.an) == null) {
                    adkr13 = adkr.a;
                }
                final adkr c12 = this.c(adkr13);
                builder.copyOnWrite();
                final adku adku16 = (adku)builder.instance;
                c12.getClass();
                adku16.an = c12;
                adku16.d |= 0x1;
            }
            if (((adku)builder.instance).z) {
                adkr adkr14;
                if ((adkr14 = adku.as) == null) {
                    adkr14 = adkr.a;
                }
                final adkr d2 = d(adkr14);
                builder.copyOnWrite();
                final adku adku17 = (adku)builder.instance;
                d2.getClass();
                adku17.as = d2;
                adku17.d |= 0x20;
            }
            return (adku)builder.build();
        }
        throw new IllegalStateException("use_explicit_upload_flow must be true");
    }
}
