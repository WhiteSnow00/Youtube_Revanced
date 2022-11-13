import android.text.TextUtils;
import android.os.Bundle;
import com.google.android.apps.youtube.app.common.ui.navigation.PaneDescriptor;
import java.util.Iterator;
import com.google.android.libraries.youtube.logging.interaction.InteractionLoggingScreen;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hxw
{
    public static void a(final wyw wyw, final String c) {
        final InteractionLoggingScreen a = wyw.a();
        if (a != null) {
            a.c();
            final int f = a.f;
            final ahaz builder = ((ahbh)alhi.a).createBuilder();
            final ahaz builder2 = ((ahbh)algz.a).createBuilder();
            builder2.copyOnWrite();
            final algz algz = (algz)builder2.instance;
            algz.b |= 0x1;
            algz.c = c;
            builder2.copyOnWrite();
            final algz algz2 = (algz)builder2.instance;
            algz2.b |= 0x2;
            algz2.d = f;
            builder.copyOnWrite();
            final alhi alhi = (alhi)builder.instance;
            final algz m = (algz)builder2.build();
            m.getClass();
            alhi.m = m;
            alhi.b |= 0x4000;
            final alhi alhi2 = (alhi)builder.build();
            final appm g = wyw.g(new Object(), xaa.c(22811));
            wyw.D(xmm.ac(g));
            wyw.t(xmm.ac(g), alhi2);
        }
    }
    
    public static anjs b(final anjx anjx) {
        if (anjx == null) {
            return null;
        }
        for (final anjy anjy : anjx.d) {
            if ((anjy.b & 0x8) != 0x0) {
                anjs anjs;
                if ((anjs = anjy.d) == null) {
                    anjs = anjs.a;
                }
                return anjs;
            }
        }
        return null;
    }
    
    public static anjt c(final anjx anjx) {
        if (anjx == null) {
            return null;
        }
        for (final anjy anjy : anjx.d) {
            if ((anjy.b & 0x4) != 0x0) {
                anjt anjt;
                if ((anjt = anjy.c) == null) {
                    anjt = anjt.a;
                }
                return anjt;
            }
        }
        return null;
    }
    
    public static final PaneDescriptor d(final String s) {
        final Bundle a = PaneDescriptor.a();
        a.putString("playlist_id", s);
        return new PaneDescriptor((Class)hxe.class, a, true);
    }
    
    public static String e(final akli akli) {
        if (akli != null) {
            if (akli.d.size() != 0) {
                for (final aklj aklj : akli.d) {
                    final int bo = adyf.bo(aklj.b);
                    if (bo != 0 && bo == 5) {
                        for (final alkt alkt : aklj.c) {
                            if (TextUtils.equals((CharSequence)alkt.e, (CharSequence)"context")) {
                                if (alkt.c == 2) {
                                    return (String)alkt.d;
                                }
                                return "";
                            }
                        }
                    }
                }
            }
        }
        return null;
    }
    
    public static void f(final Throwable t, final Throwable t2) {
        try {
            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(t, t2);
        }
        catch (final Exception ex) {}
    }
}
