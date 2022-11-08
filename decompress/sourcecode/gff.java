import android.view.View;
import android.view.View$OnClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

final class gff implements View$OnClickListener
{
    final /* synthetic */ gfi a;
    private final almd b;
    private final agzc c;
    
    public gff(final gfi a, final agzc c, final almd b) {
        this.a = a;
        this.c = c;
        this.b = b;
    }
    
    public final void onClick(final View view) {
        if (view.isSelected()) {
            this.a.h(almd.c, this.c);
            return;
        }
        this.a.h(this.b, this.c);
    }
}
