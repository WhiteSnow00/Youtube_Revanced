import android.view.Window;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoc extends aob
{
    public aoc(final Window window) {
        super(window);
    }
    
    public final void b(final boolean b) {
        if (b) {
            super.a.clearFlags(67108864);
            super.a.addFlags(Integer.MIN_VALUE);
            this.f(8192);
            return;
        }
        this.g(8192);
    }
    
    public final boolean c() {
        return (this.a.getDecorView().getSystemUiVisibility() & 0x2000) != 0x0;
    }
}
