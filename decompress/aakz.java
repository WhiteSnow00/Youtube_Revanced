import java.security.NoSuchAlgorithmException;
import java.security.MessageDigest;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aakz implements aala
{
    int a;
    private final MessageDigest b;
    private final boolean c;
    
    public aakz(final boolean c) {
        this.a = 0;
        try {
            (this.b = MessageDigest.getInstance("SHA-256")).reset();
            this.c = c;
        }
        catch (final NoSuchAlgorithmException ex) {
            throw new IllegalStateException(ex);
        }
    }
    
    @Override
    public final int a() {
        final int a = this.a;
        if (a > 0) {
            final int c = aalc.c;
            return a - 1;
        }
        return 0;
    }
    
    @Override
    public final void b() {
        this.b.reset();
        this.a = 0;
    }
    
    @Override
    public final void c(final byte[] array, final int n, final int n2) {
        if (this.a == 0 && n2 > 0) {
            this.b.update(aalc.a);
            ++this.a;
        }
        this.b.update(array, n, n2);
        this.a += n2;
    }
    
    @Override
    public final byte[] d() {
        byte[] array;
        if (this.c) {
            array = aalc.e(this.b.digest());
        }
        else {
            array = this.b.digest();
        }
        return array;
    }
}
