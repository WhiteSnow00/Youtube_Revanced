// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.common.widget;

import java.util.Iterator;
import android.text.style.StyleSpan;
import android.text.TextUtils$TruncateAt;
import android.text.TextUtils;
import android.view.View$MeasureSpec;
import android.util.AttributeSet;
import java.util.Collections;
import android.content.Context;
import android.text.SpannableString;
import java.util.List;
import android.widget.TextView;

public class WrappingTextViewForClarifyBox extends TextView
{
    public List a;
    public int b;
    public int c;
    public adtj d;
    private SpannableString e;
    private CharSequence f;
    private int g;
    
    public WrappingTextViewForClarifyBox(final Context context) {
        super(context);
        this.a = Collections.emptyList();
        this.b = 0;
        this.g = 0;
    }
    
    public WrappingTextViewForClarifyBox(final Context context, final AttributeSet set) {
        super(context, set);
        this.a = Collections.emptyList();
        this.b = 0;
        this.g = 0;
    }
    
    public WrappingTextViewForClarifyBox(final Context context, final AttributeSet set, final int n, final int n2) {
        super(context, set, n, n2);
        this.a = Collections.emptyList();
        this.b = 0;
        this.g = 0;
    }
    
    protected final void onMeasure(final int n, final int n2) {
        if (!this.a.isEmpty()) {
            final StringBuilder sb = new StringBuilder();
            int size;
            if (View$MeasureSpec.getMode(n) == 0) {
                size = Integer.MAX_VALUE;
            }
            else {
                size = View$MeasureSpec.getSize(n);
            }
            final int n3 = size - this.c;
            StringBuilder sb2 = new StringBuilder();
            this.g = 0;
            final Iterator iterator = this.a.iterator();
            int n4 = 0;
            int n5 = 0;
            StringBuilder sb3;
            while (true) {
                sb3 = sb2;
                if (!iterator.hasNext()) {
                    break;
                }
                final CharSequence charSequence = (CharSequence)iterator.next();
                n4 += charSequence.length();
                final boolean b = sb2.length() == 0;
                if (TextUtils.isEmpty(charSequence)) {
                    continue;
                }
                int n6 = n4;
                if (!b && (n6 = n4) != this.b) {
                    sb2.append(" ");
                    n6 = n4 + 1;
                }
                sb2.append(charSequence);
                final boolean b2 = n5 == this.getMaxLines() - 1;
                final float measureText = this.getPaint().measureText(sb2.toString());
                final float n7 = (float)size;
                boolean b3 = measureText <= n7;
                if (b2) {
                    b3 = (this.getPaint().measureText(sb2.toString()) <= n3);
                }
                if (b2) {
                    n4 = n6;
                    if (!b3) {
                        final CharSequence ellipsize = TextUtils.ellipsize((CharSequence)sb2, this.getPaint(), (float)n3, TextUtils$TruncateAt.END);
                        sb3 = new StringBuilder();
                        sb3.append(ellipsize);
                        break;
                    }
                    continue;
                }
                else {
                    n4 = n6;
                    if (b3) {
                        continue;
                    }
                    final boolean b4 = b ^ true;
                    if (b4) {
                        sb2.delete(sb2.length() - charSequence.length(), sb2.length());
                    }
                    CharSequence charSequence2;
                    if (b) {
                        charSequence2 = TextUtils.ellipsize((CharSequence)sb2, this.getPaint(), n7, TextUtils$TruncateAt.END);
                    }
                    else {
                        charSequence2 = sb2.toString();
                    }
                    sb.append(charSequence2);
                    ++n5;
                    if (b4) {
                        sb2 = new StringBuilder(charSequence);
                        n4 = n6;
                    }
                    else {
                        sb2 = new StringBuilder();
                        n4 = n6;
                    }
                }
            }
            if (sb3.length() != 0) {
                sb.append((CharSequence)sb3);
            }
            int g;
            if (sb3.length() != 0) {
                g = (int)(n3 - this.getPaint().measureText(sb3.toString()));
            }
            else {
                g = -1;
            }
            this.g = g;
            final CharSequence subSequence = sb.subSequence(0, sb.length());
            this.f = subSequence;
            (this.e = new SpannableString(subSequence)).setSpan((Object)new StyleSpan(1), 0, this.b, 18);
            this.setText((CharSequence)this.e);
            final adtj d = this.d;
            if (d != null) {
                ((jjc)d.b).d.g(this.g, d.a);
            }
        }
        super.onMeasure(n, n2);
    }
}
