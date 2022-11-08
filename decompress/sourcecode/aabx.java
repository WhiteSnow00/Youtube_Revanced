import android.text.TextUtils;
import java.util.List;
import java.util.ArrayList;
import java.util.Collection;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aabx extends vjn
{
    public Collection a;
    public String b;
    
    public aabx(final adcr adcr, final zkh zkh, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6) {
        super("player/refresh", adcr, zkh, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
        this.a = new ArrayList();
        this.b = "";
        ((vii)this).i = uyp.b;
    }
    
    protected final void c() {
        tsx.n(((vii)this).p);
        if (TextUtils.isEmpty((CharSequence)this.b)) {
            agot.D(this.a.isEmpty() ^ true);
            return;
        }
        tsx.n(this.b);
    }
}
