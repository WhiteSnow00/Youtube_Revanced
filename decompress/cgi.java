import java.util.Collection;
import java.util.ArrayList;
import android.os.Bundle;
import java.util.LinkedHashSet;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cgi implements cgk
{
    public final Set a;
    
    public cgi(final cgl cgl) {
        this.a = new LinkedHashSet();
        cgl.c("androidx.savedstate.Restarter", this);
    }
    
    @Override
    public final Bundle a() {
        final Bundle bundle = new Bundle();
        bundle.putStringArrayList("classes_to_restore", new ArrayList(this.a));
        return bundle;
    }
}
