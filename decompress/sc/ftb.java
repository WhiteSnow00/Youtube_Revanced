import android.view.View$MeasureSpec;
import android.content.Context;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ftb extends dst
{
    @dyi(a = 13)
    @dyj(a = dyk.a)
    String a;
    @dyi(a = 13)
    @dyj(a = dyk.a)
    arkg b;
    @dyi(a = 13)
    @dyj(a = dyk.a)
    Integer c;
    @dyi(a = 13)
    @dyj(a = dyk.a)
    Boolean d;
    @dyi(a = 13)
    @dyj(a = dyk.a)
    oum e;
    @dyi(a = 13)
    @dyj(a = dyk.a)
    Integer f;
    @dyi(a = 13)
    @dyj(a = dyk.a)
    CommandOuterClass$Command g;
    
    public ftb() {
        super("Slider");
    }
    
    protected final int K() {
        return 3;
    }
    
    protected final Object R(final Context context) {
        return new ftc(context);
    }
    
    public final void Z(final dsx dsx, final dtb dtb, int size, final int n, final dwq dwq) {
        if (View$MeasureSpec.getMode(size) == 0) {
            size = (int)(dsx.b().getDisplayMetrics().density * 40.0f + 0.5f);
            dwq.a = size;
        }
        else {
            size = View$MeasureSpec.getSize(size);
            dwq.a = size;
        }
        final double n2 = size;
        Double.isNaN(n2);
        dwq.b = (int)(n2 * 0.1);
    }
    
    public final /* bridge */ boolean a(final Object o) {
        return this.f((dst)o);
    }
    
    protected final void aa(final dsx dsx, final Object o) {
        final ftc ftc = (ftc)o;
        final Integer f = this.f;
        final Integer c = this.c;
        final Boolean d = this.d;
        final CommandOuterClass$Command g = this.g;
        final String a = this.a;
        final arkg b = this.b;
        final oum e = this.e;
        ftc.a.setMax((int)f);
        ftc.a.setProgress((int)c);
        ftc.b = b;
        ftc.c = g;
        ftc.a.setEnabled((boolean)d);
        ftc.d = e;
        if (a != null && !a.isEmpty()) {
            ftc.a.setContentDescription((CharSequence)a);
        }
        ftc.setVisibility(0);
    }
    
    protected final void ac(final dsx dsx, final Object o) {
        final ftc ftc = (ftc)o;
    }
    
    protected final boolean af() {
        return true;
    }
    
    public final boolean am() {
        return true;
    }
    
    public final int an() {
        return 3;
    }
    
    protected final boolean ay(final dst dst, final dst dst2) {
        final ftb ftb = (ftb)dst;
        final ftb ftb2 = (ftb)dst2;
        final Object o = null;
        Object f;
        if (ftb == null) {
            f = null;
        }
        else {
            f = ftb.f;
        }
        final dub dub = new dub(f, (Object)ftb2.f);
        Object c;
        if (ftb == null) {
            c = null;
        }
        else {
            c = ftb.c;
        }
        final dub dub2 = new dub(c, (Object)ftb2.c);
        Object d;
        if (ftb == null) {
            d = o;
        }
        else {
            d = ftb.d;
        }
        final dub dub3 = new dub(d, (Object)ftb2.d);
        final boolean equals = ((Integer)dub.a).equals(dub.b);
        final boolean equals2 = ((Integer)dub2.a).equals(dub2.b);
        final boolean equals3 = ((Boolean)dub3.a).equals(dub3.b);
        return (equals ^ true) || (equals2 ^ true) || (equals3 ^ true);
    }
    
    public final boolean f(final dst dst) {
        if (this == dst) {
            return true;
        }
        if (dst != null && this.getClass() == dst.getClass()) {
            final ftb ftb = (ftb)dst;
            final String a = this.a;
            Label_0062: {
                if (a != null) {
                    if (a.equals(ftb.a)) {
                        break Label_0062;
                    }
                }
                else if (ftb.a == null) {
                    break Label_0062;
                }
                return false;
            }
            final arkg b = this.b;
            Label_0094: {
                if (b != null) {
                    if (b.equals(ftb.b)) {
                        break Label_0094;
                    }
                }
                else if (ftb.b == null) {
                    break Label_0094;
                }
                return false;
            }
            final Integer c = this.c;
            Label_0126: {
                if (c != null) {
                    if (c.equals(ftb.c)) {
                        break Label_0126;
                    }
                }
                else if (ftb.c == null) {
                    break Label_0126;
                }
                return false;
            }
            final Boolean d = this.d;
            Label_0158: {
                if (d != null) {
                    if (d.equals(ftb.d)) {
                        break Label_0158;
                    }
                }
                else if (ftb.d == null) {
                    break Label_0158;
                }
                return false;
            }
            final oum e = this.e;
            Label_0190: {
                if (e != null) {
                    if (e.equals(ftb.e)) {
                        break Label_0190;
                    }
                }
                else if (ftb.e == null) {
                    break Label_0190;
                }
                return false;
            }
            final Integer f = this.f;
            Label_0222: {
                if (f != null) {
                    if (f.equals(ftb.f)) {
                        break Label_0222;
                    }
                }
                else if (ftb.f == null) {
                    break Label_0222;
                }
                return false;
            }
            final CommandOuterClass$Command g = this.g;
            if (g != null) {
                if (((ahbh)g).equals((Object)ftb.g)) {
                    return true;
                }
            }
            else if (ftb.g == null) {
                return true;
            }
            return false;
        }
        return false;
    }
}
