import com.google.android.apps.youtube.app.player.overlay.YouTubeControlsOverlay;
import android.graphics.Rect;
import j$.util.Optional;
import j$.util.Objects;
import android.content.Context;
import android.app.Activity;
import android.util.Pair;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ivm implements asji
{
    public static final ivm a;
    public static final ivm b;
    public static final ivm c;
    public static final ivm d;
    public static final ivm e;
    public static final ivm f;
    public static final ivm g;
    public static final ivm h;
    public static final ivm i;
    public static final ivm j;
    public static final ivm k;
    public static final ivm l;
    public static final ivm m;
    public static final ivm n;
    public static final ivm o;
    public static final ivm p;
    public static final ivm q;
    public static final ivm r;
    public static final ivm s;
    public static final ivm t;
    public static final ivm u;
    private final int v;
    
    static {
        u = new ivm(20);
        t = new ivm(19);
        s = new ivm(18);
        r = new ivm(17);
        q = new ivm(16);
        p = new ivm(15);
        o = new ivm(14);
        n = new ivm(13);
        m = new ivm(12);
        l = new ivm(11);
        k = new ivm(10);
        j = new ivm(9);
        i = new ivm(8);
        h = new ivm(7);
        g = new ivm(6);
        f = new ivm(5);
        e = new ivm(4);
        d = new ivm(3);
        c = new ivm(2);
        b = new ivm(1);
        a = new ivm(0);
    }
    
    private ivm(final int v) {
        this.v = v;
    }
    
    @Override
    public final Object a(final Object o, Object b) {
        final int v = this.v;
        final boolean b2 = true;
        final boolean b3 = true;
        final boolean b4 = true;
        final boolean b5 = true;
        boolean b6 = true;
        int intValue = 0;
        switch (v) {
            default: {
                return Pair.create((Object)o, (Object)b);
            }
            case 19: {
                final aezp aezp = (aezp)o;
                final aezp aezp2 = (aezp)b;
                if (aezp.h()) {
                    return aezp;
                }
                return aezp2;
            }
            case 18: {
                return aezp.j((Object)tpe.cu((Context)o, (int)b));
            }
            case 17: {
                return aezp.j((Object)agx.a((Context)o, (int)b));
            }
            case 16: {
                final akcn akcn = (akcn)o;
                final ajdv ajdv = (ajdv)b;
                alxw alxw;
                if ((alxw = akcn.e) == null) {
                    alxw = alxw.a;
                }
                String f;
                if (alxw.aZ) {
                    f = ajdv.f;
                }
                else {
                    f = "";
                }
                return f;
            }
            case 15: {
                return new jtq((String)o, (ijk)b);
            }
            case 14: {
                final Boolean b7 = (Boolean)o;
                final Boolean b8 = (Boolean)b;
                final wzz a = jqq.a;
                if (!b7 || !b8) {
                    b6 = false;
                }
                return b6;
            }
            case 13: {
                final abkb abkb = (abkb)o;
                final jdm jdm = (jdm)b;
                return abkb.equals((Object)abkb.a) && jdm.equals(jdm.c) && b2;
            }
            case 12: {
                final aanf aanf = (aanf)o;
                jdm jdm2;
                if (Objects.equals((Object)aanf.d(), (Object)b)) {
                    if (aanf.b().a(new abka[] { abka.f })) {
                        jdm2 = jdm.a;
                    }
                    else {
                        jdm2 = jdm.b;
                    }
                }
                else {
                    jdm2 = jdm.c;
                }
                return jdm2;
            }
            case 11: {
                return new jdl((Optional)o, (jdm)b);
            }
            case 10: {
                final boolean booleanValue = (boolean)o;
                final jdm jdm3 = (jdm)b;
                if (booleanValue) {
                    return jdm.c;
                }
                return jdm3;
            }
            case 9: {
                final Boolean b9 = (Boolean)o;
                return (boolean)b && !b9 && b3;
            }
            case 8: {
                return (int)o + (int)b;
            }
            case 7: {
                final akcn akcn2 = (akcn)o;
                final Rect rect = (Rect)b;
                alxw alxw2;
                if ((alxw2 = akcn2.e) == null) {
                    alxw2 = alxw.a;
                }
                Integer n;
                if (alxw2.aX) {
                    n = rect.right;
                }
                else {
                    n = 0;
                }
                return n;
            }
            case 6: {
                final aezp aezp3 = (aezp)o;
                final Boolean b10 = (Boolean)b;
                final Rect a2 = YouTubeControlsOverlay.a;
                return aezp3.h() && b10 && b4;
            }
            case 5: {
                final Boolean b11 = (Boolean)o;
                final Integer n2 = (Integer)b;
                if (b11) {
                    intValue = n2;
                }
                return intValue;
            }
            case 4: {
                final ixa ixa = (ixa)o;
                final ixb ixb = (ixb)b;
                final ixa a3 = ixc.a;
                final msn b12 = ixb.b;
                final ixf a4 = ixa.a;
                b = b12.b;
                final Object a5 = b12.a;
                final ixe ixe = new ixe(a4);
                ((ixd)b).a(ixe, a5);
                return ixa.a(ixe.a(), ixb.a);
            }
            case 3: {
                final Boolean b13 = (Boolean)o;
                final Boolean b14 = (Boolean)b;
                return !b13 && !b14 && b5;
            }
            case 2: {
                final boolean booleanValue2 = (boolean)o;
                final boolean booleanValue3 = (boolean)b;
                int n3;
                if (!booleanValue2 && booleanValue3) {
                    n3 = 2131231567;
                }
                else if (!booleanValue2) {
                    n3 = 2131233876;
                }
                else {
                    n3 = 2131233874;
                }
                return n3;
            }
            case 1: {
                final int intValue2 = (int)o;
                final int intValue3 = (int)b;
                float n4 = 0.0f;
                if (intValue3 > 0) {
                    n4 = Math.round(aeuz.j(1.0f - intValue2 / (float)intValue3, 0.0f, 1.0f) * 100.0f) / 100.0f;
                }
                return n4;
            }
            case 0: {
                return aezq.a((Object)o, (Object)b);
            }
        }
    }
}
