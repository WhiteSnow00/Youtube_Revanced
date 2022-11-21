import sun.misc.Unsafe;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afuz
{
    public static boolean a(final Unsafe unsafe, final Object o, final long n, final Object o2, final Object o3) {
        while (!unsafe.compareAndSwapObject(o, n, o2, o3)) {
            if (unsafe.getObject(o, n) != o2) {
                return false;
            }
        }
        return true;
    }
}
