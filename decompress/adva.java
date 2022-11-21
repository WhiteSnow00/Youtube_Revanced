import com.google.android.material.bottomsheet.BottomSheetBehavior;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adva
{
    public final boolean a;
    public final Object b;
    
    public adva(final BottomSheetBehavior b, final boolean a) {
        this.b = b;
        this.a = a;
    }
    
    public adva(final jjn b, final boolean a) {
        this.b = b;
        this.a = a;
    }
    
    public adva(final wme b, final boolean a) {
        this.b = b;
        this.a = a;
    }
    
    public final void a(final int n) {
        final Object b = this.b;
        final boolean a = this.a;
        if (n != 0 && n != 2) {
            tut.b("Error stopping capture: 1");
        }
        final wme wme = (wme)b;
        wme.j.f((wje)new wli(wme, a));
    }
}
