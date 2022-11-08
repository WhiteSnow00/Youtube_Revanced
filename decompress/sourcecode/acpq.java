import android.graphics.drawable.Drawable;
import android.content.res.ColorStateList;
import android.view.View$AccessibilityDelegate;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.View;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acpq extends qjd
{
    public acpq(final Context context) {
        super(context);
    }
    
    protected final Object a(final int n, final View view) {
        if (((qjf)this.getItem(n)) instanceof acpr) {
            return new agiy(view);
        }
        return super.a(n, view);
    }
    
    protected final void b(int orElse, Object d) {
        final qjf qjf = (qjf)this.getItem(orElse);
        if (qjf instanceof acpr) {
            final acpr acpr = (acpr)qjf;
            final agiy agiy = (agiy)d;
            ((TextView)agiy.d).setText((CharSequence)acpr.c);
            final ColorStateList d2 = acpr.d;
            if (d2 != null) {
                ((TextView)agiy.d).setTextColor(d2);
            }
            else {
                orElse = tmy.ct(((TextView)agiy.d).getContext(), 2130970924).orElse(0);
                ((TextView)agiy.d).setTextColor(orElse);
            }
            final Drawable e = acpr.e;
            if (e == null) {
                ((ImageView)agiy.c).setVisibility(8);
            }
            else {
                ((ImageView)agiy.c).setImageDrawable(e);
                ((ImageView)agiy.c).setVisibility(0);
            }
            if (!TextUtils.isEmpty((CharSequence)acpr.i)) {
                final Object a = agiy.a;
                if (a != null) {
                    ((TextView)a).setText((CharSequence)"\u2022");
                    ((TextView)agiy.a).setVisibility(0);
                }
                final Object b = agiy.b;
                if (b != null) {
                    ((TextView)b).setText((CharSequence)acpr.i);
                    ((TextView)agiy.b).setVisibility(0);
                }
                else {
                    ((TextView)agiy.d).append((CharSequence)acpr.i);
                }
            }
            else {
                final Object a2 = agiy.a;
                if (a2 != null) {
                    ((TextView)a2).setVisibility(8);
                }
                final Object b2 = agiy.b;
                if (b2 != null) {
                    ((TextView)b2).setVisibility(8);
                }
            }
            final Drawable f = acpr.f;
            if (f == null) {
                ((ImageView)agiy.f).setVisibility(8);
            }
            else {
                ((ImageView)agiy.f).setImageDrawable(f);
                ((ImageView)agiy.f).setVisibility(0);
            }
            final Object e2 = agiy.e;
            if (e2 != null) {
                if (acpr.h) {
                    ((View)e2).setVisibility(0);
                }
                else {
                    ((View)e2).setVisibility(8);
                }
            }
            d = agiy.d;
            ((TextView)d).setAccessibilityDelegate((View$AccessibilityDelegate)new acpp(acpr));
            return;
        }
        super.b(orElse, d);
    }
}
