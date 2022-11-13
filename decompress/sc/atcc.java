import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class atcc implements ashw
{
    private final AtomicReference a;
    private final atbx b;
    
    public atcc(final AtomicReference a, final atbx b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void aP(final ashy ashy) {
        atcb atcb = null;
    Label_0000:
        while ((atcb = this.a.get()) == null) {
            atcb = new atcb(this.b.a());
            final AtomicReference a = this.a;
            while (!a.compareAndSet(null, atcb)) {
                if (a.get() != null) {
                    continue Label_0000;
                }
            }
            break;
        }
        final atby atby = new atby(atcb, ashy);
        ashy.d(atby);
        atby[] array;
        atby[] array2;
        do {
            array = atcb.e.get();
            if (array == atcb.b) {
                break;
            }
            final int length = array.length;
            array2 = new atby[length + 1];
            System.arraycopy(array, 0, array2, 0, length);
            array2[length] = atby;
        } while (!atwm.f(atcb.e, (Object)array, (Object)array2));
        if (atby.d) {
            atcb.f(atby);
            return;
        }
        atcb.c.e(atby);
    }
}
