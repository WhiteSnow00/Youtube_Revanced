import android.util.Pair;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import android.text.TextUtils;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abdh
{
    public static final abdg a;
    private final abjf b;
    private final asho c;
    private final yyh d;
    private final arud e;
    private final avt f;
    
    static {
        a = (abdg)new abdf();
    }
    
    public abdh(final abjf b, final asho c, final arud e, final yyh d, final avt f, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6) {
        this.b = b;
        c.getClass();
        this.c = c;
        e.getClass();
        this.e = e;
        this.d = d;
        this.f = f;
    }
    
    public final asiw a(final PlaybackStartDescriptor playbackStartDescriptor, final abif abif, final abdg abdg, long d, final zbq zbq, final wyn wyn) {
        if (TextUtils.isEmpty((CharSequence)playbackStartDescriptor.k())) {
            abdg.a(new IllegalArgumentException("Unexpected empty videoId."));
            abdg.c(4);
            return (asiw)abdd.b;
        }
        if (abif == null || (abif.b == 1 && abif.a <= 0)) {
            abdg.a(new IllegalArgumentException("Invalid prefetchPlaybackContextWrapper."));
            abdg.c(4);
            return (asiw)abdd.a;
        }
        ancy ancy;
        if ((ancy = this.e.f().j) == null) {
            ancy = ancy.a;
        }
        if (ancy.j) {
            abdg.a(new IllegalStateException("Prefetch request are disabled."));
            abdg.c(5);
            return (asiw)abdd.c;
        }
        final String b = playbackStartDescriptor.B(this.f);
        yyg a = null;
        if (d > 0L) {
            a = this.d.a(b, (appy)null, true);
        }
        final abjf b2 = this.b;
        final anao b3 = abif.b();
        ashe ashe;
        if (TextUtils.isEmpty((CharSequence)playbackStartDescriptor.k())) {
            ashe = ashe.I((Throwable)new IllegalArgumentException("Unexpected empty videoId."));
        }
        else {
            if (wyn != null) {
                wyn.c("ps_s");
            }
            final abkg b4 = b2.e.b(playbackStartDescriptor.k(), playbackStartDescriptor.x(), playbackStartDescriptor.h(), playbackStartDescriptor.i(), playbackStartDescriptor.a(), -1, b2.g, playbackStartDescriptor.B(b2.l), wyn, playbackStartDescriptor.g, true);
            b4.V = b3;
            b4.K = playbackStartDescriptor.r();
            b4.L = playbackStartDescriptor.q();
            b4.N = playbackStartDescriptor.t();
            final Pair b5 = b2.b(b4, false);
            if (b5 != null && b2.g(b5)) {
                if (wyn != null) {
                    wyn.c("ps_r");
                    final agza builder = ((agzi)alkg.a).createBuilder();
                    builder.copyOnWrite();
                    final alkg alkg = (alkg)builder.instance;
                    alkg.c |= 0x10;
                    alkg.C = true;
                    wyn.a((alkg)builder.build());
                }
                ashe = ashp.I((Object)b5.first).k();
            }
            else {
                final vhf f = vhf.f(b2.k, playbackStartDescriptor.f(), playbackStartDescriptor.B(b2.l), playbackStartDescriptor.c(), zbq, playbackStartDescriptor.y());
                if (f == null) {
                    ashe = ashe.I((Throwable)new IllegalArgumentException("Unexpected null onesieRequest."));
                }
                else {
                    f.t = 1;
                    f.c(playbackStartDescriptor.k());
                    if (d >= 0L) {
                        final int n = (int)d;
                        f.o = n;
                        f.n = n;
                    }
                    final String k = playbackStartDescriptor.k();
                    tsx.n(k);
                    final abje abje = new abje(b2, b4, k, wyn);
                    final abjm d2 = b2.d;
                    ashe ashe2;
                    if (d2.g == null) {
                        ashe2 = ashe.I((Throwable)new IllegalArgumentException("Unexpected null OnesieLoader."));
                    }
                    else {
                        d = ((oas)d2.f).d();
                        final vji a2 = ((abke)d2.d).a(b4, (znj)((aamd)d2.e).H((znj)abje, d, (abpj)d2.h, null));
                        ashe2 = ((ykd)d2.g).a(a2, f, d2.b, wyn, false).a().W((asjc)new vsd(a2, (zni)abje, 7));
                    }
                    ashe = ashe2.F((asix)new abhi(wyn, 4));
                }
            }
        }
        return (asiw)new tov(ashe.aj(this.c).G((asix)new abbr(abdg, 10)).C((asir)new tlv(abdg, 16)).B((asir)new tlv(a, 17)).aC((asix)new abde(a, b, playbackStartDescriptor, abdg, 0), (asix)new abbr(abdg, 11)), 5);
    }
    
    public final void b(final PlaybackStartDescriptor playbackStartDescriptor, final abif abif, final abdg abdg) {
        this.a(playbackStartDescriptor, abif, abdg, -1L, null, null);
    }
}
