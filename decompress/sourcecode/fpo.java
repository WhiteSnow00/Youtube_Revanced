// 
// Decompiled by Procyon v0.6.0
// 

public final class fpo
{
    public final CharSequence a;
    private final int b;
    
    public fpo(final CharSequence a, final int b) {
        a.getClass();
        this.a = a;
        this.b = b;
    }
    
    public static fpo a(final CharSequence charSequence) {
        return new fpo(charSequence, 0);
    }
    
    public final aexq b() {
        final int b = this.b;
        Object o;
        if (b > 0) {
            o = aexq.k(b);
        }
        else {
            o = aewp.a;
        }
        return (aexq)o;
    }
    
    @Override
    public final String toString() {
        final CharSequence a = this.a;
        final int b = this.b;
        String string;
        if (b > 0) {
            string = Integer.toString(b);
        }
        else {
            string = "None";
        }
        return String.format("PlayerToast[Text=%s, durationMs=%s]", a, string);
    }
}
