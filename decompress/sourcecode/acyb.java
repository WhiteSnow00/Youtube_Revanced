import android.text.Spanned;
import java.util.function.Function;
import j$.util.Optional;
import android.widget.CompoundButton$OnCheckedChangeListener;
import android.view.View$OnClickListener;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.content.Context;
import android.view.View;
import android.widget.CheckBox;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acyb extends acja
{
    public final CheckBox a;
    public String b;
    private final View c;
    
    public acyb(final Context context) {
        final View inflate = LayoutInflater.from(context).inflate(2131625526, (ViewGroup)null);
        this.c = inflate;
        (this.a = (CheckBox)inflate.findViewById(2131428178)).setClickable(false);
        inflate.setOnClickListener((View$OnClickListener)new acsj(this, 5));
    }
    
    public final View a() {
        return this.c;
    }
    
    public final void c(final acir acir) {
        this.b = null;
        this.a.setOnCheckedChangeListener((CompoundButton$OnCheckedChangeListener)null);
    }
}
