import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import com.google.android.libraries.youtube.innertube.model.media.VideoQuality;
import android.content.res.Resources;

// 
// Decompiled by Procyon v0.6.0
// 

public class abcn implements abcl, abnq, tec
{
    protected final abcm a;
    private final Resources b;
    private final abno c;
    
    public abcn(final Resources b, final abno c, final abcm a) {
        b.getClass();
        this.b = b;
        this.c = c;
        a.getClass();
        (this.a = a).re((abcl)this);
    }
    
    public void j(final ynk ynk) {
        if (ynk.f() == null) {
            return;
        }
        this.a.m(ynk.j());
        if (ynk.j()) {
            final VideoQuality[] l = ynk.l();
            final int length = l.length;
            final int n = length + 1;
            final VideoQuality[] array = new VideoQuality[n];
            final String string = this.b.getString(2132019307);
            boolean b = false;
            array[0] = new VideoQuality(-2, string, false);
            System.arraycopy(l, 0, array, 1, length);
            final FormatStreamModel f = ynk.f();
            final int n2 = -1;
            int f2;
            if (f != null) {
                f2 = ynk.f().f();
            }
            else {
                f2 = -1;
            }
            int n3 = 0;
            int n4;
            while (true) {
                n4 = n2;
                if (n3 >= n) {
                    break;
                }
                if (array[n3].a == f2) {
                    n4 = n3;
                    break;
                }
                ++n3;
            }
            if (ynk.g() == null || !ynk.g().f()) {
                b = true;
            }
            this.a.o(array, n4, b);
        }
    }
    
    public final asic[] lX(final abns abns) {
        return new asic[] { ((asgt)abns.q().m).j(aajj.t(abns.bN(), 4194304L)).j(aajj.r(0)).am((asix)new abbr(this, 2), (asix)aaze.p) };
    }
    
    public Class[] ms(final Class clazz, final Object o, final int n) {
        return aaiy.h(this, o, n);
    }
    
    public final void x(final int n) {
        this.c.O(n);
    }
    
    public final void y(final aply aply) {
        final Object a = this.c.u.a;
        if (a == null) {
            return;
        }
        ((abta)a).O(aply);
    }
}
