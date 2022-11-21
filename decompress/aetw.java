// 
// Decompiled by Procyon v0.6.0
// 

final class aetw extends IllegalStateException
{
    public aetw(final String s) {
        super(a(null, s));
    }
    
    public aetw(final String s, final String s2, final Throwable t) {
        super(a(s, s2), t);
    }
    
    private static String a(String concat, final String s) {
        if (concat == null) {
            concat = "";
        }
        else {
            concat = ": ".concat(concat);
        }
        final StringBuilder sb = new StringBuilder("Starting new trace ");
        sb.append(s);
        sb.append(" when already associated with a trace");
        sb.append(concat);
        sb.append(". For more help, see http://go/tiktok-tracing#fixing-duplicate-trace-issues");
        return sb.toString();
    }
}
