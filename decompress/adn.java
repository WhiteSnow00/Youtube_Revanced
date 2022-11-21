import java.io.PrintStream;
import java.util.Arrays;
import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adn
{
    static int a;
    final ArrayList b;
    public final int c;
    public int d;
    ArrayList e;
    private int f;
    
    public adn(final int d) {
        this.b = new ArrayList();
        this.e = null;
        this.f = -1;
        final int a = adn.a;
        adn.a = a + 1;
        this.c = a;
        this.d = d;
    }
    
    public final int a(final acl acl, int n) {
        final int size = this.b.size();
        final int n2 = 0;
        if (size == 0) {
            return 0;
        }
        final ArrayList b = this.b;
        final act u = b.get(0).U;
        acl.k();
        u.b(acl, false);
        for (int i = 0; i < b.size(); ++i) {
            ((act)b.get(i)).b(acl, false);
        }
        if (n == 0) {
            final acu acu = (acu)u;
            if (acu.at > 0) {
                sm.c(acu, acl, b, 0);
            }
        }
        if (n == 1) {
            final acu acu2 = (acu)u;
            if (acu2.au > 0) {
                sm.c(acu2, acl, b, 1);
            }
        }
        try {
            acl.j();
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
            this.e.add(new sr((act)b.get(j)));
        }
        int n3;
        if (n == 0) {
            final acu acu3 = (acu)u;
            n3 = acl.o(acu3.J);
            n = acl.o(acu3.L);
            acl.k();
        }
        else {
            final acu acu4 = (acu)u;
            n3 = acl.o(acu4.K);
            n = acl.o(acu4.M);
            acl.k();
        }
        return n - n3;
    }
    
    public final void b(final ArrayList list) {
        final int size = this.b.size();
        if (this.f != -1 && size > 0) {
            for (int i = 0; i < list.size(); ++i) {
                final adn adn = list.get(i);
                if (this.f == adn.c) {
                    this.c(this.d, adn);
                }
            }
        }
        if (size == 0) {
            list.remove(this);
        }
    }
    
    public final void c(final int n, final adn adn) {
        final ArrayList b = this.b;
        for (int size = b.size(), i = 0; i < size; ++i) {
            final act act = (act)b.get(i);
            adn.d(act);
            if (n == 0) {
                act.ao = adn.c;
            }
            else {
                act.ap = adn.c;
            }
        }
        this.f = adn.c;
    }
    
    public final boolean d(final act act) {
        if (this.b.contains(act)) {
            return false;
        }
        this.b.add(act);
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
            final String ai = ((act)b.get(i)).ai;
            final StringBuilder sb2 = new StringBuilder();
            sb2.append(s2);
            sb2.append(" ");
            sb2.append(ai);
            s2 = sb2.toString();
        }
        return s2.concat(" >");
    }
}
