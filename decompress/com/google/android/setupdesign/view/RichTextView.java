// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.setupdesign.view;

import android.text.style.ClickableSpan;
import android.text.style.TypefaceSpan;
import android.text.Spannable;
import android.text.style.TextAppearanceSpan;
import android.util.Log;
import android.text.Annotation;
import android.text.SpannableString;
import android.text.Spanned;
import android.widget.TextView$BufferType;
import android.text.method.MovementMethod;
import android.view.MotionEvent;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.Typeface;
import android.support.v7.widget.AppCompatTextView;

public class RichTextView extends AppCompatTextView implements aefv
{
    public static Typeface a;
    private aefs b;
    
    public RichTextView(final Context context) {
        super(context);
        this.b();
    }
    
    public RichTextView(final Context context, final AttributeSet set) {
        super(context, set);
        this.b();
    }
    
    private final void b() {
        if (this.isInEditMode()) {
            return;
        }
        anb.N((View)this, (akw)(this.b = new aefs()));
    }
    
    public final void a() {
    }
    
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        final int[] drawableState = this.getDrawableState();
        for (final Drawable drawable : this.getCompoundDrawablesRelative()) {
            if (drawable != null && drawable.setState(drawableState)) {
                this.invalidateDrawable(drawable);
            }
        }
    }
    
    public final boolean onTouchEvent(final MotionEvent motionEvent) {
        final boolean onTouchEvent = super.onTouchEvent(motionEvent);
        final MovementMethod movementMethod = this.getMovementMethod();
        if (movementMethod instanceof aegl) {
            final aegl aegl = (aegl)movementMethod;
            if (aegl.b == motionEvent) {
                return aegl.a;
            }
        }
        return onTouchEvent;
    }
    
    public final void setText(final CharSequence charSequence, final TextView$BufferType textView$BufferType) {
        final Context context = this.getContext();
        final boolean b = charSequence instanceof Spanned;
        boolean b2 = true;
        Object o = charSequence;
        if (b) {
            o = new SpannableString(charSequence);
            for (final Annotation annotation : (Annotation[])((SpannableString)o).getSpans(0, ((SpannableString)o).length(), (Class)Annotation.class)) {
                final String key = annotation.getKey();
                if ("textAppearance".equals(key)) {
                    int identifier;
                    if ((identifier = context.getResources().getIdentifier(annotation.getValue(), "style", context.getPackageName())) == 0) {
                        Log.w("RichTextView", "Cannot find resource: 0");
                        identifier = 0;
                    }
                    aefb.n((Spannable)o, (Object)annotation, new Object[] { new TextAppearanceSpan(context, identifier) });
                }
                else if ("link".equals(key)) {
                    annotation.getValue();
                    final aefw aefw = new aefw();
                    TypefaceSpan typefaceSpan;
                    if (RichTextView.a != null) {
                        typefaceSpan = new TypefaceSpan(RichTextView.a);
                    }
                    else {
                        typefaceSpan = new TypefaceSpan("sans-serif-medium");
                    }
                    aefb.n((Spannable)o, (Object)annotation, new Object[] { aefw, typefaceSpan });
                }
            }
        }
        super.setText((CharSequence)o, textView$BufferType);
        if (!(o instanceof Spanned) || ((ClickableSpan[])((Spanned)o).getSpans(0, ((CharSequence)o).length(), (Class)ClickableSpan.class)).length <= 0) {
            b2 = false;
        }
        if (b2) {
            this.setMovementMethod((MovementMethod)new aegl());
        }
        else {
            this.setMovementMethod((MovementMethod)null);
        }
        this.setFocusable(b2);
        this.setRevealOnFocusHint(false);
        this.setFocusableInTouchMode(b2);
    }
}
