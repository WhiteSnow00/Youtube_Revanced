import java.util.concurrent.CancellationException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atuq
{
    public static final atvj a;
    public static final atvj b;
    
    static {
        a = new atvj("UNDEFINED");
        b = new atvj("REUSABLE_CLAIMED");
    }
    
    public static final void a(atld atld, final Object o) {
        if (atld instanceof atup) {
            final atup atup = (atup)atld;
            atld = (atld)aulo.l(o);
            if (atup.a.e(atup.getContext())) {
                atup.c = atld;
                atup.e = 1;
                atup.a.d(atup.getContext(), (Runnable)atup);
                return;
            }
            final boolean a = atqb.a;
            final ThreadLocal a2 = atrv.a;
            final atqp a3 = atrv.a();
            if (a3.l()) {
                atup.c = atld;
                atup.e = 1;
                a3.j((atqj)atup);
                return;
            }
            a3.k(true);
            try {
                Object context = atup.getContext().get((atlg)atrb.c);
                Label_0236: {
                    if (context != null && !((atrb)context).tN()) {
                        final CancellationException n = ((atrb)context).n();
                        ((atqj)atup).q((Object)atld, (Throwable)n);
                        ((atld)atup).resumeWith(arxj.g((Throwable)n));
                        break Label_0236;
                    }
                    atld = atup.b;
                    final Object d = atup.d;
                    context = atld.getContext();
                    final Object b = atvm.b((atli)context, d);
                    if (b != atvm.a) {
                        atld = (atld)atpt.c(atld, (atli)context, b);
                    }
                    else {
                        atld = null;
                    }
                    try {
                        atup.b.resumeWith(o);
                        if (atld == null || ((atry)atld).M()) {
                            atvm.c((atli)context, b);
                        }
                        while (a3.m()) {}
                        a3.i(true);
                        return;
                    }
                    finally {
                        if (atld == null || ((atry)atld).M()) {
                            atvm.c((atli)context, b);
                        }
                    }
                }
            }
            finally {
                try {
                    final Throwable t;
                    ((atqj)atup).v(t, (Throwable)null);
                    return;
                }
                finally {
                    a3.i(true);
                }
            }
        }
        atld.resumeWith(o);
    }
}
