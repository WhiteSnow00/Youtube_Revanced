import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import android.content.pm.PackageManager;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aekh
{
    public final int a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    
    public aekh(final aefc d, final aefc e, final aefc f, final aefc h, final aefc c, final aefc b, final aefc g, final int a) {
        this.d = d;
        this.e = e;
        this.f = f;
        this.h = h;
        this.c = c;
        this.b = b;
        this.g = g;
        this.a = a;
    }
    
    public aekh(final Context d, final aezp aezp, final String f) {
        this.d = d;
        this.g = d.getPackageName();
        this.b = qca.b(d);
        afaq a;
        if (aezp.h()) {
            a = ((qcs)aezp.c()).a();
        }
        else {
            a = null;
        }
        this.c = a;
        this.f = f;
        final PackageManager packageManager = d.getPackageManager();
        int a2;
        if (packageManager.hasSystemFeature("android.hardware.type.watch")) {
            a2 = 3;
        }
        else if (packageManager.hasSystemFeature("android.software.leanback")) {
            a2 = 4;
        }
        else {
            a2 = 2;
        }
        if (packageManager.hasSystemFeature("android.hardware.type.automotive")) {
            a2 = 5;
        }
        this.a = a2;
        this.h = new ouf(d);
        this.e = adyf.A((afaq)new pyo(this, 14, (byte[])null, (byte[])null));
    }
    
    public aekh(final atke b, final ahdc c, final qqr h, final oby d, final atke f, final int a, final Executor g, final byte[] array, final byte[] array2, final byte[] array3) {
        this.e = afut.a();
        this.b = b;
        this.c = c;
        this.h = h;
        this.d = d;
        this.f = f;
        this.a = a;
        this.g = g;
    }
    
    public final ListenableFuture a() {
        final ListenableFuture b = this.b();
        this.d(b);
        return b;
    }
    
    public final ListenableFuture b() {
        return ((afut)this.e).b(aeun.c((afty)new qqz(this, 20)), (Executor)this.g);
    }
    
    public final ListenableFuture c() {
        return ((qqr)this.h).b((aezf)new aekn(this, 1), (Executor)afum.a);
    }
    
    final void d(final ListenableFuture listenableFuture) {
        afwm.w(listenableFuture, aeun.f((afva)new ter(this, 5)), (Executor)this.g);
    }
    
    public final ListenableFuture e() {
        return ((qqr)this.h).a();
    }
}
