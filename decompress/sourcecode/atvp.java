import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atvp
{
    public atvp() {
        auet.i();
    }
    
    public static final int b(final int n) {
        return Integer.highestOneBit(atnp.d(n, 1) * 3);
    }
    
    public static final int c(final int n) {
        return Integer.numberOfLeadingZeros(n) + 1;
    }
}
