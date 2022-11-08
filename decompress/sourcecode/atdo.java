import java.util.Set;
import android.text.TextUtils;
import android.net.Uri;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import io.grpc.Status;
import com.google.firebase.appindexing.internal.MutateRequest;
import android.view.View$OnClickListener;
import android.view.View$OnFocusChangeListener;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.ImageView;
import android.view.View;
import android.net.Uri$Builder;
import java.util.HashSet;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atdo
{
    public final Object a;
    public final Object b;
    public final /* synthetic */ Object c;
    
    public atdo() {
    }
    
    public atdo(final ably c, final String s) {
        this.c = c;
        this.a = new HashSet();
        final Uri$Builder scheme = new Uri$Builder().scheme("http");
        final int localPort = c.d.getLocalPort();
        final StringBuilder sb = new StringBuilder("localhost:");
        sb.append(localPort);
        this.b = scheme.encodedAuthority(sb.toString()).path(s);
    }
    
    public atdo(final acyq c, final View view) {
        this.c = c;
        new adbh(c.a, (ImageView)view.findViewById(2131431408));
        final EditText a = (EditText)view.findViewById(2131429851);
        this.a = a;
        final ImageView b = (ImageView)view.findViewById(2131429409);
        this.b = b;
        view.findViewById(2131429852);
        final eyi eyi = new eyi(this, 19, (byte[])null, (byte[])null);
        final EditText editText = a;
        a.addTextChangedListener((TextWatcher)eyi);
        final gbv onFocusChangeListener = new gbv(this, 11, null, null);
        final EditText editText2 = a;
        a.setOnFocusChangeListener((View$OnFocusChangeListener)onFocusChangeListener);
        final acsj onClickListener = new acsj(this, 8, (byte[])null, (byte[])null);
        final ImageView imageView = b;
        b.setOnClickListener((View$OnClickListener)onClickListener);
    }
    
    public atdo(final ageq b, final Class a, final afyh c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public atdo(final aggu c, final MutateRequest a) {
        this.c = c;
        this.b = new nmo();
        this.a = a;
    }
    
    public atdo(final asbz c, final asbr b, final aruq a) {
        this.c = c;
        this.b = b;
        a.getClass();
        this.a = a;
    }
    
    public atdo(final atdr c, final aujp[] a, final aujp[] b) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public static atdo b(final afyh afyh, final ageq ageq, final Class clazz) {
        return new atdo(ageq, clazz, afyh);
    }
    
    public final void a(final int n, final ashn ashn) {
        ((atdr)this.c).b(n, (aujp[])this.a, (aujp[])this.b, ashn);
    }
    
    public final void c(final Status status) {
        agot.v(status.f() ^ true, (Object)"the error status must not be OK");
        ((asbz)this.c).n.execute(new arzn(this, status, 14, null));
    }
    
    public final void d(final aruo aruo) {
        ((asbz)this.c).n.execute(new asbs(this, aruo, null));
    }
    
    public final void e() {
        final asbz asbz = (asbz)this.c;
        final aseo u = asbz.U;
        if (u != null) {
            final arvn arvn = (arvn)u.a;
            if (!arvn.c) {
                if (!arvn.b) {
                    return;
                }
            }
        }
        if (asbz.S == null) {
            asbz.S = arxi.b();
        }
        final long a = ((asbz)this.c).S.a();
        ((asbz)this.c).H.b(1, "Scheduling DNS resolution backoff for {0} ns", new Object[] { a });
        final asbz asbz2 = (asbz)this.c;
        asbz2.U = asbz2.n.d(new arzs(asbz2, 14), a, TimeUnit.NANOSECONDS, ((asbz)this.c).j.b());
    }
    
    public final void f() {
        synchronized (((aggu)this.c).b) {
            kgk.aT(((aggu)this.c).c == 0);
            ((aggu)this.c).c = 1;
            monitorexit(((aggu)this.c).b);
            ((aggu)this.c).a.v((msf)new aggt(this, (byte[])null)).n((Executor)this.c, (nls)new mii(this, 14, (byte[])null));
        }
    }
    
    public final Uri g() {
        synchronized (this) {
            final abmd c = ((ably)this.c).c;
            final Object b = this.b;
            return ((Uri$Builder)b).appendQueryParameter("sig", c.a(((Uri$Builder)b).appendQueryParameter("sparams", TextUtils.join((CharSequence)",", (Iterable)this.a)).build())).build();
        }
    }
    
    public final void h(final String s, final String s2) {
        synchronized (this) {
            agot.D(((Set)this.a).contains(s) ^ true);
            final Object b = this.b;
            String s3 = s2;
            if (s2 == null) {
                s3 = "";
            }
            ((Uri$Builder)b).appendQueryParameter(s, s3);
            ((Set<String>)this.a).add(s);
        }
    }
    
    public final void i(final String s, final long n) {
        this.h(s, Long.toString(n));
    }
}
