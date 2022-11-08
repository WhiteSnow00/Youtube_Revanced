import java.util.Iterator;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

final class aghu extends aggx
{
    private final Set a;
    private final Set b;
    private final Set c;
    private final aghb d;
    
    public aghu(final agha agha, final aghb d) {
        final HashSet set = new HashSet();
        final HashSet set2 = new HashSet();
        final HashSet set3 = new HashSet();
        final HashSet set4 = new HashSet();
        final HashSet set5 = new HashSet();
        for (final aghi aghi : agha.b) {
            if (aghi.e()) {
                if (aghi.f()) {
                    set4.add(aghi.a);
                }
                else {
                    set.add(aghi.a);
                }
            }
            else if (aghi.f()) {
                set5.add(aghi.a);
            }
            else {
                set2.add(aghi.a);
            }
        }
        if (!agha.e.isEmpty()) {
            set.add(agin.class);
        }
        this.a = Collections.unmodifiableSet((Set<?>)set);
        this.b = Collections.unmodifiableSet((Set<?>)set2);
        Collections.unmodifiableSet((Set<?>)set3);
        this.c = Collections.unmodifiableSet((Set<?>)set4);
        Collections.unmodifiableSet((Set<?>)set5);
        final Set e = agha.e;
        this.d = d;
    }
    
    public final Object a(final Class clazz) {
        if (!this.a.contains(clazz)) {
            throw new aghk(String.format("Attempting to request an undeclared dependency %s.", clazz));
        }
        final Object a = this.d.a(clazz);
        if (!clazz.equals(agin.class)) {
            return a;
        }
        final agin agin = (agin)a;
        return new aght();
    }
    
    public final Set b(final Class clazz) {
        if (this.c.contains(clazz)) {
            return (Set)((aggx)this.d).d(clazz).a();
        }
        throw new aghk(String.format("Attempting to request an undeclared dependency Set<%s>.", clazz));
    }
    
    public final agjg c(final Class clazz) {
        if (this.b.contains(clazz)) {
            return this.d.c(clazz);
        }
        throw new aghk(String.format("Attempting to request an undeclared dependency Provider<%s>.", clazz));
    }
    
    public final agjg d(final Class clazz) {
        throw null;
    }
}
