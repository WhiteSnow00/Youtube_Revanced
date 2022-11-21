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

public final class athd
{
    public final Object a;
    public final Object b;
    public final Object c;
    
    public athd() {
    }
    
    public athd(final abpf c, final String s) {
        this.c = c;
        this.a = new HashSet();
        final Uri$Builder scheme = new Uri$Builder().scheme("http");
        final int localPort = c.d.getLocalPort();
        final StringBuilder sb = new StringBuilder("localhost:");
        sb.append(localPort);
        this.b = scheme.encodedAuthority(sb.toString()).path(s);
    }
    
    public athd(final adcg c, final View view) {
        this.c = c;
        new adew(c.a, (ImageView)view.findViewById(2131431412));
        final EditText a = (EditText)view.findViewById(2131429851);
        this.a = a;
        final ImageView b = (ImageView)view.findViewById(2131429409);
        this.b = b;
        view.findViewById(2131429852);
        final eyo eyo = new eyo(this, 19, (byte[])null, (byte[])null);
        final EditText editText = a;
        a.addTextChangedListener((TextWatcher)eyo);
        final gci onFocusChangeListener = new gci(this, 11, (byte[])null, (byte[])null);
        final EditText editText2 = a;
        a.setOnFocusChangeListener((View$OnFocusChangeListener)onFocusChangeListener);
        final acvy onClickListener = new acvy(this, 8, (byte[])null, (byte[])null);
        final ImageView imageView = b;
        b.setOnClickListener((View$OnClickListener)onClickListener);
    }
    
    public athd(final agij b, final Class a, final agca c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public athd(final agkn c, final MutateRequest a) {
        this.c = c;
        this.b = new noj();
        this.a = a;
    }
    
    public athd(final asgb c, final asft b, final arzo a) {
        this.c = c;
        this.b = b;
        a.getClass();
        this.a = a;
    }
    
    public athd(final athg c, final auna[] a, final auna[] b) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public static athd b(final agca agca, final agij agij, final Class clazz) {
        return new athd(agij, clazz, agca);
    }
    
    public final void a(final int n, final asky asky) {
        ((athg)this.c).b(n, (auna[])this.a, (auna[])this.b, asky);
    }
    
    public final void c(final Status status) {
        adme.L(status.f() ^ true, "the error status must not be OK");
        ((asgb)this.c).n.execute((Runnable)new asbm(this, status, 18, (byte[])null));
    }
    
    public final void d(final arzm arzm) {
        ((asgb)this.c).n.execute((Runnable)new asfu(this, arzm, (byte[])null));
    }
    
    public final void e() {
        final asgb asgb = (asgb)this.c;
        final asck s = asgb.S;
        if (s != null) {
            final asad asad = (asad)s.a;
            if (!asad.c) {
                if (!asad.b) {
                    return;
                }
            }
        }
        if (asgb.R == null) {
            asgb.R = asbq.a();
        }
        final long a = ((asgb)this.c).R.a();
        ((asgb)this.c).G.b(1, "Scheduling DNS resolution backoff for {0} ns", a);
        final asgb asgb2 = (asgb)this.c;
        asgb2.S = asgb2.n.d((Runnable)new asdv(asgb2, 14), a, TimeUnit.NANOSECONDS, ((asgb)this.c).j.b());
    }
    
    public final void f() {
        synchronized (((agkn)this.c).b) {
            kht.aT(((agkn)this.c).c == 0);
            ((agkn)this.c).c = 1;
            monitorexit(((agkn)this.c).b);
            ((agkn)this.c).a.v((mty)new agkm(this, (byte[])null, (byte[])null)).n((Executor)this.c, (nno)new mkb(this, 14, (byte[])null, (byte[])null));
        }
    }
    
    public final Uri g() {
        synchronized (this) {
            final abpk c = ((abpf)this.c).c;
            final Object b = this.b;
            return ((Uri$Builder)b).appendQueryParameter("sig", c.a(((Uri$Builder)b).appendQueryParameter("sparams", TextUtils.join((CharSequence)",", (Iterable)this.a)).build())).build();
        }
    }
    
    public final void h(final String s, final String s2) {
        synchronized (this) {
            adme.T(((Set)this.a).contains(s) ^ true);
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
