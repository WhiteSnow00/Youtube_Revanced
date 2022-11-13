import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.Map;
import android.text.TextUtils;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fxo implements xeu
{
    public final fxq a;
    
    public fxo(final fxq a) {
        this.a = a;
    }
    
    public final void a(final xje xje) {
        final fxq a = this.a;
        final Map l = xje.l();
        String s = null;
        String s2;
        if (l != null) {
            s2 = l.get("offerParams");
        }
        else {
            s2 = null;
        }
        if (l != null) {
            s = l.get("remoteTransactionSessionId");
        }
        final aln j = new aln(xje.a.f(), s2, s);
        if (j.a != null) {
            if (!a.i.contains(j.b)) {
                final aln i = a.j;
                if (i == null || !((xjr)i.a).equals(j.a) || !TextUtils.equals((CharSequence)a.j.b, (CharSequence)j.b)) {
                    final aln k = a.j;
                    if (k == null || ((xjr)k.a).equals(j.a)) {
                        final aln m = a.j;
                        if (m != null && !TextUtils.isEmpty((CharSequence)m.b) && ((xjr)a.j.a).equals(j.a) && TextUtils.isEmpty((CharSequence)j.b)) {
                            a.b.removeCallbacks((Runnable)new eym(a, 16));
                            a.b.post((Runnable)new eym(a, 16));
                            return;
                        }
                        if (!TextUtils.isEmpty((CharSequence)j.b)) {
                            j.toString();
                            a.j = j;
                            final vxr d = a.d;
                            final vxn vxn = new vxn(d.c, d.f.c(), (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
                            vxn.a = vxn.g((String)a.j.b);
                            ((vkk)vxn).i();
                            final Object b = a.j.b;
                            final bu e = a.e;
                            final vxr d2 = a.d;
                            final Executor f = a.f;
                            final ListenableFuture b2 = d2.k.b((vls)vxn, f);
                            if (d2.n.C()) {
                                vxg.a(d2.m, b2, f, almx.cn);
                            }
                            teu.n((aun)e, b2, (ttg)new exv(a, 18), (ttg)new exv(a, 19));
                            a.d("deviceDetected");
                            final ahaz builder = ((ahbh)amdq.a).createBuilder();
                            builder.copyOnWrite();
                            final amdq amdq = (amdq)builder.instance;
                            amdq.c = 8;
                            amdq.b |= 0x1;
                            final Object c = j.c;
                            builder.copyOnWrite();
                            final amdq amdq2 = (amdq)builder.instance;
                            c.getClass();
                            amdq2.b |= 0x2;
                            amdq2.d = (String)c;
                            final amdq amdq3 = (amdq)builder.build();
                            final aknr d3 = aknt.d();
                            ((ahaz)d3).copyOnWrite();
                            aknt.bd((aknt)d3.instance, amdq3);
                            a.a.d((aknt)((ahaz)d3).build());
                        }
                    }
                }
            }
        }
    }
    
    public final void b() {
    }
}
