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

final class fvd implements AdapterView$OnItemSelectedListener
{
    public int a;
    final fve b;
    private Map c;
    
    public fvd(final fve b) {
        this.b = b;
        this.a = -1;
    }
    
    private final aoiw a(final int n) {
        return (aoiw)this.b.b.getItem(n);
    }
    
    public final void onItemSelected(final AdapterView adapterView, final View view, final int a, final long n) {
        if (a == this.a) {
            return;
        }
        final aoiw a2 = this.a(a);
        final ackm e = this.b.e;
        if (e != null) {
            ike.a(e, (MessageLite)a2);
        }
        aoiy a3;
        if (a2.c == 3) {
            a3 = (aoiy)a2.d;
        }
        else {
            a3 = aoiy.a;
        }
        if ((a3.b & 0x1) != 0x0) {
            final ackm e2 = this.b.e;
            if (e2 != null) {
                final acod c = kgf.c(e2);
                if (c != null) {
                    aoiy a4;
                    if (a2.c == 3) {
                        a4 = (aoiy)a2.d;
                    }
                    else {
                        a4 = aoiy.a;
                    }
                    anul anul;
                    if ((anul = a4.c) == null) {
                        anul = anul.a;
                    }
                    c.lH(anul, null);
                }
            }
        }
        else if (a2.c == 5) {
            final vcy a5 = this.b.a;
            final aiqj aiqj = (aiqj)a2.d;
            if (this.c == null) {
                this.c = new HashMap(1);
            }
            final ackm e3 = this.b.e;
            if (e3 != null) {
                this.c.put("sectionListController", e3.c("sectionListController"));
            }
            a5.c(aiqj, this.c);
        }
        for (int i = 0; i < this.b.b.getCount(); ++i) {
            final ahaz builder = this.a(i).toBuilder();
            final boolean g = i == a;
            builder.copyOnWrite();
            final aoiw aoiw = (aoiw)builder.instance;
            aoiw.b |= 0x4;
            aoiw.g = g;
            this.b.b.b(i, builder.build());
        }
        final View viewById = this.b.d.findViewById(2131432095);
        if (viewById instanceof TextView) {
            ((TextView)viewById).setText((CharSequence)this.a(a).e);
        }
        this.a = a;
    }
    
    public final void onNothingSelected(final AdapterView adapterView) {
    }
}
