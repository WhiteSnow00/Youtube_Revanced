import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abdc implements aezf
{
    public static final abdc a;
    public static final abdc b;
    public static final abdc c;
    public static final abdc d;
    public static final abdc e;
    public static final abdc f;
    public static final abdc g;
    public static final abdc h;
    public static final abdc i;
    public static final abdc j;
    public static final abdc k;
    public static final abdc l;
    public static final abdc m;
    public static final abdc n;
    public static final abdc o;
    public static final abdc p;
    public static final abdc q;
    public static final abdc r;
    public static final abdc s;
    public static final abdc t;
    public static final abdc u;
    private final int v;
    
    static {
        u = new abdc(20);
        t = new abdc(19);
        s = new abdc(18);
        r = new abdc(17);
        q = new abdc(16);
        p = new abdc(15);
        o = new abdc(14);
        n = new abdc(13);
        m = new abdc(12);
        l = new abdc(11);
        k = new abdc(10);
        j = new abdc(9);
        i = new abdc(8);
        h = new abdc(7);
        g = new abdc(6);
        f = new abdc(5);
        e = new abdc(4);
        d = new abdc(3);
        c = new abdc(2);
        b = new abdc(1);
        a = new abdc(0);
    }
    
    private abdc(final int v) {
        this.v = v;
    }
    
    public final Object apply(final Object o) {
        final int v = this.v;
        boolean b = true;
        switch (v) {
            default: {
                if (((aqrj)o).c <= 0) {
                    b = false;
                }
                return b;
            }
            case 19: {
                return ((abxa)o).J();
            }
            case 18: {
                return ((abqh)o).v();
            }
            case 17: {
                return ((abxa)o).M();
            }
            case 16: {
                final PlayerResponseModel playerResponseModel = (PlayerResponseModel)o;
                return true;
            }
            case 15: {
                return ((abxa)o).J();
            }
            case 14: {
                return ((abqh)o).D();
            }
            case 13: {
                return ((abxa)o).J();
            }
            case 12: {
                ahan ahan;
                if ((ahan = ((aqre)o).c) == null) {
                    ahan = ahan.a;
                }
                return String.valueOf(ahan.b);
            }
            case 11: {
                return ((aqre)o).d;
            }
            case 10: {
                return ((abxa)o).s();
            }
            case 9: {
                return ((abxa)o).F();
            }
            case 8: {
                return ((abxa)o).s();
            }
            case 7: {
                return ((abxa)o).W();
            }
            case 6: {
                return ((abqh)o).D();
            }
            case 5: {
                return ((abxa)o).R();
            }
            case 4: {
                return ((abxa)o).S();
            }
            case 3: {
                return ((abqh)o).v();
            }
            case 2: {
                return ((abxa)o).X();
            }
            case 1: {
                return ((abxa)o).R();
            }
            case 0: {
                return ((abqh)o).D();
            }
        }
    }
}
