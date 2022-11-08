import java.util.Map;
import android.graphics.Bitmap;
import java.util.Set;
import android.text.TextUtils;
import java.util.concurrent.Callable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kep
{
    public boolean a;
    public final Object b;
    public final Object c;
    
    public kep(final atjj b, final iqi c, final uyi uyi, final mrm mrm, final byte[] array, final byte[] array2, final byte[] array3) {
        this.b = b;
        this.c = c;
        this.a = true;
        mrm.A((Callable)new imb(this, uyi, 17, null));
    }
    
    public kep(final CharSequence b, final CharSequence c) {
        this.b = b;
        this.c = c;
        this.a = TextUtils.equals(b, c);
    }
    
    public kep(final Set b) {
        this.b = b;
        this.c = new zsg(this, 1, (byte[])null);
    }
    
    public kep(final sfh c, final sfx b) {
        this.c = c;
        this.b = b;
    }
    
    public final void a(final onw onw, final Bitmap bitmap) {
        final abno abno = (abno)((atjj)this.b).a();
        abno.a();
        final Runnable a = kax.a(((kax)onw.d).c, bitmap, (vax)onw.c, (wwv)onw.a, (Map)onw.e, (acif)onw.b);
        abno.ak(21);
        abno.t();
        a.run();
    }
}
