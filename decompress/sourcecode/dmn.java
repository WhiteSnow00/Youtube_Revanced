import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dmn implements dmo
{
    private final /* synthetic */ int a;
    
    public dmn(final int a) {
        this.a = a;
    }
    
    public final dcl a(final dbo dbo, final dmg dmg, final dmq dmq, final Context context) {
        if (this.a != 0) {
            return (dcl)new acft(dbo, dmg, dmq, context);
        }
        return new dcl(dbo, dmg, dmq, context);
    }
}
