import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.UnderlineSpan;
import android.text.style.StyleSpan;
import android.text.SpannableString;
import android.graphics.Color;
import java.util.ArrayList;
import android.text.SpannableStringBuilder;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

final class bxq
{
    public static final int a;
    public static final int b;
    public static final int[] c;
    public static final int[] d;
    public static final int[] e;
    public static final boolean[] f;
    public static final int[] g;
    public static final int[] h;
    public static final int[] i;
    public static final int[] j;
    private int A;
    private int B;
    private int C;
    private int D;
    private int E;
    private int F;
    public final List k;
    public final SpannableStringBuilder l;
    public boolean m;
    public boolean n;
    public int o;
    public boolean p;
    public int q;
    public int r;
    public int s;
    public int t;
    public boolean u;
    public int v;
    public int w;
    public int x;
    public int y;
    public int z;
    
    static {
        a = a(2, 2, 2, 0);
        final int n = b = a(0, 0, 0, 0);
        final int a2 = a(0, 0, 0, 3);
        c = new int[] { 0, 0, 0, 0, 0, 2, 0 };
        d = new int[] { 0, 0, 0, 0, 0, 0, 2 };
        e = new int[] { 3, 3, 3, 3, 3, 3, 1 };
        f = new boolean[] { false, false, false, true, true, true, false };
        g = new int[] { n, a2, n, n, a2, n, n };
        h = new int[] { 0, 1, 2, 3, 4, 3, 4 };
        i = new int[] { 0, 0, 0, 0, 0, 3, 3 };
        j = new int[] { n, n, n, n, n, a2, a2 };
    }
    
    public bxq() {
        this.k = new ArrayList();
        this.l = new SpannableStringBuilder();
        this.e();
    }
    
    public static int a(int n, int n2, final int n3, int n4) {
        dk.j(n, 4);
        dk.j(n2, 4);
        dk.j(n3, 4);
        dk.j(n4, 4);
        int n5 = 0;
        Label_0060: {
            if (n4 != 0 && n4 != 1) {
                if (n4 == 2) {
                    n4 = 127;
                    break Label_0060;
                }
                if (n4 == 3) {
                    n4 = 0;
                    break Label_0060;
                }
            }
            n4 = 255;
        }
        if (n > 1) {
            n = 255;
        }
        else {
            n = 0;
        }
        if (n2 > 1) {
            n2 = 255;
        }
        else {
            n2 = 0;
        }
        if (n3 > 1) {
            n5 = 255;
        }
        return Color.argb(n4, n, n2, n5);
    }
    
    public static void j(final int n, final int n2, final int n3) {
        a(n, n2, n3, 0);
    }
    
    public final SpannableString b() {
        final SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder((CharSequence)this.l);
        final int length = spannableStringBuilder.length();
        if (length > 0) {
            if (this.A != -1) {
                spannableStringBuilder.setSpan((Object)new StyleSpan(2), this.A, length, 33);
            }
            if (this.B != -1) {
                spannableStringBuilder.setSpan((Object)new UnderlineSpan(), this.B, length, 33);
            }
            if (this.C != -1) {
                spannableStringBuilder.setSpan((Object)new ForegroundColorSpan(this.D), this.C, length, 33);
            }
            if (this.E != -1) {
                spannableStringBuilder.setSpan((Object)new BackgroundColorSpan(this.F), this.E, length, 33);
            }
        }
        return new SpannableString((CharSequence)spannableStringBuilder);
    }
    
    public final void c(final char c) {
        if (c == '\n') {
            this.k.add(this.b());
            this.l.clear();
            if (this.A != -1) {
                this.A = 0;
            }
            if (this.B != -1) {
                this.B = 0;
            }
            if (this.C != -1) {
                this.C = 0;
            }
            if (this.E != -1) {
                this.E = 0;
            }
            while ((this.u && this.k.size() >= this.t) || this.k.size() >= 15) {
                this.k.remove(0);
            }
            return;
        }
        this.l.append(c);
    }
    
    public final void d() {
        this.k.clear();
        this.l.clear();
        this.A = -1;
        this.B = -1;
        this.C = -1;
        this.E = -1;
        this.z = 0;
    }
    
    public final void e() {
        this.d();
        this.m = false;
        this.n = false;
        this.o = 4;
        this.p = false;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.t = 15;
        this.u = true;
        this.v = 0;
        this.w = 0;
        this.x = 0;
        final int b = bxq.b;
        this.y = b;
        this.D = bxq.a;
        this.F = b;
    }
    
    public final boolean f() {
        final boolean m = this.m;
        boolean b = true;
        if (m) {
            if (this.k.isEmpty()) {
                if (this.l.length() != 0) {
                    return false;
                }
                b = b;
            }
            else {
                b = false;
            }
        }
        return b;
    }
    
    public final void g(final boolean b, final boolean b2) {
        if (this.A != -1) {
            if (!b) {
                this.l.setSpan((Object)new StyleSpan(2), this.A, this.l.length(), 33);
                this.A = -1;
            }
        }
        else if (b) {
            this.A = this.l.length();
        }
        if (this.B != -1) {
            if (!b2) {
                this.l.setSpan((Object)new UnderlineSpan(), this.B, this.l.length(), 33);
                this.B = -1;
            }
        }
        else if (b2) {
            this.B = this.l.length();
        }
    }
    
    public final void h(final int d, final int f) {
        if (this.C != -1 && this.D != d) {
            this.l.setSpan((Object)new ForegroundColorSpan(this.D), this.C, this.l.length(), 33);
        }
        if (d != bxq.a) {
            this.C = this.l.length();
            this.D = d;
        }
        if (this.E != -1 && this.F != f) {
            this.l.setSpan((Object)new BackgroundColorSpan(this.F), this.E, this.l.length(), 33);
        }
        if (f != bxq.b) {
            this.E = this.l.length();
            this.F = f;
        }
    }
    
    public final void i(final int y, final int v) {
        this.y = y;
        this.v = v;
    }
}
