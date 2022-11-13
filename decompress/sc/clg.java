import android.os.Build$VERSION;

// 
// Decompiled by Procyon v0.6.0
// 

public final class clg extends clk
{
    public clg(final String s, final String s2) {
        super(s, s2);
    }
    
    public final boolean a() {
        return Build$VERSION.SDK_INT >= 27;
    }
}
