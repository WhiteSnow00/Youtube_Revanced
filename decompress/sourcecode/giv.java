import android.widget.TextView;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

final class giv extends akv
{
    final /* synthetic */ gix a;
    
    public giv(final gix a) {
        this.a = a;
    }
    
    public final void c(final View view, final aol aol) {
        super.c(view, aol);
        boolean b = true;
        aol.o(true);
        final giw giw = (giw)view.getTag();
        if (giw != null) {
            if (this.a.b.getSelectedItem() != giw.g) {
                b = false;
            }
            aol.p(b);
        }
        aol.u((CharSequence)String.valueOf(((TextView)view.findViewById(2131429479)).getText().toString()).concat(String.valueOf(((TextView)view.findViewById(2131428624)).getText().toString())));
    }
}
