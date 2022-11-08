// 
// Decompiled by Procyon v0.6.0
// 

package androidx.window;

public final class WindowProperties
{
    public static final WindowProperties INSTANCE;
    public static final String PROPERTY_ACTIVITY_EMBEDDING_ALLOW_SYSTEM_OVERRIDE = "android.window.PROPERTY_ACTIVITY_EMBEDDING_ALLOW_SYSTEM_OVERRIDE";
    
    static {
        INSTANCE = new WindowProperties();
    }
    
    private WindowProperties() {
    }
}
