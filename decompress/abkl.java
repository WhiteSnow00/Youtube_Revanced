// 
// Decompiled by Procyon v0.6.0
// 

public enum abkl
{
    a("MEDIASESSION", 0, "YTPL.mediasession"), 
    b("AUDIOMANAGER", 1, "YTPL.audiomanager");
    
    private static final abkl[] d;
    public final String c;
    
    private abkl(final String s, final int n, final String c) {
        this.c = c;
    }
    
    @Override
    public final String toString() {
        return this.c;
    }
}
