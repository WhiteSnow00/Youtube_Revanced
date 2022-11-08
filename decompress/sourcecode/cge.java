import java.util.Collection;
import java.util.ArrayList;
import android.os.Bundle;
import java.util.LinkedHashSet;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cge implements cgg
{
    public final Set a;
    
    public cge(final cgh cgh) {
        this.a = new LinkedHashSet();
        cgh.c("androidx.savedstate.Restarter", (cgg)this);
    }
    
    public final Bundle a() {
        final Bundle bundle = new Bundle();
        bundle.putStringArrayList("classes_to_restore", new ArrayList(this.a));
        return bundle;
    }
}
