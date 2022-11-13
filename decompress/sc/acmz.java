import android.widget.Spinner;
import android.widget.TextView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView$OnItemSelectedListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acmz implements AdapterView$OnItemSelectedListener
{
    final Object a;
    final Object b;
    private final int c;
    
    public acmz(final acna b, final acmy a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public acmz(final koh a, final aprr b, final int c, final byte[] array) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public final void onItemSelected(final AdapterView adapterView, View a, final int a2, final long n) {
        if (this.c != 0) {
            a = ((koh)this.a).a;
            tpe.t((TextView)a, (CharSequence)acak.b((ajut)((aprr)this.b).e.get(a2)));
            ((tgd)((koh)this.a).d).d((Object)new jit(a2));
            final View b = ((koh)this.a).b;
            final ajut ajut = (ajut)((aprr)this.b).d.get(a2);
            ajuu ajuu;
            if ((ajuu = ajut.f) == null) {
                ajuu = ajuu.a;
            }
            String c;
            if ((ajuu.b & 0x1) != 0x0) {
                ajuu ajuu2;
                if ((ajuu2 = ajut.f) == null) {
                    ajuu2 = ajuu.a;
                }
                ahik ahik;
                if ((ahik = ajuu2.c) == null) {
                    ahik = ahik.a;
                }
                c = ahik.c;
            }
            else {
                c = null;
            }
            ((Spinner)b).setContentDescription((CharSequence)c);
            return;
        }
        final acnb e = ((acna)this.b).e;
        final acmy acmy = (acmy)this.a;
        if (acmy.a != a2) {
            acmy.a = a2;
            e.notifyDataSetChanged();
        }
    }
    
    public final void onNothingSelected(final AdapterView adapterView) {
    }
}
