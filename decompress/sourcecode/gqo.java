import java.util.concurrent.Executor;
import android.content.Context;
import android.content.Intent;
import android.app.Activity;
import com.google.android.apps.youtube.app.extensions.accountlinking.UriFlowActivity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gqo extends gqp implements aeho
{
    public final UriFlowActivity a;
    public final gqn b;
    public final tox c;
    public int d;
    private final rxr f;
    
    public gqo(final UriFlowActivity a, final gqn b, final aegi aegi, final UriFlowActivity uriFlowActivity, final rxr f, final tox c, final byte[] array, final byte[] array2) {
        this.d = 1;
        this.a = a;
        this.b = b;
        this.f = f;
        final aeht b2 = aehu.b((Activity)uriFlowActivity);
        b2.b((Class)rkr.class);
        aegi.d(b2.a());
        aegi.c((aeho)this);
        this.c = c;
    }
    
    public final void d(final aeby aeby) {
        this.f.h(3, 2, 2);
    }
    
    public final void e() {
        this.g(4);
    }
    
    public final void f() {
        this.g(3);
    }
    
    public final void g(int n) {
        this.d = 5;
        final gqn b = this.b;
        final UriFlowActivity a = this.a;
        Object o;
        if (--n != 1) {
            if (n != 2) {
                if (n != 3) {
                    trn.b("Unknown UriFlowResult");
                    o = null;
                }
                else {
                    o = b.e;
                }
            }
            else {
                o = b.d;
            }
        }
        else {
            o = b.c;
        }
        Label_0146: {
            if (o == null) {
                break Label_0146;
            }
            final String f = b.f;
            if (f == null) {
                trn.b("No activity name found");
                break Label_0146;
            }
            try {
                final Intent intent = new Intent((Context)a, (Class)Class.forName(f).asSubclass(Activity.class));
                intent.setFlags(603979776);
                intent.putExtra("navigation_endpoint", ((agxl)o).toByteArray());
                ((Activity)a).startActivity(intent);
                b.b = null;
                b.c = null;
                b.d = null;
                b.e = null;
                b.f = null;
                tcp.j(b.g.c((aexg)gku.f, (Executor)afsl.a), (Executor)afsl.a, (tcn)gnh.d);
                this.a.finish();
            }
            catch (final ClassNotFoundException ex) {
                throw gqo$$ExternalSyntheticBackport0.m("Unable to retrieve activity that started UriFlow.", ex);
            }
        }
    }
    
    public final void sR(final Throwable t) {
        this.f.i(3, t);
        this.a.finish();
    }
}
