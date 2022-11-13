import android.widget.TextView;
import android.widget.Spinner;
import android.view.ViewGroup$MarginLayoutParams;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import android.widget.RadioButton;
import android.widget.AdapterView$OnItemSelectedListener;
import android.widget.SpinnerAdapter;
import java.util.List;
import android.view.View$OnClickListener;
import android.view.ViewGroup;
import android.view.View;
import java.util.HashMap;
import android.content.Context;
import java.util.Map;
import android.view.LayoutInflater;
import android.widget.ListAdapter;
import android.widget.ArrayAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acnb extends ArrayAdapter implements ListAdapter
{
    private LayoutInflater a;
    private amya b;
    private final Map c;
    private final aghv d;
    
    public acnb(final Context context, final aghv d, final byte[] array) {
        super(context, 2131625299);
        this.c = new HashMap();
        this.d = d;
    }
    
    public final amya a() {
        final amya b = this.b;
        if (b != null) {
            final acmy acmy = this.c.get(b);
            if (acmy != null) {
                return acmy.b(acmy.a);
            }
        }
        return this.b;
    }
    
    public final boolean areAllItemsEnabled() {
        return true;
    }
    
    public final void b(final amya b) {
        if ((b == null && this.b != null) || (b != null && !((ahbh)b).equals((Object)this.b))) {
            this.b = b;
            this.notifyDataSetChanged();
        }
    }
    
    public final void clear() {
        super.clear();
        this.b = null;
    }
    
    public final View getView(int a, final View view, final ViewGroup viewGroup) {
        View inflate = view;
        if (view == null) {
            if (this.a == null) {
                this.a = LayoutInflater.from(this.getContext());
            }
            inflate = this.a.inflate(2131625299, viewGroup, false);
        }
        final amxy amxy = (amxy)this.getItem(a);
        Object o;
        if (inflate.getTag() instanceof acna) {
            o = inflate.getTag();
        }
        else {
            o = new acna(this, inflate);
            inflate.setTag(o);
            inflate.setOnClickListener((View$OnClickListener)o);
        }
        if (amxy != null) {
            amya tag;
            if ((tag = amxy.e) == null) {
                tag = amya.a;
            }
            acmy acmy = this.c.get(tag);
            final ajut ajut = null;
            acmy adapter;
            if ((adapter = acmy) == null) {
                adapter = acmy;
                if (!this.c.containsKey(tag)) {
                    if (tag.d.size() > 0) {
                        final Spinner b = ((acna)o).b;
                        Context context;
                        if (b == null) {
                            context = null;
                        }
                        else {
                            context = b.getContext();
                        }
                        acmy = new acmy(context, (List)tag.d);
                    }
                    this.c.put(tag, acmy);
                    adapter = acmy;
                }
            }
            final boolean equals = ((ahbh)tag).equals((Object)this.b);
            if (tag != null) {
                final TextView a2 = ((acna)o).a;
                if (a2 != null && ((acna)o).c != null) {
                    if (((acna)o).b != null) {
                        ajut ajut2 = ajut;
                        if ((tag.b & 0x1) != 0x0 && (ajut2 = tag.c) == null) {
                            ajut2 = ajut.a;
                        }
                        a2.setText((CharSequence)acak.b(ajut2));
                        ((acna)o).c.setTag((Object)tag);
                        ((acna)o).c.setChecked(equals);
                        if (equals && adapter != null) {
                            a = 1;
                        }
                        else {
                            a = 0;
                        }
                        ((acna)o).b.setAdapter((SpinnerAdapter)adapter);
                        final Spinner b2 = ((acna)o).b;
                        int n;
                        if (1 != a) {
                            n = 8;
                        }
                        else {
                            n = 0;
                        }
                        b2.setVisibility(n);
                        ((acna)o).d.setVisibility(n);
                        if (a != 0) {
                            a = adapter.a;
                            ((acna)o).b.setSelection(a);
                            ((acna)o).b.setOnItemSelectedListener((AdapterView$OnItemSelectedListener)new acmz((acna)o, adapter, 0));
                        }
                    }
                }
            }
        }
        if (this.d.a) {
            final RadioButton radioButton = (RadioButton)inflate.findViewById(2131431155);
            final YouTubeTextView youTubeTextView = (YouTubeTextView)inflate.findViewById(2131431158);
            final aghv d = this.d;
            d.b(radioButton);
            if (d.a) {
                youTubeTextView.getClass();
                youTubeTextView.setTextColor(tpe.cr(youTubeTextView.getContext(), 2130970924));
            }
            a = (int)this.getContext().getResources().getDimension(2131169370);
            tpe.aF((View)radioButton, tpe.an(new tut[] { tpe.aB(a), tpe.aq(a) }), (Class)ViewGroup$MarginLayoutParams.class);
        }
        return inflate;
    }
}
