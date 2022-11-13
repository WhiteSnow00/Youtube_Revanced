import java.util.ArrayList;
import java.lang.reflect.Modifier;
import java.io.Writer;
import java.io.PrintWriter;

// 
// Decompiled by Procyon v0.6.0
// 

public final class av extends ct implements cj
{
    final cl a;
    boolean b;
    public int c;
    
    public av(final cl a) {
        a.h();
        final bz l = a.l;
        if (l != null) {
            l.c.getClassLoader();
        }
        this.c = -1;
        this.a = a;
    }
    
    public final int a() {
        return this.b(false);
    }
    
    final int b(final boolean b) {
        if (!this.b) {
            if (cl.W(2)) {
                new StringBuilder("Commit: ").append(this);
                final PrintWriter printWriter = new PrintWriter(new cx());
                this.g("  ", printWriter);
                printWriter.close();
            }
            this.b = true;
            if (this.j) {
                this.c = this.a.f.getAndIncrement();
            }
            else {
                this.c = -1;
            }
            this.a.E((cj)this, b);
            return this.c;
        }
        throw new IllegalStateException("commit already called");
    }
    
    final void c(final int n) {
        if (!this.j) {
            return;
        }
        if (cl.W(2)) {
            new StringBuilder("Bump nesting in ").append(this);
        }
        for (int size = this.d.size(), i = 0; i < size; ++i) {
            final cs cs = this.d.get(i);
            final br b = cs.b;
            if (b != null) {
                b.y += n;
                if (cl.W(2)) {
                    new StringBuilder("Bump nesting of ").append(cs.b);
                    final int y = cs.b.y;
                }
            }
        }
    }
    
    public final void d() {
        this.v();
        this.a.F((cj)this, false);
    }
    
    public final void e() {
        this.v();
        this.a.F((cj)this, true);
    }
    
    public final void f(final int n, final br br, final String f, final int n2) {
        final String v = br.V;
        if (v != null) {
            ath.a(br, v);
        }
        final Class<? extends br> class1 = br.getClass();
        final int modifiers = class1.getModifiers();
        if (!class1.isAnonymousClass() && Modifier.isPublic(modifiers) && (!class1.isMemberClass() || Modifier.isStatic(modifiers))) {
            if (f != null) {
                final String f2 = br.F;
                if (f2 != null && !f.equals(f2)) {
                    final StringBuilder sb = new StringBuilder("Can't change tag of fragment ");
                    sb.append(br);
                    sb.append(": was ");
                    sb.append(br.F);
                    sb.append(" now ");
                    sb.append(f);
                    throw new IllegalStateException(sb.toString());
                }
                br.F = f;
            }
            if (n != 0) {
                if (n == -1) {
                    final StringBuilder sb2 = new StringBuilder("Can't add fragment ");
                    sb2.append(br);
                    sb2.append(" with tag ");
                    sb2.append(f);
                    sb2.append(" to container view with no id");
                    throw new IllegalArgumentException(sb2.toString());
                }
                final int d = br.D;
                if (d != 0 && d != n) {
                    final StringBuilder sb3 = new StringBuilder("Can't change container ID of fragment ");
                    sb3.append(br);
                    sb3.append(": was ");
                    sb3.append(br.D);
                    sb3.append(" now ");
                    sb3.append(n);
                    throw new IllegalStateException(sb3.toString());
                }
                br.D = n;
                br.E = n;
            }
            this.p(new cs(n2, br));
            br.z = this.a;
            return;
        }
        final StringBuilder sb4 = new StringBuilder("Fragment ");
        sb4.append(class1.getCanonicalName());
        sb4.append(" must be a public static class to be  properly recreated from instance state.");
        throw new IllegalStateException(sb4.toString());
    }
    
    public final void g(final String s, final PrintWriter printWriter) {
        this.h(s, printWriter, true);
    }
    
    public final void h(final String s, final PrintWriter printWriter, final boolean b) {
        if (b) {
            printWriter.print(s);
            printWriter.print("mName=");
            printWriter.print(this.l);
            printWriter.print(" mIndex=");
            printWriter.print(this.c);
            printWriter.print(" mCommitted=");
            printWriter.println(this.b);
            if (this.i != 0) {
                printWriter.print(s);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.i));
            }
            if (this.e != 0 || this.f != 0) {
                printWriter.print(s);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.e));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f));
            }
            if (this.g != 0 || this.h != 0) {
                printWriter.print(s);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.g));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.h));
            }
            if (this.m != 0 || this.n != null) {
                printWriter.print(s);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.m));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.n);
            }
            if (this.o != 0 || this.p != null) {
                printWriter.print(s);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.o));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.p);
            }
        }
        if (!this.d.isEmpty()) {
            printWriter.print(s);
            printWriter.println("Operations:");
            for (int size = this.d.size(), i = 0; i < size; ++i) {
                final cs cs = this.d.get(i);
                String string = null;
                switch (cs.a) {
                    default: {
                        final StringBuilder sb = new StringBuilder("cmd=");
                        sb.append(cs.a);
                        string = sb.toString();
                        break;
                    }
                    case 10: {
                        string = "OP_SET_MAX_LIFECYCLE";
                        break;
                    }
                    case 9: {
                        string = "UNSET_PRIMARY_NAV";
                        break;
                    }
                    case 8: {
                        string = "SET_PRIMARY_NAV";
                        break;
                    }
                    case 7: {
                        string = "ATTACH";
                        break;
                    }
                    case 6: {
                        string = "DETACH";
                        break;
                    }
                    case 5: {
                        string = "SHOW";
                        break;
                    }
                    case 4: {
                        string = "HIDE";
                        break;
                    }
                    case 3: {
                        string = "REMOVE";
                        break;
                    }
                    case 2: {
                        string = "REPLACE";
                        break;
                    }
                    case 1: {
                        string = "ADD";
                        break;
                    }
                    case 0: {
                        string = "NULL";
                        break;
                    }
                }
                printWriter.print(s);
                printWriter.print("  Op #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.print(string);
                printWriter.print(" ");
                printWriter.println(cs.b);
                if (b) {
                    if (cs.d != 0 || cs.e != 0) {
                        printWriter.print(s);
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(cs.d));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(cs.e));
                    }
                    if (cs.f != 0 || cs.g != 0) {
                        printWriter.print(s);
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(cs.f));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(cs.g));
                    }
                }
            }
        }
    }
    
    public final boolean i(final ArrayList list, final ArrayList list2) {
        if (cl.W(2)) {
            new StringBuilder("Run: ").append(this);
        }
        list.add(this);
        list2.add(false);
        if (this.j) {
            final cl a = this.a;
            if (a.b == null) {
                a.b = new ArrayList();
            }
            a.b.add(this);
        }
        return true;
    }
    
    public final boolean j() {
        return this.d.isEmpty();
    }
    
    public final void k() {
        this.b(true);
    }
    
    public final void l(final br br) {
        final cl z = br.z;
        if (z != null && z != this.a) {
            final StringBuilder sb = new StringBuilder("Cannot detach Fragment attached to a different FragmentManager. Fragment ");
            sb.append(br.toString());
            sb.append(" is already attached to a FragmentManager.");
            throw new IllegalStateException(sb.toString());
        }
        this.p(new cs(6, br));
    }
    
    public final void m(final br br) {
        final cl z = br.z;
        if (z != null && z != this.a) {
            final StringBuilder sb = new StringBuilder("Cannot hide Fragment attached to a different FragmentManager. Fragment ");
            sb.append(br.toString());
            sb.append(" is already attached to a FragmentManager.");
            throw new IllegalStateException(sb.toString());
        }
        this.p(new cs(4, br));
    }
    
    public final void n(final br br) {
        final cl z = br.z;
        if (z != null && z != this.a) {
            final StringBuilder sb = new StringBuilder("Cannot remove Fragment attached to a different FragmentManager. Fragment ");
            sb.append(br.toString());
            sb.append(" is already attached to a FragmentManager.");
            throw new IllegalStateException(sb.toString());
        }
        this.p(new cs(3, br));
    }
    
    public final void o(final br br) {
        final cl z = br.z;
        if (z != null && z != this.a) {
            final StringBuilder sb = new StringBuilder("Cannot show Fragment attached to a different FragmentManager. Fragment ");
            sb.append(br.toString());
            sb.append(" is already attached to a FragmentManager.");
            throw new IllegalStateException(sb.toString());
        }
        this.p(new cs(5, br));
    }
    
    public final String toString() {
        final StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.c >= 0) {
            sb.append(" #");
            sb.append(this.c);
        }
        if (this.l != null) {
            sb.append(" ");
            sb.append(this.l);
        }
        sb.append("}");
        return sb.toString();
    }
}
