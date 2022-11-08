import java.util.WeakHashMap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class odr
{
    public static final WeakHashMap a;
    
    static {
        a = new WeakHashMap();
    }
    
    public static void a(final Thread thread) {
        final Thread.State state = thread.getState();
        if (state == Thread.State.NEW) {
            final WeakHashMap a = odr.a;
            synchronized (a) {
                a.put(thread, true);
                return;
            }
        }
        final String value = String.valueOf(thread);
        final String value2 = String.valueOf(state);
        final StringBuilder sb = new StringBuilder("This method can only be applied to threads that have been created but not yet started, and ");
        sb.append(value);
        sb.append(" was in state ");
        sb.append(value2);
        throw new IllegalArgumentException(sb.toString());
    }
}
