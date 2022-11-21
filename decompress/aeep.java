import android.os.Build$VERSION;
import android.os.Bundle;
import com.google.android.gms.cast.framework.CastOptions;
import android.content.Intent;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aeep implements nnn
{
    public final Object a;
    public final Object b;
    private final int c;
    
    public aeep(final aeex a, final noj b, final int c, final byte[] array) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public aeep(final agny a, final Intent b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public aeep(final mmf a, final CastOptions b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public final void a(final nnt nnt) {
        final int c = this.c;
        if (c != 0) {
            if (c != 1) {
                ((agny)this.a).f((Intent)this.b);
                return;
            }
            final Object a = this.a;
            final Object b = this.b;
            boolean boolean1 = false;
            Label_0090: {
                if (nnt.j()) {
                    final Bundle bundle = (Bundle)nnt.f();
                    if (bundle != null && bundle.containsKey("com.google.android.gms.cast.FLAG_OUTPUT_SWITCHER_ENABLED")) {
                        boolean1 = bundle.getBoolean("com.google.android.gms.cast.FLAG_OUTPUT_SWITCHER_ENABLED");
                        break Label_0090;
                    }
                }
                boolean1 = true;
            }
            final boolean k = ((CastOptions)b).k;
            final boolean a2 = boolean1 && k;
            final mmf mmf = (mmf)a;
            if (mmf.f != null) {
                final CastOptions b2 = mmf.b;
                if (b2 != null) {
                    final boolean j = b2.j;
                    final boolean i = b2.i;
                    final aung aung = new aung((byte[])null);
                    if (Build$VERSION.SDK_INT >= 30) {
                        aung.a = a2;
                    }
                    if (Build$VERSION.SDK_INT >= 30) {
                        aung.b = j;
                    }
                    if (Build$VERSION.SDK_INT >= 30) {
                        aung.c = i;
                    }
                    final cdd m = new cdd(aung, null, null);
                    dmo.r();
                    final ccs q = dmo.q();
                    final cdd l = q.m;
                    q.m = m;
                    if (q.q()) {
                        if (q.e == null) {
                            q.g(q.e = new ccd(q.a, new oqz(q), null, null, null, null));
                            q.m();
                            q.A.b();
                        }
                        if ((l != null && l.c) != m.c) {
                            q.e.lg(q.u);
                        }
                    }
                    else {
                        final ccd e = q.e;
                        if (e != null) {
                            q.j(e);
                            q.e = null;
                            q.A.b();
                        }
                    }
                    q.j.a(769, m);
                    mmf.a.a("media transfer = %b, session transfer = %b, transfer to local = %b, in-app output switcher = %b", new Object[] { mmf.e, a2, j, i });
                    if (j) {
                        final mmg d = mmf.d;
                        kht.aL((Object)d);
                        final mme w = new mme(d);
                        dmo.r();
                        dmo.q().w = (cct)w;
                        mls.e(afsk.K);
                    }
                }
            }
        }
        else {
            final Object a3 = this.a;
            final Object b3 = this.b;
            synchronized (((aeex)a3).d) {
                ((aeex)a3).c.remove(b3);
            }
        }
    }
}
