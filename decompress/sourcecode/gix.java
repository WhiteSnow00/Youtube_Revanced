import android.view.ViewGroup;
import android.view.View;
import java.util.Arrays;
import com.google.android.apps.youtube.app.common.ui.playlist.PrivacySpinner;
import java.util.List;
import android.widget.BaseAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gix extends BaseAdapter
{
    public final List a;
    final /* synthetic */ PrivacySpinner b;
    private final giv c;
    
    public gix(final PrivacySpinner b) {
        this.b = b;
        this.c = new giv(this);
        this.a = Arrays.asList(glp.values());
    }
    
    public final int getCount() {
        return this.a.size();
    }
    
    public final View getDropDownView(final int n, View inflate, final ViewGroup viewGroup) {
        giu tag;
        if (inflate == null) {
            inflate = this.b.a.inflate(2131625097, (ViewGroup)null);
            if (this.b.d.isPresent() && ((uyi)this.b.d.get()).aT()) {
                inflate.setBackgroundColor(tmy.cn(this.b.getContext(), 2130970868));
            }
            tag = new giu(this, inflate);
            inflate.setTag((Object)tag);
        }
        else {
            tag = (giu)inflate.getTag();
        }
        ana.N(inflate, (akv)this.c);
        if (tag != null) {
            ((giw)tag).a(n);
        }
        return inflate;
    }
    
    public final Object getItem(final int n) {
        return this.a.get(n);
    }
    
    public final long getItemId(final int n) {
        return n;
    }
    
    public final View getView(final int n, View inflate, final ViewGroup viewGroup) {
        giw tag;
        if (inflate == null) {
            inflate = this.b.a.inflate(2131625098, (ViewGroup)null);
            tag = new giw(this, inflate);
            inflate.setTag((Object)tag);
        }
        else {
            tag = (giw)inflate.getTag();
        }
        if (tag != null) {
            tag.a(n);
        }
        return inflate;
    }
}
