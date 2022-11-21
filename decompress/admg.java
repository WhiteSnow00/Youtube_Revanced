// 
// Decompiled by Procyon v0.6.0
// 

public final class admg extends admo
{
    private final adgg a;
    
    public admg(final adgg a, final adnd adnd, final byte[] array, final byte[] array2) {
        super(adnd);
        this.a = a;
    }
    
    private final adog c(final adog adog) {
        int y;
        if ((y = adme.y(adog.c)) == 0) {
            y = 1;
        }
        if (y - 1 != 1) {
            return this.a.n();
        }
        return adog.a;
    }
    
    private static final adog d(final adog adog) {
        final int y = adme.y(adog.c);
        if (y != 0) {
            if (y == 2) {
                return adog;
            }
        }
        return adog.a;
    }
    
    public final adoj b(adoj adoj) {
        if (adoj == null) {
            return null;
        }
        if (adoj.Y) {
            final ahcr builder = adoj.toBuilder();
            builder.copyOnWrite();
            final adoj adoj2 = (adoj)builder.instance;
            adoj2.c |= 0x10000000;
            adoj2.aj = false;
            builder.copyOnWrite();
            final adoj adoj3 = (adoj)builder.instance;
            adoj3.c |= 0x8000000;
            adoj3.ai = true;
            adog adog;
            if ((adog = adoj.ar) == null) {
                adog = adog.a;
            }
            final adog d = d(adog);
            builder.copyOnWrite();
            final adoj adoj4 = (adoj)builder.instance;
            d.getClass();
            adoj4.ar = d;
            adoj4.d |= 0x10;
            adog adog2;
            if ((adog2 = adoj.S) == null) {
                adog2 = adog.a;
            }
            final adog c = this.c(adog2);
            builder.copyOnWrite();
            final adoj adoj5 = (adoj)builder.instance;
            c.getClass();
            adoj5.S = c;
            adoj5.c |= 0x4000;
            adog adog3;
            if ((adog3 = adoj.ae) == null) {
                adog3 = adog.a;
            }
            final adog c2 = this.c(adog3);
            builder.copyOnWrite();
            final adoj adoj6 = (adoj)builder.instance;
            c2.getClass();
            adoj6.ae = c2;
            adoj6.c |= 0x800000;
            adog adog4;
            if ((adog4 = adoj.C) == null) {
                adog4 = adog.a;
            }
            final adog c3 = this.c(adog4);
            builder.copyOnWrite();
            final adoj adoj7 = (adoj)builder.instance;
            c3.getClass();
            adoj7.C = c3;
            adoj7.b |= 0x40000000;
            adog adog5;
            if ((adog5 = adoj.C) == null) {
                adog5 = adog.a;
            }
            final adog c4 = this.c(adog5);
            builder.copyOnWrite();
            final adoj adoj8 = (adoj)builder.instance;
            c4.getClass();
            adoj8.ag = c4;
            adoj8.c |= 0x2000000;
            adog adog6;
            if ((adog6 = adoj.ao) == null) {
                adog6 = adog.a;
            }
            final adog c5 = this.c(adog6);
            builder.copyOnWrite();
            final adoj adoj9 = (adoj)builder.instance;
            c5.getClass();
            adoj9.ao = c5;
            adoj9.d |= 0x2;
            adog adog7;
            if ((adog7 = adoj.R) == null) {
                adog7 = adog.a;
            }
            final adog c6 = this.c(adog7);
            builder.copyOnWrite();
            final adoj adoj10 = (adoj)builder.instance;
            c6.getClass();
            adoj10.R = c6;
            adoj10.c |= 0x2000;
            adog adog8;
            if ((adog8 = adoj.O) == null) {
                adog8 = adog.a;
            }
            final adog c7 = this.c(adog8);
            builder.copyOnWrite();
            final adoj adoj11 = (adoj)builder.instance;
            c7.getClass();
            adoj11.O = c7;
            adoj11.c |= 0x400;
            adog adog9;
            if ((adog9 = adoj.N) == null) {
                adog9 = adog.a;
            }
            final adog c8 = this.c(adog9);
            builder.copyOnWrite();
            final adoj adoj12 = (adoj)builder.instance;
            c8.getClass();
            adoj12.N = c8;
            adoj12.c |= 0x200;
            adog adog10;
            if ((adog10 = adoj.Q) == null) {
                adog10 = adog.a;
            }
            final adog c9 = this.c(adog10);
            builder.copyOnWrite();
            final adoj adoj13 = (adoj)builder.instance;
            c9.getClass();
            adoj13.Q = c9;
            adoj13.c |= 0x1000;
            adog adog11;
            if ((adog11 = adoj.ah) == null) {
                adog11 = adog.a;
            }
            final adog c10 = this.c(adog11);
            builder.copyOnWrite();
            final adoj adoj14 = (adoj)builder.instance;
            c10.getClass();
            adoj14.ah = c10;
            adoj14.c |= 0x4000000;
            adog adog12;
            if ((adog12 = adoj.am) == null) {
                adog12 = adog.a;
            }
            final adog c11 = this.c(adog12);
            builder.copyOnWrite();
            final adoj adoj15 = (adoj)builder.instance;
            c11.getClass();
            adoj15.am = c11;
            adoj15.c |= Integer.MIN_VALUE;
            if (adoj15.w) {
                adog adog13;
                if ((adog13 = adoj.an) == null) {
                    adog13 = adog.a;
                }
                final adog c12 = this.c(adog13);
                builder.copyOnWrite();
                final adoj adoj16 = (adoj)builder.instance;
                c12.getClass();
                adoj16.an = c12;
                adoj16.d |= 0x1;
            }
            if (((adoj)builder.instance).z) {
                adog adog14;
                if ((adog14 = adoj.as) == null) {
                    adog14 = adog.a;
                }
                final adog d2 = d(adog14);
                builder.copyOnWrite();
                adoj = (adoj)builder.instance;
                d2.getClass();
                adoj.as = d2;
                adoj.d |= 0x20;
            }
            return (adoj)builder.build();
        }
        throw new IllegalStateException("use_explicit_upload_flow must be true");
    }
}
