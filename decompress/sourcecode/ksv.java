import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.Collection;
import j$.util.Collection$_EL;
import android.content.Context;
import com.google.android.apps.youtube.embeddedplayer.service.hostappverification.e;
import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ksv implements znj
{
    public final atjj a;
    public final ksu b;
    public final String c;
    public final vbq d;
    public acjb e;
    private final tny f;
    private final aciw g;
    private final Activity h;
    
    public ksv(final atjj a, final tny f, final aeby aeby, final zhb zhb, final tdz tdz, final vbq d, final e e, final Activity h, final ksu b, final String c, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6) {
        this.a = a;
        this.f = f;
        this.h = h;
        this.b = b;
        this.c = c;
        this.d = d;
        final mri mri = new mri(this, tdz);
        final achs achs = new achs();
        ((acir)achs).f(amet.class, new ksr(h, zhb, b, 0, null));
        ((acir)achs).f(anfq.class, new kss(e, mri, 0, null, null, null));
        ((acir)achs).f(achx.class, (acip)new hwy(h, 5));
        this.g = aeby.T((acir)achs);
    }
    
    public final void a(final dbi dbi) {
        trn.d("Error adding video to playlist", (Throwable)dbi);
        this.b.aO(true);
        tmy.y((Context)this.h, (CharSequence)this.f.b((Throwable)dbi), 0);
    }
    
    public final void d(final String s, final int n) {
        Collection$_EL.stream((Collection)this.e).filter((Predicate)krp.n).map((Function)krq.f).filter((Predicate)new fqe(s, 20)).findFirst().ifPresent((Consumer)new kst(this, n, 0));
    }
}
