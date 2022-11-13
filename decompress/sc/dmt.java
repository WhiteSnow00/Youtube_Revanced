import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

final class dmt implements dpb
{
    final Context a;
    
    public dmt(final Context a) {
        this.a = a;
    }
    
    public final /* bridge */ Object a() {
        return this.a.getSystemService("connectivity");
    }
}
