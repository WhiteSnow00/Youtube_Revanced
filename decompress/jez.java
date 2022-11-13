import com.google.android.apps.youtube.app.common.ui.playlist.PrivacySpinner;
import android.view.ViewGroup;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.View;
import java.util.Iterator;
import java.util.List;
import android.content.Context;
import android.view.LayoutInflater;
import android.widget.ArrayAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jez extends ArrayAdapter
{
    final uak a;
    private final LayoutInflater b;
    private final jey c;
    private final acpk d;
    
    public jez(final uak a, final Context context, final acpk d, final List list, final byte[] array, final byte[] array2) {
        this.a = a;
        super(context, 0);
        this.b = LayoutInflater.from(context);
        this.d = d;
        this.c = new jey(a, null, null);
        final Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            this.add((Object)iterator.next());
        }
    }
    
    private final void a(final View view, int a) {
        final ajkc tag = (ajkc)this.getItem(a);
        if (view.findViewById(2131429479) != null) {
            final TextView textView = (TextView)view.findViewById(2131429479);
            ajut ajut;
            if ((ajut = tag.e) == null) {
                ajut = ajut.a;
            }
            tpe.t(textView, (CharSequence)acak.b(ajut));
        }
        if (view.findViewById(2131428624) != null) {
            final TextView textView2 = (TextView)view.findViewById(2131428624);
            ajut ajut2;
            if ((ajut2 = tag.f) == null) {
                ajut2 = ajut.a;
            }
            tpe.t(textView2, (CharSequence)acak.b(ajut2));
        }
        final ImageView imageView = (ImageView)view.findViewById(2131429270);
        if (imageView != null) {
            final acpk d = this.d;
            akdi akdi;
            if ((akdi = tag.k) == null) {
                akdi = akdi.a;
            }
            akdh akdh;
            if ((akdh = akdh.b(akdi.c)) == null) {
                akdh = akdh.a;
            }
            a = d.a(akdh);
            if (a == 0) {
                imageView.setImageDrawable((Drawable)null);
            }
            else {
                imageView.setImageResource(a);
            }
        }
        view.setTag((Object)tag);
    }
    
    public final View getDropDownView(final int n, View view, final ViewGroup viewGroup) {
        View inflate = view;
        if (view == null) {
            view = (inflate = this.b.inflate(2131625101, (ViewGroup)null));
            if (((vai)this.a.c).aU()) {
                view.setBackgroundColor(tpe.cr(this.getContext(), 2130970868));
                inflate = view;
            }
        }
        this.a(inflate, n);
        anb.N(inflate, this.c);
        if (((PrivacySpinner)this.a.b).getSelectedItem().equals(inflate.getTag())) {
            if (((vai)this.a.c).aU()) {
                inflate.findViewById(2131429412).setBackgroundColor(tpe.cr(this.getContext(), 2130970829));
            }
            else {
                inflate.findViewById(2131429412).setBackgroundColor(tpe.cr(this.getContext(), 2130970822));
            }
        }
        return inflate;
    }
    
    public final View getView(final int n, final View view, final ViewGroup viewGroup) {
        View inflate = view;
        if (view == null) {
            inflate = this.b.inflate(2131625102, (ViewGroup)null);
        }
        this.a(inflate, n);
        return inflate;
    }
}
