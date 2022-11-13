import java.util.List;
import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import com.google.android.libraries.youtube.player.subtitles.model.SubtitleTrack;
import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData;
import java.util.Iterator;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import android.media.AudioManager$OnAudioFocusChangeListener;
import android.text.TextUtils;
import java.util.concurrent.Executor;
import android.net.Uri;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abpj implements asjm
{
    public final Object a;
    private final int b;
    
    public abpj(final aakg a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public abpj(final aakn a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public abpj(final abol a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public abpj(final abpq a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public abpj(final abqd a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public abpj(final abqz a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public abpj(final abru a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public abpj(final abry a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public abpj(final absb a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public abpj(final abzv a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public abpj(final acid a, final int b, final byte[] array, final byte[] array2) {
        this.b = b;
        this.a = a;
    }
    
    public abpj(final asiq a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void a(Object a) {
        final int b = this.b;
        final PlayerResponseModel playerResponseModel = null;
        final String s = null;
        switch (b) {
            default: {
                final Object a2 = this.a;
                final aamb aamb = (aamb)a;
                final Iterator iterator = ((abry)a2).b.values().iterator();
                while (iterator.hasNext()) {
                    ((zaa)iterator.next()).j(aamb.a());
                }
                return;
            }
            case 19: {
                final Object a3 = this.a;
                final aans aans = (aans)a;
                final abke c = aans.c();
                final abke a4 = abke.a;
                final int ordinal = c.ordinal();
                if (ordinal != 0) {
                    if (ordinal == 5 || ordinal == 8) {
                        PlayerResponseModel playerResponseModel2;
                        if (aans.c().h()) {
                            playerResponseModel2 = aans.a();
                        }
                        else {
                            playerResponseModel2 = aans.b();
                        }
                        if (playerResponseModel2 != null) {
                            final VideoStreamingData n = playerResponseModel2.n();
                            Uri parse;
                            if (n != null && !n.b.j.isEmpty()) {
                                parse = Uri.parse(n.b.j);
                            }
                            else {
                                parse = null;
                            }
                            aipp aipp;
                            if ((aipp = playerResponseModel2.m().c.G) == null) {
                                aipp = aipp.a;
                            }
                            final int b2 = aipp.b;
                            String s2;
                            if (aans.a() != null) {
                                s2 = aans.k();
                            }
                            else {
                                s2 = s;
                                if (aans.b() != null) {
                                    s2 = aans.e();
                                }
                            }
                            final String k = playerResponseModel2.K();
                            final abru abru = (abru)a3;
                            if (!k.equals(abru.b)) {
                                abru.b = k;
                                final aujg c2 = abru.c;
                                final Executor executor = (Executor)((atke)c2.b).a();
                                executor.getClass();
                                final zap zap = (zap)((atke)c2.c).a();
                                zap.getClass();
                                final agoe agoe = (agoe)((atke)c2.a).a();
                                agoe.getClass();
                                a = new abrs(executor, zap, agoe, parse, b2, s2, (byte[])null, (byte[])null, (byte[])null);
                                abru.a = (abrs)a;
                                if (((abrs)a).c != null) {
                                    ((abrs)a).a.execute((Runnable)new abei((abrs)a, 20));
                                }
                            }
                        }
                    }
                }
                else {
                    final abru abru2 = (abru)a3;
                    abru2.b = null;
                    final abrs a5 = abru2.a;
                    if (a5 != null) {
                        a5.e = true;
                        final Thread f = a5.f;
                        if (f != null) {
                            f.interrupt();
                        }
                        abru2.a = null;
                    }
                }
                return;
            }
            case 18: {
                final Object a6 = this.a;
                final aama aama = (aama)a;
                ((asiq)a6).dispose();
                return;
            }
            case 17: {
                ((abqz)this.a).b((aamb)a);
                return;
            }
            case 16: {
                final Object a7 = this.a;
                final abiw abiw = (abiw)a;
                ((abqz)a7).p();
                return;
            }
            case 15: {
                ((abqz)this.a).c((aamh)a);
                return;
            }
            case 14: {
                ((abqz)this.a).d((aanl)a);
                return;
            }
            case 13: {
                ((abzv)this.a).c((aanw)a);
                return;
            }
            case 12: {
                ((abzv)this.a).b((aans)a);
                return;
            }
            case 11: {
                final Object a8 = this.a;
                final aama aama2 = (aama)a;
                ((abqd)a8).b.s();
                return;
            }
            case 10: {
                final Object a9 = this.a;
                final ypj ypj = (ypj)a;
                final absb absb = (absb)a9;
                final abtj j = absb.j;
                final FormatStreamModel e = ypj.e();
                if (j != null && e != null) {
                    if (!e.q().isEmpty()) {
                        final String q = e.q();
                        final Iterator<Object> iterator2 = ((List<Object>)j.a.c).iterator();
                        int c3 = 0;
                        while (iterator2.hasNext()) {
                            final aneb b3 = iterator2.next();
                            if (TextUtils.equals((CharSequence)q, (CharSequence)b3.c)) {
                                j.b = b3;
                                j.c = c3;
                                break;
                            }
                            ++c3;
                        }
                        final SubtitleTrack i = absb.i;
                        if (i != null && i.n()) {
                            absb.i = null;
                        }
                        final SubtitleTrack l = absb.i;
                        if (l != null) {
                            final SubtitleTrack c4 = j.c(l.e());
                            if (c4 != null) {
                                absb.i = c4;
                            }
                        }
                        absb.i(absb.i, false);
                    }
                }
                return;
            }
            case 9: {
                final Object a10 = this.a;
                final aans aans2 = (aans)a;
                if (aans2.c().a(new abke[] { abke.a })) {
                    ((absb)a10).g();
                    return;
                }
                if (aans2.c().a(new abke[] { abke.c, abke.i, abke.f })) {
                    PlayerResponseModel m;
                    if (aans2.c() == abke.f) {
                        m = playerResponseModel;
                        if (aans2.a() != null) {
                            m = aans2.a();
                        }
                    }
                    else {
                        m = aans2.b();
                    }
                    final absb absb2 = (absb)a10;
                    if (!adkp.ae(m, absb2.k)) {
                        if ((absb2.k = m) == null) {
                            absb2.g();
                            return;
                        }
                        absb2.f(m, m.D());
                    }
                }
                return;
            }
            case 8: {
                ((abpq)this.a).v((abkh)a);
                return;
            }
            case 7: {
                final Object a11 = this.a;
                final aang aang = (aang)a;
                ((abpq)a11).ac();
                return;
            }
            case 6: {
                final Object a12 = this.a;
                final boolean f2 = ((aanw)a).f();
                final aakn aakn = (aakn)a12;
                aakn.h = f2;
                if (f2) {
                    aakn.b();
                }
                return;
            }
            case 5: {
                final Object a13 = this.a;
                if (((aanb)a).a()) {
                    abjf.a(abje.b, "AudioFocus Abandoned", new Object[0]);
                    final aakg aakg = (aakg)a13;
                    if (aakg.d.abandonAudioFocus((AudioManager$OnAudioFocusChangeListener)aakg.e) == 1) {
                        aakg.j = 0;
                    }
                    return;
                }
                ((aakg)a13).a();
                return;
            }
            case 4: {
                final Object a14 = this.a;
                if (((aanw)a).a() == 2) {
                    final aakg aakg2 = (aakg)a14;
                    aakg2.g.a();
                    if (aakg2.j == 0) {
                        final PlayerResponseModel k2 = aakg2.k;
                        PlayerConfigModel playerConfigModel;
                        if (k2 != null) {
                            playerConfigModel = k2.m();
                        }
                        else {
                            playerConfigModel = aakg2.c.b();
                        }
                        if (aakg2.b.a() != 0.0f && aakg2.b.s != 2) {
                            if (playerConfigModel != null) {
                                if (playerConfigModel.ax()) {
                                    return;
                                }
                                if (playerConfigModel.az() && aakg2.b.s == 1) {
                                    return;
                                }
                            }
                            aakg2.a();
                        }
                    }
                }
                return;
            }
            case 3: {
                final Object a15 = this.a;
                final aans aans3 = (aans)a;
                if (aans3.c() == abke.h) {
                    ((aakg)a15).k = aans3.b();
                    return;
                }
                if (aans3.c() == abke.e) {
                    ((aakg)a15).k = aans3.a();
                    return;
                }
                if (aans3.c() == abke.c) {
                    ((aakg)a15).g.a();
                }
                return;
            }
            case 2: {
                final Object a16 = this.a;
                final aany aany = (aany)a;
                final acid acid = (acid)a16;
                final vkf vkf = (vkf)((atke)acid.c).a();
                vkf.e.set(vke.a);
                vkf.f.incrementAndGet();
                ashi.E((Object[])new auke[] { (auke)aany.a().J().P((asid)acid.d).C((asjr)new zgy(acid, 19, (byte[])null, (byte[])null)), (auke)aany.a().G(), (auke)aany.a().I(), (auke)aany.a().Y().f() }).D(askj.a, 4).aj().ab((asjm)new abpj(acid, 0, null, null), (asjm)abfd.j);
                return;
            }
            case 1: {
                final Object a17 = this.a;
                final aani aani = (aani)a;
                if (aani.c() == abkb.e) {
                    final abol abol = (abol)a17;
                    if (abol.j) {
                        if (((aakl)abol.c.a()).c(abop.c) == 2) {
                            abol.h = true;
                            abol.b.post(abol.f);
                            abol.j = false;
                            return;
                        }
                    }
                }
                if (aani.c() == abkb.b) {
                    ((abol)a17).j = false;
                }
                return;
            }
            case 0: {
                ((vkf)((atke)((acid)this.a).c).a()).g();
            }
        }
    }
}
