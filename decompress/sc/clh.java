import android.os.Build$VERSION;

// 
// Decompiled by Procyon v0.6.0
// 

public final class clh extends clk
{
    public clh() {
        super("TRACING_CONTROLLER_BASIC_USAGE", "TRACING_CONTROLLER_BASIC_USAGE");
    }
    
    public final boolean a() {
        return Build$VERSION.SDK_INT >= 28;
    }
}
