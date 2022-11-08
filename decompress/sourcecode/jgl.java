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

public final class jgl extends jgv
{
    public final tny a;
    public final acjb b;
    private final Executor c;
    private final aack d;
    private final adcr e;
    
    public jgl(final atjj atjj, final abll abll, final adcr e, final atjj atjj2, final aeby aeby, final Executor c, final tny a, final uyf uyf, final arud arud, final atjj atjj3, final kkd kkd, final ikh ikh, final RecyclerView recyclerView, final LoadingFrameLayout loadingFrameLayout, final Activity activity, final wwv wwv, final Bundle bundle, final acpi acpi, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        super(loadingFrameLayout, activity, wwv, uyf, arud, bundle, acpi, (byte[])null, (byte[])null);
        this.e = e;
        this.c = c;
        this.a = a;
        this.d = ((zzu)atjj.a()).a();
        abll.d = new abli(activity);
        recyclerView.af((nw)new LinearLayoutManager());
        final achs achs = new achs();
        ((acir)achs).f(zzg.class, (acip)kkd);
        ((acir)achs).f(zyx.class, (acip)ikh);
        ((acir)achs).f(amfe.class, (acip)new acit(atjj2, 0));
        ((acir)achs).f(ahwm.class, (acip)new acit(atjj3, 0));
        final acjb b = new acjb();
        this.b = b;
        final aciw t = aeby.T((acir)achs);
        t.f((acik)new fas(wwv, 10));
        t.h((achk)b);
        recyclerView.ac((nq)t);
    }
    
    public final void a() {
    }
    
    public final void c(final String s, final String s2) {
    }
    
    public final void d(final Configuration configuration) {
    }
    
    public final void e(final String s) {
        this.f(s, new acvr());
    }
    
    public final void f(final String s, final acvr acvr) {
        this.G.c();
        final adcr e = this.e;
        final aack d = this.d;
        final ifl m = ifl.m;
        final taa c = taa.c(this.c, (szx)new hwo(this, 2));
        d.getClass();
        ((Executor)e.a).execute((Runnable)new udn((szx)c, d, s, (Predicate)m, 15));
    }
    
    public final boolean g() {
        return false;
    }
    
    public final boolean h() {
        return false;
    }
}
