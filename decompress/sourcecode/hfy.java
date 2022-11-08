// 
// Decompiled by Procyon v0.6.0
// 

final class hfy implements adif
{
    public hfy() {
    }
    
    private static void c(final String s) {
        zjp.b(zjo.b, zjn.f, "[ShortsCreation][Android][Upload]".concat(s));
    }
    
    public final void a(final String s) {
        final StringBuilder sb = new StringBuilder("Current executing flow failed for ");
        sb.append(s);
        sb.append(".");
        c(sb.toString());
    }
    
    public final void b(final String s) {
        final StringBuilder sb = new StringBuilder("Upload creation failed for ");
        sb.append(s);
        sb.append(".");
        c(sb.toString());
    }
}
