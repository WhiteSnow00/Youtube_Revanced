import java.util.EnumSet;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mnk
{
    public final Object a;
    public final Object b;
    public final Object c;
    public Object d;
    
    public mnk(final adof b, final adof c, final mrm a, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.b = b;
        this.c = c;
        this.a = a;
        if (c.d() != null) {
            tmy.v(c.d(), false);
        }
        if (b.d() != null) {
            tmy.v(b.d(), false);
        }
    }
    
    public mnk(final Context a, final String b) {
        this.c = fkp.f;
        this.d = mnr.e;
        kgk.aL((Object)a);
        this.a = a;
        kgk.aV(b);
        this.b = b;
    }
    
    public final mnm a() {
        mnm.f((EnumSet)this.d, null);
        final Object a = this.a;
        final Object b = this.b;
        final Object d = this.d;
        final Object c = this.c;
        final Context context = (Context)a;
        return new mnm(context, (String)b, null, (EnumSet)d, mnv.c(context, (aeyr)c), (mnp)new mnz((Context)this.a));
    }
    
    public final void b(final EnumSet d) {
        kgk.aL((Object)d);
        mnm.e((EnumSet)(this.d = d));
    }
}
