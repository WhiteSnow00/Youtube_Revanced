import android.widget.Spinner;
import android.widget.TextView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView$OnItemSelectedListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acom implements AdapterView$OnItemSelectedListener
{
    final Object a;
    final Object b;
    private final int c;
    
    public acom(final acon b, final acol a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public acom(final kor a, final apud b, final int c, final byte[] array) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public final void onItemSelected(final AdapterView adapterView, final View view, final int a, final long n) {
        if (this.c != 0) {
            tqf.t((TextView)((kor)this.a).a, (CharSequence)acbu.b((ajws)((apud)this.b).e.get(a)));
            ((thg)((kor)this.a).d).d((Object)new jje(a));
            final View b = ((kor)this.a).b;
            final ajws ajws = (ajws)((apud)this.b).d.get(a);
            ajwt ajwt;
            if ((ajwt = ajws.f) == null) {
                ajwt = ajwt.a;
            }
            String c;
            if ((ajwt.b & 0x1) != 0x0) {
                ajwt ajwt2;
                if ((ajwt2 = ajws.f) == null) {
                    ajwt2 = ajwt.a;
                }
                ahkb ahkb;
                if ((ahkb = ajwt2.c) == null) {
                    ahkb = ahkb.a;
                }
                c = ahkb.c;
            }
            else {
                c = null;
            }
            ((Spinner)b).setContentDescription((CharSequence)c);
            return;
        }
        final acoo e = ((acon)this.b).e;
        final acol acol = (acol)this.a;
        if (acol.a != a) {
            acol.a = a;
            e.notifyDataSetChanged();
        }
    }
    
    public final void onNothingSelected(final AdapterView adapterView) {
    }
}
