import android.content.Intent;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fky extends fkv
{
    public vaf a;
    public vwa b;
    
    public final void onReceive(final Context context, final Intent intent) {
        if (intent != null) {
            this.a(context);
            if (this.a.b() != null) {
                alxp alxp;
                if ((alxp = this.a.b().e) == null) {
                    alxp = alxp.a;
                }
                if (alxp.w) {
                    this.b.N();
                }
            }
        }
    }
}
