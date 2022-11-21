import java.util.concurrent.CancellationException;
import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abmj implements asmi
{
    public final Object a;
    public final Object b;
    public final Object c;
    private final int d;
    
    public abmj(final abmo b, final abna c, final PlaybackStartDescriptor a, final int d) {
        this.d = d;
        this.b = b;
        this.c = c;
        this.a = a;
    }
    
    public abmj(final abmo a, final abna b, final String c, final int d) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public abmj(final sqv a, final asmh b, final String c, final int d, final byte[] array) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final void a(Object c) {
        final int d = this.d;
        if (d == 0) {
            final Object a = this.a;
            final Object b = this.b;
            ((abna)b).g((WatchNextResponseModel)c, (String)this.c);
            ((abmo)a).n(abli.e);
            ((abna)b).a(3);
            return;
        }
        if (d != 1) {
            final Object b2 = this.b;
            final Object c2 = this.c;
            final Object a2 = this.a;
            final Throwable t = (Throwable)c;
            ((abna)c2).b(new ablo(4, true, 1, ((abmo)b2).d.b(t), t, ((PlaybackStartDescriptor)a2).k()));
            return;
        }
        final Object a3 = this.a;
        final Object b3 = this.b;
        final Object c3 = this.c;
        final String s = (String)c;
        ((asmh)b3).a();
        c = ((sqv)a3).c;
        ((acrm)c).f((String)c3, (Throwable)new CancellationException());
    }
}
