import android.view.ViewGroup;
import android.view.View;
import java.util.Arrays;
import com.google.android.apps.youtube.app.common.ui.playlist.PrivacySpinner;
import java.util.List;
import android.widget.BaseAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gjf extends BaseAdapter
{
    public final List a;
    final PrivacySpinner b;
    private final gjd c;
    
    public gjf(final PrivacySpinner b) {
        this.b = b;
        this.c = new gjd(this);
        this.a = Arrays.asList(glx.values());
    }
    
    public final int getCount() {
        return this.a.size();
    }
    
    public final View getDropDownView(final int n, View inflate, final ViewGroup viewGroup) {
        gjc tag;
        if (inflate == null) {
            inflate = this.b.a.inflate(2131625101, (ViewGroup)null);
            if (this.b.d.isPresent() && ((vai)this.b.d.get()).aU()) {
                inflate.setBackgroundColor(tpe.cr(this.b.getContext(), 2130970868));
            }
            tag = new gjc(this, inflate);
            inflate.setTag((Object)tag);
        }
        else {
            tag = (gjc)inflate.getTag();
        }
        anb.N(inflate, this.c);
        if (tag != null) {
            tag.a(n);
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
        gje tag;
        if (inflate == null) {
            inflate = this.b.a.inflate(2131625102, (ViewGroup)null);
            tag = new gje(this, inflate);
            inflate.setTag((Object)tag);
        }
        else {
            tag = (gje)inflate.getTag();
        }
        if (tag != null) {
            tag.a(n);
        }
        return inflate;
    }
}
