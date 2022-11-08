// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.common.ui.bottomui;

import android.view.View;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.TextView;

public class HatsHorizontalSurvey extends HatsSurvey
{
    TextView a;
    TextView b;
    
    public HatsHorizontalSurvey(final Context context) {
        super(context);
    }
    
    public HatsHorizontalSurvey(final Context context, final AttributeSet set) {
        super(context, set);
    }
    
    public HatsHorizontalSurvey(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
    }
    
    public final void a(final CharSequence text) {
        this.b.setText(text);
        tmy.v((View)this.b, TextUtils.isEmpty(text) ^ true);
    }
    
    public final void b(final CharSequence text) {
        this.a.setText(text);
        tmy.v((View)this.a, TextUtils.isEmpty(text) ^ true);
    }
    
    protected final boolean c() {
        return true;
    }
    
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.a = (TextView)this.findViewById(2131429186);
        this.b = (TextView)this.findViewById(2131429185);
    }
}
