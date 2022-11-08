// 
// Decompiled by Procyon v0.6.0
// 

public final class aajr extends wyy
{
    private final String b;
    
    public aajr(final String b, final wzd wzd) {
        super("prebuffer", wzd);
        this.b = b;
    }
    
    public final eol b() {
        this.g("mod_trans", this.b);
        return super.b();
    }
}
