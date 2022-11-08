import java.util.Iterator;
import java.util.HashSet;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

abstract class auit implements auiv
{
    private volatile String[] a;
    
    public auit() {
    }
    
    public final void d(final Set set) {
        if (this.a == null) {
            final String[] c = this.c();
            final int length = c.length;
            int n = Integer.MAX_VALUE;
            String s = null;
            int length2;
            for (int i = 0; i < length; ++i, n = length2) {
                final String s2 = c[i];
                if (s2.length() < (length2 = n)) {
                    length2 = s2.length();
                    s = s2;
                }
            }
            final HashSet set2 = new HashSet();
            for (final auiv auiv : set) {
                if (auiv != null) {
                    for (final String s3 : auiv.c()) {
                        if (s3.length() > n || (s3.equalsIgnoreCase(s) && !s3.equals(s))) {
                            set2.add(s3);
                        }
                    }
                }
            }
            this.a = (String[])set2.toArray(new String[set2.size()]);
        }
    }
}
