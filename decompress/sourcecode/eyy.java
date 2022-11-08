import android.widget.CompoundButton$OnCheckedChangeListener;
import android.support.v7.widget.SwitchCompat;
import android.widget.TextView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import java.util.Iterator;
import java.util.List;
import android.content.Context;
import android.widget.ArrayAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

public final class eyy extends ArrayAdapter
{
    public final vax a;
    public final aeim b;
    private final Context c;
    
    public eyy(final Context c, final vax a, final List list, final aeim b, final byte[] array, final byte[] array2) {
        super(c, 0);
        this.c = c;
        this.a = a;
        this.b = b;
        for (final aigt aigt : list) {
            if ((aigt.b & 0x1) != 0x0) {
                anxs anxs;
                if ((anxs = aigt.c) == null) {
                    anxs = anxs.a;
                }
                this.add((Object)anxs);
            }
        }
    }
    
    public final View getView(final int n, final View view, final ViewGroup viewGroup) {
        View inflate = view;
        if (view == null) {
            inflate = LayoutInflater.from(this.c).inflate(2131624165, viewGroup, false);
        }
        final anxs anxs = (anxs)this.getItem(n);
        final TextView textView = (TextView)inflate.findViewById(2131432092);
        ajsq ajsq;
        if ((anxs.b & 0x10) != 0x0) {
            if ((ajsq = anxs.d) == null) {
                ajsq = ajsq.a;
            }
        }
        else {
            ajsq = null;
        }
        textView.setText((CharSequence)abyh.b(ajsq));
        final SwitchCompat switchCompat = (SwitchCompat)inflate.findViewById(2131432111);
        switchCompat.setOnCheckedChangeListener((CompoundButton$OnCheckedChangeListener)null);
        switchCompat.setChecked(this.b.A(anxs));
        switchCompat.setOnCheckedChangeListener((CompoundButton$OnCheckedChangeListener)new jqg(this, anxs, 1));
        return inflate;
    }
}
