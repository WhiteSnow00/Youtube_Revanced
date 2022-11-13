import android.view.View;
import android.view.View$OnClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

final class dsw implements View$OnClickListener
{
    public dun a;
    
    public dsw() {
    }
    
    public final void onClick(final View a) {
        final dun a2 = this.a;
        if (a2 != null) {
            try {
                bkw.e();
                if (bku.c == null) {
                    bku.c = new dsl();
                }
                bku.c.a = a;
                a2.b.l().P(a2, bku.c);
                bku.c.a = null;
            }
            finally {}
        }
    }
}
