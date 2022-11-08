import java.util.NoSuchElementException;
import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atkr extends atkq implements Iterator, atnq
{
    private final /* synthetic */ int d;
    
    public atkr(final atks atks, final int d) {
        this.d = d;
        super(atks);
    }
    
    public atkr(final atks atks, final int d, final byte[] array) {
        this.d = d;
        super(atks);
    }
    
    @Override
    public final Object next() {
        if (this.d != 0) {
            final int b = super.b;
            final atks a = super.a;
            if (b < a.d) {
                super.b = b + 1;
                super.c = b;
                final Object o = a.a[b];
                this.a();
                return o;
            }
            throw new NoSuchElementException();
        }
        else {
            final int b2 = super.b;
            final atks a2 = super.a;
            if (b2 < a2.d) {
                super.b = b2 + 1;
                super.c = b2;
                final Object[] b3 = a2.b;
                b3.getClass();
                final Object o2 = b3[b2];
                this.a();
                return o2;
            }
            throw new NoSuchElementException();
        }
    }
}
