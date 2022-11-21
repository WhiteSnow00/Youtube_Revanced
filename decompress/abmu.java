import java.util.concurrent.Executor;
import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abmu implements asmn
{
    public final PlaybackStartDescriptor a;
    public final ListenableFuture b;
    public final abla c;
    public final String d;
    public final afax e;
    public final acjq f;
    
    public abmu(final acjq f, final PlaybackStartDescriptor a, final ListenableFuture b, final abla c, final String d, final afax e, final byte[] array, final byte[] array2) {
        this.f = f;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    @Override
    public final Object a(final Object o) {
        final acjq f = this.f;
        final PlaybackStartDescriptor a = this.a;
        final ListenableFuture b = this.b;
        final abla c = this.c;
        final String d = this.d;
        final afax e = this.e;
        final Throwable t = (Throwable)o;
        asla asla;
        if (TextUtils.isEmpty((CharSequence)a.k())) {
            asla = ume.N(afvh.f(b, aewf.d((afvq)new ihx(f, a, c, d, e, 8, (byte[])null, (byte[])null)), (Executor)f.c));
        }
        else {
            asla = asla.C(t);
        }
        return asla;
    }
}
