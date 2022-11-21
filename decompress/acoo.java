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

public final class acoo extends ArrayAdapter implements ListAdapter
{
    private LayoutInflater a;
    private anaf b;
    private final Map c;
    private final agjn d;
    
    public acoo(final Context context, final agjn d, final byte[] array) {
        super(context, 2131625301);
        this.c = new HashMap();
        this.d = d;
    }
    
    public final anaf a() {
        final anaf b = this.b;
        if (b != null) {
            final acol acol = this.c.get(b);
            if (acol != null) {
                return acol.b(acol.a);
            }
        }
        return this.b;
    }
    
    public final boolean areAllItemsEnabled() {
        return true;
    }
    
    public final void b(final anaf b) {
        if ((b == null && this.b != null) || (b != null && !((ahcz)b).equals(this.b))) {
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
            inflate = this.a.inflate(2131625301, viewGroup, false);
        }
        final anad anad = (anad)this.getItem(a);
        Object o;
        if (inflate.getTag() instanceof acon) {
            o = inflate.getTag();
        }
        else {
            o = new acon(this, inflate);
            inflate.setTag(o);
            inflate.setOnClickListener((View$OnClickListener)o);
        }
        if (anad != null) {
            anaf tag;
            if ((tag = anad.e) == null) {
                tag = anaf.a;
            }
            acol acol = this.c.get(tag);
            final ajws ajws = null;
            acol adapter;
            if ((adapter = acol) == null) {
                adapter = acol;
                if (!this.c.containsKey(tag)) {
                    if (tag.d.size() > 0) {
                        final Spinner b = ((acon)o).b;
                        Context context;
                        if (b == null) {
                            context = null;
                        }
                        else {
                            context = b.getContext();
                        }
                        acol = new acol(context, (List)tag.d);
                    }
                    this.c.put(tag, acol);
                    adapter = acol;
                }
            }
            final boolean equals = ((ahcz)tag).equals(this.b);
            if (tag != null) {
                final TextView a2 = ((acon)o).a;
                if (a2 != null && ((acon)o).c != null) {
                    if (((acon)o).b != null) {
                        ajws ajws2 = ajws;
                        if ((tag.b & 0x1) != 0x0 && (ajws2 = tag.c) == null) {
                            ajws2 = ajws.a;
                        }
                        a2.setText((CharSequence)acbu.b(ajws2));
                        ((acon)o).c.setTag((Object)tag);
                        ((acon)o).c.setChecked(equals);
                        if (equals && adapter != null) {
                            a = 1;
                        }
                        else {
                            a = 0;
                        }
                        ((acon)o).b.setAdapter((SpinnerAdapter)adapter);
                        final Spinner b2 = ((acon)o).b;
                        int n;
                        if (1 != a) {
                            n = 8;
                        }
                        else {
                            n = 0;
                        }
                        b2.setVisibility(n);
                        ((acon)o).d.setVisibility(n);
                        if (a != 0) {
                            a = adapter.a;
                            ((acon)o).b.setSelection(a);
                            ((acon)o).b.setOnItemSelectedListener((AdapterView$OnItemSelectedListener)new acom((acon)o, adapter, 0));
                        }
                    }
                }
            }
        }
        if (this.d.a) {
            final RadioButton radioButton = (RadioButton)inflate.findViewById(2131431155);
            final YouTubeTextView youTubeTextView = (YouTubeTextView)inflate.findViewById(2131431158);
            final agjn d = this.d;
            d.b(radioButton);
            if (d.a) {
                youTubeTextView.getClass();
                youTubeTextView.setTextColor(tqf.cr(youTubeTextView.getContext(), 2130970922));
            }
            a = (int)this.getContext().getResources().getDimension(2131169409);
            tqf.aF((View)radioButton, tqf.an(new tvv[] { tqf.aB(a), tqf.aq(a) }), (Class)ViewGroup$MarginLayoutParams.class);
        }
        return inflate;
    }
}
