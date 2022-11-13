import java.util.HashSet;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class dvq
{
    private static final HashSet a;
    
    static {
        final HashSet a2 = new HashSet();
        (a = a2).add("_changeset");
        a2.add("_firstlayout");
    }
    
    public dvq() {
        new HashSet();
        new HashSet();
    }
    
    public static boolean b(final dvq dvq) {
        return dvq != null && dvq.a();
    }
    
    protected abstract boolean a();
}
