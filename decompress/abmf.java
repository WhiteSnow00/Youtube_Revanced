import android.util.Pair;
import java.util.concurrent.TimeUnit;
import android.util.Base64;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abmf extends zra
{
    final abmg a;
    private final abno b;
    private final String c;
    private final xbt d;
    
    public abmf(final abmg a, final abno b, final String c, final xbt d) {
        this.a = a;
        this.b = b;
        c.getClass();
        this.c = c;
        this.d = d;
    }
    
    private static final int e(final PlayerResponseModel playerResponseModel) {
        aknj aknj;
        if ((aknj = playerResponseModel.z().d) == null) {
            aknj = aknj.a;
        }
        return aknj.e;
    }
    
    public final /* bridge */ void mU(final Object o) {
        final PlayerResponseModel a = this.a.a(this.c, (PlayerResponseModel)o);
        final boolean f = aamr.f(a, this.a.h);
        final boolean b = a != null && aamr.o(a.y());
        Label_0304: {
            Label_0147: {
                if (this.a.i != null && a != null && a.m() != null) {
                    ahva ahva;
                    if ((ahva = a.m().c.B) == null) {
                        ahva = ahva.a;
                    }
                    if (ahva.b) {
                        break Label_0147;
                    }
                }
                final absv j = this.a.j;
                if (j == null || !absv.ac((arzb)j.a).G) {
                    break Label_0304;
                }
            }
            if (!f && b && this.a.i != null && e(a) > 0) {
                final absv i = this.a.j;
                if (i != null && i.i()) {
                    final abno b2 = this.b;
                    a.r().a("PLAYER_REQUEST_WAS_AUTOPLAY", b2.K);
                    a.r().a("PLAYER_REQUEST_WAS_AUTONAV", b2.L);
                    a.r().c("PLAYER_REQUEST_CLICK_TRACKING", Base64.encodeToString(((vls)b2).i, 0));
                }
                this.a.i.put((Object)((vls)this.b).b(), (Object)new Pair((Object)a, (Object)(this.a.h.d() + TimeUnit.SECONDS.toMillis(e(a)))));
            }
        }
        this.a.c.d((Object)new aaoq(((vls)this.b).k));
        final xbt d = this.d;
        if (d != null) {
            d.c("ps_r");
            final xbt d2 = this.d;
            final ahcr builder = aloj.a.createBuilder();
            final boolean k = ((vls)this.b).k;
            builder.copyOnWrite();
            final aloj aloj = (aloj)builder.instance;
            aloj.c |= 0x10;
            aloj.C = k;
            d2.a((aloj)builder.build());
        }
        ((afvd)this).set(a);
    }
}
