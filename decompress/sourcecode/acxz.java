import android.widget.ImageView;
import android.widget.CompoundButton$OnCheckedChangeListener;
import android.view.View$OnClickListener;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.content.Context;
import android.support.v7.widget.AppCompatImageView;
import android.view.View;
import android.widget.RadioButton;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acxz extends acja
{
    public final RadioButton a;
    private final View b;
    private final AppCompatImageView c;
    private final acng d;
    
    public acxz(final Context context, final acng d) {
        this.d = d;
        final View inflate = LayoutInflater.from(context).inflate(2131625525, (ViewGroup)null);
        this.b = inflate;
        this.a = (RadioButton)inflate.findViewById(2131430766);
        this.c = (AppCompatImageView)inflate.findViewById(2131429270);
        inflate.setOnClickListener((View$OnClickListener)new acsj(this, 4));
    }
    
    public final View a() {
        return this.b;
    }
    
    public final void c(final acir acir) {
        this.a.setOnCheckedChangeListener((CompoundButton$OnCheckedChangeListener)null);
    }
}
