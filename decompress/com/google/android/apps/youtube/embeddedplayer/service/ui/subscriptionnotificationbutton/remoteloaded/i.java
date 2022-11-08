// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.remoteloaded;

import android.view.Window;
import android.graphics.Rect;
import android.app.Activity;
import android.graphics.Point;
import android.graphics.drawable.ColorDrawable;
import android.view.View$MeasureSpec;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.View$OnClickListener;
import java.util.List;
import com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.model.SubscriptionNotificationMenuItem;
import android.view.ViewGroup;
import android.view.View;
import com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.model.SubscriptionNotificationMenuData;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.content.Context;
import android.widget.PopupWindow;

public final class i implements h
{
    public PopupWindow b;
    public boolean c;
    private final Context d;
    
    public i(final Context d) {
        this.d = d;
    }
    
    private final Drawable d(final int n) {
        final Resources resources = this.d.getResources();
        if (n == 1) {
            return resources.getDrawable(2131232553);
        }
        if (n == 2) {
            return resources.getDrawable(2131232552);
        }
        if (n != 3) {
            return null;
        }
        return resources.getDrawable(2131232550);
    }
    
    public final void a(final SubscriptionNotificationMenuData subscriptionNotificationMenuData, int n, final View view, final akn akn) {
        final afcr b = subscriptionNotificationMenuData.b;
        this.b();
        final ViewGroup viewGroup = (ViewGroup)View.inflate(this.d, 2131625521, (ViewGroup)null);
        int childCount = -1;
        for (int i = 0; i < ((List)b).size(); ++i) {
            final SubscriptionNotificationMenuItem subscriptionNotificationMenuItem = (SubscriptionNotificationMenuItem)((List)b).get(i);
            final View inflate = View.inflate(this.d, 2131625522, (ViewGroup)null);
            final boolean b2 = subscriptionNotificationMenuItem.b() == n;
            inflate.setOnClickListener((View$OnClickListener)new sts(this, inflate, viewGroup, (List)b, view, b2, akn, subscriptionNotificationMenuItem, 1));
            inflate.setBackgroundColor(this.d.getResources().getColor(2131102104));
            final TextView textView = (TextView)inflate.findViewById(2131431950);
            textView.setText((CharSequence)subscriptionNotificationMenuItem.e());
            textView.setContentDescription((CharSequence)subscriptionNotificationMenuItem.d());
            ((ImageView)inflate.findViewById(2131429270)).setImageDrawable(this.d(subscriptionNotificationMenuItem.a()));
            if (b2) {
                childCount = viewGroup.getChildCount();
                this.c(inflate, subscriptionNotificationMenuItem, true);
            }
            viewGroup.addView(inflate);
            inflate.setTag((Object)subscriptionNotificationMenuItem.b());
        }
        if (childCount == -1) {
            afqg.r("Could not find the item for the current state!");
            return;
        }
        viewGroup.measure(View$MeasureSpec.makeMeasureSpec(tmy.bd(this.d), Integer.MIN_VALUE), View$MeasureSpec.makeMeasureSpec(tmy.bb(this.d), Integer.MIN_VALUE));
        n = 0;
        for (int j = 0; j < childCount; ++j) {
            n += viewGroup.getChildAt(j).getMeasuredHeight();
        }
        (this.b = new PopupWindow((View)viewGroup, -2, -2, true)).setElevation((float)tmy.aZ(this.d.getResources().getDisplayMetrics(), 4));
        this.b.setBackgroundDrawable((Drawable)new ColorDrawable(this.d.getResources().getColor(2131102104)));
        this.b.setOutsideTouchable(true);
        this.b.setAnimationStyle(16973826);
        final int[] array = new int[2];
        view.getLocationOnScreen(array);
        final Point point = new Point(array[0], array[1]);
        final int x = point.x;
        final int measuredWidth = viewGroup.getMeasuredWidth();
        final int width = view.getWidth();
        final int paddingEnd = view.getPaddingEnd();
        final int paddingEnd2 = viewGroup.getChildAt(0).getPaddingEnd();
        n = point.y - n + (view.getHeight() - viewGroup.getChildAt(0).getMeasuredHeight()) / 2;
        final int measuredHeight = viewGroup.getMeasuredHeight();
        final ytx ytx = new ytx(this, view, x - measuredWidth + width - paddingEnd + paddingEnd2, 1);
        final Context d = this.d;
        View decorView = null;
        Label_0534: {
            if (d instanceof Activity) {
                final Window window = ((Activity)d).getWindow();
                if (window != null) {
                    decorView = window.getDecorView();
                    break Label_0534;
                }
            }
            decorView = null;
        }
        if (decorView == null) {
            ((akn)ytx).accept((Object)n);
            return;
        }
        final Rect rect = new Rect();
        decorView.getWindowVisibleDisplayFrame(rect);
        final int top = rect.top;
        if (n < top) {
            n = top;
        }
        int n2 = n;
        if (n + measuredHeight > rect.bottom) {
            n2 = rect.bottom - measuredHeight;
        }
        ((akn)ytx).accept((Object)n2);
    }
    
    public final void b() {
        final PopupWindow b = this.b;
        if (b != null) {
            b.dismiss();
            this.b = null;
        }
        this.c = false;
    }
    
    public final void c(final View view, final SubscriptionNotificationMenuItem subscriptionNotificationMenuItem, final boolean b) {
        final ImageView imageView = (ImageView)view.findViewById(2131429270);
        if (b) {
            view.setBackgroundColor(this.d.getResources().getColor(2131102103));
            final int a = subscriptionNotificationMenuItem.a();
            final Resources resources = this.d.getResources();
            Drawable imageDrawable;
            if (a != 1) {
                if (a != 2) {
                    if (a != 3) {
                        imageDrawable = null;
                    }
                    else {
                        imageDrawable = resources.getDrawable(2131232838);
                    }
                }
                else {
                    imageDrawable = resources.getDrawable(2131232841);
                }
            }
            else {
                imageDrawable = resources.getDrawable(2131232846);
            }
            imageView.setImageDrawable(imageDrawable);
            return;
        }
        view.setBackgroundColor(this.d.getResources().getColor(2131102104));
        imageView.setImageDrawable(this.d(subscriptionNotificationMenuItem.a()));
    }
}
