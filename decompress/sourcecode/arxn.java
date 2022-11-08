import java.nio.ByteBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arxn
{
    public final boolean a;
    public final boolean b;
    public final Object c;
    
    public arxn(final ByteBuffer c, final boolean a, final boolean b) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public arxn(final ynx c, final boolean b, final boolean a) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    private final void b(final String s, final yxx yxx) {
        ((ynx)this.c).k(s, yxx.a(((ynx)this.c).a()));
    }
    
    public final void a(final yhk yhk) {
        monitorenter(this);
        try {
            if (this.b) {
                final yme i = yhk.i;
                final long b = i.b;
                if (b > 0L) {
                    final int a = yhk.a;
                    final int c = i.c;
                    final StringBuilder sb = new StringBuilder("rn.");
                    sb.append(a);
                    sb.append(";bw.");
                    sb.append(b);
                    sb.append(";src.");
                    sb.append(c);
                    this.b("bwinfo", (yxx)new ynm(sb.toString()));
                }
            }
            if (this.b) {
                final StringBuilder sb2 = new StringBuilder("rn.");
                sb2.append(yhk.a);
                sb2.append(";rt.");
                sb2.append(yhk.j);
                final long b2 = yhk.i.b;
                if (b2 > 0L) {
                    final long e = yhk.e;
                    if (e > 0L) {
                        final long n = e * 8000L / b2;
                        sb2.append(";pt.");
                        sb2.append(n);
                        sb2.append(";ps.");
                        sb2.append(yhk.e);
                    }
                }
                if (yhk.d > 0L) {
                    sb2.append(";pmd.");
                    sb2.append(yhk.d);
                }
                if (yhk.k > 0L) {
                    sb2.append(";ct.");
                    sb2.append(yhk.k);
                }
                if (yhk.l != null) {
                    sb2.append(";ec.");
                    sb2.append(yhk.l);
                }
                this.b("rqs", (yxx)new yhm(sb2.toString(), yhk.b + yhk.j));
            }
            if (this.a) {
                int n2;
                for (int j = 0; j < yhk.c.length(); j = n2) {
                    final int a2 = yhk.a;
                    final StringBuilder c2 = yhk.c;
                    n2 = j + 260;
                    final String substring = c2.substring(j, Math.min(n2, c2.length()));
                    final StringBuilder sb3 = new StringBuilder();
                    sb3.append("rn.");
                    sb3.append(a2);
                    sb3.append(";idx.");
                    sb3.append(j / 260);
                    sb3.append(";d.");
                    sb3.append(substring);
                    this.b("rqd", (yxx)new ynm(sb3.toString()));
                }
            }
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
}
