import com.google.android.apps.youtube.app.extensions.accountlinking.PlayBilling;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gqj extends Exception
{
    public final String a;
    
    public gqj(final String s, final int n, final int n2) {
        this(s, PlayBilling.i(n, n2));
    }
    
    public gqj(final String s, final String a) {
        super(s);
        this.a = a;
    }
}
