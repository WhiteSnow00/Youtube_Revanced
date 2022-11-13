import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.app.AlertDialog;
import android.widget.RadioGroup$OnCheckedChangeListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ita implements RadioGroup$OnCheckedChangeListener
{
    public final Object a;
    private final int b;
    
    public ita(final AlertDialog a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public ita(final AlertDialog a, final int b, final byte[] array) {
        this.b = b;
        this.a = a;
    }
    
    public ita(final fuq a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public ita(final jng a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public final void onCheckedChanged(final RadioGroup radioGroup, int f) {
        final int b = this.b;
        boolean enabled = true;
        if (b == 0) {
            final Button button = ((AlertDialog)this.a).getButton(-1);
            if (f == -1) {
                enabled = false;
            }
            button.setEnabled(enabled);
            return;
        }
        if (b == 1) {
            final fuq fuq = (fuq)this.a;
            if (fuq.e != null) {
                final ajfo ajfo = (ajfo)((ViewGroup)radioGroup).findViewById(f).getTag();
                if (ajfo != null) {
                    fuq.e.p(ajfo.c);
                }
            }
            return;
        }
        if (b != 2) {
            if (b != 3) {
                final Object a = this.a;
                f = syh.f;
                ((AlertDialog)a).getButton(-1).setEnabled(true);
                return;
            }
            ((AlertDialog)this.a).getButton(-1).setEnabled(true);
        }
        else {
            final Object a2 = this.a;
            final String string = ((RadioButton)radioGroup.findViewById(f)).getText().toString();
            final jng jng = (jng)a2;
            jng.ak = string;
            if (radioGroup.equals(jng.al)) {
                jng.aO(jng.am);
                return;
            }
            if (radioGroup.equals(jng.am)) {
                jng.aO(jng.al);
            }
        }
    }
}
