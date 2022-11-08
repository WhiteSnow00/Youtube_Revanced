import androidx.preference.Preference;
import androidx.preference.ListPreference;
import android.widget.TextView;
import java.util.concurrent.TimeUnit;
import android.view.View;
import android.widget.AdapterView;
import androidx.preference.DropDownPreference;
import android.widget.EditText;
import android.support.v7.widget.SearchView;
import android.widget.AdapterView$OnItemSelectedListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ov implements AdapterView$OnItemSelectedListener
{
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;
    
    public ov(final SearchView a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public ov(final EditText a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public ov(final DropDownPreference a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public ov(final hwl a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public ov(final jem a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public ov(final nb a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public ov(final sro a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public ov(final ssj a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public ov(final tyh a, final int b, final byte[] array, final byte[] array2) {
        this.b = b;
        this.a = a;
    }
    
    public final void onItemSelected(final AdapterView adapterView, final View view, final int n, long n2) {
        final int b = this.b;
        int intValue = 0;
        switch (b) {
            default: {
                final ajaj ajaj = ((ssj)this.a).ak.get(n);
                final ssj ssj = (ssj)this.a;
                auev aj = ssj.aj;
                final aufc f = auez.f(aufc.j((int)TimeUnit.SECONDS.toMillis(ajaj.f)));
                final aufc f2 = auez.f(((auft)aj).k());
                if (f != f2) {
                    n2 = ((aufv)aj).a;
                    if (f != f2) {
                        n2 = f.n(f2.d(n2), n2);
                    }
                    aj = new auev(n2, ((aufv)aj).b.b(f));
                }
                ssj.aj = aj;
                ((ssj)this.a).aK();
                return;
            }
            case 7: {
                final srf aj2 = ((sro)this.a).aj;
                aj2.a = aj2.a(n);
                return;
            }
            case 6: {
                if (adapterView.getSelectedItem() == rew.a) {
                    return;
                }
                final ajhw ajhw = (ajhw)adapterView.getSelectedItem();
                final Object a = this.a;
                ajhy ajhy;
                if ((ajhy = ajhw.c) == null) {
                    ajhy = ajhy.a;
                }
                ajsq ajsq;
                if ((ajhy.b & 0x1) != 0x0) {
                    ajhy ajhy2;
                    if ((ajhy2 = ajhw.c) == null) {
                        ajhy2 = ajhy.a;
                    }
                    if ((ajsq = ajhy2.e) == null) {
                        ajsq = ajsq.a;
                    }
                }
                else {
                    ajsq = null;
                }
                ((EditText)a).setText((CharSequence)abyh.b(ajsq));
                ajhy ajhy3;
                if ((ajhy3 = ajhw.c) == null) {
                    ajhy3 = ajhy.a;
                }
                final String g = ajhy3.g;
                return;
            }
            case 5: {
                final Object itemAtPosition = adapterView.getItemAtPosition(n);
                if (itemAtPosition instanceof ajhy && (((ajhy)itemAtPosition).b & 0x2000) != 0x0) {
                    ((jem)this.a).dismiss();
                }
                return;
            }
            case 4: {
                final Object selectedItem = adapterView.getSelectedItem();
                if (selectedItem instanceof ajhy) {
                    final ajhy ajhy4 = (ajhy)selectedItem;
                    if ((ajhy4.b & 0x2000) != 0x0) {
                        final Object a2 = ((tyh)this.a).a;
                        aioe aioe;
                        if ((aioe = ajhy4.j) == null) {
                            aioe = aioe.a;
                        }
                        ((vax)a2).a(aioe);
                    }
                    if ((ajhy4.b & 0x2000) != 0x0) {
                        if (ajhy4.c == 6) {
                            intValue = (int)ajhy4.d;
                        }
                        final int ct = aqql.ct(intValue);
                        if (ct == 2 || ct == 3) {
                            ((tyh)this.a).n(1);
                        }
                    }
                }
                final Object e = ((tyh)this.a).e;
                if (e != null) {
                    ((AdapterView$OnItemSelectedListener)e).onItemSelected(adapterView, view, n, n2);
                }
                return;
            }
            case 3: {
                ((hwl)this.a).q();
                final Object selectedItem2 = adapterView.getSelectedItem();
                if (selectedItem2 instanceof ajhy) {
                    final Object a3 = this.a;
                    ajsq ajsq2;
                    if ((ajsq2 = ((ajhy)selectedItem2).l) == null) {
                        ajsq2 = ajsq.a;
                    }
                    final hwl hwl = (hwl)a3;
                    tmy.t((TextView)hwl.aj, (CharSequence)vbd.a(ajsq2, hwl.ae, false));
                }
                return;
            }
            case 2: {
                if (n >= 0) {
                    final String string = ((ListPreference)this.a).h[n].toString();
                    if (!string.equals(((ListPreference)this.a).i) && ((Preference)this.a).R((Object)string)) {
                        ((ListPreference)this.a).o(string);
                    }
                }
                return;
            }
            case 1: {
                if (n != -1) {
                    final mh e2 = ((nb)this.a).e;
                    if (e2 != null) {
                        e2.a = false;
                    }
                }
                return;
            }
            case 0: {
                ((SearchView)this.a).onItemSelected(n);
            }
        }
    }
    
    public final void onNothingSelected(final AdapterView adapterView) {
    }
}
