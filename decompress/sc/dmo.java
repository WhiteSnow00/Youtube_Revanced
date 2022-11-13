import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dmo implements dmp
{
    private final int a;
    
    public dmo(final int a) {
        this.a = a;
    }
    
    public final dcm a(final dbp dbp, final dmh dmh, final dmr dmr, final Context context) {
        if (this.a != 0) {
            return new achw(dbp, dmh, dmr, context);
        }
        return new dcm(dbp, dmh, dmr, context);
    }
}
