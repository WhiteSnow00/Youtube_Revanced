import android.os.Build$VERSION;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cpm extends cpi
{
    public cpm(final cpv cpv) {
        super(cpv);
    }
    
    @Override
    public final boolean b(final crg crg) {
        crg.getClass();
        final int i = crg.k.i;
        boolean b = true;
        if (i != 3) {
            if (Build$VERSION.SDK_INT >= 30) {
                if (i != 6) {
                    return false;
                }
                b = b;
            }
            else {
                b = false;
            }
        }
        return b;
    }
}
