import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

final class acfx implements out
{
    final acet a;
    final boolean b;
    final xbe c;
    
    public acfx(final acet a, final boolean b, final xbe c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final void b(final View view, final View view2) {
        nch.I((out)this, view);
    }
    
    public final void e(final View view) {
        alji b;
        final alji alji = b = this.a.b;
        if (this.b) {
            ahcr ahcr;
            if (alji == null) {
                ahcr = ((ahcz)alji.a).createBuilder();
            }
            else {
                ahcr = ((ahcz)alji).toBuilder();
            }
            final ahcr builder = ((ahcz)alja.a).createBuilder();
            builder.copyOnWrite();
            alja.a((alja)builder.instance);
            ahcr.copyOnWrite();
            final alji alji2 = (alji)ahcr.instance;
            final alja o = (alja)builder.build();
            o.getClass();
            alji2.O = o;
            alji2.d |= 0x8;
            b = (alji)ahcr.build();
        }
        this.a.a.t(this.c, b);
    }
}
