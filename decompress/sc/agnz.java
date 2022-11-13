import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agnz implements arub
{
    public final Object a;
    private final int b;
    
    public agnz(final Context a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public agnz(final arwk a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public agnz(final atke a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public final arua a(final arwo arwo, final artx artx, final arty arty) {
        final int b = this.b;
        if (b == 0) {
            return (arua)new agof(new agod(arty, arwo, artx, (afeq)((atke)this.a).a()));
        }
        if (b != 1) {
            return (arua)new asgp(this, arty.a(arwo, artx), (byte[])null);
        }
        return (arua)new nql(this, arty.a(arwo, artx), (byte[])null);
    }
}
