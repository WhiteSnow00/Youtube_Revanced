import java.util.Arrays;
import java.nio.ByteBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arv
{
    private int a;
    private int b;
    private int c;
    private final boolean d;
    private final int[] e;
    private final bkh f;
    private bkh g;
    private bkh h;
    
    public arv(final bkh bkh, final boolean d, final int[] e, final byte[] array, final byte[] array2) {
        this.a = 1;
        this.f = bkh;
        this.g = bkh;
        this.d = d;
        this.e = e;
    }
    
    private static boolean e(final int n) {
        return n == 65039;
    }
    
    private final boolean f() {
        final chr e = ((art)this.g.b).e();
        final int a = e.a(6);
        if (a != 0 && ((ByteBuffer)e.b).get(a + e.a) != 0) {
            return true;
        }
        if (e(this.b)) {
            return true;
        }
        if (this.d) {
            if (this.e == null) {
                return true;
            }
            if (Arrays.binarySearch(this.e, ((art)this.g.b).a(0)) < 0) {
                return true;
            }
        }
        return false;
    }
    
    private final void g() {
        this.a = 1;
        this.g = this.f;
        this.c = 0;
    }
    
    public final int a(final int b) {
        final bkh m = this.g.m(b);
        final int a = this.a;
        int n = 1;
        Label_0167: {
            if (a != 2) {
                if (m == null) {
                    this.g();
                    break Label_0167;
                }
                this.a = 2;
                this.g = m;
                this.c = 1;
            }
            else if (m != null) {
                this.g = m;
                ++this.c;
            }
            else {
                if (b == 65038) {
                    this.g();
                    break Label_0167;
                }
                if (!e(b)) {
                    final bkh g = this.g;
                    if (g.b != null) {
                        if (this.c == 1) {
                            if (!this.f()) {
                                this.g();
                                break Label_0167;
                            }
                            this.h = this.g;
                            this.g();
                        }
                        else {
                            this.h = g;
                            this.g();
                        }
                        n = 3;
                        break Label_0167;
                    }
                    this.g();
                    break Label_0167;
                }
            }
            n = 2;
        }
        this.b = b;
        return n;
    }
    
    public final art b() {
        return (art)this.g.b;
    }
    
    final art c() {
        return (art)this.h.b;
    }
    
    public final boolean d() {
        final int a = this.a;
        boolean b2;
        final boolean b = b2 = false;
        if (a == 2) {
            b2 = b;
            if (this.g.b != null) {
                if (this.c <= 1) {
                    if (this.f()) {
                        return true;
                    }
                    b2 = b;
                }
                else {
                    b2 = true;
                }
            }
        }
        return b2;
    }
}
