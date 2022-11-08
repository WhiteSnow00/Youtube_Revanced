import java.util.Iterator;
import android.os.Looper;
import android.os.Parcelable;
import com.google.common.android.concurrent.ParcelableFuture;
import android.os.Bundle;
import java.util.Set;
import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aewl extends avo implements aewm
{
    private static volatile Handler j;
    public final abo a;
    public final Set b;
    public cl c;
    public aewf d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public final String i;
    private final avh k;
    
    public aewl(final avh k) {
        this.a = new abo();
        this.b = (Set)new abi();
        this.c = null;
        int i = 0;
        this.e = false;
        this.f = false;
        this.g = false;
        this.h = false;
        this.k = k;
        final String name = aexg.class.getName();
        final String name2 = br.class.getName();
        final String name3 = this.getClass().getName();
        final StringBuilder sb = new StringBuilder();
        sb.append(name);
        sb.append(name2);
        sb.append(name3);
        this.i = sb.toString();
        if (k.c()) {
            final Bundle bundle = (Bundle)k.a("FutureListenerState");
            this.g = true;
            this.h(bundle);
            final Parcelable[] parcelableArray = bundle.getParcelableArray("futures");
            if (parcelableArray != null) {
                while (i < parcelableArray.length) {
                    this.b.add(parcelableArray[i]);
                    ++i;
                }
            }
        }
        k.b("FutureListenerState", (cgg)new cb(this, 17));
    }
    
    public static final void f() {
        agot.E(Looper.myLooper() == Looper.getMainLooper(), (Object)"Must be called from the main thread.");
    }
    
    private final void h(final Bundle bundle) {
        final String string = bundle.getString("appVersion");
        if (string == null) {
            throw new aewk("Got key but not value from saved state.");
        }
        if (this.i.equals(string)) {
            return;
        }
        final String i = this.i;
        final StringBuilder sb = new StringBuilder("Got data from old app version: expected=");
        sb.append(i);
        sb.append(" got=");
        sb.append(string);
        throw new aewk(sb.toString());
    }
    
    public final void a(final Runnable runnable) {
        this.h = true;
        try {
            runnable.run();
        }
        finally {
            this.h = false;
        }
    }
    
    public final void b(final ParcelableFuture parcelableFuture, final Throwable t) {
        this.c(parcelableFuture, new aecw(this, parcelableFuture, t, 8));
    }
    
    public final void c(final ParcelableFuture parcelableFuture, final Runnable runnable) {
        if (this.c != null) {
            if (aewl.j == null) {
                aewl.j = new Handler(Looper.getMainLooper());
            }
            aewl.j.post((Runnable)new aecw(this, parcelableFuture, runnable, 9));
        }
    }
    
    public final void d() {
        for (final ParcelableFuture parcelableFuture : this.b) {
            if (this.a.d(parcelableFuture.a) != null) {
                this.a((Runnable)new aesf(parcelableFuture, 2));
            }
        }
        this.b.clear();
    }
    
    public final void e(final cl c) {
        final boolean b = true;
        agot.u(c != null);
        final cl c2 = this.c;
        agot.D(c2 == null || c == c2);
        if (!this.f) {
            if (this.k.c()) {
                final Bundle bundle = (Bundle)this.k.a("FutureListenerState");
                this.h(bundle);
                final int[] intArray = bundle.getIntArray("callback_ids");
                for (int length = intArray.length, i = 0; i < length; ++i) {
                    agot.E(this.a.d(intArray[i]) != null, (Object)"Didn't re-register callback.");
                }
            }
            this.f = true;
        }
        int n = b ? 1 : 0;
        if (!this.e) {
            if (this.c == null) {
                n = (b ? 1 : 0);
            }
            else {
                n = 0;
            }
        }
        if (this.c == null) {
            this.c = c;
        }
        if (n != 0) {
            this.e = false;
            for (final ParcelableFuture parcelableFuture : this.b) {
                if (!parcelableFuture.c()) {
                    final xpb xpb = (xpb)this.a.d(parcelableFuture.a);
                    this.g(parcelableFuture);
                }
                parcelableFuture.b((aewm)this);
            }
        }
    }
    
    public final void g(final ParcelableFuture parcelableFuture) {
        this.a((Runnable)new aesf(parcelableFuture, 3));
    }
}
