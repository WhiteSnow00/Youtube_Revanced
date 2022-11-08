import java.util.Collections;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class etk implements rdz
{
    public static final Set a;
    
    static {
        final HashSet set = new HashSet(rkw.b);
        set.add("https://www.googleapis.com/auth/accounts.reauth");
        set.add("https://www.googleapis.com/auth/assistant-sdk-prototype");
        set.add("https://www.googleapis.com/auth/peopleapi.readonly");
        set.add("https://www.googleapis.com/auth/photos.image.readonly");
        a = Collections.unmodifiableSet((Set<?>)set);
    }
    
    public final Set a() {
        return etk.a;
    }
}
