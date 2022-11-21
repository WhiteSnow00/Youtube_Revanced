import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.util.concurrent.TimeUnit;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abmk implements aslc
{
    public final abmo a;
    public final abmd b;
    public final PlaybackStartDescriptor c;
    public final String d;
    public final abla e;
    public final long f;
    public final abna g;
    public final long h;
    
    public abmk(final abmo a, final abmd b, final PlaybackStartDescriptor c, final String d, final abla e, final long f, final abna g, final long h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
    }
    
    @Override
    public final void a(final athl athl) {
        final abmo a = this.a;
        final abmd b = this.b;
        final PlaybackStartDescriptor c = this.c;
        final String d = this.d;
        final abla e = this.e;
        final long f = this.f;
        final abna g = this.g;
        final long h = this.h;
        final aslm aslm = new aslm();
        final askp g2 = b.g(c, d, e);
        final asla p = g2.K((asmo)aaex.j).aD().R(f, TimeUnit.MILLISECONDS).J(aaqs.t).p(PlayerResponseModel.class);
        aslm.c(p.L(a.b).ab(new abkh(g, 15), new abmj(a, g, c, 2)));
        aslm.c(p.L(a.f).E(new abml(a, h, 0)).E((asmn)new zgh(g2, 17)).L(a.b).ab(new abmj(a, g, d, 0), (asmi)new tpd(a, g, 17)));
        athl.b((Object)aslm);
    }
}
