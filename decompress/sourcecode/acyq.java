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

public final class acyq implements adar
{
    public final aceo a;
    public final List b;
    private final atdo c;
    
    public acyq(final Context context, final acng acng, final aceo a, final View view, final View view2) {
        context.getClass();
        acng.getClass();
        a.getClass();
        this.a = a;
        final TextView textView = (TextView)view.findViewById(2131431347);
        final ImageView imageView = (ImageView)view.findViewById(2131429270);
        view.findViewById(2131431348);
        this.c = new atdo(this, view2);
        this.b = new ArrayList();
    }
    
    @Override
    public final void tf(final adbl adbl) {
        final Object d = adbl.d;
        if (!TextUtils.equals((CharSequence)((EditText)this.c.a).getText(), (CharSequence)d)) {
            ((EditText)this.c.a).setText((CharSequence)d);
        }
    }
}
