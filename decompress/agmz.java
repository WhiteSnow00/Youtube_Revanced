import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agmz implements Runnable
{
    public final agna a;
    
    public agmz(final agna a) {
        this.a = a;
    }
    
    @Override
    public final void run() {
        final agna a = this.a;
        final Object a2 = agna.a;
        monitorenter(a2);
        try {
            Object c = agnv.b(a.b.a());
            try {
                final agnn a3 = a.d.a();
                if (c != null) {
                    ((agnv)c).a();
                }
                monitorexit(a2);
                try {
                    agnn agnn;
                    if (!a3.b() && !a3.e()) {
                        if (!a.e.c(a3)) {
                            return;
                        }
                        c = a.c.c(a.d(), a3.a, a.f(), a3.c);
                        final int c2 = ((agns)c).c;
                        final int n = c2 - 1;
                        if (c2 == 0) {
                            throw null;
                        }
                        if (n != 0) {
                            if (n != 1) {
                                if (n != 2) {
                                    throw new agnc("Firebase Installations Service is unavailable. Please try again later.");
                                }
                                a.i((String)null);
                                final agnm f = a3.f();
                                f.c(2);
                                agnn = f.a();
                            }
                            else {
                                agnn = a3.g();
                            }
                        }
                        else {
                            final String a4 = ((agns)c).a;
                            final long b = ((agns)c).b;
                            final long a5 = a.e.a();
                            c = a3.f();
                            ((agnm)c).b = a4;
                            ((agnm)c).b(b);
                            ((agnm)c).d(a5);
                            agnn = ((agnm)c).a();
                        }
                    }
                    else {
                        final String a6 = a3.a;
                        final String s2;
                        Label_0471: {
                            if (a6 != null && a6.length() == 11) {
                                final agnk f2 = a.f;
                                synchronized (f2.b) {
                                    final String[] a7 = agnk.a;
                                    for (int i = 0; i < 4; ++i) {
                                        final String s = a7[i];
                                        final String c3 = f2.c;
                                        c = new StringBuilder();
                                        ((StringBuilder)c).append("|T|");
                                        ((StringBuilder)c).append(c3);
                                        ((StringBuilder)c).append("|");
                                        ((StringBuilder)c).append(s);
                                        c = ((StringBuilder)c).toString();
                                        c = f2.b.getString((String)c, (String)null);
                                        if (c != null && !((String)c).isEmpty()) {
                                            if (((String)c).startsWith("{")) {
                                                try {
                                                    new JSONObject((String)c).getString("token");
                                                }
                                                catch (final JSONException ex) {}
                                            }
                                            break Label_0471;
                                        }
                                    }
                                }
                            }
                            s2 = null;
                        }
                        final agnp b2 = a.c.b(a.d(), a3.a, a.f(), a.e(), s2);
                        final int d = b2.d;
                        final int n2 = d - 1;
                        if (d == 0) {
                            throw null;
                        }
                        if (n2 != 0) {
                            if (n2 != 1) {
                                throw new agnc("Firebase Installations Service is unavailable. Please try again later.");
                            }
                            agnn = a3.g();
                        }
                        else {
                            final String a8 = b2.a;
                            c = b2.b;
                            final long a9 = a.e.a();
                            final agns c4 = b2.c;
                            final String a10 = c4.a;
                            final long b3 = c4.b;
                            final agnm f3 = a3.f();
                            f3.a = a8;
                            f3.c(4);
                            f3.b = a10;
                            f3.c = (String)c;
                            f3.b(b3);
                            f3.d(a9);
                            agnn = f3.a();
                        }
                    }
                    synchronized (agna.a) {
                        final agnv b4 = agnv.b(a.b.a());
                        try {
                            a.d.b(agnn);
                            if (b4 != null) {
                                b4.a();
                            }
                            monitorexit(agna.a);
                            a.j(a3, agnn);
                            if (agnn.d()) {
                                a.i(agnn.a);
                            }
                            if (agnn.b()) {
                                a.g((Exception)new agnc());
                                return;
                            }
                            if (agnn.c()) {
                                a.g((Exception)new IOException("Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."));
                                return;
                            }
                            a.h(agnn);
                            return;
                        }
                        finally {
                            if (b4 != null) {
                                b4.a();
                            }
                        }
                    }
                    throw null;
                }
                catch (final agnc a2) {
                    a.g((Exception)a2);
                }
            }
            finally {
                if (c != null) {
                    ((agnv)c).a();
                }
            }
        }
        finally {
            monitorexit(a2);
            while (true) {}
        }
    }
}
