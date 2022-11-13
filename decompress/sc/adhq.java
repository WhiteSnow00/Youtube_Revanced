import java.util.Iterator;
import android.util.Pair;
import java.util.ArrayList;
import java.util.List;
import android.os.Bundle;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adhq extends nbr
{
    final Bundle a;
    
    public adhq(final Bundle a) {
        this.a = a;
    }
    
    public final List ai() {
        final ArrayList list = new ArrayList();
        for (final String s : this.a.keySet()) {
            list.add(Pair.create((Object)s, (Object)this.a.getString(s, "")));
        }
        return list;
    }
}
