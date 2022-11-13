import android.content.Intent;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dav extends dbj
{
    public Intent a;
    
    public dav() {
    }
    
    public dav(final Intent a) {
        this.a = a;
    }
    
    public dav(final dbb dbb) {
        super(dbb);
    }
    
    public dav(final String s) {
        super(s);
    }
    
    public dav(final String s, final Exception ex) {
        super(s, ex);
    }
    
    @Override
    public final String getMessage() {
        if (this.a != null) {
            return "User needs to (re)enter credentials.";
        }
        return super.getMessage();
    }
}
