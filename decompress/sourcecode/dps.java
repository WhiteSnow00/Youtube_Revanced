import java.util.Iterator;
import java.io.Closeable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dps extends ardh implements Closeable
{
    static {
        arfn.d(dps.class);
    }
    
    public dps(final ardi ardi, final dpq dpq) {
        this.t(ardi, ardi.c(), dpq);
    }
    
    public static byte[] b(final String s) {
        final byte[] array = new byte[4];
        if (s != null) {
            for (int i = 0; i < Math.min(4, s.length()); ++i) {
                array[i] = (byte)s.charAt(i);
            }
        }
        return array;
    }
    
    public final dqm a() {
        for (final dpu dpu : this.i()) {
            if (dpu instanceof dqm) {
                return (dqm)dpu;
            }
        }
        return null;
    }
    
    @Override
    public final void close() {
        this.r.close();
    }
    
    @Override
    public final String toString() {
        final String string = this.r.toString();
        final StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 7);
        sb.append("model(");
        sb.append(string);
        sb.append(")");
        return sb.toString();
    }
}
