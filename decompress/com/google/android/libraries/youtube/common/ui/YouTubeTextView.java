// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.youtube.common.ui;

import android.widget.TextView$BufferType;
import android.view.MotionEvent;
import android.text.StaticLayout;
import android.text.Layout$Alignment;
import android.text.Layout;
import android.text.style.ClickableSpan;
import android.text.Spanned;
import android.content.res.Resources$Theme;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.TextView;

public class YouTubeTextView extends TextView
{
    private boolean a;
    private boolean b;
    private boolean c;
    private boolean d;
    private int e;
    private boolean f;
    public boolean g;
    public boolean h;
    public int i;
    private int j;
    private boolean k;
    private int l;
    private float m;
    private float n;
    
    public YouTubeTextView(final Context context) {
        super(context);
        this.b = false;
        this.c = true;
        this.h = false;
        this.d = false;
        this.f = false;
        this.k = false;
        this.m = 1.0f;
        this.n = 0.0f;
        this.f(context, null, 0, 0);
    }
    
    public YouTubeTextView(final Context context, final AttributeSet set) {
        super(context, set);
        this.b = false;
        this.c = true;
        this.h = false;
        this.d = false;
        this.f = false;
        this.k = false;
        this.m = 1.0f;
        this.n = 0.0f;
        this.f(context, set, 0, 0);
    }
    
    public YouTubeTextView(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.b = false;
        this.c = true;
        this.h = false;
        this.d = false;
        this.f = false;
        this.k = false;
        this.m = 1.0f;
        this.n = 0.0f;
        this.f(context, set, n, 0);
    }
    
    public YouTubeTextView(final Context context, final AttributeSet set, final int n, final int n2) {
        super(context, set, n, n2);
        this.b = false;
        this.c = true;
        this.h = false;
        this.d = false;
        this.f = false;
        this.k = false;
        this.m = 1.0f;
        this.n = 0.0f;
        this.f(context, set, n, n2);
    }
    
    private final void a(final TypedArray typedArray) {
        if (this.isInEditMode()) {
            return;
        }
        final int indexCount = typedArray.getIndexCount();
        final int n = 0;
        int i = 0;
        int n2 = -1;
        int n3 = -1;
        int n4 = -1;
        int n5 = -1;
        while (i < indexCount) {
            final int index = typedArray.getIndex(i);
            final int[] a = tqs.a;
            int int1;
            int int2;
            int int3;
            int int4;
            if (index == 5) {
                this.a = typedArray.getBoolean(5, false);
                int1 = n2;
                int2 = n3;
                int3 = n4;
                int4 = n5;
            }
            else if (index == 1) {
                int4 = typedArray.getInt(1, n5);
                int1 = n2;
                int2 = n3;
                int3 = n4;
            }
            else if (index == 6) {
                int1 = typedArray.getInt(6, n2);
                int2 = n3;
                int3 = n4;
                int4 = n5;
            }
            else if (index == 12) {
                int2 = typedArray.getInt(12, n3);
                int1 = n2;
                int3 = n4;
                int4 = n5;
            }
            else if (index == 11) {
                int3 = typedArray.getInt(11, n4);
                int1 = n2;
                int2 = n3;
                int4 = n5;
            }
            else if (index == 4) {
                this.i = typedArray.getColor(4, 0);
                this.h = true;
                int1 = n2;
                int2 = n3;
                int3 = n4;
                int4 = n5;
            }
            else if (index == 8) {
                this.e = typedArray.getColor(8, 0);
                this.d = true;
                int1 = n2;
                int2 = n3;
                int3 = n4;
                int4 = n5;
            }
            else if (index == 9) {
                this.j = typedArray.getColor(9, 0);
                this.f = true;
                int1 = n2;
                int2 = n3;
                int3 = n4;
                int4 = n5;
            }
            else if (index == 10) {
                this.l = typedArray.getDimensionPixelSize(10, 0);
                this.k = true;
                int1 = n2;
                int2 = n3;
                int3 = n4;
                int4 = n5;
            }
            else {
                int1 = n2;
                int2 = n3;
                int3 = n4;
                int4 = n5;
                if (index == 7) {
                    this.c = typedArray.getBoolean(7, true);
                    int4 = n5;
                    int3 = n4;
                    int2 = n3;
                    int1 = n2;
                }
            }
            ++i;
            n2 = int1;
            n3 = int2;
            n4 = int3;
            n5 = int4;
        }
        final Context context = this.getContext();
        acan acan;
        if (n2 != -1) {
            acan = acan.c(n2);
        }
        else if (n3 != -1) {
            acan = acan.d(n3);
        }
        else {
            final acan acan2 = acan = null;
            if (n4 != -1) {
                final acan[] values = acan.values();
                final int length = values.length;
                int n6 = n;
                while (true) {
                    acan = acan2;
                    if (n6 >= length) {
                        break;
                    }
                    acan = values[n6];
                    if (acan.v == n4) {
                        break;
                    }
                    ++n6;
                }
            }
        }
        if (acan != null) {
            this.setTypeface(acan.b(context, n5), n5);
        }
    }
    
    private final void f(final Context context, final AttributeSet set, int resourceId, final int n) {
        if (this.isInEditMode()) {
            return;
        }
        final Resources$Theme theme = context.getTheme();
        final TypedArray obtainStyledAttributes = theme.obtainStyledAttributes((AttributeSet)null, tqs.i, resourceId, n);
        this.a(obtainStyledAttributes);
        obtainStyledAttributes.recycle();
        final TypedArray obtainStyledAttributes2 = theme.obtainStyledAttributes(set, tqs.i, 0, 0);
        resourceId = obtainStyledAttributes2.getResourceId(0, 0);
        if (resourceId != 0) {
            final TypedArray obtainStyledAttributes3 = theme.obtainStyledAttributes(resourceId, tqs.i);
            this.a(obtainStyledAttributes3);
            obtainStyledAttributes3.recycle();
        }
        this.a(obtainStyledAttributes2);
        obtainStyledAttributes2.recycle();
    }
    
    private final void g() {
        if (this.a) {
            final CharSequence text = this.getText();
            if (text instanceof Spanned && ((ClickableSpan[])((Spanned)text).getSpans(0, text.length(), (Class)ClickableSpan.class)).length > 0) {
                this.d();
                return;
            }
            this.c();
        }
    }
    
    public final Layout b(final CharSequence charSequence) {
        return (Layout)new StaticLayout(charSequence, this.getPaint(), this.getWidth() - this.getPaddingLeft() - this.getPaddingRight(), Layout$Alignment.ALIGN_NORMAL, this.m, this.n, false);
    }
    
    public final void c() {
        this.b = false;
        this.setMovementMethod(this.getDefaultMovementMethod());
    }
    
    public final void d() {
        this.b = true;
        final boolean longClickable = this.isLongClickable();
        this.setMovementMethod(tro.a());
        this.setLongClickable(longClickable);
    }
    
    public final void e(final boolean a) {
        this.a = a;
        if (a) {
            this.g();
            return;
        }
        this.c();
    }
    
    public final boolean onTouchEvent(final MotionEvent motionEvent) {
        if (this.b) {
            this.g = false;
            super.onTouchEvent(motionEvent);
            return this.g;
        }
        return super.onTouchEvent(motionEvent);
    }
    
    public final void scrollTo(final int n, final int n2) {
        if (this.c) {
            super.scrollTo(n, n2);
        }
    }
    
    public final void setLineSpacing(final float n, final float m) {
        super.setLineSpacing(this.n = n, this.m = m);
    }
    
    public final void setText(final CharSequence charSequence, final TextView$BufferType textView$BufferType) {
        if (charSequence instanceof Spanned) {
            final int dimensionPixelSize = this.getContext().getResources().getDimensionPixelSize(2131169854);
            final Spanned spanned = (Spanned)charSequence;
            final int length = charSequence.length();
            int i = 0;
            for (final acad acad : (acad[])spanned.getSpans(0, length, (Class)acad.class)) {
                if (this.d) {
                    acad.a.setColor(this.e);
                    acad.b = true;
                }
                acad.a.setStrokeWidth((float)dimensionPixelSize);
            }
            int n;
            if (this.k) {
                n = this.l;
            }
            else {
                n = this.getContext().getResources().getDimensionPixelSize(2131170191);
            }
            for (acae[] array2 = (acae[])spanned.getSpans(0, charSequence.length(), (Class)acae.class); i < array2.length; ++i) {
                final acae acae = array2[i];
                if (this.f) {
                    acae.a.setColor(this.j);
                    acae.b = true;
                }
                acae.a.setStrokeWidth((float)n);
            }
        }
        super.setText(charSequence, textView$BufferType);
        this.g();
    }
    
    public final void setTextAppearance(final Context context, final int n) {
        final acan c = acan.c(-1);
        if (c != null) {
            this.setTypeface(c.b(this.getContext(), 0), 0);
        }
        this.i = 0;
        this.e = 0;
        this.j = 0;
        this.l = 0;
        this.h = false;
        this.d = false;
        this.f = false;
        this.k = false;
        super.setTextAppearance(context, n);
        final TypedArray obtainStyledAttributes = this.getContext().obtainStyledAttributes(n, tqs.i);
        this.a(obtainStyledAttributes);
        obtainStyledAttributes.recycle();
    }
}
