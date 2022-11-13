import com.google.vr.sdk.base.HeadsetSelector$HeadsetInfo;
import android.text.Html;
import android.widget.AdapterView$OnItemClickListener;
import android.view.View$OnClickListener;
import android.widget.Button;
import android.widget.ListAdapter;
import android.view.View;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.widget.TextView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aawt extends aawk
{
    public static final String ae = "aawt";
    public tmx af;
    public aawv ag;
    private TextView ah;
    
    public final View K(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        return layoutInflater.inflate(2131625762, viewGroup, false);
    }
    
    protected final /* bridge */ ListAdapter aM() {
        return null;
    }
    
    public final void ab(final View view, final Bundle bundle) {
        view.setVisibility(0);
        view.findViewById(2131432420).setVisibility(8);
        ((TextView)view.findViewById(2131432422)).setText(2132020179);
        this.ah = (TextView)view.findViewById(2131432421);
        final Button button = (Button)view.findViewById(2131432419);
        button.setText(2132020177);
        button.setOnClickListener((View$OnClickListener)new xqn(this, 7));
        final Button button2 = (Button)view.findViewById(2131432418);
        button2.setText(2132020181);
        button2.setOnClickListener((View$OnClickListener)new xqn(this, 8));
    }
    
    protected final int nQ() {
        return 2;
    }
    
    protected final AdapterView$OnItemClickListener nR() {
        return null;
    }
    
    protected final String nS() {
        return null;
    }
    
    public final void no() {
        super.no();
        final HeadsetSelector$HeadsetInfo a = aaws.a(((br)this).nT(), this.af);
        String displayName;
        if (a != null) {
            displayName = a.getDisplayName();
        }
        else {
            displayName = "";
        }
        this.ah.setText((CharSequence)Html.fromHtml(((br)this).Q(2132020178, displayName), 63));
    }
}
