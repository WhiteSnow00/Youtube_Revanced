import java.util.List;
import android.text.Spanned;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.widget.TextView;
import android.view.View;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kfu extends acja
{
    private final Context a;
    private final vax b;
    private final View c;
    private final TextView d;
    private final TextView e;
    
    public kfu(final Context a, final vax b) {
        this.a = a;
        this.b = b;
        final View inflate = LayoutInflater.from(a).inflate(2131625801, (ViewGroup)null);
        this.c = inflate;
        this.d = (TextView)inflate.findViewById(2131432092);
        this.e = (TextView)inflate.findViewById(2131428424);
    }
    
    public final View a() {
        return this.c;
    }
    
    public final void c(final acir acir) {
    }
}
