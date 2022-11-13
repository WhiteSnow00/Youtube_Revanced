// 
// Decompiled by Procyon v0.6.0
// 

public final class arlq implements arls
{
    private atke a;
    
    public static void b(final atke atke, final atke a) {
        a.getClass();
        final arlq arlq = (arlq)atke;
        if (arlq.a == null) {
            arlq.a = a;
            return;
        }
        throw new IllegalStateException();
    }
    
    public final Object a() {
        final atke a = this.a;
        if (a != null) {
            return a.a();
        }
        throw new IllegalStateException();
    }
}
