import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.Collections;
import java.util.Collection;
import java.util.ArrayList;
import io.grpc.Status;

// 
// Decompiled by Procyon v0.6.0
// 

public final class asfb implements asae
{
    final asfc a;
    public final asfe b;
    
    public asfb(final asfe b, final asfc a) {
        this.b = b;
        this.a = a;
    }
    
    private static final Integer b(final arwk arwk) {
        final String s = (String)arwk.b(asfe.b);
        Integer n;
        if (s != null) {
            try {
                n = Integer.valueOf(s);
            }
            catch (final NumberFormatException ex) {
                n = -1;
            }
        }
        else {
            n = null;
        }
        return n;
    }
    
    @Override
    public final void a(Status c, final asad asad, final arwk arwk) {
        Object q = this.b.l;
        synchronized (q) {
            final asfe b = this.b;
            final asez q2 = b.q;
            final asfc a = this.a;
            final int n = 1;
            final int n2 = 1;
            a.b = true;
            asez q3 = q2;
            if (q2.c.contains(a)) {
                final ArrayList list = new ArrayList(q2.c);
                list.remove(a);
                q3 = new asez(q2.b, Collections.unmodifiableCollection((Collection<?>)list), q2.d, q2.f, q2.g, q2.a, q2.h, q2.e);
            }
            b.q = q3;
            this.b.p.a((Object)c.getCode());
            monitorexit(q);
            final asfc a2 = this.a;
            if (a2.c) {
                this.b.r(a2);
                if (this.b.q.f == this.a) {
                    this.b.g.execute(new aaxa(this, c, asad, arwk, 8));
                }
                return;
            }
            if (asad == asad.d && this.b.s.incrementAndGet() > 1000) {
                this.b.r(this.a);
                if (this.b.q.f == this.a) {
                    c = Status.k.withDescription("Too many transparent retries. Might be a bug in gRPC").c((Throwable)c.d());
                    this.b.g.execute(new aaxa(this, c, asad, arwk, 9));
                }
                return;
            }
            Label_1463: {
                if (this.b.q.f == null) {
                    final asad d = asad.d;
                    final boolean b2 = false;
                    int n3 = 0;
                    if (asad != d) {
                        if (asad != asad.b || !this.b.r.compareAndSet(false, true)) {
                            if (asad == asad.c) {
                                final asfe b3 = this.b;
                                if (b3.k) {
                                    b3.u();
                                }
                                break Label_1463;
                            }
                            else {
                                this.b.r.set(true);
                                final asfe b4 = this.b;
                                if (b4.k) {
                                    final Integer b5 = b(arwk);
                                    final boolean b6 = this.b.j.c.contains(c.getCode()) ^ true;
                                    final boolean b7 = this.b.o != null && (!b6 || (b5 != null && b5 < 0)) && (this.b.o.b() ^ true);
                                    int n4;
                                    if (!b6 && !b7) {
                                        n4 = n2;
                                    }
                                    else {
                                        n4 = 0;
                                    }
                                    if (n4 != 0) {
                                        q = this.b;
                                        if (b5 != null) {
                                            if (b5 < 0) {
                                                ((asfe)q).u();
                                            }
                                            else {
                                                synchronized (((asfe)q).l) {
                                                    final abdo b8 = ((asfe)q).B;
                                                    if (b8 != null) {
                                                        final Future i = b8.i();
                                                        final abdo b9 = new abdo(((asfe)q).l);
                                                        ((asfe)q).B = b9;
                                                        monitorexit(((asfe)q).l);
                                                        if (i != null) {
                                                            i.cancel(false);
                                                        }
                                                        b9.j((Future)((asfe)q).h.schedule((Runnable)new ymr((asfe)q, b9, 2, (byte[])null), b5, TimeUnit.MILLISECONDS));
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    synchronized (this.b.l) {
                                        final asfe b10 = this.b;
                                        q = b10.q;
                                        final asfc a3 = this.a;
                                        final ArrayList list2 = new ArrayList<Object>(((asez)q).d);
                                        list2.remove(a3);
                                        b10.q = new asez(((asez)q).b, ((asez)q).c, Collections.unmodifiableCollection((Collection<?>)list2), ((asez)q).f, ((asez)q).g, ((asez)q).a, ((asez)q).h, ((asez)q).e);
                                        if (n4 != 0) {
                                            final asfe b11 = this.b;
                                            if (b11.v(b11.q) || !this.b.q.d.isEmpty()) {
                                                return;
                                            }
                                        }
                                        break Label_1463;
                                    }
                                }
                                final asff j = b4.i;
                                long nanos = 0L;
                                Label_1133: {
                                    if (j != null) {
                                        final boolean contains = j.f.contains(c.getCode());
                                        final Integer b12 = b(arwk);
                                        final boolean b13 = this.b.o != null && (contains || (b12 != null && b12 < 0)) && (this.b.o.b() ^ true);
                                        final asfe b14 = this.b;
                                        Label_1130: {
                                            if (b14.i.a > this.a.d + 1 && !b13) {
                                                if (b12 == null) {
                                                    if (!contains) {
                                                        break Label_1130;
                                                    }
                                                    final double n5 = (double)b14.v;
                                                    final double nextDouble = asfe.d.nextDouble();
                                                    Double.isNaN(n5);
                                                    final asfe b15 = this.b;
                                                    final double n6 = (double)b15.v;
                                                    final asff k = b15.i;
                                                    final double d2 = k.d;
                                                    Double.isNaN(n6);
                                                    b15.v = Math.min((long)(n6 * d2), k.c);
                                                    nanos = (long)(n5 * nextDouble);
                                                }
                                                else {
                                                    if (b12 < 0) {
                                                        break Label_1130;
                                                    }
                                                    nanos = TimeUnit.MILLISECONDS.toNanos(b12);
                                                    final asfe b16 = this.b;
                                                    b16.v = b16.i.b;
                                                }
                                                n3 = n;
                                                break Label_1133;
                                            }
                                        }
                                        n3 = 0;
                                    }
                                }
                                if (n3 == 0) {
                                    break Label_1463;
                                }
                                synchronized (this.b.l) {
                                    final asfe b17 = this.b;
                                    final abdo a4 = new abdo(b17.l);
                                    b17.A = a4;
                                    monitorexit(this.b.l);
                                    a4.j((Future)this.b.h.schedule(new ased(this, 7), nanos, TimeUnit.NANOSECONDS));
                                    return;
                                }
                            }
                        }
                    }
                    final asfc p3 = this.b.p(this.a.d, true);
                    final asfe b18 = this.b;
                    Label_1440: {
                        if (b18.k) {
                            synchronized (b18.l) {
                                final asfe b19 = this.b;
                                final asez q4 = b19.q;
                                q = this.a;
                                final ArrayList list3 = new ArrayList(q4.d);
                                list3.remove(q);
                                list3.add((Object)p3);
                                q = new asez(q4.b, q4.c, Collections.unmodifiableCollection((Collection<?>)list3), q4.f, q4.g, q4.a, q4.h, q4.e);
                                b19.q = (asez)q;
                                final asfe b20 = this.b;
                                int n7 = b2 ? 1 : 0;
                                if (!b20.v(b20.q)) {
                                    n7 = (b2 ? 1 : 0);
                                    if (this.b.q.d.size() == 1) {
                                        n7 = 1;
                                    }
                                }
                                monitorexit(b18.l);
                                if (n7 != 0) {
                                    this.b.r(p3);
                                }
                                break Label_1440;
                            }
                        }
                        final asff l = b18.i;
                        if (l == null || l.a == 1) {
                            b18.r(p3);
                        }
                    }
                    this.b.f.execute(new asfa(this, p3, 1));
                    return;
                }
            }
            this.b.r(this.a);
            if (this.b.q.f == this.a) {
                this.b.g.execute(new aaxa(this, c, asad, arwk, 10));
            }
        }
    }
    
    @Override
    public final void c(final arwk arwk) {
        this.b.r(this.a);
        if (this.b.q.f == this.a) {
            final asfd o = this.b.o;
            if (o != null) {
                int value;
                int a;
                do {
                    value = o.d.get();
                    a = o.a;
                } while (value != a && !o.d.compareAndSet(value, Math.min(o.c + value, a)));
            }
            this.b.g.execute((Runnable)new asat(this, arwk, 20));
        }
    }
    
    @Override
    public final void d(final asft asft) {
        final asez q = this.b.q;
        adkp.R(q.f != null, (Object)"Headers should be received prior to messages.");
        if (q.f != this.a) {
            return;
        }
        this.b.g.execute(new asfa(this, asft, 0));
    }
    
    @Override
    public final void e() {
        if (!this.b.o()) {
            return;
        }
        this.b.g.execute(new ased(this, 8));
    }
}
