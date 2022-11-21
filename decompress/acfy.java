import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acfy implements oum
{
    final Object a;
    final Object b;
    private final int c;
    
    public acfy(final acet a, final xbe b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public acfy(final ovh b, final aqji a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public final void a(final View view) {
        if (this.c != 0) {
            final Object b = this.b;
            final Object a = this.a;
            oml.d();
            ((ovh)b).b(afgh.r(a), 3);
            return;
        }
        final acet acet = (acet)this.a;
        acet.a.o((xbe)this.b, acet.b);
    }
}
