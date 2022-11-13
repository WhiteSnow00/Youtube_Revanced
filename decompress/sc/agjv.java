import java.util.Iterator;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

final class agjv extends agiy
{
    private final Set a;
    private final Set b;
    private final Set c;
    private final agjc d;
    
    public agjv(final agjb agjb, final agjc d) {
        final HashSet set = new HashSet();
        final HashSet set2 = new HashSet();
        final HashSet set3 = new HashSet();
        final HashSet set4 = new HashSet();
        final HashSet set5 = new HashSet();
        for (final agjk agjk : agjb.b) {
            if (agjk.e()) {
                if (agjk.f()) {
                    set4.add(agjk.a);
                }
                else {
                    set.add(agjk.a);
                }
            }
            else if (agjk.f()) {
                set5.add(agjk.a);
            }
            else {
                set2.add(agjk.a);
            }
        }
        if (!agjb.e.isEmpty()) {
            set.add(agko.class);
        }
        this.a = Collections.unmodifiableSet((Set<?>)set);
        this.b = Collections.unmodifiableSet((Set<?>)set2);
        Collections.unmodifiableSet((Set<?>)set3);
        this.c = Collections.unmodifiableSet((Set<?>)set4);
        Collections.unmodifiableSet((Set<?>)set5);
        final Set e = agjb.e;
        this.d = d;
    }
    
    @Override
    public final Object a(final Class clazz) {
        if (!this.a.contains(clazz)) {
            throw new agjm(String.format("Attempting to request an undeclared dependency %s.", clazz));
        }
        final Object a = this.d.a(clazz);
        if (!clazz.equals(agko.class)) {
            return a;
        }
        final agko agko = (agko)a;
        return new agju();
    }
    
    @Override
    public final Set b(final Class clazz) {
        if (this.c.contains(clazz)) {
            return (Set)((agiy)this.d).d(clazz).a();
        }
        throw new agjm(String.format("Attempting to request an undeclared dependency Set<%s>.", clazz));
    }
    
    public final aglh c(final Class clazz) {
        if (this.b.contains(clazz)) {
            return this.d.c(clazz);
        }
        throw new agjm(String.format("Attempting to request an undeclared dependency Provider<%s>.", clazz));
    }
    
    public final aglh d(final Class clazz) {
        throw null;
    }
}
