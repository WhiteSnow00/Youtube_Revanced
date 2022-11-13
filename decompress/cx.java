import java.io.Writer;

// 
// Decompiled by Procyon v0.6.0
// 

final class cx extends Writer
{
    private final StringBuilder a;
    
    public cx() {
        this.a = new StringBuilder(128);
    }
    
    private final void a() {
        if (this.a.length() > 0) {
            this.a.toString();
            final StringBuilder a = this.a;
            a.delete(0, a.length());
        }
    }
    
    @Override
    public final void close() {
        this.a();
    }
    
    @Override
    public final void flush() {
        this.a();
    }
    
    @Override
    public final void write(final char[] array, final int n, final int n2) {
        for (int i = 0; i < n2; ++i) {
            final char c = array[n + i];
            if (c == '\n') {
                this.a();
            }
            else {
                this.a.append(c);
            }
        }
    }
}
