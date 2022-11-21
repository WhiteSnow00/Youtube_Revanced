import java.util.Arrays;
import java.security.NoSuchAlgorithmException;
import java.security.MessageDigest;
import java.util.ArrayDeque;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aalc
{
    static final byte[] a;
    static final byte[] b;
    public static final int c = 0;
    private final ArrayDeque d;
    private final MessageDigest e;
    private int f;
    private final boolean g;
    
    static {
        a = new byte[] { 0 };
        b = new byte[] { 1 };
    }
    
    public aalc() {
        this.d = new ArrayDeque();
        try {
            this.e = MessageDigest.getInstance("SHA-256");
            this.g = false;
        }
        catch (final NoSuchAlgorithmException ex) {
            throw new IllegalStateException(ex);
        }
    }
    
    public aalc(final boolean g) {
        this.d = new ArrayDeque();
        try {
            this.e = MessageDigest.getInstance("SHA-256");
            this.g = g;
        }
        catch (final NoSuchAlgorithmException ex) {
            throw new IllegalStateException(ex);
        }
    }
    
    public static aala a(final boolean b) {
        return new aakz(b);
    }
    
    static byte[] e(final byte[] array) {
        return Arrays.copyOf(array, 10);
    }
    
    private final void f() {
        while (this.d.size() >= 2) {
            final aasq aasq = this.d.pop();
            final aasq aasq2 = this.d.pop();
            if (aasq.a != aasq2.a) {
                this.d.push(aasq2);
                this.d.push(aasq);
                return;
            }
            this.e.reset();
            this.e.update(aalc.b);
            this.e.update((byte[])aasq2.b);
            this.e.update((byte[])aasq.b);
            final byte[] digest = this.e.digest();
            final ArrayDeque d = this.d;
            final int a = aasq2.a;
            byte[] e = digest;
            if (this.g) {
                e = e(digest);
            }
            d.push(new aasq(a + 1, e));
        }
    }
    
    public final void b(final byte[] array) {
        this.d.push(new aasq(0, array));
        ++this.f;
        this.f();
    }
    
    public final void c() {
        this.d.clear();
        this.f = 0;
    }
    
    public final byte[] d() {
        while (this.d.size() > 1) {
            final aasq aasq = this.d.peek();
            if (aasq != null) {
                ++aasq.a;
                this.f();
            }
        }
        final aasq aasq2 = this.d.peek();
        if (this.d.size() == 1 && aasq2 != null) {
            return (byte[])aasq2.b;
        }
        this.e.reset();
        byte[] array;
        if (this.g) {
            array = e(this.e.digest());
        }
        else {
            array = this.e.digest();
        }
        return array;
    }
}
