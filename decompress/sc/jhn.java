import java.util.function.Predicate;
import android.content.res.Configuration;
import android.support.v7.widget.LinearLayoutManager;
import android.os.Bundle;
import android.app.Activity;
import com.google.android.libraries.youtube.rendering.ui.widget.loadingframe.LoadingFrameLayout;
import android.support.v7.widget.RecyclerView;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jhn extends jhx
{
    public final tqd a;
    public final acle b;
    private final Executor c;
    private final aaeh d;
    private final aeea e;
    
    public jhn(final atke atke, final abnl abnl, final aeea e, final atke atke2, final aeea aeea, final Executor c, final tqd a, final vaf vaf, final arwh arwh, final atke atke3, final kle kle, final ilf ilf, final RecyclerView recyclerView, final LoadingFrameLayout loadingFrameLayout, final Activity activity, final wyw wyw, final Bundle bundle, final acrm acrm, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6, final byte[] array7) {
        super(loadingFrameLayout, activity, wyw, vaf, arwh, bundle, acrm, (byte[])null, (byte[])null);
        this.e = e;
        this.c = c;
        this.a = a;
        this.d = ((aabo)atke.a()).a();
        abnl.d = new abni(activity);
        recyclerView.af((nw)new LinearLayoutManager());
        final acjv acjv = new acjv();
        ((acku)acjv).f(aaba.class, (acks)kle);
        ((acku)acjv).f(aaar.class, (acks)ilf);
        ((acku)acjv).f(amhi.class, (acks)new ackw(atke2, 0));
        ((acku)acjv).f(ahyk.class, (acks)new ackw(atke3, 0));
        final acle b = new acle();
        this.b = b;
        final ackz z = aeea.Z((acku)acjv);
        z.f((ackn)new faw(wyw, 10));
        z.h((acjn)b);
        recyclerView.ac((nq)z);
    }
    
    public final void a() {
    }
    
    public final void c(final String s, final String s2) {
    }
    
    public final void d(final Configuration configuration) {
    }
    
    public final void e(final String s) {
        this.f(s, new acxt());
    }
    
    public final void f(final String s, final acxt acxt) {
        this.G.c();
        final aeea e = this.e;
        final aaeh d = this.d;
        final igi m = igi.m;
        final tcf c = tcf.c(this.c, (tcc)new hxl(this, 2));
        d.getClass();
        ((Executor)e.a).execute((Runnable)new ufq((tcc)c, d, s, (Predicate)m, 15));
    }
    
    public final boolean g() {
        return false;
    }
    
    public final boolean h() {
        return false;
    }
}
