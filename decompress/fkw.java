import java.util.concurrent.ThreadFactory;
import java.util.concurrent.Executors;
import android.util.Log;
import android.app.ActivityManager;
import android.app.ActivityManager$RunningAppProcessInfo;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fkw implements afaq
{
    public static final fkw a;
    public static final fkw b;
    public static final fkw c;
    public static final fkw d;
    public static final fkw e;
    public static final fkw f;
    public static final fkw g;
    public static final fkw h;
    public static final fkw i;
    public static final fkw j;
    public static final fkw k;
    public static final fkw l;
    public static final fkw m;
    public static final fkw n;
    public static final fkw o;
    public static final fkw p;
    public static final fkw q;
    public static final fkw r;
    public static final fkw s;
    public static final fkw t;
    private final int u;
    
    static {
        t = new fkw(20);
        s = new fkw(19);
        r = new fkw(18);
        q = new fkw(17);
        p = new fkw(16);
        o = new fkw(15);
        n = new fkw(14);
        m = new fkw(13);
        l = new fkw(12);
        k = new fkw(11);
        j = new fkw(10);
        i = new fkw(9);
        h = new fkw(8);
        g = new fkw(7);
        f = new fkw(6);
        e = new fkw(5);
        d = new fkw(4);
        c = new fkw(3);
        b = new fkw(2);
        a = new fkw(1);
    }
    
    public fkw(final int u) {
        this.u = u;
    }
    
    public final Object a() {
        final int u = this.u;
        boolean b = true;
        final Boolean value = false;
        switch (u) {
            default: {
                return tlu.d;
            }
            case 19: {
                return null;
            }
            case 18: {
                return akc.a();
            }
            case 17: {
                return aeyo.a;
            }
            case 16: {
                return rr.d;
            }
            case 15: {
                return new dqx();
            }
            case 14: {
                return new drk();
            }
            case 13: {
                return value;
            }
            case 12: {
                final ActivityManager$RunningAppProcessInfo activityManager$RunningAppProcessInfo = new ActivityManager$RunningAppProcessInfo();
                try {
                    ActivityManager.getMyMemoryState(activityManager$RunningAppProcessInfo);
                    final int importance = activityManager$RunningAppProcessInfo.importance;
                    if (activityManager$RunningAppProcessInfo.importance >= 400) {
                        return b;
                    }
                }
                catch (final RuntimeException ex) {
                    Log.w("PhenotypeProcessReaper", "Failed to retrieve memory state, not killing process.", (Throwable)ex);
                }
                b = false;
                return b;
            }
            case 11: {
                return afwm.f(Executors.newSingleThreadScheduledExecutor((ThreadFactory)odn.c));
            }
            case 10: {
                return qex.a();
            }
            case 9: {
                return nnv.C();
            }
            case 8: {
                final dbn dbn = new dbn();
                dbn.b((dom)new don(0));
                return dbn;
            }
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7: {
                return value;
            }
            case 1: {
                return new beb();
            }
            case 0: {
                return afeq.x((Object)new tmo(Integer.toString(1), 2132019899, 4, true, false), (Object)new tmo(Integer.toString(2), 2132018388, 4, true, true), (Object)new tmo(Integer.toString(3), 2132017743, 3, true, false), (Object)new tmo(Integer.toString(5), 2132019321, 2, true, false), (Object)new tmo(Integer.toString(6), 2132020031, 2, true, false), (Object)new tmo(Integer.toString(7), 2132018392, 2, false, false), (Object)new tmo(Integer.toString(90), 2132018046, 2, false, false));
            }
        }
    }
}
