import android.view.View;
import android.view.ViewGroup$LayoutParams;
import android.widget.TextView;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.content.Context;
import android.widget.FrameLayout;

// 
// Decompiled by Procyon v0.6.0
// 

public final class iyn implements fqk
{
    public final sld a;
    public final FrameLayout b;
    public long c;
    public long d;
    public boolean e;
    
    public iyn(final Context context) {
        final FrameLayout b = new FrameLayout(context);
        this.b = b;
        LayoutInflater.from(context).inflate(2131625629, (ViewGroup)b);
        b.setVisibility(8);
        final TextView textView = (TextView)b.findViewById(2131431967);
        this.a = new sld(textView, textView.getText(), textView.getCurrentTextColor(), textView.getTextSize(), textView.getBackground(), textView.getAlpha());
    }
    
    public final ViewGroup$LayoutParams a() {
        return new ViewGroup$LayoutParams(-1, -1);
    }
    
    public final void e(final int visibility) {
        this.b.setVisibility(visibility);
    }
    
    public final void k(final fkr fkr) {
        final boolean e = this.e;
        int n = 8;
        if (e) {
            n = n;
            if (fkr.k()) {
                n = 0;
            }
        }
        this.e(n);
    }
    
    public final View md() {
        return (View)this.b;
    }
    
    public final String mr() {
        return "player_overlay_text_banner";
    }
    
    public final boolean ow(final fkr fkr) {
        return fkr.k();
    }
}
