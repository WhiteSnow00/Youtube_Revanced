import java.security.SecureRandom;
import java.util.Random;

// 
// Decompiled by Procyon v0.6.0
// 

final class afbq extends Random
{
    private final boolean a;
    
    public afbq() {
        this.a = true;
    }
    
    static final SecureRandom a() {
        return afbr.c.get();
    }
    
    @Override
    protected final int next(final int n) {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public final boolean nextBoolean() {
        return a().nextBoolean();
    }
    
    @Override
    public final void nextBytes(final byte[] array) {
        a().nextBytes(array);
    }
    
    @Override
    public final double nextDouble() {
        return a().nextDouble();
    }
    
    @Override
    public final float nextFloat() {
        return a().nextFloat();
    }
    
    @Override
    public final double nextGaussian() {
        return a().nextGaussian();
    }
    
    @Override
    public final int nextInt() {
        return a().nextInt();
    }
    
    @Override
    public final int nextInt(final int n) {
        return a().nextInt(n);
    }
    
    @Override
    public final long nextLong() {
        return a().nextLong();
    }
    
    @Override
    public final void setSeed(final long seed) {
        if (!this.a) {
            super.setSeed(seed);
            return;
        }
        throw new UnsupportedOperationException("Setting the seed on a thread-local Random object is not permitted");
    }
}
