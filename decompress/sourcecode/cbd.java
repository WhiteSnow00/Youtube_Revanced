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

public class cbd extends fy
{
    private final cbb a;
    private TextView b;
    private ccj c;
    private ArrayList d;
    private cbc e;
    private ListView f;
    private boolean g;
    private long h;
    private final Handler i;
    private final dmk j;
    
    public cbd(final Context context) {
        this(context, null);
    }
    
    public cbd(Context j, final byte[] array) {
        j = bid.j(j, 0, false);
        super(j, bid.e(j));
        this.c = ccj.a;
        this.i = new cba(this);
        this.j = dmk.T(this.getContext());
        this.a = new cbb(this);
    }
    
    public void a(final List list) {
        int size = list.size();
        while (true) {
            final int n = size - 1;
            if (size <= 0) {
                break;
            }
            if (!this.j((ccs)list.get(n))) {
                list.remove(n);
            }
            size = n;
        }
    }
    
    public final void b() {
        if (this.g) {
            final ArrayList list = new ArrayList(dmk.x());
            this.a(list);
            Collections.sort((List<Object>)list, mm.a);
            if (SystemClock.uptimeMillis() - this.h >= 300L) {
                this.i(list);
                return;
            }
            this.i.removeMessages(1);
            final Handler i = this.i;
            i.sendMessageAtTime(i.obtainMessage(1, (Object)list), this.h + 300L);
        }
    }
    
    public final void g(final ccj c) {
        if (c != null) {
            if (!this.c.equals(c)) {
                this.c = c;
                if (this.g) {
                    this.j.I(this.a);
                    this.j.H(c, this.a, 1);
                }
                this.b();
            }
            return;
        }
        throw new IllegalArgumentException("selector must not be null");
    }
    
    final void h() {
        this.getWindow().setLayout(caw.b(this.getContext()), -2);
    }
    
    final void i(final List list) {
        this.h = SystemClock.uptimeMillis();
        this.d.clear();
        this.d.addAll(list);
        this.e.notifyDataSetChanged();
    }
    
    public final boolean j(final ccs ccs) {
        return !ccs.j() && ccs.g && ccs.n(this.c);
    }
    
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.g = true;
        this.j.H(this.c, this.a, 1);
        this.b();
    }
    
    protected void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        ((qu)this).setContentView(2131624853);
        this.d = new ArrayList();
        this.e = new cbc(this.getContext(), this.d);
        (this.f = (ListView)this.findViewById(2131429932)).setAdapter((ListAdapter)this.e);
        this.f.setOnItemClickListener((AdapterView$OnItemClickListener)this.e);
        this.f.setEmptyView(this.findViewById(16908292));
        this.b = (TextView)this.findViewById(2131429937);
        this.h();
    }
    
    public final void onDetachedFromWindow() {
        this.g = false;
        this.j.I(this.a);
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
