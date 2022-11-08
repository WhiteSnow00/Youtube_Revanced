import java.util.concurrent.atomic.AtomicReferenceArray;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atvg
{
    public volatile AtomicReferenceArray array;
    
    public atvg(final int n) {
        this.array = new AtomicReferenceArray(n);
    }
    
    public final Object a(final int n) {
        final AtomicReferenceArray array = this.array;
        if (n < array.length()) {
            return array.get(n);
        }
        return null;
    }
    
    public final void b(final int n, final Object o) {
        final AtomicReferenceArray array = this.array;
        final int length = array.length();
        if (n < length) {
            array.set(n, o);
            return;
        }
        final AtomicReferenceArray array2 = new AtomicReferenceArray<Object>(atnp.d(n + 1, length + length));
        for (int i = 0; i < length; ++i) {
            array2.set(i, array.get(i));
        }
        array2.set(n, o);
        this.array = array2;
    }
}
