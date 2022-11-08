import android.view.View;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jp extends ix
{
    final /* synthetic */ jt d;
    
    public jp(final jt d, final Context context, final jg jg, final View view) {
        this.d = d;
        super(context, (im)jg, view, false);
        if (!jg.l.o()) {
            Object h;
            if ((h = d.h) == null) {
                h = d.f;
            }
            super.a = (View)h;
        }
        this.e((iy)d.p);
    }
    
    @Override
    public final void c() {
        final jt d = this.d;
        d.m = null;
        d.n = 0;
        super.c();
    }
}
