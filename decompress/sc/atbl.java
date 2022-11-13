import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atbl implements ashw
{
    private final AtomicReference a;
    
    public atbl(final AtomicReference a) {
        this.a = a;
    }
    
    @Override
    public final void aP(final ashy ashy) {
        final atbj atbj = new atbj(ashy);
        ashy.d(atbj);
        atbk atbk2 = null;
    Label_0018:
        while (true) {
            final atbk atbk = this.a.get();
            while (true) {
                Label_0042: {
                    if (atbk == null) {
                        break Label_0042;
                    }
                    atbk2 = atbk;
                    if (atbk.tA()) {
                        break Label_0042;
                    }
                    atbj[] array;
                    atbj[] array2;
                    do {
                        array = atbk2.d.get();
                        if (array == atbk.b) {
                            continue Label_0018;
                        }
                        final int length = array.length;
                        array2 = new atbj[length + 1];
                        System.arraycopy(array, 0, array2, 0, length);
                        array2[length] = atbj;
                    } while (!atum.n(atbk2.d, (Object)array, (Object)array2));
                    break;
                }
                atbk2 = new atbk(this.a);
                final AtomicReference a = this.a;
                while (!a.compareAndSet(atbk, atbk2)) {
                    if (a.get() != atbk) {
                        continue Label_0018;
                    }
                }
                continue;
            }
        }
        if (!atbj.compareAndSet(null, atbk2)) {
            atbk2.f(atbj);
        }
    }
}
