import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ateh implements asks
{
    private final AtomicReference a;
    
    public ateh(final AtomicReference a) {
        this.a = a;
    }
    
    @Override
    public final void aP(final asku asku) {
        final atef atef = new atef(asku);
        asku.d(atef);
        ateg ateg2 = null;
    Label_0018:
        while (true) {
            final ateg ateg = this.a.get();
            while (true) {
                Label_0042: {
                    if (ateg == null) {
                        break Label_0042;
                    }
                    ateg2 = ateg;
                    if (ateg.tz()) {
                        break Label_0042;
                    }
                    atef[] array;
                    atef[] array2;
                    do {
                        array = ateg2.d.get();
                        if (array == ateg.b) {
                            continue Label_0018;
                        }
                        final int length = array.length;
                        array2 = new atef[length + 1];
                        System.arraycopy(array, 0, array2, 0, length);
                        array2[length] = atef;
                    } while (!atzd.q(ateg2.d, (Object)array, (Object)array2));
                    break;
                }
                ateg2 = new ateg(this.a);
                final AtomicReference a = this.a;
                while (!a.compareAndSet(ateg, ateg2)) {
                    if (a.get() != ateg) {
                        continue Label_0018;
                    }
                }
                continue;
            }
        }
        if (!atef.compareAndSet(null, ateg2)) {
            ateg2.f(atef);
        }
    }
}
