import java.util.concurrent.Executor;
import android.content.Context;
import android.content.Intent;
import android.app.Activity;
import com.google.android.apps.youtube.app.extensions.accountlinking.UriFlowActivity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gqt extends gqu implements aejp
{
    public final UriFlowActivity a;
    public final gqs b;
    public final trc c;
    public int d;
    private final rzv f;
    
    public gqt(final UriFlowActivity a, final gqs b, final aeij aeij, final UriFlowActivity uriFlowActivity, final rzv f, final trc c, final byte[] array, final byte[] array2) {
        this.d = 1;
        this.a = a;
        this.b = b;
        this.f = f;
        final aeju b2 = aejv.b((Activity)uriFlowActivity);
        b2.b(rmv.class);
        aeij.d(b2.a());
        aeij.c((aejp)this);
        this.c = c;
    }
    
    public final void b() {
    }
    
    public final void c() {
        afse.j((aejp)this);
    }
    
    public final void d(final aeea aeea) {
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
        final gqs b = this.b;
        final UriFlowActivity a = this.a;
        Object o;
        if (--n != 1) {
            if (n != 2) {
                if (n != 3) {
                    ttr.b("Unknown UriFlowResult");
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
        Label_0143: {
            if (o == null) {
                break Label_0143;
            }
            final String f = b.f;
            if (f == null) {
                ttr.b("No activity name found");
                break Label_0143;
            }
            try {
                final Intent intent = new Intent((Context)a, (Class)Class.forName(f).asSubclass(Activity.class));
                intent.setFlags(603979776);
                intent.putExtra("navigation_endpoint", ((agzk)o).toByteArray());
                ((Activity)a).startActivity(intent);
                b.b = null;
                b.c = null;
                b.d = null;
                b.e = null;
                b.f = null;
                teu.j(b.g.b((aezf)glc.f, (Executor)afum.a), (Executor)afum.a, (tes)gnn.d);
                this.a.finish();
            }
            catch (final ClassNotFoundException ex) {
                throw gqt$$ExternalSyntheticBackport0.m("Unable to retrieve activity that started UriFlow.", (Throwable)ex);
            }
        }
    }
    
    public final void sX(final Throwable t) {
        this.f.i(3, t);
        this.a.finish();
    }
}
