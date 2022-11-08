import java.util.Iterator;
import android.view.View$OnClickListener;
import android.widget.TextView;
import android.widget.ImageView;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import android.content.res.Resources;
import android.widget.FrameLayout;
import android.view.View;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fag implements acil
{
    private final /* synthetic */ int a;
    private final Object b;
    private final Object c;
    
    public fag(final Context c, final int a) {
        this.a = a;
        c.getClass();
        this.c = c;
        this.b = LayoutInflater.from(c).inflate(2131624159, (ViewGroup)null);
    }
    
    public fag(final Context context, final int a, final byte[] array) {
        this.a = a;
        final fyl b = new fyl(tmy.ct(context, 2130970897).orElse(0), context.getResources().getDimensionPixelSize(2131167246));
        this.b = b;
        final fyl fyl = b;
        b.c(16);
        final fyl fyl2 = b;
        b.e(true);
        final View inflate = LayoutInflater.from(context).inflate(2131625348, (ViewGroup)null, false);
        this.c = inflate;
        final Drawable drawable = (Drawable)b;
        final View view = inflate;
        tmy.d(inflate, drawable);
    }
    
    public fag(final Context context, final int a, final char[] array) {
        this.a = a;
        final View inflate = View.inflate(context, 2131624221, (ViewGroup)null);
        this.b = inflate;
        final View view = inflate;
        this.c = inflate.findViewById(2131428344);
    }
    
    public fag(final Context context, final acjc acjc, final tdz tdz, ViewGroup viewGroup, final int a) {
        this.a = a;
        final FrameLayout c = (FrameLayout)LayoutInflater.from(context).inflate(2131624037, viewGroup, false);
        viewGroup = (ViewGroup)c.findViewById(2131428419);
        final Resources resources = context.getResources();
        final pct pct = new pct(-1.0f, resources.getDimensionPixelSize(2131165406), resources.getDimensionPixelSize(2131165555), new int[] { resources.getColor(2131099753) });
        pct.setAlpha(resources.getInteger(2131492881));
        this.b = new gfo(context, acjc, tdz, viewGroup, (Drawable)pct);
        this.c = c;
    }
    
    public fag(final Context context, final giz b, final int a) {
        this.a = a;
        context.getClass();
        b.getClass();
        this.b = b;
        final YouTubeTextView c = (YouTubeTextView)View.inflate(context, 2131625331, (ViewGroup)null);
        this.c = c;
        b.c((View)c);
    }
    
    public fag(final Context context, final hyc hyc, final ViewGroup viewGroup, final int a, final byte[] array, final byte[] array2) {
        this.a = a;
        final ImageView c = (ImageView)LayoutInflater.from(context).inflate(2131625523, viewGroup, false);
        this.c = c;
        final ImageView imageView = c;
        this.b = hyc.j(c);
    }
    
    public fag(final Context context, final rjf rjf, final int a) {
        this.a = a;
        final View inflate = LayoutInflater.from(context).inflate(2131624479, (ViewGroup)null);
        this.c = inflate;
        final View view = inflate;
        this.b = inflate.findViewById(2131430009);
        final qtr onClickListener = new qtr(rjf, 19);
        final View view2 = inflate;
        inflate.setOnClickListener((View$OnClickListener)onClickListener);
    }
    
    public fag(final Context context, final vax b, final ViewGroup viewGroup, final int a) {
        this.a = a;
        this.b = b;
        this.c = LayoutInflater.from(context).inflate(2131625477, viewGroup, false);
    }
    
    public final View a() {
        switch (this.a) {
            default: {
                return (View)this.c;
            }
            case 6: {
                return (View)this.b;
            }
            case 5: {
                return (View)this.c;
            }
            case 4: {
                return (View)this.c;
            }
            case 3: {
                return ((giz)this.b).a;
            }
            case 2: {
                return (View)this.c;
            }
            case 1: {
                return (View)this.b;
            }
            case 0: {
                return (View)this.c;
            }
        }
    }
    
    public final void c(final acir acir) {
        switch (this.a) {
            default: {
                ((ViewGroup)this.c).removeAllViews();
                return;
            }
            case 3:
            case 4:
            case 5:
            case 6: {
                return;
            }
            case 2: {
                ((gfo)this.b).c(acir);
            }
            case 1: {
                return;
            }
            case 0: {
                ((fwe)this.b).b(null, null);
            }
        }
    }
}
