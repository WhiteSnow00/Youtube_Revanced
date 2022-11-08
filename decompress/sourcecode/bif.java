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

public class bif extends bmb implements bfc
{
    public boolean d;
    public final eaa e;
    public qpt f;
    private final bhj q;
    private int r;
    private ayf s;
    private long t;
    private boolean u;
    private boolean v;
    
    public bif(final Context context, final blu blu, final bmd bmd, final boolean b, final Handler handler, final bhd bhd, final bhj q) {
        super(1, blu, bmd, b, 44100.0f);
        context.getApplicationContext();
        this.q = q;
        this.e = new eaa(handler, bhd);
        q.n(new bie(this));
    }
    
    public bif(final Context context, final bmd bmd, final Handler handler, final bhd bhd, final bhj bhj) {
        this(context, blu.b, bmd, false, handler, bhd, bhj);
    }
    
    private static List au(final bmd bmd, final ayf ayf, final boolean b, final bhj bhj) {
        final String n = ayf.n;
        if (n == null) {
            return (List)afcr.q();
        }
        if (bhj.w(ayf)) {
            final bly b2 = bmj.b();
            if (b2 != null) {
                return (List)afcr.r((Object)b2);
            }
        }
        final List a = bmd.a(n, b, false);
        final String c = bmj.c(ayf);
        if (c == null) {
            return (List)afcr.o((Collection)a);
        }
        final List a2 = bmd.a(c, b, false);
        final afcm d = afcr.d();
        d.j((Iterable)a);
        d.j((Iterable)a2);
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
    
    private static final int aw(final bly bly, final ayf ayf) {
        if ("OMX.google.raw.decoder".equals(bly.a)) {
            final int a = baw.a;
        }
        return ayf.o;
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
    
    protected final bdy U(final bly bly, final ayf ayf, final ayf ayf2) {
        final bdy b = bly.b(ayf, ayf2);
        int e;
        final int n = e = b.e;
        if (aw(bly, ayf2) > this.r) {
            e = (n | 0x40);
        }
        final String a = bly.a;
        int d;
        if (e != 0) {
            d = 0;
        }
        else {
            d = b.d;
            e = 0;
        }
        return new bdy(a, ayf, ayf2, d, e);
    }
    
    protected final blt V(final bly bly, final ayf ayf, final MediaCrypto mediaCrypto, final float n) {
        final ayf[] n2 = ((bdw)this).N();
        int aw = aw(bly, ayf);
        final int length = n2.length;
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
                final ayf ayf2 = n2[n3];
                int max = aw;
                if (bly.b(ayf, ayf2).d != 0) {
                    max = Math.max(aw, aw(bly, ayf2));
                }
                ++n3;
                aw = max;
            }
        }
        this.r = r;
        final String a = bly.a;
        final int a2 = baw.a;
        final String c = bly.c;
        final int r2 = this.r;
        final MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", c);
        mediaFormat.setInteger("channel-count", ayf.A);
        mediaFormat.setInteger("sample-rate", ayf.B);
        dl.r(mediaFormat, ayf.p);
        dl.q(mediaFormat, "max-input-size", r2);
        mediaFormat.setInteger("priority", 0);
        if (n != -1.0f) {
            mediaFormat.setFloat("operating-rate", n);
        }
        if (baw.a <= 28 && "audio/ac4".equals(ayf.n)) {
            mediaFormat.setInteger("ac4-is-sync", 1);
        }
        if (this.q.a(baw.I(4, ayf.A, ayf.B)) == 2) {
            mediaFormat.setInteger("pcm-encoding", 4);
        }
        if (baw.a >= 32) {
            mediaFormat.setInteger("max-output-channel-count", 99);
        }
        final boolean equals = "audio/raw".equals(bly.b);
        ayf s = null;
        if (equals) {
            s = s;
            if (!"audio/raw".equals(ayf.n)) {
                s = ayf;
            }
        }
        this.s = s;
        return new blt(bly, mediaFormat, ayf, (Surface)null, mediaCrypto);
    }
    
    protected final List W(final bmd bmd, final ayf ayf, final boolean b) {
        return bmj.e(au(bmd, ayf, b, this.q), ayf);
    }
    
    protected final void X(final Exception ex) {
        bao.b("MediaCodecAudioRenderer", "Audio codec error", (Throwable)ex);
        this.e.l(ex);
    }
    
    protected void Y(final String s, final blt blt, final long n, final long n2) {
        this.e.n(s, n, n2);
    }
    
    protected final void Z(final String s) {
        this.e.o(s);
    }
    
    protected final void aa(final ayf ayf, final MediaFormat mediaFormat) {
        ayf ayf2 = this.s;
        if (ayf2 == null) {
            ayf2 = ayf;
            if (super.h != null) {
                int z;
                if ("audio/raw".equals(ayf.n)) {
                    z = ayf.C;
                }
                else {
                    final int a = baw.a;
                    if (mediaFormat.containsKey("pcm-encoding")) {
                        z = mediaFormat.getInteger("pcm-encoding");
                    }
                    else if (mediaFormat.containsKey("v-bits-per-sample")) {
                        z = baw.l(mediaFormat.getInteger("v-bits-per-sample"));
                    }
                    else {
                        z = 2;
                    }
                }
                final aye aye = new aye();
                aye.k = "audio/raw";
                aye.z = z;
                aye.A = ayf.D;
                aye.B = ayf.E;
                aye.x = mediaFormat.getInteger("channel-count");
                aye.y = mediaFormat.getInteger("sample-rate");
                ayf2 = aye.a();
            }
        }
        try {
            this.q.y(ayf2);
        }
        catch (final bhe bhe) {
            throw ((bdw)this).l((Throwable)bhe, bhe.a, 5001);
        }
    }
    
    protected final void ab() {
        this.q.f();
    }
    
    protected void ac(final bdb bdb) {
        if (this.u && !((bcv)bdb).isDecodeOnly()) {
            if (Math.abs(bdb.e - this.t) > 500000L) {
                this.t = bdb.e;
            }
            this.u = false;
        }
    }
    
    protected final void ad() {
        try {
            this.q.i();
        }
        catch (final bhi bhi) {
            throw ((bdw)this).m((Throwable)bhi, bhi.c, bhi.b, 5002);
        }
    }
    
    protected boolean ae(final long n, final long n2, final blv blv, final ByteBuffer byteBuffer, final int n3, final int n4, final int n5, final long n6, final boolean b, final boolean b2, final ayf ayf) {
        dk.d((Object)byteBuffer);
        if (this.s != null && (n4 & 0x2) != 0x0) {
            dk.d((Object)blv);
            blv.p(n3);
            return true;
        }
        if (b) {
            if (blv != null) {
                blv.p(n3);
            }
            final bdx o = this.o;
            o.f += n5;
            this.q.f();
            return true;
        }
        try {
            if (this.q.t(byteBuffer, n6, n5)) {
                if (blv != null) {
                    blv.p(n3);
                }
                final bdx o2 = this.o;
                o2.e += n5;
                return true;
            }
            return false;
        }
        catch (final bhi bhi) {
            throw ((bdw)this).m((Throwable)bhi, ayf, bhi.b, 5002);
        }
        catch (final bhf bhf) {
            throw ((bdw)this).m((Throwable)bhf, bhf.c, bhf.b, 5001);
        }
    }
    
    protected final boolean af(final ayf ayf) {
        return this.q.w(ayf);
    }
    
    protected final void ag() {
        this.q.x();
    }
    
    protected final bdy ah(final bxb bxb) {
        final bdy ah = super.ah(bxb);
        this.e.r(bxb.a, ah);
        return ah;
    }
    
    public final String d() {
        return "MediaCodecAudioRenderer";
    }
    
    protected final float e(final float n, final ayf ayf, final ayf[] array) {
        final int length = array.length;
        int i = 0;
        int n2 = -1;
        while (i < length) {
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
    
    protected final int f(final bmd bmd, final ayf ayf) {
        final boolean i = ayy.i(ayf.n);
        final int n = 0;
        if (!i) {
            return beq.b(0);
        }
        final int a = baw.a;
        final int g = ayf.G;
        final boolean ar = ar(ayf);
        final int n2 = 4;
        final int n3 = 8;
        if (ar && this.q.w(ayf) && (g == 0 || bmj.b() != null)) {
            return beq.c(4, 8, 32);
        }
        if ("audio/raw".equals(ayf.n) && !this.q.w(ayf)) {
            return beq.b(1);
        }
        if (!this.q.w(baw.I(2, ayf.A, ayf.B))) {
            return beq.b(1);
        }
        final List au = au(bmd, ayf, false, this.q);
        if (au.isEmpty()) {
            return beq.b(1);
        }
        if (!ar) {
            return beq.b(2);
        }
        final bly bly = au.get(0);
        boolean c = bly.c(ayf);
        bly bly2 = null;
        boolean b = false;
        Label_0262: {
            if (!c) {
                for (int j = 1; j < au.size(); ++j) {
                    bly2 = au.get(j);
                    if (bly2.c(ayf)) {
                        b = false;
                        c = true;
                        break Label_0262;
                    }
                }
            }
            b = true;
            bly2 = bly;
        }
        int n4 = n2;
        if (!c) {
            n4 = 3;
        }
        int n5 = n3;
        if (c) {
            n5 = n3;
            if (bly2.d(ayf)) {
                n5 = 16;
            }
        }
        int n6;
        if (!bly2.g) {
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
        return beq.d(n4, n5, 32, n6, n7);
    }
    
    public long kH() {
        if (((bdw)this).b == 2) {
            this.av();
        }
        return this.t;
    }
    
    public final azb kI() {
        return this.q.c();
    }
    
    public final void kJ(final azb azb) {
        this.q.o(azb);
    }
    
    public bfc n() {
        return this;
    }
    
    public void t(int a, final Object o) {
        if (a == 2) {
            this.q.s((float)o);
            return;
        }
        if (a == 3) {
            this.q.k((axt)o);
            return;
        }
        if (a == 6) {
            this.q.m((axu)o);
            return;
        }
        switch (a) {
            default: {
                return;
            }
            case 12: {
                a = baw.a;
                bid.a(this.q, o);
                return;
            }
            case 11: {
                this.f = (qpt)o;
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
        ((bdw)this).O();
        this.q.d();
        this.q.p(((bdw)this).p());
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
