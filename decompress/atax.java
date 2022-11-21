import java.util.concurrent.atomic.AtomicInteger;

// 
// Decompiled by Procyon v0.6.0
// 

final class atax extends AtomicInteger implements asln
{
    private static final long serialVersionUID = 6770240836423125754L;
    final asku a;
    final ataz b;
    atay c;
    int d;
    long e;
    volatile boolean f;
    
    public atax(final asku a, final ataz b) {
        this.a = a;
        this.b = b;
        this.c = b.g;
    }
    
    @Override
    public final void dispose() {
        Label_0129: {
            if (!this.f) {
                this.f = true;
                final ataz b = this.b;
                atax[] array;
                atax[] b2;
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
                                        b2 = ataz.b;
                                        continue Label_0115;
                                    }
                                    b2 = new atax[length - 1];
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
                } while (!atxh.f(b.e, (Object)array, (Object)b2));
            }
        }
    }
    
    @Override
    public final boolean tz() {
        return this.f;
    }
}
