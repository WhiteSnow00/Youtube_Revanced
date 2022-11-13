import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aql implements alw
{
    public static final aql a;
    
    static {
        a = new aql();
    }
    
    private aql() {
    }
    
    public final aob a(final View view, final aob f) {
        final int h = aqr.h;
        final aqr aqr = (aqr)view;
        final int c = f.b.d().c;
        aqr.f = f;
        final boolean b = true;
        final boolean g = c > 0;
        aqr.g = g;
        aqr.setWillNotDraw(!g && aqr.getBackground() == null && b);
        aqr.requestLayout();
        return f.l();
    }
}
