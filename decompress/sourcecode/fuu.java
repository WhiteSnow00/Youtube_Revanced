import android.widget.TextView;
import java.util.HashMap;
import com.google.protobuf.MessageLite;
import android.view.View;
import android.widget.AdapterView;
import java.util.Map;
import android.widget.AdapterView$OnItemSelectedListener;

// 
// Decompiled by Procyon v0.6.0
// 

final class fuu implements AdapterView$OnItemSelectedListener
{
    public int a;
    final /* synthetic */ fuv b;
    private Map c;
    
    public fuu(final fuv b) {
        this.b = b;
        this.a = -1;
    }
    
    private final aogt a(final int n) {
        return (aogt)this.b.b.getItem(n);
    }
    
    public final void onItemSelected(final AdapterView adapterView, final View view, final int a, final long n) {
        if (a == this.a) {
            return;
        }
        final aogt a2 = this.a(a);
        final acij e = this.b.e;
        if (e != null) {
            iji.a(e, (MessageLite)a2);
        }
        aogv a3;
        if (a2.c == 3) {
            a3 = (aogv)a2.d;
        }
        else {
            a3 = aogv.a;
        }
        if ((a3.b & 0x1) != 0x0) {
            final acij e2 = this.b.e;
            if (e2 != null) {
                final acma c = kfe.c(e2);
                if (c != null) {
                    aogv a4;
                    if (a2.c == 3) {
                        a4 = (aogv)a2.d;
                    }
                    else {
                        a4 = aogv.a;
                    }
                    ansi ansi;
                    if ((ansi = a4.c) == null) {
                        ansi = ansi.a;
                    }
                    c.lH(ansi, null);
                }
            }
        }
        else if (a2.c == 5) {
            final vax a5 = this.b.a;
            final aioe aioe = (aioe)a2.d;
            if (this.c == null) {
                this.c = new HashMap(1);
            }
            final acij e3 = this.b.e;
            if (e3 != null) {
                this.c.put("sectionListController", e3.c("sectionListController"));
            }
            a5.c(aioe, this.c);
        }
        for (int i = 0; i < this.b.b.getCount(); ++i) {
            final agza builder = ((agzi)this.a(i)).toBuilder();
            final boolean g = i == a;
            builder.copyOnWrite();
            final aogt aogt = (aogt)builder.instance;
            aogt.b |= 0x4;
            aogt.g = g;
            this.b.b.b(i, builder.build());
        }
        final View viewById = this.b.d.findViewById(2131432092);
        if (viewById instanceof TextView) {
            ((TextView)viewById).setText((CharSequence)this.a(a).e);
        }
        this.a = a;
    }
    
    public final void onNothingSelected(final AdapterView adapterView) {
    }
}
