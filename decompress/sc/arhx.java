import android.util.Log;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arhx extends aric
{
    final String a;
    
    public arhx(final String a) {
        this.a = a;
    }
    
    public final void a(final String s) {
        String.valueOf(this.a).length();
        String.valueOf(s).length();
    }
    
    public final void b(final String s) {
        final String a = this.a;
        final StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 1 + String.valueOf(s).length());
        sb.append(a);
        sb.append(":");
        sb.append(s);
        Log.e("isoparser", sb.toString());
    }
    
    public final void c(final String s) {
        final String a = this.a;
        final StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 1 + String.valueOf(s).length());
        sb.append(a);
        sb.append(":");
        sb.append(s);
        Log.w("isoparser", sb.toString());
    }
}
