import android.text.Layout$Alignment;
import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import android.text.style.StyleSpan;
import android.text.style.ForegroundColorSpan;
import android.text.SpannableStringBuilder;
import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

final class bxn
{
    public final List a;
    public final List b;
    public final StringBuilder c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    
    public bxn(final int n, final int h) {
        this.a = new ArrayList();
        this.b = new ArrayList();
        this.c = new StringBuilder();
        this.e(n);
        this.h = h;
    }
    
    private static void h(final SpannableStringBuilder spannableStringBuilder, final int n, final int n2, final int n3) {
        if (n3 == -1) {
            return;
        }
        spannableStringBuilder.setSpan((Object)new ForegroundColorSpan(n3), n, n2, 33);
    }
    
    private static void i(final SpannableStringBuilder spannableStringBuilder, final int n, final int n2) {
        spannableStringBuilder.setSpan((Object)new StyleSpan(2), n, n2, 33);
    }
    
    private static void j(final SpannableStringBuilder spannableStringBuilder, final int n, final int n2) {
        spannableStringBuilder.setSpan((Object)new UnderlineSpan(), n, n2, 33);
    }
    
    public final SpannableString a() {
        final SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder((CharSequence)this.c);
        final int length = spannableStringBuilder.length();
        int i = 0;
        int n = -1;
        int n2 = -1;
        int n3 = -1;
        int n4 = 0;
        int n5 = -1;
        int n6 = 0;
        while (i < this.a.size()) {
            final bxm bxm = this.a.get(i);
            final boolean b = bxm.b;
            final int a = bxm.a;
            int n7 = n2;
            int n8 = n6;
            if (a != 8) {
                int n9;
                if (a == 7) {
                    n9 = 1;
                }
                else {
                    n9 = 0;
                }
                if (a != 7) {
                    n2 = bxo.a[a];
                }
                n8 = n9;
                n7 = n2;
            }
            final int c = bxm.c;
            final int n10 = i + 1;
            int c2;
            if (n10 < this.a.size()) {
                c2 = this.a.get(n10).c;
            }
            else {
                c2 = length;
            }
            if (c == c2) {
                i = n10;
                n2 = n7;
                n6 = n8;
            }
            else {
                int n11;
                if (n != -1 && !b) {
                    j(spannableStringBuilder, n, c);
                    n11 = -1;
                }
                else if ((n11 = n) == -1) {
                    n11 = n;
                    if (b) {
                        n11 = c;
                    }
                }
                int n12;
                if (n3 != -1 && n8 == 0) {
                    i(spannableStringBuilder, n3, c);
                    n12 = -1;
                }
                else if ((n12 = n3) == -1) {
                    n12 = n3;
                    if (n8 != 0) {
                        n12 = c;
                    }
                }
                i = n10;
                n = n11;
                n2 = n7;
                n3 = n12;
                n6 = n8;
                if (n7 == n5) {
                    continue;
                }
                h(spannableStringBuilder, n4, c, n5);
                n5 = n7;
                i = n10;
                n = n11;
                n2 = n7;
                n3 = n12;
                n4 = c;
                n6 = n8;
            }
        }
        if (n != -1 && n != length) {
            j(spannableStringBuilder, n, length);
        }
        if (n3 != -1 && n3 != length) {
            i(spannableStringBuilder, n3, length);
        }
        if (n4 != length) {
            h(spannableStringBuilder, n4, length, n5);
        }
        return new SpannableString((CharSequence)spannableStringBuilder);
    }
    
    public final azx b(int g) {
        final int n = this.e + this.f;
        final int n2 = 32 - n;
        final SpannableStringBuilder a = new SpannableStringBuilder();
        for (int i = 0; i < this.b.size(); ++i) {
            a.append(baw.K((CharSequence)this.b.get(i), n2));
            a.append('\n');
        }
        a.append(baw.K((CharSequence)this.a(), n2));
        if (a.length() == 0) {
            return null;
        }
        final int n3 = n2 - a.length();
        final int n4 = n - n3;
        if (g == Integer.MIN_VALUE) {
            if (this.g == 2 && (Math.abs(n4) < 3 || n3 < 0)) {
                g = 1;
            }
            else if (this.g == 2 && n4 > 0) {
                g = 2;
            }
            else {
                g = 0;
            }
        }
        float f;
        if (g != 1) {
            int n5;
            if (g != 2) {
                n5 = n;
            }
            else {
                n5 = 32 - n3;
            }
            f = n5 / 32.0f * 0.8f + 0.1f;
        }
        else {
            f = 0.5f;
        }
        final int d = this.d;
        int n6;
        if (d > 7) {
            n6 = d - 17;
        }
        else {
            n6 = d;
            if (this.g == 1) {
                n6 = d - (this.h - 1);
            }
        }
        final azw azw = new azw();
        azw.a = (CharSequence)a;
        azw.c = Layout$Alignment.ALIGN_NORMAL;
        azw.b((float)n6, 1);
        azw.f = f;
        azw.g = g;
        return azw.a();
    }
    
    public final void c(final char c) {
        if (this.c.length() < 32) {
            this.c.append(c);
        }
    }
    
    public final void d() {
        final int length = this.c.length();
        if (length > 0) {
            this.c.delete(length - 1, length);
            int size = this.a.size();
            while (--size >= 0) {
                final bxm bxm = this.a.get(size);
                final int c = bxm.c;
                if (c != length) {
                    break;
                }
                bxm.c = c - 1;
            }
        }
    }
    
    public final void e(final int g) {
        this.g = g;
        this.a.clear();
        this.b.clear();
        this.c.setLength(0);
        this.d = 15;
        this.e = 0;
        this.f = 0;
    }
    
    public final void f(final int n, final boolean b) {
        this.a.add(new bxm(n, b, this.c.length()));
    }
    
    public final boolean g() {
        return this.a.isEmpty() && this.b.isEmpty() && this.c.length() == 0;
    }
}
