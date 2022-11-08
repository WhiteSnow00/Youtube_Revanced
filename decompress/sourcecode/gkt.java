import java.util.List;
import com.google.protobuf.ExtensionRegistryLite;
import android.graphics.Matrix;
import android.graphics.Bitmap;
import android.content.res.Resources;
import android.content.Context;
import android.text.TextUtils;
import java.util.Iterator;
import com.google.protos.youtube.api.innertube.CommandExecutorCommandOuterClass$CommandExecutorCommand;
import com.google.protos.youtube.api.innertube.WatchEndpointOuterClass;
import app.revanced.integrations.patches.NewActionbarPatch;
import com.google.android.libraries.backup.Backup;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gkt
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
    
    public static boolean A(final uyf uyf) {
        final ains b = uyf.b();
        if (b != null) {
            alvl alvl;
            if ((alvl = b.e) == null) {
                alvl = alvl.a;
            }
            if (alvl.aH) {
                return true;
            }
        }
        return false;
    }
    
    public static boolean B(final uyf uyf) {
        alvl alvl;
        if ((alvl = uyf.b().e) == null) {
            alvl = alvl.a;
        }
        return alvl.bi;
    }
    
    public static boolean C(final uyf uyf) {
        alvl alvl;
        if ((alvl = uyf.b().e) == null) {
            alvl = alvl.a;
        }
        return alvl.aa;
    }
    
    public static boolean D(final uyf uyf) {
        alvl alvl;
        if ((alvl = uyf.b().e) == null) {
            alvl = alvl.a;
        }
        return alvl.bk;
    }
    
    public static boolean E(final uyf uyf) {
        alvl alvl;
        if ((alvl = uyf.b().e) == null) {
            alvl = alvl.a;
        }
        return alvl.aw;
    }
    
    public static boolean F(final uyf uyf) {
        alvl alvl;
        if ((alvl = uyf.b().e) == null) {
            alvl = alvl.a;
        }
        return alvl.O;
    }
    
    public static boolean G(final uyf uyf) {
        alvl alvl;
        if ((alvl = uyf.b().e) == null) {
            alvl = alvl.a;
        }
        return alvl.ak;
    }
    
    public static boolean H(final uyf uyf) {
        alvl alvl;
        if ((alvl = uyf.b().e) == null) {
            alvl = alvl.a;
        }
        return alvl.h;
    }
    
    public static boolean I(final uyf uyf) {
        alvl alvl;
        if ((alvl = uyf.b().e) == null) {
            alvl = alvl.a;
        }
        return alvl.bv;
    }
    
    public static boolean J(final uyf uyf) {
        alvl alvl;
        if ((alvl = uyf.b().e) == null) {
            alvl = alvl.a;
        }
        final boolean y = alvl.y;
        return NewActionbarPatch.getNewActionBar();
    }
    
    public static boolean K(final uyf uyf) {
        alvl alvl;
        if ((alvl = uyf.b().e) == null) {
            alvl = alvl.a;
        }
        return alvl.bt;
    }
    
    public static boolean L(final uyf uyf) {
        alvl alvl;
        if ((alvl = uyf.b().e) == null) {
            alvl = alvl.a;
        }
        return alvl.bs;
    }
    
    public static boolean M(final uyf uyf) {
        alvl alvl;
        if ((alvl = uyf.b().e) == null) {
            alvl = alvl.a;
        }
        return alvl.aN;
    }
    
    public static boolean N(final uyf uyf) {
        alvl alvl;
        if ((alvl = uyf.b().e) == null) {
            alvl = alvl.a;
        }
        return alvl.F;
    }
    
    public static boolean O(final uyf uyf) {
        alvl alvl;
        if ((alvl = uyf.b().e) == null) {
            alvl = alvl.a;
        }
        final boolean u = alvl.U;
        return NewActionbarPatch.getNewActionBar();
    }
    
    public static boolean P(final uyf uyf) {
        alvl alvl;
        if ((alvl = uyf.b().e) == null) {
            alvl = alvl.a;
        }
        return alvl.X;
    }
    
    public static boolean Q(final uyf uyf) {
        final ains b = uyf.b();
        if (b != null) {
            alvl alvl;
            if ((alvl = b.e) == null) {
                alvl = alvl.a;
            }
            if (alvl.bm) {
                return true;
            }
        }
        return false;
    }
    
    public static boolean R(final uyf uyf) {
        alvl alvl;
        if ((alvl = uyf.b().e) == null) {
            alvl = alvl.a;
        }
        apof apof;
        if ((apof = alvl.E) == null) {
            apof = apof.a;
        }
        return apof.b;
    }
    
    public static boolean S(final uyf uyf) {
        alvl alvl;
        if ((alvl = uyf.b().e) == null) {
            alvl = alvl.a;
        }
        apof apof;
        if ((apof = alvl.E) == null) {
            apof = apof.a;
        }
        return apof.d;
    }
    
    public static boolean T(final uyf uyf) {
        alvl alvl;
        if ((alvl = uyf.b().e) == null) {
            alvl = alvl.a;
        }
        return alvl.Y;
    }
    
    public static boolean U(final uyf uyf) {
        alvl alvl;
        if ((alvl = uyf.b().e) == null) {
            alvl = alvl.a;
        }
        return alvl.au;
    }
    
    public static byte[] V(final aioe aioe) {
        if (aioe != null && (aioe.b & 0x1) != 0x0) {
            return aioe.c.I();
        }
        return uyp.b;
    }
    
    public static final gli W(final Object o) {
        final glf bg = bG(o);
        final float o2 = bg.o;
        switch (bg.ordinal()) {
            case 13: {
                return new gli((annw)o);
            }
            case 12: {
                return new gli((annv)o);
            }
            case 11: {
                return new gli((anno)o);
            }
            case 10: {
                return new gli((annp)o);
            }
            case 9: {
                return new gli((jzj)o);
            }
            case 8: {
                return new gli((jzi)o);
            }
            case 7: {
                return new gli((ajax)o);
            }
            case 6: {
                return new gli(((kmd)o).a);
            }
            case 5: {
                return new gli((anoi)o);
            }
            case 4: {
                if (bH(o)) {
                    return new gli((akeh)o);
                }
                break;
            }
            case 3: {
                return new gli((hyp)o);
            }
            case 2: {
                return new gli((akdz)o);
            }
            case 1: {
                return (gli)o;
            }
        }
        return null;
    }
    
    public static final akdw X(final akdz akdz) {
        if (akdz != null) {
            akdx akdx;
            if ((akdx = akdz.g) == null) {
                akdx = akdx.a;
            }
            if ((akdx.b & 0x1) != 0x0) {
                akdx akdx2;
                if ((akdx2 = akdz.g) == null) {
                    akdx2 = akdx.a;
                }
                akdw akdw;
                if ((akdw = akdx2.c) == null) {
                    akdw = akdw.a;
                }
                return akdw;
            }
        }
        return null;
    }
    
    public static final boolean Y(final Object o) {
        return bG(o) != glf.a;
    }
    
    public static aioe Z(aioe aioe) {
        if (aioe == null) {
            return null;
        }
        if (((agzd)aioe).rs((agyr)WatchEndpointOuterClass.watchEndpoint)) {
            return aioe;
        }
        if (((agzd)aioe).rs((agyr)CommandExecutorCommandOuterClass$CommandExecutorCommand.commandExecutorCommand)) {
            final Iterator<Object> iterator = ((List<Object>)((CommandExecutorCommandOuterClass$CommandExecutorCommand)((agzd)aioe).rr((agyr)CommandExecutorCommandOuterClass$CommandExecutorCommand.commandExecutorCommand)).b).iterator();
            while (iterator.hasNext()) {
                aioe = iterator.next();
                if (((agzd)aioe).rs((agyr)WatchEndpointOuterClass.watchEndpoint)) {
                    return aioe;
                }
            }
        }
        return null;
    }
    
    public static boolean a(final tku tku) {
        return !((gkn)tku.c()).h;
    }
    
    public static boolean aA(final arud arud) {
        alvs alvs;
        if ((alvs = arud.f().e) == null) {
            alvs = alvs.a;
        }
        return alvs.aN;
    }
    
    public static boolean aB(final arud arud) {
        alvs alvs;
        if ((alvs = arud.f().e) == null) {
            alvs = alvs.a;
        }
        return alvs.s;
    }
    
    public static boolean aC(final arud arud) {
        altu altu;
        if ((altu = arud.f().m) == null) {
            altu = altu.a;
        }
        algr algr;
        if ((algr = altu.d) == null) {
            algr = algr.a;
        }
        return algr.h;
    }
    
    public static boolean aD(final arud arud) {
        alvs alvs;
        if ((alvs = arud.f().e) == null) {
            alvs = alvs.a;
        }
        return alvs.aS;
    }
    
    public static boolean aE(final arud arud) {
        amdv amdv;
        if ((amdv = arud.f().i) == null) {
            amdv = amdv.a;
        }
        amdw amdw;
        if ((amdw = amdv.j) == null) {
            amdw = amdw.a;
        }
        return amdw.b;
    }
    
    public static boolean aF(final arud arud) {
        alvs alvs;
        if ((alvs = arud.f().e) == null) {
            alvs = alvs.a;
        }
        return alvs.aC;
    }
    
    public static boolean aG(final arud arud) {
        final akak f = arud.f();
        if (f != null) {
            alvs alvs;
            if ((alvs = f.e) == null) {
                alvs = alvs.a;
            }
            if (alvs.ac) {
                return true;
            }
        }
        return false;
    }
    
    public static boolean aH(final arud arud) {
        final akak f = arud.f();
        if (f != null) {
            alvs alvs;
            if ((alvs = f.e) == null) {
                alvs = alvs.a;
            }
            if (alvs.bc) {
                return true;
            }
        }
        return false;
    }
    
    public static boolean aI(final arud arud) {
        final akak f = arud.f();
        if (f != null) {
            alvs alvs;
            if ((alvs = f.e) == null) {
                alvs = alvs.a;
            }
            if (alvs.bd) {
                return true;
            }
        }
        return false;
    }
    
    public static boolean aJ(final thh thh, final arud arud) {
        if (thh.n()) {
            apgj apgj;
            if ((apgj = arud.f().h) == null) {
                apgj = apgj.a;
            }
            if ((apgj.b & 0x1) == 0x0 || apgj.t) {
                return true;
            }
        }
        return false;
    }
    
    public static boolean aK(final arud arud) {
        alvs alvs;
        if ((alvs = arud.f().e) == null) {
            alvs = alvs.a;
        }
        return alvs.an;
    }
    
    public static boolean aL(final arud arud) {
        alvs alvs;
        if ((alvs = arud.f().e) == null) {
            alvs = alvs.a;
        }
        return alvs.aY;
    }
    
    public static boolean aM(final arud arud) {
        alvs alvs;
        if ((alvs = arud.f().e) == null) {
            alvs = alvs.a;
        }
        return alvs.ba;
    }
    
    public static boolean aN(final arud arud) {
        alvs alvs;
        if ((alvs = arud.f().e) == null) {
            alvs = alvs.a;
        }
        return alvs.y;
    }
    
    public static boolean aO(final arud arud) {
        amdv amdv;
        if ((amdv = arud.f().i) == null) {
            amdv = amdv.a;
        }
        amdw amdw;
        if ((amdw = amdv.j) == null) {
            amdw = amdw.a;
        }
        return amdw.i;
    }
    
    public static boolean aP(final arud arud) {
        alvs alvs;
        if ((alvs = arud.f().e) == null) {
            alvs = alvs.a;
        }
        return alvs.aw;
    }
    
    public static int aQ(final arud arud) {
        final akak f = arud.f();
        if ((f.b & 0x40) != 0x0) {
            alvs alvs;
            if ((alvs = f.e) == null) {
                alvs = alvs.a;
            }
            int c;
            if ((c = alhb.C(alvs.D)) == 0) {
                c = 1;
            }
            return c;
        }
        return 2;
    }
    
    public static int aR(final arud arud) {
        final akak f = arud.f();
        if ((f.b & 0x40) != 0x0) {
            alvs alvs;
            if ((alvs = f.e) == null) {
                alvs = alvs.a;
            }
            int b;
            if ((b = alhb.B(alvs.C)) == 0) {
                b = 1;
            }
            return b;
        }
        return 2;
    }
    
    public static aorm aS(final zyx zyx) {
        final amqz bi = bI(zyx);
        if (bi != null && (bi.b & 0x2) != 0x0) {
            aorm aorm;
            if ((aorm = bi.d) == null) {
                aorm = aorm.a;
            }
            return aorm;
        }
        return null;
    }
    
    public static int aT(final zyx zyx) {
        final amqz bi = bI(zyx);
        int ai;
        final int n = ai = 1;
        if (bi != null) {
            ai = n;
            if ((bi.b & 0x1) != 0x0) {
                ai = aesy.aI(bi.c);
                if (ai == 0) {
                    ai = n;
                }
            }
        }
        return ai;
    }
    
    public static String aU(final String s) {
        return bi(ahkf.b, s);
    }
    
    public static String aV(final String s) {
        return bi(apwa.b, s);
    }
    
    @Deprecated
    public static String aW() {
        return bi(alxz.b, "");
    }
    
    public static String aX(final apng apng) {
        return bh(ajen.b, ((agxl)apng).toByteString());
    }
    
    public static String aY(final String s) {
        return bi(apwe.b, s);
    }
    
    public static String aZ(final String s) {
        return bi(apwj.b, s);
    }
    
    public static boolean aa(final gle gle) {
        return gle.s() == 5;
    }
    
    public static boolean ab(final gle gle) {
        return gle.s() == 4;
    }
    
    public static boolean ac(final gle gle, final gle gle2) {
        if (gle2 == null) {
            return false;
        }
        aioe aioe;
        if (gle.d() != null) {
            aioe = gle.d();
        }
        else {
            aioe = gle.c();
        }
        aioe aioe2;
        if (gle2.d() != null) {
            aioe2 = gle2.d();
        }
        else {
            aioe2 = gle2.c();
        }
        final aioe z = Z(aioe);
        final aioe z2 = Z(aioe2);
        if (z != null && z2 != null) {
            return abhz.h(z, z2);
        }
        return TextUtils.equals((CharSequence)gle.i(), (CharSequence)gle2.i());
    }
    
    public static void ad(final gle gle) {
        if (!gle.q()) {
            gle.p();
        }
    }
    
    public static float ae(final arud arud) {
        final akak f = arud.f();
        if ((f.b & 0x40) != 0x0) {
            alvs alvs;
            if ((alvs = f.e) == null) {
                alvs = alvs.a;
            }
            return alvs.E;
        }
        return 0.7f;
    }
    
    public static int af(final arud arud) {
        final akak f = arud.f();
        alvs alvs;
        if ((alvs = f.e) == null) {
            alvs = alvs.a;
        }
        if ((alvs.c & 0x2) != 0x0) {
            alvs alvs2;
            if ((alvs2 = f.e) == null) {
                alvs2 = alvs.a;
            }
            return alvs2.G;
        }
        return 1024;
    }
    
    public static int ag(final arud arud) {
        alvs alvs;
        if ((alvs = arud.f().e) == null) {
            alvs = alvs.a;
        }
        return alvs.r;
    }
    
    public static int ah(final arud arud) {
        final akak f = arud.f();
        alvs alvs;
        if ((alvs = f.e) == null) {
            alvs = alvs.a;
        }
        if ((alvs.b & 0x2) != 0x0) {
            alvs alvs2;
            if ((alvs2 = f.e) == null) {
                alvs2 = alvs.a;
            }
            return alvs2.q;
        }
        return 500;
    }
    
    public static int ai(final arud arud) {
        alvs alvs;
        if ((alvs = arud.f().e) == null) {
            alvs = alvs.a;
        }
        if ((alvs.d & 0x2000000) != 0x0) {
            return alvs.W;
        }
        return -1;
    }
    
    public static int aj(final arud arud) {
        alvs alvs;
        if ((alvs = arud.f().e) == null) {
            alvs = alvs.a;
        }
        return alvs.o;
    }
    
    public static int ak(final arud arud) {
        alvs alvs;
        if ((alvs = arud.f().e) == null) {
            alvs = alvs.a;
        }
        return alvs.bb;
    }
    
    public static int al(final arud arud) {
        alvs alvs;
        if ((alvs = arud.f().e) == null) {
            alvs = alvs.a;
        }
        if ((alvs.h & 0x100) != 0x0) {
            return alvs.aP;
        }
        return -1;
    }
    
    public static aexq am(final arud arud) {
        final akak f = arud.f();
        alvs alvs;
        if ((alvs = f.e) == null) {
            alvs = alvs.a;
        }
        if ((alvs.g & 0x4000000) != 0x0) {
            alvs alvs2;
            if ((alvs2 = f.e) == null) {
                alvs2 = alvs.a;
            }
            return aexq.k((Object)alvs2.aB);
        }
        return aewp.a;
    }
    
    public static aexq an(final arud arud) {
        final akak f = arud.f();
        alvs alvs;
        if ((alvs = f.e) == null) {
            alvs = alvs.a;
        }
        if ((alvs.c & 0x200000) != 0x0) {
            alvs alvs2;
            if ((alvs2 = f.e) == null) {
                alvs2 = alvs.a;
            }
            return aexq.k((Object)alvs2.L);
        }
        return aewp.a;
    }
    
    public static aexq ao(final arud arud) {
        final akak f = arud.f();
        alvs alvs;
        if ((alvs = f.e) == null) {
            alvs = alvs.a;
        }
        if ((alvs.h & 0x400) != 0x0) {
            alvs alvs2;
            if ((alvs2 = f.e) == null) {
                alvs2 = alvs.a;
            }
            return aexq.k((Object)alvs2.aQ);
        }
        return aewp.a;
    }
    
    public static String ap(final arud arud) {
        final akak f = arud.f();
        String ae;
        if (f != null && (f.b & 0x40) != 0x0) {
            alvs alvs;
            if ((alvs = f.e) == null) {
                alvs = alvs.a;
            }
            ae = alvs.aE;
        }
        else {
            ae = "embeddedassistant.googleapis.com";
        }
        return ae;
    }
    
    public static String aq(final arud arud, final Context context) {
        final akak f = arud.f();
        aisf aisf;
        if ((aisf = f.r) == null) {
            aisf = aisf.b;
        }
        if (!aisf.c.isEmpty()) {
            aisf aisf2;
            if ((aisf2 = f.r) == null) {
                aisf2 = aisf.b;
            }
            return aisf2.c;
        }
        return context.getString(2132020014);
    }
    
    public static boolean ar(final arud arud) {
        alvs alvs;
        if ((alvs = arud.f().e) == null) {
            alvs = alvs.a;
        }
        return alvs.F;
    }
    
    public static boolean as(final arud arud) {
        alvs alvs;
        if ((alvs = arud.f().e) == null) {
            alvs = alvs.a;
        }
        return alvs.az;
    }
    
    public static boolean at(final arud arud) {
        alvs alvs;
        if ((alvs = arud.f().e) == null) {
            alvs = alvs.a;
        }
        return alvs.J;
    }
    
    public static boolean au(final arud arud) {
        ahox ahox;
        if ((ahox = arud.f().o) == null) {
            ahox = ahox.a;
        }
        return ahox.Y;
    }
    
    public static boolean av(final arud arud) {
        alvs alvs;
        if ((alvs = arud.f().e) == null) {
            alvs = alvs.a;
        }
        return alvs.ad;
    }
    
    public static boolean aw(final arud arud) {
        alvs alvs;
        if ((alvs = arud.f().e) == null) {
            alvs = alvs.a;
        }
        return alvs.x;
    }
    
    public static boolean ax(final arud arud) {
        alvs alvs;
        if ((alvs = arud.f().e) == null) {
            alvs = alvs.a;
        }
        return alvs.B;
    }
    
    public static boolean ay(final arud arud) {
        alvs alvs;
        if ((alvs = arud.f().e) == null) {
            alvs = alvs.a;
        }
        return alvs.V;
    }
    
    public static boolean az(final arud arud) {
        alvs alvs;
        if ((alvs = arud.f().e) == null) {
            alvs = alvs.a;
        }
        return alvs.z;
    }
    
    public static boolean b(final float n, final float n2) {
        return Math.abs(n - n2) < 0.005f;
    }
    
    public static String bA(final String s) {
        return bi(alyi.b, s);
    }
    
    public static String bB(final String s) {
        return bi(aplm.b, s);
    }
    
    public static final Bitmap bC(final Resources resources, final Bitmap bitmap) {
        final int height = bitmap.getHeight();
        final int width = bitmap.getWidth();
        final int min = Math.min(height, (int)(width / resources.getFraction(2131361819, 1, 1)));
        final float n = resources.getDimensionPixelSize(2131168294) / (float)min;
        final Matrix matrix = new Matrix();
        matrix.setScale(n, n, 0.0f, 0.0f);
        return Bitmap.createBitmap(bitmap, (width - min) / 2, (height - min) / 2, min, min, matrix, false);
    }
    
    public static boolean bE(final uyf uyf) {
        aook aook;
        if ((aook = uyf.b().s) == null) {
            aook = aook.a;
        }
        ahsd ahsd;
        if ((ahsd = aook.g) == null) {
            ahsd = ahsd.a;
        }
        return ahsd.m;
    }
    
    public static apng bF(String o, final bhu bhu) {
        final Object o2 = null;
        try {
            alvs alvs;
            if ((alvs = ((arud)bhu.a).f().e) == null) {
                alvs = alvs.a;
            }
            if (alvs.aD) {
                final agyc c = vek.c((String)o);
                if (c.H()) {
                    o = o2;
                }
                else {
                    o = agzi.parseFrom((agzi)apng.a, c, ExtensionRegistryLite.getGeneratedRegistry());
                }
                return (apng)o;
            }
            return (apng)agzi.parseFrom((agzi)apng.a, vek.c((String)o), ExtensionRegistryLite.getGeneratedRegistry());
        }
        catch (final ahab ahab) {
            final StringBuilder sb = new StringBuilder("Found entityKey=`");
            sb.append((String)o);
            sb.append("` that does not contain a ViewModelEntityId message as it's identifier.");
            trn.b(sb.toString());
            return null;
        }
    }
    
    private static final glf bG(final Object o) {
        if (o instanceof gli) {
            return glf.b;
        }
        if (o instanceof akdz) {
            return glf.c;
        }
        if (o instanceof hyp) {
            return glf.d;
        }
        if (o instanceof anoi) {
            return glf.f;
        }
        if (o instanceof kmd) {
            for (final aidi aidi : ((kmd)o).a.c) {
                ajax a;
                if (aidi.b == 144881215) {
                    a = (ajax)aidi.c;
                }
                else {
                    a = ajax.a;
                }
                if (a.c == 18) {
                    return glf.g;
                }
            }
        }
        if (o instanceof ajax) {
            return glf.h;
        }
        if (o instanceof jzi) {
            return glf.i;
        }
        if (o instanceof jzj) {
            return glf.j;
        }
        if (o instanceof annp) {
            return glf.k;
        }
        if (o instanceof anno) {
            return glf.l;
        }
        if (o instanceof annv) {
            return glf.m;
        }
        if (o instanceof annw) {
            return glf.n;
        }
        if (bH(o)) {
            return glf.e;
        }
        return glf.a;
    }
    
    private static boolean bH(final Object o) {
        if (o instanceof akeh) {
            akeg akeg;
            if ((akeg = ((akeh)o).h) == null) {
                akeg = akeg.a;
            }
            if (akeg.b == 83537025) {
                return true;
            }
        }
        return false;
    }
    
    private static amqz bI(final zyx zyx) {
        final amss k = zyx.k;
        if (k == null) {
            return null;
        }
        if (k.j.size() != 0) {
            for (final amsr amsr : k.j) {
                if ((amsr.b & 0x2) != 0x0) {
                    amqz amqz;
                    if ((amqz = amsr.c) == null) {
                        amqz = amqz.a;
                    }
                    return amqz;
                }
            }
        }
        return null;
    }
    
    public static String ba(final apng apng) {
        return bh(ajeu.b, ((agxl)apng).toByteString());
    }
    
    public static String bb() {
        return bi(alwl.b, "downloads_library");
    }
    
    public static String bc() {
        return bi(alwr.b, "downloads_list");
    }
    
    public static String bd(final apng apng) {
        return bh(ajfx.b, ((agxl)apng).toByteString());
    }
    
    public static String be() {
        return bi(ajgl.b, "");
    }
    
    public static String bf(final apng apng) {
        return bh(ajhb.b, ((agxl)apng).toByteString());
    }
    
    public static String bg(final String s) {
        return bi(ajhu.b, s);
    }
    
    public static String bh(final agyr agyr, final agyc agyc) {
        return vek.g(agyr.a(), agyc);
    }
    
    public static String bi(final agyr agyr, final String s) {
        return vek.h(agyr.a(), s);
    }
    
    public static String bj(final String s) {
        return bi(alxg.b, s);
    }
    
    public static String bk(final String d, final String c) {
        final agzg b = alxl.b;
        final agza builder = ((agzi)alxh.a).createBuilder();
        builder.copyOnWrite();
        final alxh alxh = (alxh)builder.instance;
        d.getClass();
        alxh.b |= 0x2;
        alxh.d = d;
        builder.copyOnWrite();
        final alxh alxh2 = (alxh)builder.instance;
        c.getClass();
        alxh2.b |= 0x1;
        alxh2.c = c;
        return bh(b, ((agxl)builder.build()).toByteString());
    }
    
    public static String bl(final String s) {
        return bi(alyo.b, s);
    }
    
    public static String bm() {
        return bi(alww.b, "OFFLINE_GENERATION_STATUS_ENTITY_ID_PES_TO_IMES");
    }
    
    public static String bn() {
        return bi(alww.b, "video");
    }
    
    public static String bo(final String s) {
        return bi(amty.b, s);
    }
    
    public static String bp(final String s) {
        return bi(amue.b, s);
    }
    
    public static String bq(final String s) {
        return bi(amui.b, s);
    }
    
    public static String br(final String s) {
        return bi(anav.b, s);
    }
    
    public static String bs(final String s) {
        return bi(apwp.b, s);
    }
    
    public static String bt(final String s) {
        return bi(alxa.b, s);
    }
    
    public static String bu(final String d, final String c) {
        final agzg b = apww.b;
        final agza builder = ((agzi)apws.a).createBuilder();
        builder.copyOnWrite();
        final apws apws = (apws)builder.instance;
        d.getClass();
        apws.b |= 0x2;
        apws.d = d;
        builder.copyOnWrite();
        final apws apws2 = (apws)builder.instance;
        c.getClass();
        apws2.b |= 0x1;
        apws2.c = c;
        return bh(b, ((agxl)builder.build()).toByteString());
    }
    
    public static String bv() {
        return bi(alwr.b, "DOWNLOADS_LIST_ENTITY_ID_DOWNLOAD_RECOMMENDATIONS");
    }
    
    public static String bw(final String s) {
        return bi(alxt.b, s);
    }
    
    public static String bx() {
        return bi(alwr.b, "DOWNLOADS_LIST_ENTITY_ID_SMART_DOWNLOADS");
    }
    
    public static String by(final String s) {
        return bi(aova.b, s);
    }
    
    public static String bz(final String s) {
        return bi(apxd.b, s);
    }
    
    public static boolean c(final float n, final float n2) {
        return !b(n, n2) && n < n2;
    }
    
    public static boolean d(final float n) {
        return !b(n, 1.777f) && n > 1.777f;
    }
    
    public static final String e(final Object o) {
        if (o instanceof aibb) {
            return ((aibb)o).k;
        }
        if (o instanceof aisy) {
            return ((aisy)o).l;
        }
        if (o instanceof ajxt) {
            final ajxt ajxt = (ajxt)o;
            if ((ajxt.b & 0x40000) != 0x0) {
                return ajxt.c;
            }
            return null;
        }
        else {
            if (o instanceof aloa) {
                return ((aloa)o).c;
            }
            if (o instanceof alnl) {
                return ((alnl)o).g;
            }
            if (o instanceof alng) {
                return ((alng)o).e;
            }
            if (o instanceof aloz) {
                return ((aloz)o).j;
            }
            if (o instanceof ameo) {
                return ((ameo)o).g;
            }
            if (o instanceof amzl) {
                return ((amzl)o).f;
            }
            if (o instanceof amzi) {
                return ((amzi)o).f;
            }
            if (o instanceof aokb) {
                return ((aokb)o).s;
            }
            if (o instanceof aopg) {
                return ((aopg)o).l;
            }
            if (o instanceof aibk) {
                return ((aibk)o).t;
            }
            if (o instanceof aotf) {
                return ((aotf)o).d;
            }
            if (o instanceof amjl) {
                final amjl amjl = (amjl)o;
                if ((amjl.b & 0x1000) != 0x0) {
                    return amjl.j;
                }
            }
            return null;
        }
    }
    
    public static boolean f(final akak akak) {
        ahox ahox;
        if ((ahox = akak.o) == null) {
            ahox = ahox.a;
        }
        return ahox.O;
    }
    
    public static boolean g(final akak akak) {
        ahox ahox;
        if ((ahox = akak.o) == null) {
            ahox = ahox.a;
        }
        return ahox.Z;
    }
    
    public static int h(final uyf uyf) {
        alvl alvl;
        if ((alvl = uyf.b().e) == null) {
            alvl = alvl.a;
        }
        return alvl.aG;
    }
    
    public static int i(final uyf uyf) {
        final ains b = uyf.b();
        alvl alvl;
        if ((alvl = b.e) == null) {
            alvl = alvl.a;
        }
        if (alvl.u > 0) {
            alvl alvl2;
            if ((alvl2 = b.e) == null) {
                alvl2 = alvl.a;
            }
            return alvl2.u;
        }
        return 2400;
    }
    
    public static int j(final uyf uyf) {
        alvl alvl;
        if ((alvl = uyf.b().e) == null) {
            alvl = alvl.a;
        }
        return alvl.k;
    }
    
    public static int k(final uyf uyf) {
        final ains b = uyf.b();
        alvl alvl;
        if ((alvl = b.e) == null) {
            alvl = alvl.a;
        }
        if ((alvl.b & 0x8000) != 0x0) {
            alvl alvl2;
            if ((alvl2 = b.e) == null) {
                alvl2 = alvl.a;
            }
            apof apof;
            if ((apof = alvl2.E) == null) {
                apof = apof.a;
            }
            return apof.c;
        }
        return 1800;
    }
    
    public static aexq l(final uyf uyf) {
        final ains b = uyf.b();
        alvl alvl;
        if ((alvl = b.e) == null) {
            alvl = alvl.a;
        }
        if ((alvl.f & 0x1000) != 0x0) {
            alvl alvl2;
            if ((alvl2 = b.e) == null) {
                alvl2 = alvl.a;
            }
            return aexq.k((Object)alvl2.aZ);
        }
        return aewp.a;
    }
    
    public static String m(final uyf uyf) {
        final ains b = uyf.b();
        alvl alvl;
        if ((alvl = b.e) == null) {
            alvl = alvl.a;
        }
        if ((alvl.c & 0x20000) != 0x0) {
            alvl alvl2;
            if ((alvl2 = b.e) == null) {
                alvl2 = alvl.a;
            }
            return alvl2.P;
        }
        return null;
    }
    
    public static boolean n(final uyf uyf) {
        alvl alvl;
        if ((alvl = uyf.b().e) == null) {
            alvl = alvl.a;
        }
        return alvl.bu;
    }
    
    public static boolean o(final uyf uyf) {
        alvl alvl;
        if ((alvl = uyf.b().e) == null) {
            alvl = alvl.a;
        }
        return alvl.aR;
    }
    
    public static boolean p(final uyf uyf) {
        alvl alvl;
        if ((alvl = uyf.b().e) == null) {
            alvl = alvl.a;
        }
        return "always_show_entry_point".equals(alvl.bc) || q(uyf);
    }
    
    public static boolean q(final uyf uyf) {
        alvl alvl;
        if ((alvl = uyf.b().e) == null) {
            alvl = alvl.a;
        }
        return "conditionally_show_entry_point".equals(alvl.bc);
    }
    
    public static boolean r(final uyf uyf) {
        alvl alvl;
        if ((alvl = uyf.b().e) == null) {
            alvl = alvl.a;
        }
        return alvl.ay;
    }
    
    public static boolean s(final uyf uyf) {
        alvl alvl;
        if ((alvl = uyf.b().e) == null) {
            alvl = alvl.a;
        }
        return alvl.ah;
    }
    
    public static boolean t(final uyf uyf) {
        alvl alvl;
        if ((alvl = uyf.b().e) == null) {
            alvl = alvl.a;
        }
        return alvl.ai;
    }
    
    public static boolean u(final uyf uyf) {
        final ains b = uyf.b();
        if (b != null) {
            alvl alvl;
            if ((alvl = b.e) == null) {
                alvl = alvl.a;
            }
            if (alvl.an) {
                return true;
            }
        }
        return false;
    }
    
    public static boolean v(final uyf uyf) {
        alvl alvl;
        if ((alvl = uyf.b().e) == null) {
            alvl = alvl.a;
        }
        return alvl.bg;
    }
    
    public static boolean w(final uyf uyf) {
        final ains b = uyf.b();
        if (b != null) {
            alvl alvl;
            if ((alvl = b.e) == null) {
                alvl = alvl.a;
            }
            if (alvl.as) {
                return true;
            }
        }
        return false;
    }
    
    public static boolean x(final uyf uyf) {
        final ains b = uyf.b();
        if (b != null) {
            alvl alvl;
            if ((alvl = b.e) == null) {
                alvl = alvl.a;
            }
            if (alvl.aS) {
                return true;
            }
        }
        return false;
    }
    
    public static boolean y(final uyf uyf) {
        alvl alvl;
        if ((alvl = uyf.b().e) == null) {
            alvl = alvl.a;
        }
        return alvl.br;
    }
    
    public static boolean z(final uyf uyf) {
        alvl alvl;
        if ((alvl = uyf.b().e) == null) {
            alvl = alvl.a;
        }
        return alvl.aA;
    }
}
