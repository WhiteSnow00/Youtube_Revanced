import java.util.Map;
import android.view.View;
import android.text.TextUtils;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bbw implements afbk
{
    public static final bbw a;
    public static final bbw b;
    public static final bbw c;
    public static final bbw d;
    public static final bbw e;
    public static final bbw f;
    public static final bbw g;
    public static final bbw h;
    public static final bbw i;
    public static final bbw j;
    public static final bbw k;
    public static final bbw l;
    public static final bbw m;
    public static final bbw n;
    public static final bbw o;
    public static final bbw p;
    public static final bbw q;
    public static final bbw r;
    public static final bbw s;
    public static final bbw t;
    public static final bbw u;
    private final int v;
    
    static {
        u = new bbw(20);
        t = new bbw(19);
        s = new bbw(18);
        r = new bbw(17);
        q = new bbw(16);
        p = new bbw(15);
        o = new bbw(14);
        n = new bbw(13);
        m = new bbw(12);
        l = new bbw(11);
        k = new bbw(10);
        j = new bbw(9);
        i = new bbw(8);
        h = new bbw(7);
        g = new bbw(6);
        f = new bbw(5);
        e = new bbw(4);
        d = new bbw(3);
        c = new bbw(2);
        b = new bbw(1);
        a = new bbw(0);
    }
    
    private bbw(final int v) {
        this.v = v;
    }
    
    @Override
    public final boolean a(final Object o) {
        final int v = this.v;
        final boolean b = true;
        final boolean b2 = true;
        boolean b3 = true;
        switch (v) {
            default: {
                adoh adoh;
                if ((adoh = adoh.a(((adoj)o).l)) == null) {
                    adoh = adoh.a;
                }
                return adoh == adoh.d;
            }
            case 19: {
                return "donation_shelf".equals(o);
            }
            case 18: {
                return "donation_amount_picker".equals(o);
            }
            case 17: {
                final String s = (String)o;
                if (!fao.L(s)) {
                    if (!TextUtils.isEmpty((CharSequence)s) && s.endsWith("bollard_frequency_mins")) {
                        return true;
                    }
                    b3 = false;
                }
                return b3;
            }
            case 16: {
                final View view = (View)o;
                if (view != null) {
                    final boolean b4 = b;
                    if (view.getTag(2131430458) != null) {
                        return b4;
                    }
                    if (view.isClickable()) {
                        if (view.getTag(2131428686) == null) {
                            return true;
                        }
                    }
                }
                return false;
            }
            case 15: {
                final View view2 = (View)o;
                if (view2 != null) {
                    final boolean b5 = b2;
                    if (view2.getTag(2131430458) != null) {
                        return b5;
                    }
                    if (view2.isClickable()) {
                        if (view2.getTag(2131428686) == null) {
                            return true;
                        }
                    }
                }
                return false;
            }
            case 14: {
                final String s2 = (String)o;
                final afhk a = fno.a;
                return s2.startsWith("offline_access_enabled") || s2.startsWith("offline_access_updated_at");
            }
            case 13: {
                final String s3 = (String)o;
                final afhk a2 = fno.a;
                return s3.startsWith("offline_last_scheduled_ad_hoc_refresh_time_millis");
            }
            case 12: {
                return (((aikl)o).b & 0x20) != 0x0;
            }
            case 11: {
                return (((aikl)o).b & 0x40) != 0x0;
            }
            case 10: {
                aikn aikn;
                if ((aikn = ((aikl)o).d) == null) {
                    aikn = aikn.a;
                }
                return aikn.b == 109219466;
            }
            case 9: {
                aikn aikn2;
                if ((aikn2 = ((aikl)o).c) == null) {
                    aikn2 = aikn.a;
                }
                return aikn2.b == 109219466;
            }
            case 8: {
                aikp aikp;
                if ((aikp = ((aikl)o).g) == null) {
                    aikp = aikp.a;
                }
                return aikp.b == 105917786;
            }
            case 7: {
                aikp aikp2;
                if ((aikp2 = ((aikl)o).f) == null) {
                    aikp2 = aikp.a;
                }
                return aikp2.b == 105917786;
            }
            case 6: {
                return (((aikm)o).b & 0x1) != 0x0;
            }
            case 5: {
                return (((aikm)o).b & 0x2) != 0x0;
            }
            case 4: {
                aikp aikp3;
                if ((aikp3 = ((aikl)o).e) == null) {
                    aikp3 = aikp.a;
                }
                return aikp3.b == 105917786;
            }
            case 3: {
                final almh almh = (almh)o;
                return almh != null && (almh.h & 0x2000) != 0x0;
            }
            case 2: {
                final String s4 = (String)o;
                if (s4 != null) {
                    final String b6 = aewr.b(s4);
                    if (!TextUtils.isEmpty((CharSequence)b6) && (!b6.contains("text") || b6.contains("text/vtt")) && !b6.contains("html") && !b6.contains("xml")) {
                        return true;
                    }
                }
                return false;
            }
            case 1: {
                return ((Map.Entry)o).getKey() != null;
            }
            case 0: {
                return o != null;
            }
        }
    }
}
