import java.util.Arrays;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class bam
{
    private final String[] a;
    private boolean b;
    private boolean c;
    
    public bam(final String... a) {
        this.a = a;
    }
    
    protected abstract void a(final String p0);
    
    public final boolean b() {
        monitorenter(this);
        try {
            if (this.b) {
                final boolean c = this.c;
                monitorexit(this);
                return c;
            }
            this.b = true;
            try {
                final String[] a = this.a;
                for (int length = a.length, i = 0; i < length; ++i) {
                    this.a(a[i]);
                }
                this.c = true;
            }
            catch (final UnsatisfiedLinkError unsatisfiedLinkError) {
                baq.c("LibraryLoader", "Failed to load ".concat(String.valueOf(Arrays.toString(this.a))));
            }
            final boolean c2 = this.c;
            monitorexit(this);
            return c2;
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
}
