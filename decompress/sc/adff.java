import android.widget.LinearLayout;
import java.util.function.Consumer;
import android.view.ViewGroup;
import android.widget.TextView;
import j$.util.Optional;
import android.view.View;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adff implements nwd
{
    public final adfe a;
    
    public adff(final adfe a) {
        this.a = a;
    }
    
    public final View a(final List list) {
        final adfe a = this.a;
        a.g.removeAllViews();
        for (int i = 0; i < list.size(); ++i) {
            final pme pme = list.get(i);
            Optional optional;
            if (i >= a.i.size()) {
                optional = Optional.empty();
            }
            else {
                final aqnk aqnk = (aqnk)a.i.get(i);
                if (aqnk.b == 1 && pme.b < ((aqmy)aqnk.c).b.size()) {
                    final TextView textView = (TextView)a.h.inflate(2131624172, (ViewGroup)a.g, false);
                    textView.setVisibility(0);
                    aqmy a2;
                    if (aqnk.b == 1) {
                        a2 = (aqmy)aqnk.c;
                    }
                    else {
                        a2 = aqmy.a;
                    }
                    textView.setText((CharSequence)a2.b.get(pme.b));
                    optional = Optional.of((Object)textView);
                }
                else {
                    optional = Optional.empty();
                }
            }
            final LinearLayout g = a.g;
            g.getClass();
            optional.ifPresent((Consumer)new aaxy(g, 18));
        }
        return (View)a;
    }
}
