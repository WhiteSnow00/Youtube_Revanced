import android.widget.Spinner;
import android.widget.TextView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView$OnItemSelectedListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ackw implements AdapterView$OnItemSelectedListener
{
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;
    
    public ackw(final ackx b, final ackv a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public ackw(final knf a, final appn b, final int c, final byte[] array) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public final void onItemSelected(final AdapterView adapterView, View a, final int a2, final long n) {
        if (this.c != 0) {
            a = ((knf)this.a).a;
            tmy.t((TextView)a, (CharSequence)abyh.b((ajsq)((appn)this.b).e.get(a2)));
            ((tdz)((knf)this.a).d).d((Object)new jhr(a2));
            final View b = ((knf)this.a).b;
            final ajsq ajsq = ((appn)this.b).d.get(a2);
            ajsr ajsr;
            if ((ajsr = ajsq.f) == null) {
                ajsr = ajsr.a;
            }
            String c;
            if ((ajsr.b & 0x1) != 0x0) {
                ajsr ajsr2;
                if ((ajsr2 = ajsq.f) == null) {
                    ajsr2 = ajsr.a;
                }
                ahgm ahgm;
                if ((ahgm = ajsr2.c) == null) {
                    ahgm = ahgm.a;
                }
                c = ahgm.c;
            }
            else {
                c = null;
            }
            ((Spinner)b).setContentDescription((CharSequence)c);
            return;
        }
        final acky e = ((ackx)this.b).e;
        final ackv ackv = (ackv)this.a;
        if (ackv.a != a2) {
            ackv.a = a2;
            e.notifyDataSetChanged();
        }
    }
    
    public final void onNothingSelected(final AdapterView adapterView) {
    }
}
