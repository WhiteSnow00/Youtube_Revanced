import java.io.PrintStream;
import java.util.Arrays;
import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adm
{
    static int a;
    final ArrayList b;
    public final int c;
    public int d;
    ArrayList e;
    private int f;
    
    public adm(final int d) {
        this.b = new ArrayList();
        this.e = null;
        this.f = -1;
        final int a = adm.a;
        adm.a = a + 1;
        this.c = a;
        this.d = d;
    }
    
    public final int a(final ack ack, int n) {
        final int size = this.b.size();
        final int n2 = 0;
        if (size == 0) {
            return 0;
        }
        final ArrayList b = this.b;
        final acs u = b.get(0).U;
        ack.k();
        u.b(ack, false);
        for (int i = 0; i < b.size(); ++i) {
            ((acs)b.get(i)).b(ack, false);
        }
        if (n == 0) {
            final act act = (act)u;
            if (act.at > 0) {
                sm.b(act, ack, b, 0);
            }
        }
        if (n == 1) {
            final act act2 = (act)u;
            if (act2.au > 0) {
                sm.b(act2, ack, b, 1);
            }
        }
        try {
            ack.j();
        }
        catch (final Exception ex) {
            final PrintStream err = System.err;
            final String string = ex.toString();
            final String replace = Arrays.toString(ex.getStackTrace()).replace("[", "   at ").replace(",", "\n   at").replace("]", "");
            final StringBuilder sb = new StringBuilder();
            sb.append(string);
            sb.append("\n");
            sb.append(replace);
            err.println(sb.toString());
        }
        this.e = new ArrayList();
        for (int j = n2; j < b.size(); ++j) {
            this.e.add(new sr((acs)b.get(j)));
        }
        int n3;
        if (n == 0) {
            final act act3 = (act)u;
            n3 = ack.o((Object)act3.J);
            n = ack.o((Object)act3.L);
            ack.k();
        }
        else {
            final act act4 = (act)u;
            n3 = ack.o((Object)act4.K);
            n = ack.o((Object)act4.M);
            ack.k();
        }
        return n - n3;
    }
    
    public final void b(final ArrayList list) {
        final int size = this.b.size();
        if (this.f != -1 && size > 0) {
            for (int i = 0; i < list.size(); ++i) {
                final adm adm = list.get(i);
                if (this.f == adm.c) {
                    this.c(this.d, adm);
                }
            }
        }
        if (size == 0) {
            list.remove(this);
        }
    }
    
    public final void c(final int n, final adm adm) {
        final ArrayList b = this.b;
        for (int size = b.size(), i = 0; i < size; ++i) {
            final acs acs = (acs)b.get(i);
            adm.d(acs);
            if (n == 0) {
                acs.ao = adm.c;
            }
            else {
                acs.ap = adm.c;
            }
        }
        this.f = adm.c;
    }
    
    public final boolean d(final acs acs) {
        if (this.b.contains(acs)) {
            return false;
        }
        this.b.add(acs);
        return true;
    }
    
    @Override
    public final String toString() {
        final int d = this.d;
        String s;
        if (d == 0) {
            s = "Horizontal";
        }
        else if (d == 1) {
            s = "Vertical";
        }
        else {
            s = "Both";
        }
        final int c = this.c;
        final StringBuilder sb = new StringBuilder();
        sb.append(s);
        sb.append(" [");
        sb.append(c);
        sb.append("] <");
        String s2 = sb.toString();
        final ArrayList b = this.b;
        for (int size = b.size(), i = 0; i < size; ++i) {
            final String ai = ((acs)b.get(i)).ai;
            final StringBuilder sb2 = new StringBuilder();
            sb2.append(s2);
            sb2.append(" ");
            sb2.append(ai);
            s2 = sb2.toString();
        }
        return s2.concat(" >");
    }
}
