import android.widget.TextView;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

final class gjd extends akw
{
    final gjf a;
    
    public gjd(final gjf a) {
        this.a = a;
    }
    
    public final void c(final View view, final aom aom) {
        super.c(view, aom);
        boolean b = true;
        aom.o(true);
        final gje gje = (gje)view.getTag();
        if (gje != null) {
            if (this.a.b.getSelectedItem() != gje.g) {
                b = false;
            }
            aom.p(b);
        }
        aom.u((CharSequence)String.valueOf(((TextView)view.findViewById(2131429479)).getText().toString()).concat(String.valueOf(((TextView)view.findViewById(2131428624)).getText().toString())));
    }
}
