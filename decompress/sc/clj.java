import android.os.Build$VERSION;

// 
// Decompiled by Procyon v0.6.0
// 

public class clj extends clk
{
    public clj() {
        super("ALGORITHMIC_DARKENING", "ALGORITHMIC_DARKENING");
    }
    
    public final boolean a() {
        return Build$VERSION.SDK_INT >= 33;
    }
}
