import java.util.List;
import android.text.TextUtils;
import com.google.protos.youtube.api.innertube.CommandExecutorCommandOuterClass$CommandExecutorCommand;
import com.google.protos.youtube.api.innertube.WatchEndpointOuterClass;
import android.content.res.Configuration;
import android.content.Context;
import java.util.Iterator;
import com.google.protobuf.ExtensionRegistryLite;
import android.graphics.Matrix;
import android.graphics.Bitmap;
import android.content.res.Resources;
import com.google.android.libraries.backup.Backup;

// 
// Decompiled by Procyon v0.6.0
// 

public final class glb
{
    @Backup
    public static final String APP_THEME_APPEARANCE = "app_theme_appearance";
    @Backup
    public static final String APP_THEME_APPEARANCE_EDU_SHOWN = "app_theme_appearance_edu_shown";
    @Backup
    public static final String APP_THEME_DARK = "app_theme_dark";
    @Backup
    public static final String APP_THEME_NOT_MATCH_SYSTEM_EDU_SHOWN = "app_theme_not_match_system_edu_shown";
    @Backup
    public static final String AUTO_SWITCH_THEME_ON_BATTERY_SAVER = "auto_switch_theme_on_battery_saver";
    @Backup
    public static final String AUTO_SWITCH_THEME_ON_BATTERY_SAVER_SETTINGS_TOGGLE = "auto_switch_theme_on_battery_saver_settings_toggle";
    
    public static String A() {
        return G((ahaq)alyv.b, "downloads_list");
    }
    
    public static String B(final appk appk) {
        return F((ahaq)ajib.b, ((agzk)appk).toByteString());
    }
    
    public static String C() {
        return G((ahaq)ajip.b, "");
    }
    
    public static String D(final appk appk) {
        return F((ahaq)ajjf.b, ((agzk)appk).toByteString());
    }
    
    public static String E(final String s) {
        return G((ahaq)ajjy.b, s);
    }
    
    public static String F(final ahaq ahaq, final ahab ahab) {
        return vgl.g(ahaq.a(), ahab);
    }
    
    public static String G(final ahaq ahaq, final String s) {
        return vgl.h(ahaq.a(), s);
    }
    
    public static String H(final String s) {
        return G((ahaq)alzl.b, s);
    }
    
    public static String I(final String d, final String c) {
        final ahbf b = alzq.b;
        final ahaz builder = ((ahbh)alzm.a).createBuilder();
        builder.copyOnWrite();
        final alzm alzm = (alzm)builder.instance;
        d.getClass();
        alzm.b |= 0x2;
        alzm.d = d;
        builder.copyOnWrite();
        final alzm alzm2 = (alzm)builder.instance;
        c.getClass();
        alzm2.b |= 0x1;
        alzm2.c = c;
        return F((ahaq)b, ((agzk)builder.build()).toByteString());
    }
    
    public static String J(final String s) {
        return G((ahaq)amas.b, s);
    }
    
    public static String K() {
        return G((ahaq)alzb.b, "OFFLINE_GENERATION_STATUS_ENTITY_ID_PES_TO_IMES");
    }
    
    public static String L() {
        return G((ahaq)alzb.b, "video");
    }
    
    public static String M(final String s) {
        return G((ahaq)amwc.b, s);
    }
    
    public static String N(final String s) {
        return G((ahaq)amwi.b, s);
    }
    
    public static String O(final String s) {
        return G((ahaq)amwm.b, s);
    }
    
    public static String P(final String s) {
        return G((ahaq)ancz.b, s);
    }
    
    public static String Q(final String s) {
        return G((ahaq)apyz.b, s);
    }
    
    public static String R(final String s) {
        return G((ahaq)alzf.b, s);
    }
    
    public static String S(final String d, final String c) {
        final ahbf b = apzg.b;
        final ahaz builder = ((ahbh)apzc.a).createBuilder();
        builder.copyOnWrite();
        final apzc apzc = (apzc)builder.instance;
        d.getClass();
        apzc.b |= 0x2;
        apzc.d = d;
        builder.copyOnWrite();
        final apzc apzc2 = (apzc)builder.instance;
        c.getClass();
        apzc2.b |= 0x1;
        apzc2.c = c;
        return F((ahaq)b, ((agzk)builder.build()).toByteString());
    }
    
    public static String T() {
        return G((ahaq)alyv.b, "DOWNLOADS_LIST_ENTITY_ID_DOWNLOAD_RECOMMENDATIONS");
    }
    
    public static String U(final String s) {
        return G((ahaq)alzy.b, s);
    }
    
    public static String V() {
        return G((ahaq)alyv.b, "DOWNLOADS_LIST_ENTITY_ID_SMART_DOWNLOADS");
    }
    
    public static String W(final String s) {
        return G((ahaq)aoxd.b, s);
    }
    
    public static String X(final String s) {
        return G((ahaq)apzn.b, s);
    }
    
    public static String Y(final String s) {
        return G((ahaq)aman.b, s);
    }
    
    public static String Z(final String s) {
        return G((ahaq)apnq.b, s);
    }
    
    public static final String a(final Object o) {
        if (o instanceof aicz) {
            return ((aicz)o).k;
        }
        if (o instanceof aivd) {
            return ((aivd)o).l;
        }
        if (o instanceof ajzw) {
            final ajzw ajzw = (ajzw)o;
            if ((ajzw.b & 0x40000) != 0x0) {
                return ajzw.c;
            }
            return null;
        }
        else {
            if (o instanceof alqd) {
                return ((alqd)o).c;
            }
            if (o instanceof alpo) {
                return ((alpo)o).g;
            }
            if (o instanceof alpj) {
                return ((alpj)o).e;
            }
            if (o instanceof alrc) {
                return ((alrc)o).j;
            }
            if (o instanceof amgs) {
                return ((amgs)o).g;
            }
            if (o instanceof anbp) {
                return ((anbp)o).f;
            }
            if (o instanceof anbm) {
                return ((anbm)o).f;
            }
            if (o instanceof aome) {
                return ((aome)o).s;
            }
            if (o instanceof aorj) {
                return ((aorj)o).l;
            }
            if (o instanceof aidi) {
                return ((aidi)o).t;
            }
            if (o instanceof aovi) {
                return ((aovi)o).d;
            }
            if (o instanceof amlp) {
                final amlp amlp = (amlp)o;
                if ((amlp.b & 0x1000) != 0x0) {
                    return amlp.j;
                }
            }
            return null;
        }
    }
    
    public static final Bitmap aa(final Resources resources, final Bitmap bitmap) {
        final int height = bitmap.getHeight();
        final int width = bitmap.getWidth();
        final int min = Math.min(height, (int)(width / resources.getFraction(2131361819, 1, 1)));
        final float n = (float)resources.getDimensionPixelSize(2131168293);
        final float n2 = (float)min;
        final Matrix matrix = new Matrix();
        final float n3 = n / n2;
        matrix.setScale(n3, n3, 0.0f, 0.0f);
        return Bitmap.createBitmap(bitmap, (width - min) / 2, (height - min) / 2, min, min, matrix, false);
    }
    
    public static void ab(final Throwable t, final Throwable t2) {
        try {
            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(t, t2);
        }
        catch (final Exception ex) {}
    }
    
    public static boolean ac(final vaf vaf) {
        aoqn aoqn;
        if ((aoqn = vaf.b().s) == null) {
            aoqn = aoqn.a;
        }
        ahub ahub;
        if ((ahub = aoqn.g) == null) {
            ahub = ahub.a;
        }
        return ahub.m;
    }
    
    public static appk ad(String o, final bhv bhv) {
        final Object o2 = null;
        try {
            alxw alxw;
            if ((alxw = ((arwh)bhv.a).f().e) == null) {
                alxw = alxw.a;
            }
            if (alxw.aD) {
                final ahab c = vgl.c((String)o);
                if (c.H()) {
                    o = o2;
                }
                else {
                    o = ahbh.parseFrom((ahbh)appk.a, c, ExtensionRegistryLite.getGeneratedRegistry());
                }
                return (appk)o;
            }
            return (appk)ahbh.parseFrom((ahbh)appk.a, vgl.c((String)o), ExtensionRegistryLite.getGeneratedRegistry());
        }
        catch (final ahca ahca) {
            final StringBuilder sb = new StringBuilder("Found entityKey=`");
            sb.append((String)o);
            sb.append("` that does not contain a ViewModelEntityId message as it's identifier.");
            ttr.b(sb.toString());
            return null;
        }
    }
    
    private static final gln ae(final Object o) {
        if (o instanceof glq) {
            return gln.b;
        }
        if (o instanceof akgc) {
            return gln.c;
        }
        if (o instanceof hzl) {
            return gln.d;
        }
        if (o instanceof anqm) {
            return gln.f;
        }
        if (o instanceof kne) {
            for (final aifg aifg : ((kne)o).a.c) {
                ajdb a;
                if (aifg.b == 144881215) {
                    a = (ajdb)aifg.c;
                }
                else {
                    a = ajdb.a;
                }
                if (a.c == 18) {
                    return gln.g;
                }
            }
        }
        if (o instanceof ajdb) {
            return gln.h;
        }
        if (o instanceof kai) {
            return gln.i;
        }
        if (o instanceof kaj) {
            return gln.j;
        }
        if (o instanceof anps) {
            return gln.k;
        }
        if (o instanceof anpr) {
            return gln.l;
        }
        if (o instanceof anpy) {
            return gln.m;
        }
        if (o instanceof anpz) {
            return gln.n;
        }
        if (af(o)) {
            return gln.e;
        }
        return gln.a;
    }
    
    private static boolean af(final Object o) {
        if (o instanceof akgk) {
            akgj akgj;
            if ((akgj = ((akgk)o).h) == null) {
                akgj = akgj.a;
            }
            if (akgj.b == 83537025) {
                return true;
            }
        }
        return false;
    }
    
    private static amtd ag(final aaar aaar) {
        final amuw k = aaar.k;
        if (k == null) {
            return null;
        }
        if (k.j.size() != 0) {
            for (final amuv amuv : k.j) {
                if ((amuv.b & 0x2) != 0x0) {
                    amtd amtd;
                    if ((amtd = amuv.c) == null) {
                        amtd = amtd.a;
                    }
                    return amtd;
                }
            }
        }
        return null;
    }
    
    public static boolean b(final tmx tmx) {
        return !((gkw)tmx.c()).h;
    }
    
    public static void c(final Context context) {
        d(false, context);
    }
    
    public static void d(final boolean b, final Context context) {
        final Configuration configuration = context.getResources().getConfiguration();
        final int uiMode = configuration.uiMode;
        int n;
        if (!b) {
            n = 16;
        }
        else {
            n = 32;
        }
        configuration.uiMode = (n | (uiMode & 0xFFFFFFCF));
        context.getResources().updateConfiguration(configuration, context.getResources().getDisplayMetrics());
    }
    
    public static byte[] e(final aiqj aiqj) {
        if (aiqj != null && (aiqj.b & 0x1) != 0x0) {
            return aiqj.c.I();
        }
        return vap.b;
    }
    
    public static final glq f(final Object o) {
        final gln ae = ae(o);
        final float o2 = ae.o;
        switch (ae.ordinal()) {
            case 13: {
                return new glq((anpz)o);
            }
            case 12: {
                return new glq((anpy)o);
            }
            case 11: {
                return new glq((anpr)o);
            }
            case 10: {
                return new glq((anps)o);
            }
            case 9: {
                return new glq((kaj)o);
            }
            case 8: {
                return new glq((kai)o);
            }
            case 7: {
                return new glq((ajdb)o);
            }
            case 6: {
                return new glq(((kne)o).a);
            }
            case 5: {
                return new glq((anqm)o);
            }
            case 4: {
                if (af(o)) {
                    return new glq((akgk)o);
                }
                break;
            }
            case 3: {
                return new glq((hzl)o);
            }
            case 2: {
                return new glq((akgc)o);
            }
            case 1: {
                return (glq)o;
            }
        }
        return null;
    }
    
    public static final akfz g(final akgc akgc) {
        if (akgc != null) {
            akga akga;
            if ((akga = akgc.g) == null) {
                akga = akga.a;
            }
            if ((akga.b & 0x1) != 0x0) {
                akga akga2;
                if ((akga2 = akgc.g) == null) {
                    akga2 = akga.a;
                }
                akfz akfz;
                if ((akfz = akga2.c) == null) {
                    akfz = akfz.a;
                }
                return akfz;
            }
        }
        return null;
    }
    
    public static final boolean h(final Object o) {
        return ae(o) != gln.a;
    }
    
    public static aiqj i(aiqj aiqj) {
        if (aiqj == null) {
            return null;
        }
        if (((ahbc)aiqj).ry((ahaq)WatchEndpointOuterClass.watchEndpoint)) {
            return aiqj;
        }
        if (((ahbc)aiqj).ry((ahaq)CommandExecutorCommandOuterClass$CommandExecutorCommand.commandExecutorCommand)) {
            final Iterator<Object> iterator = ((List<Object>)((CommandExecutorCommandOuterClass$CommandExecutorCommand)((ahbc)aiqj).rx((ahaq)CommandExecutorCommandOuterClass$CommandExecutorCommand.commandExecutorCommand)).b).iterator();
            while (iterator.hasNext()) {
                aiqj = iterator.next();
                if (((ahbc)aiqj).ry((ahaq)WatchEndpointOuterClass.watchEndpoint)) {
                    return aiqj;
                }
            }
        }
        return null;
    }
    
    public static boolean j(final glm glm) {
        return glm.t() == 5;
    }
    
    public static boolean k(final glm glm) {
        return glm.t() == 4;
    }
    
    public static boolean l(final glm glm, final glm glm2) {
        if (glm2 == null) {
            return false;
        }
        aiqj aiqj;
        if (glm.d() != null) {
            aiqj = glm.d();
        }
        else {
            aiqj = glm.c();
        }
        aiqj aiqj2;
        if (glm2.d() != null) {
            aiqj2 = glm2.d();
        }
        else {
            aiqj2 = glm2.c();
        }
        final aiqj i = i(aiqj);
        final aiqj j = i(aiqj2);
        if (i != null && j != null) {
            return abjr.h(i, j);
        }
        return TextUtils.equals((CharSequence)glm.i(), (CharSequence)glm2.i());
    }
    
    public static void m(final glm glm) {
        if (!glm.q()) {
            glm.p();
        }
    }
    
    public static boolean n(final float n, final float n2) {
        return Math.abs(n - n2) < 0.005f;
    }
    
    public static boolean o(final float n, final float n2) {
        return !n(n, n2) && n < n2;
    }
    
    public static boolean p(final float n) {
        return !n(n, 1.777f) && n > 1.777f;
    }
    
    public static aotp q(final aaar aaar) {
        final amtd ag = ag(aaar);
        if (ag != null && (ag.b & 0x2) != 0x0) {
            aotp aotp;
            if ((aotp = ag.d) == null) {
                aotp = aotp.a;
            }
            return aotp;
        }
        return null;
    }
    
    public static int r(final aaar aaar) {
        final amtd ag = ag(aaar);
        int ae;
        final int n = ae = 1;
        if (ag != null) {
            ae = n;
            if ((ag.b & 0x1) != 0x0) {
                ae = aefb.ae(ag.c);
                if (ae == 0) {
                    ae = n;
                }
            }
        }
        return ae;
    }
    
    public static String s(final String s) {
        return G((ahaq)ahmd.b, s);
    }
    
    public static String t(final String s) {
        return G((ahaq)apyk.b, s);
    }
    
    @Deprecated
    public static String u() {
        return G((ahaq)amae.b, "");
    }
    
    public static String v(final appk appk) {
        return F((ahaq)ajgr.b, ((agzk)appk).toByteString());
    }
    
    public static String w(final String s) {
        return G((ahaq)apyo.b, s);
    }
    
    public static String x(final String s) {
        return G((ahaq)apyt.b, s);
    }
    
    public static String y(final appk appk) {
        return F((ahaq)ajgy.b, ((agzk)appk).toByteString());
    }
    
    public static String z() {
        return G((ahaq)alyp.b, "downloads_library");
    }
}
