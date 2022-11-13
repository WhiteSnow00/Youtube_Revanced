import com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData;
import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abco implements abps, tgg
{
    final abcp a;
    
    public abco(final abcp a) {
        this.a = a;
    }
    
    public final void a(final ypj ypj) {
        if (!yfd.bw(ypj.b())) {
            return;
        }
        this.a.h = ypj.f();
        this.a.i = ypj.e();
        final abcp a = this.a;
        if (a.n) {
            a.a.c(a.h);
            final abcp a2 = this.a;
            a2.a.b(a2.i);
        }
    }
    
    public final void b(final aans aans) {
        final abke a = abke.a;
        final int ordinal = aans.c().ordinal();
        if (ordinal != 4 && ordinal != 7) {
            return;
        }
        final PlayerResponseModel a2 = aans.a();
        final vjj vjj = null;
        if (a2 != null) {
            this.a.d = aans.a().K();
            this.a.e = aans.k();
        }
        else if (aans.b() != null) {
            this.a.d = aans.b().K();
            this.a.e = aans.e();
        }
        else {
            this.a.d = null;
        }
        PlayerResponseModel playerResponseModel;
        if (aans.c().h()) {
            playerResponseModel = aans.a();
        }
        else {
            playerResponseModel = aans.b();
        }
        final abcp a3 = this.a;
        final PlayerConfigModel m = playerResponseModel.m();
        float min = 0.0f;
        if (m != null) {
            ahwh ahwh;
            if ((ahwh = playerResponseModel.m().c.f) == null) {
                ahwh = ahwh.a;
            }
            min = Math.min(0.0f, ahwh.b);
        }
        a3.q = min;
        VideoStreamingData n;
        if (playerResponseModel == null) {
            n = null;
        }
        else {
            n = playerResponseModel.n();
        }
        final abcp a4 = this.a;
        vjj e;
        if (n == null) {
            e = vjj;
        }
        else {
            e = n.e();
        }
        a4.j = e;
        final Object a5 = this.a.c.a();
        final abcp a6 = this.a;
        final yon yon = (yon)a5;
        a6.f = yon.b;
        a6.g = yon.a;
        if (a6.n) {
            a6.j();
        }
    }
    
    public final asir[] lX(final abpu abpu) {
        return new asir[] { ((ashi)abpu.p().a).j(aale.s(abpu.bM(), 32768L)).j(aale.q(1)).an((asjm)new abci(this, 10), abba.i), ((ashi)abpu.p().m).am((asjm)new abci(this, 11)) };
    }
    
    public final Class[] ms(final Class clazz, final Object o, final int n) {
        Class[] array;
        if (n != -1) {
            array = null;
            if (n != 0) {
                if (n != 1) {
                    final StringBuilder sb = new StringBuilder("unsupported op code: ");
                    sb.append(n);
                    throw new IllegalStateException(sb.toString());
                }
                this.b((aans)o);
            }
            else {
                this.a((ypj)o);
            }
        }
        else {
            array = new Class[] { ypj.class, aans.class };
        }
        return array;
    }
}
