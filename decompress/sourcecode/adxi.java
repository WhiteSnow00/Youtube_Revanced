import android.app.Activity;
import java.lang.ref.WeakReference;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adxi
{
    public int a;
    public boolean b;
    public final Object c;
    
    public adxi(final int a, final aepj aepj, final byte[] array, final byte[] array2) {
        this.c = new WeakReference(aepj);
        this.a = a;
    }
    
    public adxi(final int a, final zhb zhb, final Object o, final byte[] array, final byte[] array2) {
        this.b = false;
        this.a = a;
        abzj c;
        if (zhb != null) {
            c = new abzj((olq)zhb.a, (wwv)zhb.e, (acbz)zhb.b, (dsw)zhb.d, (dzt)zhb.c, (abzh)o);
        }
        else {
            c = null;
        }
        this.c = c;
    }
    
    public adxi(final adsl c) {
        this.b = false;
        this.a = 0;
        this.c = c;
    }
    
    public adxi(final Activity c) {
        this.a = 0;
        this.c = c;
    }
    
    final boolean a(final aepj aepj) {
        return aepj != null && ((WeakReference)this.c).get() == aepj;
    }
}
