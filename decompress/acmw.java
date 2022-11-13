import android.text.method.LinkMovementMethod;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.content.Context;
import android.widget.CompoundButton;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.LinearLayout;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acmw extends LinearLayout
{
    public final TextView a;
    public final ListView b;
    public final TextView c;
    public final View d;
    public final CompoundButton e;
    public final TextView f;
    
    public acmw(final Context context) {
        super(context);
        this.setOrientation(1);
        final LayoutInflater from = LayoutInflater.from(context);
        from.inflate(2131625298, (ViewGroup)this);
        this.a = (TextView)this.findViewById(2131432095);
        final ListView b = (ListView)this.findViewById(2131428424);
        this.b = b;
        final View inflate = from.inflate(2131625300, (ViewGroup)b, false);
        this.c = (TextView)inflate.findViewById(2131429064);
        this.d = inflate.findViewById(2131429526);
        this.e = (CompoundButton)inflate.findViewById(2131429525);
        final TextView f = (TextView)inflate.findViewById(2131429527);
        this.f = f;
        b.addFooterView(inflate, (Object)null, false);
        f.setMovementMethod(LinkMovementMethod.getInstance());
    }
}
