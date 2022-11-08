import android.graphics.drawable.Drawable;
import android.content.res.ColorStateList;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.view.View;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acps extends qjd
{
    private final achj a;
    private achk b;
    
    public acps(final Context context, final achk b) {
        super(context);
        final jjf a = new jjf(this, 5);
        this.a = (achj)a;
        this.b = (achk)acho.a;
        b.getClass();
        this.b.g((achj)a);
        (this.b = b).qK((achj)a);
        this.notifyDataSetChanged();
    }
    
    protected final Object a(final int n, final View view) {
        final qjf c = this.c(n);
        if (c instanceof acpu) {
            if (n == 0) {
                view.setLayoutDirection(this.getContext().getResources().getConfiguration().getLayoutDirection());
            }
            return new adjo(view);
        }
        if (c instanceof acpt) {
            return view;
        }
        return super.a(n, view);
    }
    
    protected final void b(int i, Object a) {
        final qjf c = this.c(i);
        if (c instanceof acpu) {
            final acpu acpu = (acpu)c;
            final adjo adjo = (adjo)a;
            ((TextView)adjo.f).setText((CharSequence)acpu.c);
            final Object f = adjo.f;
            final boolean e = acpu.e();
            final int n = 2130970922;
            final int n2 = 2130970924;
            ColorStateList textColor;
            if (e) {
                if ((textColor = acpu.d) == null) {
                    textColor = tmy.cp(((TextView)adjo.f).getContext(), 2130970924);
                }
            }
            else {
                textColor = tmy.cp(((TextView)adjo.f).getContext(), 2130970922);
            }
            ((TextView)f).setTextColor(textColor);
            if (acpu instanceof acpv) {
                if (((acpv)acpu).l) {
                    ((ProgressBar)adjo.e).setVisibility(0);
                }
                else {
                    ((ProgressBar)adjo.e).setVisibility(8);
                }
            }
            final Drawable e2 = acpu.e;
            if (e2 == null) {
                ((ImageView)adjo.d).setVisibility(8);
            }
            else {
                ((ImageView)adjo.d).setImageDrawable(e2);
                ((ImageView)adjo.d).setVisibility(0);
                final ImageView imageView = (ImageView)adjo.d;
                final Context context = imageView.getContext();
                if (!acpu.e()) {
                    i = 2130970865;
                }
                else {
                    i = 2130970924;
                }
                imageView.setImageTintList(tmy.cp(context, i));
            }
            final String h = acpu.h;
            if (h == null) {
                ((TextView)adjo.g).setVisibility(8);
                ((TextView)adjo.b).setVisibility(8);
            }
            else {
                ((TextView)adjo.g).setText((CharSequence)h);
                ((TextView)adjo.g).setVisibility(0);
                ((TextView)adjo.b).setText((CharSequence)"\u2022");
                ((TextView)adjo.b).setVisibility(0);
                final Context context2 = ((TextView)adjo.g).getContext();
                if (!acpu.e()) {
                    i = n;
                }
                else {
                    i = 2130970926;
                }
                final ColorStateList cp = tmy.cp(context2, i);
                ((TextView)adjo.g).setTextColor(cp);
                ((TextView)adjo.b).setTextColor(cp);
            }
            final Drawable f2 = acpu.f;
            if (f2 == null) {
                ((ImageView)adjo.c).setVisibility(8);
            }
            else {
                ((ImageView)adjo.c).setImageDrawable(f2);
                ((ImageView)adjo.c).setVisibility(0);
                final ImageView imageView2 = (ImageView)adjo.c;
                final Context context3 = imageView2.getContext();
                i = n2;
                if (!acpu.e()) {
                    i = 2130970865;
                }
                imageView2.setImageTintList(tmy.cp(context3, i));
            }
            a = adjo.a;
            i = acpu.i;
            ((View)a).setBackgroundColor(i);
            return;
        }
        if (c instanceof acpt) {
            final acpt acpt = (acpt)c;
            final ViewGroup viewGroup = (ViewGroup)a;
            if (acpt.e == null) {
                final acij acij = new acij();
                ((wwx)acij).a(acpt.c);
                acpt.b.b(acij, ((acae)acpt.a.a()).d(acpt.d));
                acpt.e = acpt.b.a();
            }
            final View e3 = acpt.e;
            if (e3.getParent() instanceof ViewGroup) {
                ((ViewGroup)e3.getParent()).removeView(e3);
            }
            else if (e3.getParent() != null) {
                return;
            }
            viewGroup.removeAllViews();
            viewGroup.addView(e3);
            return;
        }
        super.b(i, a);
    }
    
    public final qjf c(final int n) {
        return (qjf)this.b.c(n);
    }
    
    public final int getCount() {
        return this.b.a();
    }
}
