// 
// Decompiled by Procyon v0.6.0
// 

public abstract class atlq
{
    public abstract int a();
    
    public final boolean c(final auna[] array) {
        final int a = this.a();
        final int length = array.length;
        if (length != a) {
            final StringBuilder sb = new StringBuilder("parallelism = ");
            sb.append(a);
            sb.append(", subscribers = ");
            sb.append(length);
            final IllegalArgumentException ex = new IllegalArgumentException(sb.toString());
            for (int i = 0; i < length; ++i) {
                atkt.f((Throwable)ex, array[i]);
            }
            return false;
        }
        return true;
    }
}
