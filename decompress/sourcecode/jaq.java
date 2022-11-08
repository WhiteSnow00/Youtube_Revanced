import android.view.View$OnClickListener;
import android.net.Uri;
import java.util.Map;
import java.util.HashMap;
import android.widget.CompoundButton$OnCheckedChangeListener;
import com.google.android.apps.youtube.app.player.overlay.fullscreenengagement.layout.MetadataHighlightsColumnLinearLayout;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.content.Context;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jaq implements acil
{
    public final Object a;
    public final View b;
    private final /* synthetic */ int c;
    private final View d;
    private final Object e;
    private final Object f;
    
    public jaq(final Context context, final aceo a, final int c) {
        this.c = c;
        this.a = a;
        final LinearLayout b = (LinearLayout)LayoutInflater.from(context).inflate(2131624835, (ViewGroup)null);
        this.b = (View)b;
        final LinearLayout linearLayout = b;
        this.e = b.findViewById(2131432092);
        final LinearLayout linearLayout2 = b;
        this.d = b.findViewById(2131432006);
        final LinearLayout linearLayout3 = b;
        this.f = b.findViewById(2131428003);
    }
    
    public jaq(final Context context, final acyt a, final int c) {
        this.c = c;
        final View inflate = View.inflate(context, 2131625367, (ViewGroup)null);
        this.d = inflate;
        this.e = inflate.findViewById(2131432092);
        this.b = inflate.findViewById(2131430019);
        this.f = inflate.findViewById(2131430020);
        this.a = a;
        adbk.e(inflate);
    }
    
    public jaq(final Context context, final arhr a, final abzk e, final wwv f, final uyi uyi, final ViewGroup viewGroup, final int c) {
        this.c = c;
        a.getClass();
        this.a = a;
        e.getClass();
        this.e = e;
        f.getClass();
        this.f = f;
        final ViewGroup d = (ViewGroup)LayoutInflater.from(context).inflate(2131624469, viewGroup, false);
        this.d = (View)d;
        Object b;
        if (d instanceof MetadataHighlightsColumnLinearLayout) {
            b = d;
        }
        else {
            b = null;
        }
        this.b = (View)b;
        if (uyi.aW()) {
            final ViewGroup viewGroup2 = d;
            d.setBackgroundResource(2131232276);
        }
    }
    
    public final View a() {
        final int c = this.c;
        if (c == 0) {
            return this.d;
        }
        if (c != 1) {
            return this.d;
        }
        return this.b;
    }
    
    public final void c(final acir acir) {
        final int c = this.c;
        if (c != 0) {
            if (c != 1) {
                ((CompoundButton)this.b).setOnCheckedChangeListener((CompoundButton$OnCheckedChangeListener)null);
            }
            return;
        }
        ((abzk)this.e).c(acir);
    }
}
