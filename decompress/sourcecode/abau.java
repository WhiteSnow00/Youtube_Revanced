import com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData;
import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abau implements abnq, tec
{
    final /* synthetic */ abav a;
    
    public abau(final abav a) {
        this.a = a;
    }
    
    public final void a(final ynk ynk) {
        if (!yah.m(ynk.b())) {
            return;
        }
        this.a.h = ynk.f();
        this.a.i = ynk.e();
        final abav a = this.a;
        if (a.n) {
            a.a.c(a.h);
            final abav a2 = this.a;
            a2.a.b(a2.i);
        }
    }
    
    public final void b(final aaly aaly) {
        final abim a = abim.a;
        final int ordinal = aaly.c().ordinal();
        if (ordinal != 4 && ordinal != 7) {
            return;
        }
        final PlayerResponseModel a2 = aaly.a();
        final vhj vhj = null;
        if (a2 != null) {
            this.a.d = aaly.a().K();
            this.a.e = aaly.k();
        }
        else if (aaly.b() != null) {
            this.a.d = aaly.b().K();
            this.a.e = aaly.e();
        }
        else {
            this.a.d = null;
        }
        PlayerResponseModel playerResponseModel;
        if (aaly.c().h()) {
            playerResponseModel = aaly.a();
        }
        else {
            playerResponseModel = aaly.b();
        }
        final abav a3 = this.a;
        final PlayerConfigModel m = playerResponseModel.m();
        float min = 0.0f;
        if (m != null) {
            ahuj ahuj;
            if ((ahuj = playerResponseModel.m().c.f) == null) {
                ahuj = ahuj.a;
            }
            min = Math.min(0.0f, ahuj.b);
        }
        a3.q = min;
        VideoStreamingData n;
        if (playerResponseModel == null) {
            n = null;
        }
        else {
            n = playerResponseModel.n();
        }
        final abav a4 = this.a;
        vhj e;
        if (n == null) {
            e = vhj;
        }
        else {
            e = n.e();
        }
        a4.j = e;
        final Object a5 = this.a.c.a();
        final abav a6 = this.a;
        final ymp ymp = (ymp)a5;
        a6.f = ymp.b;
        a6.g = ymp.a;
        if (a6.n) {
            a6.j();
        }
    }
    
    public final asic[] lX(final abns abns) {
        return new asic[] { ((asgt)abns.q().a).j(aajj.t(abns.bN(), 32768L)).j(aajj.r(1)).am((asix)new abat(this, 5), (asix)aaze.i), ((asgt)abns.q().m).al((asix)new abat(this, 6)) };
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
                this.b((aaly)o);
            }
            else {
                this.a((ynk)o);
            }
        }
        else {
            array = new Class[] { ynk.class, aaly.class };
        }
        return array;
    }
}
