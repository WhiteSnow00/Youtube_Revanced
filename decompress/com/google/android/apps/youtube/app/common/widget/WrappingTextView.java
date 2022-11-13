// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.common.widget;

import java.util.Collection;
import java.util.ArrayList;
import android.text.TextUtils;
import android.text.TextUtils$TruncateAt;
import android.util.AttributeSet;
import android.view.View$MeasureSpec;
import android.content.Context;
import java.util.List;
import android.widget.TextView;

public class WrappingTextView extends TextView
{
    private static final afeq b;
    public List a;
    private StringBuilder c;
    private StringBuilder d;
    private int e;
    private boolean f;
    
    static {
        b = afeq.q();
    }
    
    public WrappingTextView(final Context context) {
        super(context);
        this.a = (List)WrappingTextView.b;
        this.e = View$MeasureSpec.makeMeasureSpec(0, 1073741824);
        this.f = true;
    }
    
    public WrappingTextView(final Context context, final AttributeSet set) {
        super(context, set);
        this.a = (List)WrappingTextView.b;
        this.e = View$MeasureSpec.makeMeasureSpec(0, 1073741824);
        this.f = true;
    }
    
    public WrappingTextView(final Context context, final AttributeSet set, final int n, final int n2) {
        super(context, set, n, n2);
        this.a = (List)WrappingTextView.b;
        this.e = View$MeasureSpec.makeMeasureSpec(0, 1073741824);
        this.f = true;
    }
    
    private final CharSequence b(final CharSequence charSequence, final float n) {
        return TextUtils.ellipsize(charSequence, this.getPaint(), n, TextUtils$TruncateAt.END);
    }
    
    public final void a(final List list) {
        Object b = list;
        if (list == null) {
            b = WrappingTextView.b;
        }
        if (this.a.equals(b)) {
            if (((List)b).isEmpty() && !TextUtils.isEmpty(this.getText())) {
                this.setText((CharSequence)null);
            }
            return;
        }
        List a = (List)b;
        if (!(b instanceof afeq)) {
            a = new ArrayList((Collection)b);
        }
        this.a = a;
        if (a.isEmpty()) {
            this.f = false;
            this.setText((CharSequence)null);
            return;
        }
        this.f = true;
        this.requestLayout();
    }
    
    protected final void onMeasure(final int e, final int n) {
        if (!this.a.isEmpty() && (this.e != e || this.f)) {
            int size;
            if (View$MeasureSpec.getMode(e) == 0) {
                size = Integer.MAX_VALUE;
            }
            else {
                size = View$MeasureSpec.getSize(e);
            }
            final int paddingLeft = this.getPaddingLeft();
            final int paddingRight = this.getPaddingRight();
            final int n2 = this.getMaxLines() - 1;
            final StringBuilder c = this.c;
            if (c == null) {
                this.c = new StringBuilder();
                this.d = new StringBuilder();
            }
            else {
                c.setLength(0);
                this.d.setLength(0);
            }
            final int size2 = this.a.size();
            int n3 = 0;
            int n4 = 0;
            int n5 = 0;
            while (n3 < size2 && n4 <= n2) {
                int n6 = n4;
                int n7 = n5;
                if (!TextUtils.isEmpty((CharSequence)this.a.get(n3))) {
                    final String string = this.a.get(n3).toString();
                    if (n5 != 0) {
                        this.c.append('\n');
                    }
                    final boolean empty = TextUtils.isEmpty((CharSequence)this.d);
                    final int length = this.d.length();
                    if (!empty) {
                        this.d.append(" · ");
                    }
                    this.d.append((CharSequence)string);
                    final StringBuilder d = this.d;
                    final float n8 = (float)(size - paddingLeft - paddingRight);
                    if (this.getPaint().measureText(d.toString()) < n8) {
                        n7 = 0;
                        n6 = n4;
                    }
                    else {
                        if (n4 != n2 && !empty) {
                            this.c.append(this.d, 0, length);
                            this.c.append('\n');
                            this.d.setLength(0);
                            this.d.append(this.b(string, n8));
                            n7 = 0;
                        }
                        else {
                            this.c.append(this.b(this.d, n8));
                            this.d.setLength(0);
                            n7 = 1;
                        }
                        n6 = n4 + 1;
                    }
                }
                ++n3;
                n4 = n6;
                n5 = n7;
            }
            if (!TextUtils.isEmpty((CharSequence)this.d)) {
                this.c.append((CharSequence)this.d);
            }
            this.setText((CharSequence)this.c);
            this.e = e;
            this.f = false;
        }
        super.onMeasure(e, n);
    }
}
