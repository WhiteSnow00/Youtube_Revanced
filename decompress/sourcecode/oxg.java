import android.net.Uri;

// 
// Decompiled by Procyon v0.6.0
// 

public final class oxg
{
    public final Uri a;
    
    public oxg(final Uri a) {
        this.a = a;
    }
    
    public final String a() {
        return this.a.getPath();
    }
    
    public final oxg b(final String s) {
        return new oxg(this.a.buildUpon().encodedPath(s).build());
    }
    
    @Override
    public final String toString() {
        return this.a.toString();
    }
}
