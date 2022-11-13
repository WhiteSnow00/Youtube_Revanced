import android.text.TextUtils;
import android.widget.EditText;
import java.util.ArrayList;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.View;
import android.content.Context;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adat implements adcu
{
    public final acgs a;
    public final List b;
    private final ateg c;
    
    public adat(final Context context, final acpk acpk, final acgs a, final View view, final View view2) {
        context.getClass();
        acpk.getClass();
        a.getClass();
        this.a = a;
        final TextView textView = (TextView)view.findViewById(2131431350);
        final ImageView imageView = (ImageView)view.findViewById(2131429270);
        view.findViewById(2131431351);
        this.c = new ateg(this, view2);
        this.b = new ArrayList();
    }
    
    public final void tk(final addo addo) {
        final Object d = addo.d;
        if (!TextUtils.equals((CharSequence)((EditText)this.c.a).getText(), (CharSequence)d)) {
            ((EditText)this.c.a).setText((CharSequence)d);
        }
    }
}
