import android.widget.AdapterView$OnItemClickListener;
import android.widget.ListAdapter;
import android.os.Bundle;
import android.os.SystemClock;
import java.util.Comparator;
import java.util.Collections;
import java.util.Collection;
import java.util.List;
import android.content.Context;
import android.os.Handler;
import android.widget.ListView;
import java.util.ArrayList;
import android.widget.TextView;

// 
// Decompiled by Procyon v0.6.0
// 

public class cbh extends fz
{
    private final cbf a;
    private TextView b;
    private ccn c;
    private ArrayList d;
    private cbg e;
    private ListView f;
    private boolean g;
    private long h;
    private final Handler i;
    private final dmo j;
    
    public cbh(final Context context) {
        this(context, null);
    }
    
    public cbh(Context i, final byte[] array) {
        i = bih.i(i, 0, false);
        super(i, bih.d(i));
        this.c = ccn.a;
        this.i = new cbe(this);
        this.j = dmo.T(this.getContext());
        this.a = new cbf(this);
    }
    
    public void a(final List list) {
        int n;
        for (int i = list.size(); i > 0; i = n) {
            n = --i;
            if (!this.j((ccw)list.get(n))) {
                list.remove(n);
            }
        }
    }
    
    public final void b() {
        if (this.g) {
            final ArrayList list = new ArrayList(dmo.x());
            this.a(list);
            Collections.sort((List<Object>)list, (Comparator<? super Object>)mn.a);
            if (SystemClock.uptimeMillis() - this.h >= 300L) {
                this.i(list);
                return;
            }
            this.i.removeMessages(1);
            final Handler i = this.i;
            i.sendMessageAtTime(i.obtainMessage(1, (Object)list), this.h + 300L);
        }
    }
    
    public final void g(final ccn c) {
        if (c != null) {
            if (!this.c.equals(c)) {
                this.c = c;
                if (this.g) {
                    this.j.I((bkx)this.a);
                    this.j.H(c, (bkx)this.a, 1);
                }
                this.b();
            }
            return;
        }
        throw new IllegalArgumentException("selector must not be null");
    }
    
    final void h() {
        this.getWindow().setLayout(bih.k(this.getContext()), -2);
    }
    
    final void i(final List list) {
        this.h = SystemClock.uptimeMillis();
        this.d.clear();
        this.d.addAll(list);
        this.e.notifyDataSetChanged();
    }
    
    public final boolean j(final ccw ccw) {
        return !ccw.j() && ccw.g && ccw.n(this.c);
    }
    
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.g = true;
        this.j.H(this.c, (bkx)this.a, 1);
        this.b();
    }
    
    protected void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        ((qv)this).setContentView(2131624856);
        this.d = new ArrayList();
        this.e = new cbg(this.getContext(), this.d);
        (this.f = (ListView)this.findViewById(2131429932)).setAdapter((ListAdapter)this.e);
        this.f.setOnItemClickListener((AdapterView$OnItemClickListener)this.e);
        this.f.setEmptyView(this.findViewById(16908292));
        this.b = (TextView)this.findViewById(2131429937);
        this.h();
    }
    
    public final void onDetachedFromWindow() {
        this.g = false;
        this.j.I((bkx)this.a);
        this.i.removeMessages(1);
        super.onDetachedFromWindow();
    }
    
    public final void setTitle(final int text) {
        this.b.setText(text);
    }
    
    public final void setTitle(final CharSequence text) {
        this.b.setText(text);
    }
}
