// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.cast.framework.internal.featurehighlight;

import android.view.View;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.TextView;
import android.widget.LinearLayout;

public class HelpTextView extends LinearLayout
{
    TextView bodyTextView;
    TextView headerTextView;
    
    public HelpTextView(final Context context, final AttributeSet set) {
        super(context, set);
    }
    
    private void setTextAndVisibility(final TextView textView, final CharSequence text) {
        textView.setText(text);
        int visibility;
        if (!TextUtils.isEmpty(text)) {
            visibility = 0;
        }
        else {
            visibility = 8;
        }
        textView.setVisibility(visibility);
    }
    
    public View asView() {
        return (View)this;
    }
    
    protected void onFinishInflate() {
        super.onFinishInflate();
        final TextView headerTextView = (TextView)this.findViewById(2131428059);
        headerTextView.getClass();
        this.headerTextView = headerTextView;
        final TextView bodyTextView = (TextView)this.findViewById(2131428058);
        bodyTextView.getClass();
        this.bodyTextView = bodyTextView;
    }
    
    public void setText(final CharSequence charSequence, final CharSequence charSequence2) {
        this.setTextAndVisibility(this.headerTextView, charSequence);
        this.setTextAndVisibility(this.bodyTextView, charSequence2);
    }
}
