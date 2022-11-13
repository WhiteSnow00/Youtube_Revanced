import java.nio.ByteBuffer;
import android.view.Surface;
import android.media.MediaFormat;
import android.media.MediaCrypto;
import java.util.Collection;
import java.util.List;
import android.os.Handler;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public class big extends bmc implements bfd
{
    public boolean d;
    public final eab e;
    public pvh f;
    private final bhk q;
    private int r;
    private ayg s;
    private long t;
    private boolean u;
    private boolean v;
    
    public big(final Context context, final blv blv, final bme bme, final boolean b, final Handler handler, final bhe bhe, final bhk q) {
        super(1, blv, bme, b, 44100.0f);
        context.getApplicationContext();
        this.q = q;
        this.e = new eab(handler, bhe);
        q.n((bhh)new bif(this));
    }
    
    public big(final Context context, final bme bme, final Handler handler, final bhe bhe, final bhk bhk) {
        this(context, blv.b, bme, false, handler, bhe, bhk);
    }
    
    private static List au(final bme bme, final ayg ayg, final boolean b, final bhk bhk) {
        final String n = ayg.n;
        if (n == null) {
            return (List)afeq.q();
        }
        if (bhk.w(ayg)) {
            final blz b2 = bmk.b();
            if (b2 != null) {
                return (List)afeq.r((Object)b2);
            }
        }
        final List a = bme.a(n, b, false);
        final String c = bmk.c(ayg);
        if (c == null) {
            return (List)afeq.o((Collection)a);
        }
        final List a2 = bme.a(c, b, false);
        final afel d = afeq.d();
        d.j(a);
        d.j(a2);
        return (List)d.g();
    }
    
    private final void av() {
        long t = this.q.b(this.S());
        if (t != Long.MIN_VALUE) {
            if (!this.d) {
                t = Math.max(this.t, t);
            }
            this.t = t;
            this.d = false;
        }
    }
    
    private static final int aw(final blz blz, final ayg ayg) {
        if ("OMX.google.raw.decoder".equals(blz.a)) {
            final int a = bax.a;
        }
        return ayg.o;
    }
    
    protected void A() {
        this.q.h();
    }
    
    protected final void B() {
        this.av();
        this.q.g();
    }
    
    public final boolean S() {
        return super.l && this.q.v();
    }
    
    public boolean T() {
        return this.q.u() || super.T();
    }
    
    protected final bdz U(final blz blz, final ayg ayg, final ayg ayg2) {
        final bdz b = blz.b(ayg, ayg2);
        int e;
        final int n = e = b.e;
        if (aw(blz, ayg2) > this.r) {
            e = (n | 0x40);
        }
        final String a = blz.a;
        int d;
        if (e != 0) {
            d = 0;
        }
        else {
            d = b.d;
            e = 0;
        }
        return new bdz(a, ayg, ayg2, d, e);
    }
    
    protected final blu V(final blz blz, final ayg ayg, final MediaCrypto mediaCrypto, final float n) {
        final ayg[] n2 = ((bdx)this).N();
        final int length = n2.length;
        int aw = aw(blz, ayg);
        int r;
        if (length == 1) {
            r = aw;
        }
        else {
            int n3 = 0;
            while (true) {
                r = aw;
                if (n3 >= length) {
                    break;
                }
                final ayg ayg2 = n2[n3];
                int max = aw;
                if (blz.b(ayg, ayg2).d != 0) {
                    max = Math.max(aw, aw(blz, ayg2));
                }
                ++n3;
                aw = max;
            }
        }
        this.r = r;
        final String a = blz.a;
        final int a2 = bax.a;
        final String c = blz.c;
        final int r2 = this.r;
        final MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", c);
        mediaFormat.setInteger("channel-count", ayg.A);
        mediaFormat.setInteger("sample-rate", ayg.B);
        dl.r(mediaFormat, ayg.p);
        dl.q(mediaFormat, "max-input-size", r2);
        mediaFormat.setInteger("priority", 0);
        if (n != -1.0f) {
            mediaFormat.setFloat("operating-rate", n);
        }
        if (bax.a <= 28 && "audio/ac4".equals(ayg.n)) {
            mediaFormat.setInteger("ac4-is-sync", 1);
        }
        if (this.q.a(bax.I(4, ayg.A, ayg.B)) == 2) {
            mediaFormat.setInteger("pcm-encoding", 4);
        }
        if (bax.a >= 32) {
            mediaFormat.setInteger("max-output-channel-count", 99);
        }
        final boolean equals = "audio/raw".equals(blz.b);
        ayg s = null;
        if (equals) {
            s = s;
            if (!"audio/raw".equals(ayg.n)) {
                s = ayg;
            }
        }
        this.s = s;
        return new blu(blz, mediaFormat, ayg, null, mediaCrypto);
    }
    
    protected final List W(final bme bme, final ayg ayg, final boolean b) {
        return bmk.e(au(bme, ayg, b, this.q), ayg);
    }
    
    protected final void X(final Exception ex) {
        bap.b("MediaCodecAudioRenderer", "Audio codec error", (Throwable)ex);
        this.e.l(ex);
    }
    
    protected void Y(final String s, final blu blu, final long n, final long n2) {
        this.e.n(s, n, n2);
    }
    
    protected final void Z(final String s) {
        this.e.o(s);
    }
    
    protected final void aa(final ayg ayg, final MediaFormat mediaFormat) {
        ayg ayg2 = this.s;
        if (ayg2 == null) {
            ayg2 = ayg;
            if (super.h != null) {
                int z;
                if ("audio/raw".equals(ayg.n)) {
                    z = ayg.C;
                }
                else {
                    final int a = bax.a;
                    if (mediaFormat.containsKey("pcm-encoding")) {
                        z = mediaFormat.getInteger("pcm-encoding");
                    }
                    else if (mediaFormat.containsKey("v-bits-per-sample")) {
                        z = bax.l(mediaFormat.getInteger("v-bits-per-sample"));
                    }
                    else {
                        z = 2;
                    }
                }
                final ayf ayf = new ayf();
                ayf.k = "audio/raw";
                ayf.z = z;
                ayf.A = ayg.D;
                ayf.B = ayg.E;
                ayf.x = mediaFormat.getInteger("channel-count");
                ayf.y = mediaFormat.getInteger("sample-rate");
                ayg2 = ayf.a();
            }
        }
        try {
            this.q.y(ayg2);
        }
        catch (final bhf bhf) {
            throw ((bdx)this).l((Throwable)bhf, bhf.a, 5001);
        }
    }
    
    protected final void ab() {
        this.q.f();
    }
    
    protected void ac(final bdc bdc) {
        if (this.u && !((bcw)bdc).isDecodeOnly()) {
            if (Math.abs(bdc.e - this.t) > 500000L) {
                this.t = bdc.e;
            }
            this.u = false;
        }
    }
    
    protected final void ad() {
        try {
            this.q.i();
        }
        catch (final bhj bhj) {
            throw ((bdx)this).m(bhj, bhj.c, bhj.b, 5002);
        }
    }
    
    protected boolean ae(final long n, final long n2, final blw blw, final ByteBuffer byteBuffer, final int n3, final int n4, final int n5, final long n6, final boolean b, final boolean b2, final ayg ayg) {
        dk.d((Object)byteBuffer);
        if (this.s != null && (n4 & 0x2) != 0x0) {
            dk.d((Object)blw);
            blw.p(n3);
            return true;
        }
        if (b) {
            if (blw != null) {
                blw.p(n3);
            }
            final bdy o = this.o;
            o.f += n5;
            this.q.f();
            return true;
        }
        try {
            if (this.q.t(byteBuffer, n6, n5)) {
                if (blw != null) {
                    blw.p(n3);
                }
                final bdy o2 = this.o;
                o2.e += n5;
                return true;
            }
            return false;
        }
        catch (final bhj bhj) {
            throw ((bdx)this).m(bhj, ayg, bhj.b, 5002);
        }
        catch (final bhg bhg) {
            throw ((bdx)this).m((Throwable)bhg, bhg.c, bhg.b, 5001);
        }
    }
    
    protected final boolean af(final ayg ayg) {
        return this.q.w(ayg);
    }
    
    protected final void ag() {
        this.q.x();
    }
    
    protected final bdz ah(final bxc bxc) {
        final bdz ah = super.ah(bxc);
        this.e.r(bxc.a, ah);
        return ah;
    }
    
    public final String d() {
        return "MediaCodecAudioRenderer";
    }
    
    protected final float e(final float n, final ayg ayg, final ayg[] array) {
        int i = 0;
        int n2 = -1;
        while (i < array.length) {
            final int b = array[i].B;
            int max = n2;
            if (b != -1) {
                max = Math.max(n2, b);
            }
            ++i;
            n2 = max;
        }
        if (n2 == -1) {
            return -1.0f;
        }
        return n2 * n;
    }
    
    protected final int f(final bme bme, final ayg ayg) {
        final boolean i = ayz.i(ayg.n);
        final int n = 0;
        if (!i) {
            return ber.b(0);
        }
        final int a = bax.a;
        final int g = ayg.G;
        final boolean ar = ar(ayg);
        final int n2 = 4;
        final int n3 = 8;
        if (ar && this.q.w(ayg) && (g == 0 || bmk.b() != null)) {
            return ber.c(4, 8, 32);
        }
        if ("audio/raw".equals(ayg.n) && !this.q.w(ayg)) {
            return ber.b(1);
        }
        if (!this.q.w(bax.I(2, ayg.A, ayg.B))) {
            return ber.b(1);
        }
        final List au = au(bme, ayg, false, this.q);
        if (au.isEmpty()) {
            return ber.b(1);
        }
        if (!ar) {
            return ber.b(2);
        }
        blz blz = au.get(0);
        boolean c = blz.c(ayg);
        boolean b = false;
        Label_0264: {
            if (!c) {
                for (int j = 1; j < au.size(); ++j) {
                    final blz blz2 = au.get(j);
                    if (blz2.c(ayg)) {
                        blz = blz2;
                        b = false;
                        c = true;
                        break Label_0264;
                    }
                }
            }
            b = true;
        }
        int n4 = n2;
        if (!c) {
            n4 = 3;
        }
        int n5 = n3;
        if (c) {
            n5 = n3;
            if (blz.d(ayg)) {
                n5 = 16;
            }
        }
        int n6;
        if (!blz.g) {
            n6 = 0;
        }
        else {
            n6 = 64;
        }
        int n7;
        if (!b) {
            n7 = n;
        }
        else {
            n7 = 128;
        }
        return ber.d(n4, n5, 32, n6, n7);
    }
    
    public long kH() {
        if (((bdx)this).b == 2) {
            this.av();
        }
        return this.t;
    }
    
    public final azc kI() {
        return this.q.c();
    }
    
    public final void kJ(final azc azc) {
        this.q.o(azc);
    }
    
    public bfd n() {
        return (bfd)this;
    }
    
    public void t(int a, final Object o) {
        if (a == 2) {
            this.q.s((float)o);
            return;
        }
        if (a == 3) {
            this.q.k((axu)o);
            return;
        }
        if (a == 6) {
            this.q.m((axv)o);
            return;
        }
        switch (a) {
            default: {
                return;
            }
            case 12: {
                a = bax.a;
                bie.a(this.q, o);
                return;
            }
            case 11: {
                this.f = (pvh)o;
                return;
            }
            case 10: {
                this.q.l((int)o);
                return;
            }
            case 9: {
                this.q.r((boolean)o);
            }
        }
    }
    
    protected final void w() {
        this.v = true;
        try {
            this.q.e();
            try {
                super.w();
            }
            finally {
                this.e.p(this.o);
            }
        }
        finally {
            try {
                super.w();
                this.e.p(this.o);
            }
            finally {
                this.e.p(this.o);
            }
        }
    }
    
    protected void x(final boolean b, final boolean b2) {
        super.x(b, b2);
        this.e.q(this.o);
        ((bdx)this).O();
        this.q.d();
        this.q.p(((bdx)this).p());
    }
    
    protected final void y(final long t, final boolean b) {
        super.y(t, b);
        this.q.e();
        this.t = t;
        this.u = true;
        this.d = true;
    }
    
    protected final void z() {
        try {
            super.z();
            if (this.v) {
                this.v = false;
                this.q.j();
            }
        }
        finally {
            if (this.v) {
                this.v = false;
                this.q.j();
            }
        }
    }
}
