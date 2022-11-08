import java.util.concurrent.TimeUnit;
import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import android.text.TextUtils;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;

// 
// Decompiled by Procyon v0.6.0
// 

public final class euc implements rnx
{
    public final rny a;
    public int b;
    public final qbo c;
    private final rnu d;
    private final akve e;
    private final sfh f;
    private final sdr g;
    private final String h;
    private int i;
    private boolean j;
    
    public euc(final rny a, final rnu d, final qbo c, final akve e, final sfh f, final sdr g, final String h, final byte[] array) {
        this.a = a;
        this.d = d;
        this.c = c;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.b = 0;
    }
    
    private final void l() {
        if (this.b != 1) {
            return;
        }
        this.b = 2;
        try {
            this.d.n();
            final rnu d = this.d;
            akvk akvk;
            if ((akvk = this.e.g) == null) {
                akvk = akvk.a;
            }
            d.o(akvk.c, this.h);
        }
        catch (final rnm rnm) {
            qcv.z(this.f, this.g, rnm.toString());
        }
        this.c.l(6, new znn[0]);
        this.c.l(1, new znn[0]);
    }
    
    public final void f(final abid abid, final abid abid2, final int n, final int n2, final boolean b, final boolean b2) {
        final boolean j = this.j;
        final boolean i = abid == abid.c;
        this.j = i;
        if (this.b != 2) {
            return;
        }
        try {
            this.d.r(abid, abid2, n, n2, b, b2);
        }
        catch (final rnm rnm) {
            qcv.z(this.f, this.g, rnm.toString());
        }
        if (!j && i) {
            this.c.k(4, new znn[0]);
            return;
        }
        if (j && !i) {
            this.c.k(5, new znn[0]);
        }
    }
    
    public final void i(final String s, final long n, final long n2, final long n3, final boolean b) {
        if (this.b == 3) {
            return;
        }
        if (b) {
            if (TextUtils.equals((CharSequence)s, (CharSequence)this.h)) {
                this.l();
                final int n4 = (int)n;
                try {
                    this.d.p((long)n4);
                }
                catch (final rnm rnm) {
                    qcv.z(this.f, this.g, rnm.toString());
                }
                this.c.m(n4, new znn[0]);
                akvk akvk;
                if ((akvk = this.e.g) == null) {
                    akvk = akvk.a;
                }
                final int n5 = n4 * 4 / (int)(akvk.e * 1000L);
                if (n5 >= this.i) {
                    for (int i = n5; i >= this.i; --i) {
                        if (i != 1) {
                            if (i != 2) {
                                if (i == 3) {
                                    this.c.l(12, new znn[0]);
                                }
                            }
                            else {
                                this.c.l(11, new znn[0]);
                            }
                        }
                        else {
                            this.c.l(10, new znn[0]);
                        }
                    }
                    this.i = n5 + 1;
                }
            }
        }
    }
    
    public final void k(final int n, final String s) {
        if (this.b == 3) {
            return;
        }
        if (s != null && !TextUtils.equals((CharSequence)s, (CharSequence)this.h)) {
            if (this.b == 2) {
                this.b = 3;
            }
            return;
        }
        if (n != 2) {
            if (n == 3) {
                this.c.k(9, new znn[0]);
                return;
            }
            if (n != 7) {
                return;
            }
            try {
                final rnu d = this.d;
                final TimeUnit seconds = TimeUnit.SECONDS;
                akvk akvk;
                if ((akvk = this.e.g) == null) {
                    akvk = akvk.a;
                }
                d.p(seconds.toMillis(akvk.e));
            }
            catch (final rnm rnm) {
                qcv.z(this.f, this.g, rnm.toString());
            }
            this.c.l(14, new znn[0]);
            this.c.l(13, new znn[0]);
            this.i = 5;
            this.b = 3;
        }
        else {
            this.l();
            if (this.i == 0) {
                this.i = 1;
                return;
            }
            this.c.k(7, new znn[0]);
        }
    }
}
