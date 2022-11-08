import java.util.Iterator;
import java.util.ArrayList;
import com.google.android.apps.youtube.app.player.overlay.NoSoundMemoOverlay;
import com.google.android.apps.youtube.app.mdx.MdxOverlaysPresenter;
import com.google.android.libraries.youtube.player.features.overlay.subtitles.SubtitlesOverlayPresenter;
import com.google.android.libraries.youtube.player.features.iv.CreatorEndscreenOverlayPresenter;
import com.google.android.libraries.youtube.player.features.overlay.live.LiveOverlayPresenter;
import java.util.Collection;

// 
// Decompiled by Procyon v0.6.0
// 

public final class iqq extends fnh
{
    private final tdz a;
    private final asib b;
    private final abns c;
    private final Collection d;
    private final Collection e;
    private final Collection f;
    private final Collection g;
    private final Collection h;
    private final Collection i;
    
    public iqq(final aapf aapf, final atjj atjj, final tdz a, final isk isk, final qv qv, final sgv sgv, final abaa abaa, final aazo aazo, final abbo abbo, final abcn abcn, final abbb abbb, final abbf abbf, final iwu iwu, final shs shs, final shg shg, final LiveOverlayPresenter liveOverlayPresenter, final aaxm aaxm, final CreatorEndscreenOverlayPresenter creatorEndscreenOverlayPresenter, final SubtitlesOverlayPresenter subtitlesOverlayPresenter, final abav abav, final aatb aatb, final aatk aatk, final abay abay, final iro iro, final iss iss, final MdxOverlaysPresenter mdxOverlaysPresenter, final jcg jcg, final NoSoundMemoOverlay noSoundMemoOverlay, final ixz ixz, final iwr iwr, final abns c, final vzj vzj, final fpl fpl, final irc irc, final jai jai, final atjj atjj2, final irm irm, final aayj aayj, final iwy iwy, final irc irc2, final irc irc3, final byte[] array, final byte[] array2, final byte[] array3) {
        super(qv, (byte[])null, (byte[])null);
        this.a = a;
        this.c = c;
        this.b = new asib();
        final ArrayList d = new ArrayList();
        (this.d = d).add(aapf);
        d.add(isk);
        d.add(noSoundMemoOverlay);
        d.add(iwu);
        final ArrayList e = new ArrayList();
        (this.e = e).add(liveOverlayPresenter);
        e.add(aatk);
        e.add(aatb);
        e.add(atjj.a());
        e.add(abaa.T);
        e.add(iro);
        e.add(iss);
        final ArrayList f = new ArrayList();
        (this.f = f).add(subtitlesOverlayPresenter);
        f.add(aazo);
        f.add(abay);
        f.add(abbo);
        f.add(abcn);
        f.add(abbb);
        f.add(abbf);
        final ArrayList g = new ArrayList();
        (this.g = g).add(abav.m);
        g.add(aaxm.t);
        g.add(creatorEndscreenOverlayPresenter.t);
        g.add(jcg);
        g.add(fpl);
        g.add(irc);
        g.add(jai);
        g.add(irm);
        g.add(aayj);
        g.add(iwy);
        g.add(atjj2.a());
        g.add(irc2);
        g.add(irc3);
        final ArrayList h = new ArrayList();
        (this.h = h).add(sgv);
        h.add(shs);
        h.add(shg);
        final ArrayList i = new ArrayList();
        (this.i = i).add(aaxm.b());
        i.add(creatorEndscreenOverlayPresenter.u);
        i.add(abaa.U);
        i.add(abav.t);
        i.add(mdxOverlaysPresenter);
        i.add(ixz);
        i.add(iwr);
        i.add(liveOverlayPresenter.n);
        i.add(vzj);
    }
    
    private final void a(final Collection collection) {
        final Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            final asic[] lx = ((abnq)iterator.next()).lX(this.c);
            if (lx != null) {
                this.b.f(lx);
            }
        }
    }
    
    private final void b(final Collection collection) {
        final Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            this.b.f(((abnq)iterator.next()).lX(this.c));
        }
    }
    
    public final void lV() {
        this.b.b();
        final Iterator iterator = this.i.iterator();
        while (iterator.hasNext()) {
            this.a.m(iterator.next());
        }
    }
    
    public final void qB() {
        this.b(this.d);
        this.b(this.h);
        this.a(this.e);
        this.a(this.f);
        this.a(this.g);
        final Iterator iterator = this.i.iterator();
        while (iterator.hasNext()) {
            this.a.g(iterator.next());
        }
    }
}
