import android.os.Build$VERSION;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cpn extends cpj
{
    public cpn(final cpw cpw) {
        super(cpw);
    }
    
    @Override
    public final boolean b(final crh crh) {
        crh.getClass();
        final int i = crh.k.i;
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
    
    @Override
    public final /* bridge */ boolean c(final Object o) {
        final cpb cpb = (cpb)o;
        return !cpb.a || cpb.c;
    }
}
