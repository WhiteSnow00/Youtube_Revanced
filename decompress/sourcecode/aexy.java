import java.util.Random;

// 
// Decompiled by Procyon v0.6.0
// 

final class aexy extends Random
{
    private static final long serialVersionUID = 898001275432099254L;
    private final boolean a;
    
    public aexy() {
        this.a = true;
    }
    
    @Override
    public final void setSeed(final long seed) {
        if (!this.a) {
            super.setSeed(seed);
            return;
        }
        throw new UnsupportedOperationException("Setting the seed on the shared Random object is not permitted");
    }
}
