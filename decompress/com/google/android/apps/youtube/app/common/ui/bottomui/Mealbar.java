// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.common.ui.bottomui;

import android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.View;
import android.animation.StateListAnimator;
import android.view.View$OnClickListener;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.ImageView;
import android.widget.Button;
import android.widget.TextView;
import androidx.cardview.widget.CardView;

public class Mealbar extends CardView implements gaz
{
    public TextView g;
    public TextView h;
    public Button i;
    public Button j;
    public ImageView k;
    
    public Mealbar(final Context context) {
        super(context);
    }
    
    public Mealbar(final Context context, final AttributeSet set) {
        super(context, set);
    }
    
    public Mealbar(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
    }
    
    public final void a() {
        final CharSequence text = this.g.getText();
        if (!TextUtils.isEmpty(text) && TextUtils.getTrimmedLength(text) > 0) {
            final String trim = text.toString().trim();
            final Context context = this.getContext();
            final AccessibilityManager accessibilityManager = (AccessibilityManager)context.getSystemService("accessibility");
            if (accessibilityManager.isEnabled()) {
                final AccessibilityEvent obtain = AccessibilityEvent.obtain(32);
                obtain.setClassName((CharSequence)Mealbar.class.getName());
                obtain.setPackageName((CharSequence)context.getPackageName());
                obtain.getText().add(trim);
                obtain.setEnabled(true);
                accessibilityManager.sendAccessibilityEvent(obtain);
            }
        }
    }
    
    public final void h(final View$OnClickListener onClickListener, final aicz aicz, final ziy ziy) {
        final acsy ap = ziy.ap((TextView)this.i);
        ap.h();
        ((acsx)ap).b(aicz, (wyw)null);
        this.i.setOnClickListener(onClickListener);
    }
    
    public final void i(final View$OnClickListener onClickListener, final aicz aicz, final ziy ziy) {
        final acsy ap = ziy.ap((TextView)this.j);
        ap.h();
        ((acsx)ap).b(aicz, (wyw)null);
        this.j.setOnClickListener(onClickListener);
    }
    
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.g = (TextView)this.findViewById(2131429784);
        this.h = (TextView)this.findViewById(2131429783);
        this.i = (Button)this.findViewById(2131429780);
        this.j = (Button)this.findViewById(2131429781);
        this.k = (ImageView)this.findViewById(2131429782);
        this.setStateListAnimator((StateListAnimator)null);
        anb.aw((View)this);
    }
    
    public final void onInitializeAccessibilityNodeInfo(final AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClickable(false);
        accessibilityNodeInfo.removeAction(AccessibilityNodeInfo$AccessibilityAction.ACTION_CLICK);
    }
}
