import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.BitSet;
import android.app.ActivityManager;
import java.util.LinkedHashSet;
import java.util.ArrayList;
import java.util.Set;
import android.content.Context;
import java.util.concurrent.Executor;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cfs
{
    public final List a;
    public Executor b;
    public cgp c;
    public boolean d;
    public boolean e;
    public boolean f;
    private final Context g;
    private final Class h;
    private final String i;
    private final List j;
    private final List k;
    private Executor l;
    private final Set m;
    private Set n;
    private final avu o;
    
    public cfs(final Context g, final Class h, final String i) {
        this.g = g;
        this.h = h;
        this.i = i;
        this.a = new ArrayList();
        this.j = new ArrayList();
        this.k = new ArrayList();
        this.e = true;
        this.o = new avu((char[])null);
        this.m = new LinkedHashSet();
    }
    
    public final cft a() {
        final Executor b = this.b;
        if (b == null && this.l == null) {
            final Executor a = rs.a;
            this.l = a;
            this.b = a;
        }
        else if (b != null && this.l == null) {
            this.l = b;
        }
        else if (b == null) {
            this.b = this.l;
        }
        final Set n = this.n;
        if (n != null) {
            final Iterator iterator = n.iterator();
            while (iterator.hasNext()) {
                final int intValue = ((Number)iterator.next()).intValue();
                if (this.m.contains(intValue) ^ true) {
                    continue;
                }
                final StringBuilder sb = new StringBuilder("Inconsistency detected. A Migration was supplied to addMigration(Migration... migrations) that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(int... startVersions). Start version: ");
                sb.append(intValue);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        Object c;
        if ((c = this.c) == null) {
            c = new cha();
        }
        final Context g = this.g;
        final String i = this.i;
        final avu o = this.o;
        final List a2 = this.a;
        final boolean d = this.d;
        final Object systemService = g.getSystemService("activity");
        systemService.getClass();
        int n2;
        if (!((ActivityManager)systemService).isLowRamDevice()) {
            n2 = 3;
        }
        else {
            n2 = 2;
        }
        final Executor b2 = this.b;
        if (b2 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        final Executor l = this.l;
        if (l == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        final cfo cfo = new cfo(g, i, (cgp)c, o, a2, d, n2, b2, l, this.e, this.f, this.m, this.j, this.k, null, null, null);
        final cft cft = (cft)bsb.e(this.h);
        cft.c = cft.b(cfo);
        final Set g2 = cft.g();
        final BitSet set = new BitSet();
        final Iterator iterator2 = g2.iterator();
        while (true) {
            final boolean hasNext = iterator2.hasNext();
            final int n3 = -1;
            if (hasNext) {
                final Class clazz = (Class)iterator2.next();
                final int n4 = cfo.l.size() - 1;
                int n5 = n3;
                if (n4 >= 0) {
                    n5 = n4;
                    while (true) {
                        final int n6 = n5 - 1;
                        if (clazz.isAssignableFrom(cfo.l.get(n5).getClass())) {
                            set.set(n5);
                            break;
                        }
                        if (n6 < 0) {
                            n5 = n3;
                            break;
                        }
                        n5 = n6;
                    }
                }
                if (n5 < 0) {
                    final StringBuilder sb2 = new StringBuilder("A required auto migration spec (");
                    sb2.append(clazz.getCanonicalName());
                    sb2.append(") is missing in the database configuration.");
                    throw new IllegalArgumentException(sb2.toString());
                }
                cft.g.put(clazz, cfo.l.get(n5));
            }
            else {
                int n7 = cfo.l.size() - 1;
                if (n7 >= 0) {
                    while (true) {
                        final int n8 = n7 - 1;
                        if (!set.get(n7)) {
                            throw new IllegalArgumentException("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.");
                        }
                        if (n8 < 0) {
                            break;
                        }
                        n7 = n8;
                    }
                }
                final Iterator iterator3 = cft.e(cft.g).iterator();
                boolean g3;
                while (true) {
                    final boolean hasNext2 = iterator3.hasNext();
                    g3 = false;
                    if (!hasNext2) {
                        break;
                    }
                    final cfz cfz = (cfz)iterator3.next();
                    final avu n9 = cfo.n;
                    final int a3 = cfz.a;
                    final int b3 = cfz.b;
                    final Object a4 = n9.a;
                    final Integer value = a3;
                    if (((Map)a4).containsKey(value)) {
                        Object a5;
                        if ((a5 = ((Map)a4).get(value)) == null) {
                            a5 = atld.a;
                        }
                        if (((Map)a5).containsKey(b3)) {
                            continue;
                        }
                    }
                    cfo.n.g(new cfz[] { cfz });
                }
                if (cft.q(cfw.class, cft.c()) != null) {
                    throw null;
                }
                if (cft.q(cfn.class, cft.c()) == null) {
                    if (cfo.m == 3) {
                        g3 = true;
                    }
                    final cgz cgz = (cgz)cft.c();
                    if (cgz.f.b()) {
                        cdk.c(cgz.b(), g3);
                    }
                    cgz.g = g3;
                    cft.f = cfo.d;
                    cft.b = cfo.f;
                    new cso(cfo.g, 1, (byte[])null);
                    cft.e = cfo.e;
                    final Map f = cft.f();
                    final BitSet set2 = new BitSet();
                    for (final Map.Entry<Class, V> entry : f.entrySet()) {
                        final Class clazz2 = entry.getKey();
                        for (final Class clazz3 : (List)entry.getValue()) {
                            int n10 = cfo.k.size() - 1;
                            Label_1051: {
                                if (n10 >= 0) {
                                    while (true) {
                                        final int n11 = n10 - 1;
                                        if (clazz3.isAssignableFrom(cfo.k.get(n10).getClass())) {
                                            set2.set(n10);
                                            break Label_1051;
                                        }
                                        if (n11 < 0) {
                                            break;
                                        }
                                        n10 = n11;
                                    }
                                }
                                n10 = -1;
                            }
                            if (n10 < 0) {
                                final StringBuilder sb3 = new StringBuilder("A required type converter (");
                                sb3.append(clazz3);
                                sb3.append(") for ");
                                sb3.append(clazz2.getCanonicalName());
                                sb3.append(" is missing in the database configuration.");
                                throw new IllegalArgumentException(sb3.toString());
                            }
                            cft.h.put(clazz3, cfo.k.get(n10));
                        }
                    }
                    int n12 = cfo.k.size() - 1;
                    if (n12 >= 0) {
                        while (true) {
                            final int n13 = n12 - 1;
                            if (!set2.get(n12)) {
                                final Object value2 = cfo.k.get(n12);
                                final StringBuilder sb4 = new StringBuilder("Unexpected type converter ");
                                sb4.append(value2);
                                sb4.append(". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder.");
                                throw new IllegalArgumentException(sb4.toString());
                            }
                            if (n13 < 0) {
                                break;
                            }
                            n12 = n13;
                        }
                    }
                    return cft;
                }
                throw null;
            }
        }
    }
    
    public final void b(final cfz... array) {
        final Set n = this.n;
        int i;
        final int n2 = i = 0;
        if (n == null) {
            this.n = new HashSet();
            i = n2;
        }
        while (i <= 0) {
            final cfz cfz = array[i];
            final Set n3 = this.n;
            n3.getClass();
            n3.add(cfz.a);
            final Set n4 = this.n;
            n4.getClass();
            n4.add(cfz.b);
            ++i;
        }
        this.o.g((cfz[])Arrays.copyOf(array, 1));
    }
}
