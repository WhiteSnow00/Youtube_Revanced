import java.util.Arrays;
import java.util.Collections;
import java.util.Collection;
import java.util.ArrayList;
import java.util.List;
import android.os.Bundle;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ccn
{
    public static final ccn a;
    public final Bundle b;
    public List c;
    
    static {
        a = new ccn(new Bundle(), null);
    }
    
    public ccn(final Bundle b, final List c) {
        this.b = b;
        this.c = c;
    }
    
    public static ccn a(final Bundle bundle) {
        if (bundle != null) {
            return new ccn(bundle, null);
        }
        return null;
    }
    
    public final List b() {
        this.c();
        return new ArrayList(this.c);
    }
    
    public final void c() {
        if (this.c == null) {
            final ArrayList stringArrayList = this.b.getStringArrayList("controlCategories");
            this.c = stringArrayList;
            if (stringArrayList == null || stringArrayList.isEmpty()) {
                this.c = Collections.emptyList();
            }
        }
    }
    
    public final boolean d() {
        this.c();
        return this.c.isEmpty();
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o instanceof ccn) {
            final ccn ccn = (ccn)o;
            this.c();
            ccn.c();
            return this.c.equals(ccn.c);
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        this.c();
        return this.c.hashCode();
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("MediaRouteSelector{ controlCategories=");
        sb.append(Arrays.toString(this.b().toArray()));
        sb.append(" }");
        return sb.toString();
    }
}
