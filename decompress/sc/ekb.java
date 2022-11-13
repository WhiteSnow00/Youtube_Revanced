import java.util.Iterator;
import java.util.Collection;
import java.util.List;
import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ekb implements eka
{
    public final String a;
    public final ArrayList b;
    
    public ekb(final String a, final List list) {
        this.a = a;
        (this.b = new ArrayList()).addAll(list);
    }
    
    public final eka d() {
        return (eka)this;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ekb)) {
            return false;
        }
        final ekb ekb = (ekb)o;
        final String a = this.a;
        if (a != null) {
            if (a.equals(ekb.a)) {
                return this.b.equals(ekb.b);
            }
        }
        else if (ekb.a == null) {
            return this.b.equals(ekb.b);
        }
        return false;
    }
    
    public final Boolean g() {
        throw new IllegalStateException("Statement cannot be cast as Boolean");
    }
    
    public final Double h() {
        throw new IllegalStateException("Statement cannot be cast as Double");
    }
    
    @Override
    public final int hashCode() {
        final String a = this.a;
        int hashCode;
        if (a != null) {
            hashCode = a.hashCode();
        }
        else {
            hashCode = 0;
        }
        return hashCode * 31 + this.b.hashCode();
    }
    
    public final String i() {
        throw new IllegalStateException("Statement cannot be cast as String");
    }
    
    public final Iterator l() {
        return null;
    }
    
    public final eka lA(final String s, final hyx hyx, final List list) {
        throw new IllegalStateException("Statement is not an evaluated entity");
    }
}
