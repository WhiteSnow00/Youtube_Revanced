import android.content.res.Resources;
import android.view.View;
import android.widget.Space;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ftw implements acko
{
    private final Context a;
    private final Space b;
    
    public ftw(final Context a) {
        a.getClass();
        this.a = a;
        this.b = new Space(a);
    }
    
    public final View a() {
        return (View)this.b;
    }
    
    public final void c(final acku acku) {
    }
    
    public final /* bridge */ void mN(final ackm ackm, final Object o) {
        final ftu ftu = (ftu)o;
        int minimumHeight = 0;
        Label_0070: {
            if (ackm.c("vertical_padding_should_display_top") == Boolean.FALSE) {
                final Object c = ackm.c("position");
                minimumHeight = 0;
                if (c == Integer.valueOf(0)) {
                    break Label_0070;
                }
            }
            final Resources resources = this.a.getResources();
            if (ftu.b != 1) {
                minimumHeight = ftu.a;
            }
            else {
                minimumHeight = tpe.aZ(resources.getDisplayMetrics(), ftu.a);
            }
        }
        this.b.setMinimumHeight(minimumHeight);
    }
}
