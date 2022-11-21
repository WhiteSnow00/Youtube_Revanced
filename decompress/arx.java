import java.util.Arrays;
import java.nio.ByteBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arx
{
    private int a;
    private int b;
    private int c;
    private final boolean d;
    private final int[] e;
    private final bkl f;
    private bkl g;
    private bkl h;
    
    public arx(final bkl bkl, final boolean d, final int[] e, final byte[] array, final byte[] array2) {
        this.a = 1;
        this.f = bkl;
        this.g = bkl;
        this.d = d;
        this.e = e;
    }
    
    private static boolean e(final int n) {
        return n == 65039;
    }
    
    private final boolean f() {
        final chv e = ((arv)this.g.b).e();
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
            if (Arrays.binarySearch(this.e, ((arv)this.g.b).a(0)) < 0) {
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
        final bkl m = this.g.m(b);
        final int a = this.a;
        int n = 1;
        Label_0172: {
            if (a != 2) {
                if (m == null) {
                    this.g();
                    break Label_0172;
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
                    break Label_0172;
                }
                if (!e(b)) {
                    final bkl g = this.g;
                    if (g.b != null) {
                        if (this.c == 1) {
                            if (!this.f()) {
                                this.g();
                                break Label_0172;
                            }
                            this.h = this.g;
                            this.g();
                        }
                        else {
                            this.h = g;
                            this.g();
                        }
                        n = 3;
                        break Label_0172;
                    }
                    this.g();
                    break Label_0172;
                }
            }
            n = 2;
        }
        this.b = b;
        return n;
    }
    
    public final arv b() {
        return (arv)this.g.b;
    }
    
    final arv c() {
        return (arv)this.h.b;
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
