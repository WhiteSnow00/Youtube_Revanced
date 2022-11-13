import android.media.AudioFormat;
import android.media.Spatializer;
import com.google.android.libraries.youtube.innertube.model.SearchResponseModel;
import android.media.AudioAttributes;
import android.media.AudioFormat$Builder;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import android.text.TextUtils;
import com.google.android.apps.youtube.app.common.ui.navigation.PaneDescriptor;
import android.view.View;
import java.util.ArrayList;
import java.util.Set;
import com.google.android.apps.youtube.app.watch.panel.ui.DefaultWatchPanelViewController;
import com.google.android.apps.youtube.app.search.OnlineSearchController;
import android.content.SharedPreferences;

// 
// Decompiled by Procyon v0.6.0
// 

public final class etr implements aezs
{
    public final Object a;
    private final int b;
    
    public etr(final SharedPreferences a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public etr(final bqv a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public etr(final OnlineSearchController a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public etr(final DefaultWatchPanelViewController a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public etr(final how a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public etr(final hwm a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public etr(final hzv a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public etr(final ihx a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public etr(final ine a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public etr(final String a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public etr(final Set a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public etr(final jgv a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public etr(final lek a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public etr(final pas a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public etr(final sqq a, final int b, final byte[] array, final byte[] array2) {
        this.b = b;
        this.a = a;
    }
    
    public final boolean a(final Object o) {
        final int b = this.b;
        final boolean b2 = false;
        final int n = 0;
        boolean b3 = false;
        switch (b) {
            default: {
                final Object a = this.a;
                final moq moq = (moq)o;
                final pas pas = (pas)a;
                final afpu c = pas.c;
                if (c != null) {
                    moq.e = c;
                }
                final Integer d = pas.d;
                if (d != null) {
                    moq.c((int)d);
                }
                if (pas.h != 1) {
                    moq.m = 0;
                }
                final int[] f = pas.f;
                if (!moq.a.g()) {
                    if (moq.a.g()) {
                        throw new IllegalArgumentException("addExperimentIds forbidden on deidentified logger");
                    }
                    if (f != null) {
                        final int length = f.length;
                        if (length != 0) {
                            if (moq.h == null) {
                                moq.h = new ArrayList();
                            }
                            for (int i = 0; i < length; ++i) {
                                moq.h.add(f[i]);
                            }
                        }
                    }
                }
                final int[] g = pas.g;
                if (g != null) {
                    for (int j = n; j < g.length; ++j) {
                        final int n2 = g[j];
                        if (moq.f == null) {
                            moq.f = new ArrayList();
                        }
                        moq.f.add(n2);
                    }
                }
                return true;
            }
            case 19: {
                return ((String)this.a).startsWith((String)o);
            }
            case 18: {
                return !((lek)this.a).b.contains(o) && !(o instanceof acqe);
            }
            case 17: {
                final Object a2 = this.a;
                final View view = (View)o;
                final gkp t = ((DefaultWatchPanelViewController)a2).t;
                if (t != null) {
                    final View k = t.i;
                    if (k != null && view == k) {
                        return true;
                    }
                }
                return false;
            }
            case 16: {
                return !((Set)this.a).contains(o) || o instanceof aito;
            }
            case 15: {
                return ((sqq)this.a).A((String)o);
            }
            case 14: {
                return ((String)this.a).equals(o);
            }
            case 13: {
                final Object a3 = this.a;
                final aovi aovi = (aovi)o;
                final SearchResponseModel e = ((OnlineSearchController)a3).e;
                if (e != null) {
                    final akyz a4 = e.a;
                    aovi a5;
                    final aovi aovi2 = a5 = null;
                    if (a4 != null) {
                        akyx akyx;
                        if ((akyx = a4.j) == null) {
                            akyx = akyx.a;
                        }
                        a5 = aovi2;
                        if (akyx.b == 152873793) {
                            akyx akyx2;
                            if ((akyx2 = a4.j) == null) {
                                akyx2 = akyx.a;
                            }
                            if (akyx2.b == 152873793) {
                                a5 = (aovi)akyx2.c;
                            }
                            else {
                                a5 = aovi.a;
                            }
                        }
                    }
                    if (a5 != null && a5.d.equals(aovi.d)) {
                        return true;
                    }
                }
                return false;
            }
            case 12: {
                return TextUtils.equals((CharSequence)ger.j((PaneDescriptor)o), (CharSequence)ger.j(((jgv)this.a).b.d()));
            }
            case 11: {
                final Object a6 = this.a;
                final PlaybackStartDescriptor playbackStartDescriptor = (PlaybackStartDescriptor)o;
                if (((ine)a6).a.o()) {
                    if (playbackStartDescriptor == null) {
                        return b3;
                    }
                    if (TextUtils.isEmpty((CharSequence)playbackStartDescriptor.i())) {
                        return false;
                    }
                }
                b3 = true;
                return b3;
            }
            case 10: {
                final Object a7 = this.a;
                final amul amul = (amul)o;
                final int cu = aqsx.cU(amul.c);
                if (cu != 0) {
                    if (cu == 4) {
                        amuj amuj;
                        if ((amuj = amul.e) == null) {
                            amuj = amuj.b;
                        }
                        final alzg alzg = (alzg)((ahbc)amuj).rx((ahaq)alzg.b);
                        final alzg a8 = ((ihx)a7).a;
                        final int c2 = a8.c;
                        if ((c2 & 0x20) != 0x0) {
                            final int c3 = alzg.c;
                            if ((c3 & 0x20) != 0x0 && a8.i == alzg.i && (c2 & 0x40) != 0x0 && (c3 & 0x40) != 0x0 && a8.j == alzg.j) {
                                return true;
                            }
                        }
                    }
                }
                return false;
            }
            case 9: {
                return ((hzv)this.a).b.contains(glb.a((Object)o));
            }
            case 8: {
                return ((Set)((hwm)this.a).j).contains(glb.a((Object)o));
            }
            case 7: {
                return ((String)this.a).equals(o);
            }
            case 6: {
                return ((how)this.a).bA.contains(glb.a((Object)o));
            }
            case 5: {
                return ((sqq)this.a).A((String)o);
            }
            case 4: {
                return ((SharedPreferences)this.a).contains((String)o);
            }
            case 3: {
                return ((String)this.a).equals(o);
            }
            case 2: {
                return ((sqq)this.a).A((String)o);
            }
            case 1: {
                final Object a9 = this.a;
                final ayg ayg = (ayg)o;
                synchronized (((bqv)a9).c) {
                    if (((bqv)a9).f.L && !((bqv)a9).e && ayg.A > 2) {
                        final String n3 = ayg.n;
                        if (n3 != null) {
                            int n4 = 0;
                            Label_1050: {
                                switch (n3.hashCode()) {
                                    case 1504578661: {
                                        if (n3.equals("audio/eac3")) {
                                            n4 = 1;
                                            break Label_1050;
                                        }
                                        break;
                                    }
                                    case 187078297: {
                                        if (n3.equals("audio/ac4")) {
                                            n4 = 3;
                                            break Label_1050;
                                        }
                                        break;
                                    }
                                    case 187078296: {
                                        if (n3.equals("audio/ac3")) {
                                            n4 = 0;
                                            break Label_1050;
                                        }
                                        break;
                                    }
                                    case -2123537834: {
                                        if (n3.equals("audio/eac3-joc")) {
                                            n4 = 2;
                                            break Label_1050;
                                        }
                                        break;
                                    }
                                }
                                n4 = -1;
                            }
                            if (n4 == 0 || n4 == 1 || n4 == 2 || n4 == 3) {
                                if (bax.a < 32) {
                                    return true;
                                }
                                final bqq g2 = ((bqv)a9).g;
                                if (g2 == null) {
                                    return true;
                                }
                                if (!g2.b) {
                                    return true;
                                }
                            }
                        }
                        boolean b4 = b2;
                        if (bax.a < 32) {
                            return b4;
                        }
                        final bqq g3 = ((bqv)a9).g;
                        b4 = b2;
                        if (g3 == null) {
                            return b4;
                        }
                        b4 = b2;
                        if (!g3.b) {
                            return b4;
                        }
                        b4 = b2;
                        if (!g3.a.isAvailable()) {
                            return b4;
                        }
                        b4 = b2;
                        if (!((bqv)a9).g.a.isEnabled()) {
                            return b4;
                        }
                        final bqq g4 = ((bqv)a9).g;
                        final axu h = ((bqv)a9).h;
                        int a10;
                        if ("audio/eac3-joc".equals(ayg.n) && ayg.A == 16) {
                            a10 = 12;
                        }
                        else {
                            a10 = ayg.A;
                        }
                        final AudioFormat$Builder setChannelMask = new AudioFormat$Builder().setEncoding(2).setChannelMask(bax.g(a10));
                        final int b5 = ayg.B;
                        if (b5 != -1) {
                            setChannelMask.setSampleRate(b5);
                        }
                        final Spatializer a11 = g4.a;
                        final Object a12 = h.a().a;
                        final AudioFormat build = setChannelMask.build();
                        b4 = b2;
                        if (!a11.canBeSpatialized((AudioAttributes)a12, build)) {
                            return b4;
                        }
                    }
                    return true;
                }
            }
            case 0: {
                return ((String)this.a).equals(o);
            }
        }
    }
}
