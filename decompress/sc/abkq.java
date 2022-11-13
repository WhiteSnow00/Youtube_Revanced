import android.os.Looper;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abkq implements afaq
{
    public final boolean a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    private final int f;
    
    public abkq(final abku b, final PlaybackStartDescriptor c, final String d, final abjt e, final boolean a, final int f) {
        this.f = f;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.a = a;
    }
    
    public abkq(final uov d, final Looper c, final boolean a, final qye e, final unc b, final int f) {
        this.f = f;
        this.d = d;
        this.c = c;
        this.a = a;
        this.e = e;
        this.b = b;
    }
    
    public final Object a() {
        if (this.f != 0) {
            return new umn((uov)this.d, (Looper)this.c, this.a, (qye)this.e, (unc)this.b);
        }
        return ((abku)this.b).c.a((PlaybackStartDescriptor)this.c, (String)this.d, (abjt)this.e, this.a);
    }
}
