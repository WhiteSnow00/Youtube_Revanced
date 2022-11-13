import android.util.TypedValue;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ibn extends ibk
{
    public atke ag;
    public atke ah;
    public atke ai;
    public atke aj;
    public wyv ak;
    public tgd al;
    public vai am;
    public aeea an;
    
    public static int aN(final Context context) {
        final TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(2130969593, typedValue, true) && typedValue.data != 0) {
            return 2132084111;
        }
        return 2132084104;
    }
    
    public final cbo aK(final Context context) {
        return (cbo)new ibm(context, aN(context), this.ag, this.ah, this.ai, this.aj, this.ak.pF(), this.al, this.an, this.am, (byte[])null, (byte[])null, (byte[])null);
    }
}
