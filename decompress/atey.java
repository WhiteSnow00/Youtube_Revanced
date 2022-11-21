import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class atey implements asks
{
    private final AtomicReference a;
    private final atet b;
    
    public atey(final AtomicReference a, final atet b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void aP(final asku asku) {
        atex atex = null;
    Label_0000:
        while ((atex = this.a.get()) == null) {
            atex = new atex(this.b.a());
            final AtomicReference a = this.a;
            while (!a.compareAndSet(null, atex)) {
                if (a.get() != null) {
                    continue Label_0000;
                }
            }
            break;
        }
        final ateu ateu = new ateu(atex, asku);
        asku.d(ateu);
        ateu[] array;
        ateu[] array2;
        do {
            array = atex.e.get();
            if (array == atex.b) {
                break;
            }
            final int length = array.length;
            array2 = new ateu[length + 1];
            System.arraycopy(array, 0, array2, 0, length);
            array2[length] = ateu;
        } while (!auax.f(atex.e, (Object)array, (Object)array2));
        if (ateu.d) {
            atex.f(ateu);
            return;
        }
        atex.c.e(ateu);
    }
}
