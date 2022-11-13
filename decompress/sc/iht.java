import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.function.Supplier;
import j$.util.stream.Collectors;
import java.util.function.Function;
import java.util.Collection;
import j$.util.Collection$_EL;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class iht implements Callable
{
    public final ihy a;
    public final zme b;
    public final String c;
    public final alzg d;
    
    public iht(final ihy a, final zme b, final String c, final alzg d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    @Override
    public final Object call() {
        Object o = this.a;
        final zme b = this.b;
        final String c = this.c;
        final alzg d = this.d;
        final int j = ihy.j(d);
        amwz amwz;
        if ((amwz = amwz.b(d.e)) == null) {
            amwz = amwz.a;
        }
        final aaaz a = aaaz.a(d.g);
        final byte[] i = d.d.I();
        int cq = aqsx.cQ(d.h);
        if (cq == 0) {
            cq = 1;
        }
        tbi.e();
        final aaeh aaeh = (aaeh)fex.k((aabo)((ihy)o).a.a(), b).orElse((Object)null);
        aabz aabz;
        if (aaeh == null) {
            final aaby b2 = aabz.c.b();
            b2.b = 15;
            aabz = b2.a();
        }
        else {
            final zvo b3 = aaeh.B();
            final ztp c2 = aaeh.c();
            final zzu f = aaeh.f();
            if (b3 != null && c2 != null && f != null) {
                ((aanx)((ihy)o).d.a()).b(true);
                if (b3.s(c) != null) {
                    ((ihy)o).e.f((Object)new zxs(c));
                    aabz = aabz.a;
                }
                else if (!((ztn)c2).k()) {
                    ((ihy)o).f(c, 0);
                    final aaby b4 = aabz.c.b();
                    b4.b = 26;
                    aabz = b4.a();
                }
                else {
                    try {
                        final zaz k = ((aanx)((ihy)o).b.a()).J(c, j);
                        if (k == null) {
                            ((ihy)o).f(c, 3);
                            final aaby b5 = aabz.c.b();
                            b5.b = 4;
                            aabz = b5.a();
                        }
                        else {
                            final int u = ((aaec)((ihy)o).c.a()).U(amwz);
                            final Object b6 = k.b;
                            final long c3 = ((ihy)o).f.c();
                            final aaar aaar = (aaar)b6;
                            if (!b3.ap(aaar, amwz, u, i, c3, cq)) {
                                final StringBuilder sb = new StringBuilder("[Offline] Failed inserting playlist ");
                                sb.append(c);
                                sb.append(" to database");
                                ttr.b(sb.toString());
                                ((ihy)o).f(c, 2);
                                final aaby b7 = aabz.c.b();
                                b7.b = 6;
                                aabz = b7.a();
                            }
                            else {
                                final agq n = aaar.n;
                                if (n != null) {
                                    ihy.n(b3, n);
                                }
                                final Object a2 = k.a;
                                final Set set = (Set)Collection$_EL.stream((Collection)((ihy)o).e(aaeh, (List)a2)).map((Function)ifj.f).collect(Collectors.toCollection((Supplier)ihv.a));
                                if (!b3.al(aaar, (List)a2, amwz, u, set, a, -1, i, false)) {
                                    final StringBuilder sb2 = new StringBuilder("[Offline] Failed updating videos in playlist ");
                                    sb2.append(c);
                                    sb2.append(" to database");
                                    ttr.b(sb2.toString());
                                    ((ihy)o).h(c);
                                    b3.H(c);
                                    ((ihy)o).g(c);
                                    final aaby b8 = aabz.c.b();
                                    b8.b = 6;
                                    aabz = b8.a();
                                }
                                else {
                                    Label_0721: {
                                        try {
                                            f.o(((aaar)b6).a);
                                            f.r((aaar)b6);
                                            final agq n2 = ((aaar)b6).n;
                                            if (n2 != null) {
                                                f.z(n2);
                                            }
                                            break Label_0721;
                                        }
                                        catch (final ExecutionException f) {}
                                        catch (final IOException ex) {}
                                        ttr.n("[Offline] Failed saving playlist thumbnail for ".concat(aaar.a), (Throwable)f);
                                    }
                                    b3.B(aaar.a);
                                    ihy.m(b3, (List)a2);
                                    ((ihy)o).i(aaeh, aaar, set);
                                    afeq afeq;
                                    if (((ihy)o).g.n()) {
                                        afeq = zxf.d(aaar.d.e());
                                    }
                                    else {
                                        afeq = afeq.q();
                                    }
                                    final aaby a3 = aabz.a();
                                    a3.a = 2;
                                    o = afeq.d();
                                    ((afel)o).j((Iterable)ihy.k(c, (List)a2, set, amwz, a, cq, i));
                                    ((afel)o).j((Iterable)afeq);
                                    a3.b(((afel)o).g());
                                    aabz = a3.a();
                                }
                            }
                        }
                    }
                    catch (final ExecutionException ex2) {
                        final StringBuilder sb3 = new StringBuilder("[Offline] Failed requesting playlist ");
                        sb3.append(c);
                        sb3.append(" for offline");
                        ttr.d(sb3.toString(), (Throwable)ex2);
                        ((ihy)o).f(c, 1);
                        final aaby b9 = aabz.b.b();
                        b9.b = 17;
                        aabz = b9.a();
                    }
                }
            }
            else {
                final aaby b10 = aabz.c.b();
                b10.b = 15;
                aabz = b10.a();
            }
        }
        return aabz;
    }
}
