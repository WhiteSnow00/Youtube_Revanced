import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aavh implements aavj, aawp, abps, tgg
{
    public final aavk a;
    public final aavk b;
    public final atke c;
    private boolean d;
    private aans e;
    
    public aavh(final atke c, final aavk a, final aavk b, final Context context) {
        c.getClass();
        this.c = c;
        this.a = a;
        b.getClass();
        this.b = b;
        context.getClass();
        this.d = false;
    }
    
    final void a(final aans e) {
        this.e = e;
        final abke c = e.c();
        final abke i = abke.i;
        final VideoStreamingData videoStreamingData = null;
        final boolean b = false;
        PlayerResponseModel b2;
        boolean j;
        if (c != i && e.c() != abke.f) {
            b2 = null;
            j = false;
        }
        else {
            b2 = e.b();
            j = ((aawr)this.c.a()).i();
            this.d = b2.m().aa();
        }
        this.b.c(this.d && j);
        final boolean g = e.c().g();
        if (j && !g) {
            VideoStreamingData n = videoStreamingData;
            if (b2 != null) {
                n = videoStreamingData;
                if (b2.n() != null) {
                    n = b2.n();
                }
            }
            final boolean b3 = n != null && n.B();
            final boolean b4 = n != null && n.r();
            final aavk a = this.a;
            boolean b5 = b;
            Label_0239: {
                if (this.d) {
                    if (!b3) {
                        b5 = b;
                        if (!b4) {
                            break Label_0239;
                        }
                    }
                    b5 = true;
                }
            }
            a.c(b5);
            return;
        }
        this.a.c(false);
    }
    
    @Override
    public final void b(final boolean b) {
        if (b) {
            final aans e = this.e;
            if (e != null) {
                this.a(e);
            }
            return;
        }
        this.b.c(false);
        this.a.c(false);
    }
    
    @Override
    public final void c() {
        ((aawr)this.c.a()).f();
    }
    
    public final asir[] lX(final abpu abpu) {
        return new asir[] { ((ashi)abpu.p().a).j(aale.s(abpu.bM(), 128L)).j(aale.q(1)).an(new aauu(this, 2), (asjm)aaof.i) };
    }
    
    public final Class[] ms(final Class clazz, final Object o, final int n) {
        Class[] array;
        if (n != -1) {
            if (n != 0) {
                final StringBuilder sb = new StringBuilder("unsupported op code: ");
                sb.append(n);
                throw new IllegalStateException(sb.toString());
            }
            this.a((aans)o);
            array = null;
        }
        else {
            array = new Class[] { aans.class };
        }
        return array;
    }
}
