// 
// Decompiled by Procyon v0.6.0
// 

public enum abhl
{
    a("MEDIASESSION", 0, "YTPL.mediasession"), 
    b("AUDIOMANAGER", 1, "YTPL.audiomanager");
    
    public final String c;
    
    private abhl(final String s, final int n, final String c) {
        this.c = c;
    }
    
    @Override
    public final String toString() {
        return this.c;
    }
}
