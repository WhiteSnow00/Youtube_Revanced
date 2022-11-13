import android.widget.FrameLayout$LayoutParams;
import android.widget.RelativeLayout$LayoutParams;
import android.widget.LinearLayout$LayoutParams;

// 
// Decompiled by Procyon v0.6.0
// 

public final class epv implements atke
{
    public static final epv a;
    public static final epv b;
    public static final epv c;
    public static final epv d;
    public static final epv e;
    public static final epv f;
    public static final epv g;
    public static final epv h;
    public static final epv i;
    public static final epv j;
    public static final epv k;
    public static final epv l;
    public static final epv m;
    public static final epv n;
    public static final epv o;
    private final int p;
    
    static {
        o = new epv(20);
        n = new epv(15);
        m = new epv(14);
        l = new epv(13);
        k = new epv(12);
        j = new epv(11);
        i = new epv(10);
        h = new epv(9);
        g = new epv(8);
        f = new epv(7);
        e = new epv(6);
        d = new epv(5);
        c = new epv(4);
        b = new epv(3);
        a = new epv(2);
    }
    
    public epv(final int p) {
        this.p = p;
    }
    
    public final Object a() {
        switch (this.p) {
            default: {
                return wyw.k;
            }
            case 19: {
                return new LinearLayout$LayoutParams(-1, -2);
            }
            case 18: {
                return new RelativeLayout$LayoutParams(-1, -2);
            }
            case 17: {
                return new FrameLayout$LayoutParams(-1, -1);
            }
            case 16: {
                return new LinearLayout$LayoutParams(-1, -2);
            }
            case 15: {
                return false;
            }
            case 14: {
                return hoh.a;
            }
            case 13: {
                return acwa.d();
            }
            case 12: {
                return gbj.d();
            }
            case 11: {
                return gbx.d();
            }
            case 10: {
                return ryo.a;
            }
            case 9: {
                return ryo.a;
            }
            case 8: {
                return ryo.a;
            }
            case 7: {
                return ryo.a;
            }
            case 6: {
                return ryo.a;
            }
            case 5: {
                return ryo.a;
            }
            case 4: {
                return ryo.a;
            }
            case 3: {
                return ryo.a;
            }
            case 2: {
                return ryo.a;
            }
            case 1: {
                return new arks();
            }
            case 0: {
                return new arks();
            }
        }
    }
}
