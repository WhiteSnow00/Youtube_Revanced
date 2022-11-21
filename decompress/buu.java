// 
// Decompiled by Procyon v0.6.0
// 

public final class buu implements btd
{
    private final bts a;
    private final int b;
    private final pbg c;
    
    public buu(final bts a, final int b) {
        this.a = a;
        this.b = b;
        this.c = new pbg((char[])null, (byte[])null);
    }
    
    private final long c(final btn btn) {
        btg btg;
        while (true) {
            final long e = btn.e();
            btg = (btg)btn;
            if (e >= btg.b - 6L) {
                break;
            }
            final bts a = this.a;
            final int b = this.b;
            final pbg c = this.c;
            final long e2 = btn.e();
            final byte[] array = new byte[2];
            btn.j(array, 0, 2);
            if (((array[0] & 0xFF) << 8 | (array[1] & 0xFF)) != b) {
                btn.l();
                btn.g((int)(e2 - btg.c));
            }
            else {
                final bat bat = new bat(16);
                System.arraycopy(array, 0, bat.a, 0, 2);
                bat.F(bmd.b(btn, bat.a, 2, 14));
                btn.l();
                btn.g((int)(e2 - btg.c));
                if (bse.f(bat, a, b, c)) {
                    break;
                }
            }
            btn.g(1);
        }
        final long e3 = btn.e();
        final long b2 = btg.b;
        if (e3 >= -6L + b2) {
            btn.g((int)(b2 - btn.e()));
            return this.a.j;
        }
        return this.c.a;
    }
    
    public final btc a(final btn btn, final long n) {
        final long c = ((btg)btn).c;
        final long c2 = this.c(btn);
        final long e = btn.e();
        btn.g(Math.max(6, this.a.c));
        final long c3 = this.c(btn);
        final long e2 = btn.e();
        if (c2 <= n && c3 > n) {
            return btc.b(e);
        }
        if (c3 <= n) {
            return btc.c(c3, e2);
        }
        return btc.a(c2, c);
    }
    
    public final void b() {
    }
}
