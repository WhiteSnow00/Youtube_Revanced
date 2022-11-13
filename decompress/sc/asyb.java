import java.util.concurrent.atomic.AtomicInteger;

// 
// Decompiled by Procyon v0.6.0
// 

final class asyb extends AtomicInteger implements asir
{
    private static final long serialVersionUID = 6770240836423125754L;
    final ashy a;
    final asyd b;
    asyc c;
    int d;
    long e;
    volatile boolean f;
    
    public asyb(final ashy a, final asyd b) {
        this.a = a;
        this.b = b;
        this.c = b.g;
    }
    
    @Override
    public final void dispose() {
        Label_0129: {
            if (!this.f) {
                this.f = true;
                final asyd b = this.b;
                asyb[] array;
                asyb[] b2;
            Label_0115:
                do {
                    array = b.e.get();
                    final int length = array.length;
                    if (length != 0) {
                        int i = 0;
                        while (true) {
                            while (i < length) {
                                if (array[i] == this) {
                                    if (i < 0) {
                                        break Label_0129;
                                    }
                                    if (length == 1) {
                                        b2 = asyd.b;
                                        continue Label_0115;
                                    }
                                    b2 = new asyb[length - 1];
                                    System.arraycopy(array, 0, b2, 0, i);
                                    System.arraycopy(array, i + 1, b2, i, length - i - 1);
                                    continue Label_0115;
                                }
                                else {
                                    ++i;
                                }
                            }
                            i = -1;
                            continue;
                        }
                    }
                    break;
                } while (!arva.l(b.e, (Object)array, (Object)b2));
            }
        }
    }
    
    @Override
    public final boolean tA() {
        return this.f;
    }
}
