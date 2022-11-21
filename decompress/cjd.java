import java.util.List;
import android.view.ViewGroup;

// 
// Decompiled by Procyon v0.6.0
// 

public class cjd
{
    static int a(final ViewGroup viewGroup, final int n) {
        return viewGroup.getChildDrawingOrder(n);
    }
    
    static void b(final ViewGroup viewGroup, final boolean b) {
        viewGroup.suppressLayout(b);
    }
    
    public static cwq e(final czj czj, final cty cty) {
        return new cwq(l(czj, cty, (czg)cyl.b));
    }
    
    public static cwr f(final czj czj, final cty cty) {
        return g(czj, cty, true);
    }
    
    public static cwr g(final czj czj, final cty cty, final boolean b) {
        float a;
        if (b) {
            a = czu.a();
        }
        else {
            a = 1.0f;
        }
        return new cwr(n(czj, a, cty, (czg)cyl.a));
    }
    
    public static cws h(final czj czj, final cty cty, final int n) {
        return new cws(l(czj, cty, (czg)new cyo(n)));
    }
    
    public static cwt i(final czj czj, final cty cty) {
        return new cwt(l(czj, cty, (czg)cyl.c));
    }
    
    public static cwv j(final czj czj, final cty cty) {
        return new cwv(cyt.a(czj, cty, czu.a(), (czg)cyl.e, true));
    }
    
    public static cwx k(final czj czj, final cty cty) {
        return new cwx(n(czj, czu.a(), cty, (czg)cza.a));
    }
    
    public static List l(final czj czj, final cty cty, final czg czg) {
        return cyt.a(czj, cty, 1.0f, czg, false);
    }
    
    public static int[] m() {
        return new int[] { 1, 2, 3, 4, 5, 6 };
    }
    
    private static List n(final czj czj, final float n, final cty cty, final czg czg) {
        return cyt.a(czj, cty, n, czg, false);
    }
    
    public boolean c() {
        return false;
    }
    
    public boolean d(final int[] array) {
        return false;
    }
}
