import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.text.style.StyleSpan;
import android.text.style.ForegroundColorSpan;
import android.text.SpannableStringBuilder;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class byv extends bxh
{
    private final bas a;
    private final boolean b;
    private final int c;
    private final int d;
    private final String e;
    private final float f;
    private final int g;
    
    public byv(final List list) {
        super("Tx3gDecoder");
        this.a = new bas();
        final int size = list.size();
        final String s = "sans-serif";
        boolean b = false;
        if (size != 1 || (((byte[])list.get(0)).length != 48 && ((byte[])list.get(0)).length != 53)) {
            this.c = 0;
            this.d = -1;
            this.e = "sans-serif";
            this.b = false;
            this.f = 0.85f;
            this.g = -1;
            return;
        }
        final byte[] array = list.get(0);
        this.c = array[24];
        this.d = ((array[26] & 0xFF) << 24 | (array[27] & 0xFF) << 16 | (array[28] & 0xFF) << 8 | (array[29] & 0xFF));
        String e;
        if (!"Serif".equals(bax.O(array, 43, array.length - 43))) {
            e = s;
        }
        else {
            e = "serif";
        }
        this.e = e;
        final int g = array[25] * 20;
        this.g = g;
        if ((array[0] & 0x20) != 0x0) {
            b = true;
        }
        this.b = b;
        if (b) {
            this.f = bax.a(((array[11] & 0xFF) | (array[10] & 0xFF) << 8) / (float)g, 0.0f, 0.95f);
            return;
        }
        this.f = 0.85f;
    }
    
    private static void o(final boolean b) {
        if (b) {
            return;
        }
        throw new bxk("Unexpected subtitle format.");
    }
    
    private static void p(final SpannableStringBuilder spannableStringBuilder, final int n, final int n2, final int n3, final int n4, final int n5) {
        if (n != n2) {
            spannableStringBuilder.setSpan((Object)new ForegroundColorSpan(n >>> 8 | (n & 0xFF) << 24), n3, n4, n5 | 0x21);
        }
    }
    
    private static void q(final SpannableStringBuilder spannableStringBuilder, final int n, int n2, final int n3, final int n4, int n5) {
        if (n != n2) {
            final int n6 = n5 | 0x21;
            n5 = (n & 0x1);
            if ((n & 0x2) != 0x0) {
                n2 = 1;
            }
            else {
                n2 = 0;
            }
            if (n5 != 0) {
                if (n2 != 0) {
                    spannableStringBuilder.setSpan((Object)new StyleSpan(3), n3, n4, n6);
                }
                else {
                    spannableStringBuilder.setSpan((Object)new StyleSpan(1), n3, n4, n6);
                }
            }
            else if (n2 != 0) {
                spannableStringBuilder.setSpan((Object)new StyleSpan(2), n3, n4, n6);
            }
            if ((n & 0x4) == 0x0) {
                if (n5 == 0 && n2 == 0) {
                    spannableStringBuilder.setSpan((Object)new StyleSpan(0), n3, n4, n6);
                }
            }
            else {
                spannableStringBuilder.setSpan((Object)new UnderlineSpan(), n3, n4, n6);
            }
        }
    }
    
    protected final bxi n(final byte[] array, int n, final boolean b) {
        this.a.E(array, n);
        final bas a = this.a;
        o(a.a() >= 2);
        n = a.m();
        String s = null;
        Label_0133: {
            if (n == 0) {
                s = "";
            }
            else {
                if (a.a() >= 2) {
                    final byte[] a2 = a.a;
                    final int b2 = a.b;
                    final int n2 = (a2[b2 + 1] & 0xFF) | (a2[b2] & 0xFF) << 8;
                    if (n2 == 65279 || n2 == 65534) {
                        s = a.x(n, aeza.e);
                        break Label_0133;
                    }
                }
                s = a.x(n, aeza.c);
            }
        }
        if (s.isEmpty()) {
            return (bxi)byw.a;
        }
        final SpannableStringBuilder a3 = new SpannableStringBuilder((CharSequence)s);
        q(a3, this.c, 0, 0, a3.length(), 16711680);
        p(a3, this.d, -1, 0, a3.length(), 16711680);
        final String e = this.e;
        n = a3.length();
        if (e != "sans-serif") {
            a3.setSpan((Object)new TypefaceSpan(e), 0, n, 16711713);
        }
        float f = this.f;
        while (this.a.a() >= 8) {
            final bas a4 = this.a;
            final int b3 = a4.b;
            final int d = a4.d();
            n = this.a.d();
            float a5;
            if (n == 1937013100) {
                o(this.a.a() >= 2);
                final int m = this.a.m();
                n = 0;
                while (true) {
                    a5 = f;
                    if (n >= m) {
                        break;
                    }
                    final bas a6 = this.a;
                    o(a6.a() >= 12);
                    final int i = a6.m();
                    int n3 = a6.m();
                    a6.H(2);
                    final int j = a6.i();
                    a6.H(1);
                    final int d2 = a6.d();
                    if (n3 > a3.length()) {
                        final int length = a3.length();
                        final StringBuilder sb = new StringBuilder("Truncating styl end (");
                        sb.append(n3);
                        sb.append(") to cueText.length() (");
                        sb.append(length);
                        sb.append(").");
                        bap.c("Tx3gDecoder", sb.toString());
                        n3 = a3.length();
                    }
                    if (i >= n3) {
                        final StringBuilder sb2 = new StringBuilder("Ignoring styl with start (");
                        sb2.append(i);
                        sb2.append(") >= end (");
                        sb2.append(n3);
                        sb2.append(").");
                        bap.c("Tx3gDecoder", sb2.toString());
                    }
                    else {
                        q(a3, j, this.c, i, n3, 0);
                        p(a3, d2, this.d, i, n3, 0);
                    }
                    ++n;
                }
            }
            else {
                a5 = f;
                if (n == 1952608120) {
                    a5 = f;
                    if (this.b) {
                        o(this.a.a() >= 2);
                        a5 = bax.a(this.a.m() / (float)this.g, 0.0f, 0.95f);
                    }
                }
            }
            this.a.G(b3 + d);
            f = a5;
        }
        final azx azx = new azx();
        azx.a = (CharSequence)a3;
        azx.b(f, 0);
        azx.e = 0;
        return (bxi)new byw(azx.a());
    }
}
