import android.view.View;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class js extends ix
{
    final /* synthetic */ jt d;
    
    public js(final jt d, final Context context, final im im, final View view) {
        this.d = d;
        super(context, im, view, true);
        super.b = 8388613;
        this.e((iy)d.p);
    }
    
    @Override
    public final void c() {
        final im c = this.d.c;
        if (c != null) {
            c.close();
        }
        this.d.l = null;
        super.c();
    }
}
