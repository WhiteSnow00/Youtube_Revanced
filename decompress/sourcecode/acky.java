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

public final class acky extends ArrayAdapter implements ListAdapter
{
    private LayoutInflater a;
    private amvw b;
    private final Map c;
    private final agfu d;
    
    public acky(final Context context, final agfu d, final byte[] array) {
        super(context, 2131625294);
        this.c = new HashMap();
        this.d = d;
    }
    
    public final amvw a() {
        final amvw b = this.b;
        if (b != null) {
            final ackv ackv = this.c.get(b);
            if (ackv != null) {
                return ackv.b(ackv.a);
            }
        }
        return this.b;
    }
    
    public final boolean areAllItemsEnabled() {
        return true;
    }
    
    public final void b(final amvw b) {
        if ((b == null && this.b != null) || (b != null && !((agzi)b).equals((Object)this.b))) {
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
            inflate = this.a.inflate(2131625294, viewGroup, false);
        }
        final amvu amvu = (amvu)this.getItem(a);
        Object o;
        if (inflate.getTag() instanceof ackx) {
            o = inflate.getTag();
        }
        else {
            o = new ackx(this, inflate);
            inflate.setTag(o);
            inflate.setOnClickListener((View$OnClickListener)o);
        }
        if (amvu != null) {
            amvw tag;
            if ((tag = amvu.e) == null) {
                tag = amvw.a;
            }
            ackv ackv = this.c.get(tag);
            final ajsq ajsq = null;
            ackv adapter;
            if ((adapter = ackv) == null) {
                adapter = ackv;
                if (!this.c.containsKey(tag)) {
                    if (tag.d.size() > 0) {
                        final Spinner b = ((ackx)o).b;
                        Context context;
                        if (b == null) {
                            context = null;
                        }
                        else {
                            context = b.getContext();
                        }
                        ackv = new ackv(context, tag.d);
                    }
                    this.c.put(tag, ackv);
                    adapter = ackv;
                }
            }
            final boolean equals = ((agzi)tag).equals((Object)this.b);
            if (tag != null) {
                final TextView a2 = ((ackx)o).a;
                if (a2 != null && ((ackx)o).c != null) {
                    if (((ackx)o).b != null) {
                        ajsq ajsq2 = ajsq;
                        if ((tag.b & 0x1) != 0x0 && (ajsq2 = tag.c) == null) {
                            ajsq2 = ajsq.a;
                        }
                        a2.setText((CharSequence)abyh.b(ajsq2));
                        ((ackx)o).c.setTag((Object)tag);
                        ((ackx)o).c.setChecked(equals);
                        if (equals && adapter != null) {
                            a = 1;
                        }
                        else {
                            a = 0;
                        }
                        ((ackx)o).b.setAdapter((SpinnerAdapter)adapter);
                        final Spinner b2 = ((ackx)o).b;
                        int n;
                        if (1 != a) {
                            n = 8;
                        }
                        else {
                            n = 0;
                        }
                        b2.setVisibility(n);
                        ((ackx)o).d.setVisibility(n);
                        if (a != 0) {
                            a = adapter.a;
                            ((ackx)o).b.setSelection(a);
                            ((ackx)o).b.setOnItemSelectedListener((AdapterView$OnItemSelectedListener)new ackw((ackx)o, adapter, 0));
                        }
                    }
                }
            }
        }
        if (this.d.a) {
            final RadioButton radioButton = (RadioButton)inflate.findViewById(2131431152);
            final YouTubeTextView youTubeTextView = (YouTubeTextView)inflate.findViewById(2131431155);
            final agfu d = this.d;
            d.b(radioButton);
            if (d.a) {
                youTubeTextView.getClass();
                ((TextView)youTubeTextView).setTextColor(tmy.cn(((TextView)youTubeTextView).getContext(), 2130970924));
            }
            a = (int)this.getContext().getResources().getDimension(2131169371);
            tmy.aF((View)radioButton, tmy.an(new tsp[] { tmy.aB(a), tmy.aq(a) }), (Class)ViewGroup$MarginLayoutParams.class);
        }
        return inflate;
    }
}
