import java.util.Arrays;
import java.util.Collections;
import java.util.Collection;
import java.util.ArrayList;
import java.util.List;
import android.os.Bundle;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ccj
{
    public static final ccj a;
    public final Bundle b;
    public List c;
    
    static {
        a = new ccj(new Bundle(), null);
    }
    
    public ccj(final Bundle b, final List c) {
        this.b = b;
        this.c = c;
    }
    
    public static ccj a(final Bundle bundle) {
        if (bundle != null) {
            return new ccj(bundle, null);
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
        if (o instanceof ccj) {
            final ccj ccj = (ccj)o;
            this.c();
            ccj.c();
            return this.c.equals(ccj.c);
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
