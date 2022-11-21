import android.graphics.drawable.Drawable;
import java.util.Iterator;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.text.style.ScaleXSpan;
import java.util.List;
import android.text.SpannableStringBuilder;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acor extends acou
{
    private final acqv f;
    
    public acor(final Context context, final acqv f, final aapu aapu, final boolean b, final acov acov, final boolean b2, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        super(context, aapu, b, acov, b2, null, null, null, null, null);
        f.getClass();
        this.f = f;
    }
    
    private final void h(final String s, final StringBuilder sb) {
        if (this.c && sb != null) {
            sb.append(s);
        }
    }
    
    public final void a(final String s, final aowb aowb, final float e, final Object a, int length, final SpannableStringBuilder spannableStringBuilder, final StringBuilder sb) {
        this.f(a, length, spannableStringBuilder);
        final acoq acoq = new acoq();
        acoq.a = a;
        acoq.b = length;
        length = spannableStringBuilder.length();
        acoq.c = length;
        acoq.d = length + s.length();
        acoq.e = e;
        spannableStringBuilder.append((CharSequence)s);
        this.h(acou.c(aowb), sb);
        this.h(" ", sb);
        this.e.bX(acoq, aowb, Math.round(e), this);
    }
    
    public final void b(final SpannableStringBuilder spannableStringBuilder, final StringBuilder sb, final List list, final float n, final Object o, final int n2, final boolean b) {
        this.f(o, n2, spannableStringBuilder);
        if (list != null && !list.isEmpty()) {
            final float dimension = this.a.getResources().getDimension(2131165504);
            for (final arxs arxs : list) {
                if (!b || (arxs.d != akfi.fd && arxs.d != akfi.fa)) {
                    if (n != 0.0f) {
                        spannableStringBuilder.append((CharSequence)" ");
                        if (n != 1.0f) {
                            spannableStringBuilder.setSpan((Object)new ScaleXSpan(n), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                        }
                    }
                    final Object c = arxs.c;
                    if (c != null) {
                        this.a(" ", (aowb)c, dimension, o, n2, spannableStringBuilder, sb);
                    }
                    else {
                        if (arxs.d == akfi.a) {
                            continue;
                        }
                        final int a = this.f.a((akfi)arxs.d);
                        if (a != 0) {
                            final Drawable mutate = agy.a(this.a, a).mutate();
                            mutate.setBounds(0, 0, mutate.getIntrinsicWidth(), mutate.getIntrinsicHeight());
                            final Object a2 = arxs.a;
                            if (a2 != null) {
                                air.f(mutate, (int)a2);
                            }
                            ImageSpan imageSpan;
                            if (this.b) {
                                imageSpan = new acot(mutate);
                            }
                            else {
                                imageSpan = new ImageSpan(mutate);
                            }
                            spannableStringBuilder.append((CharSequence)" ");
                            spannableStringBuilder.setSpan((Object)imageSpan, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                        }
                        if (TextUtils.isEmpty((CharSequence)arxs.b)) {
                            continue;
                        }
                        this.h((String)arxs.b, sb);
                        this.h(" ", sb);
                    }
                }
            }
        }
    }
}
