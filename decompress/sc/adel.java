import java.util.concurrent.atomic.AtomicInteger;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adel extends abn
{
    final ziy a;
    
    public adel(final ziy a, final byte[] array, final byte[] array2, final byte[] array3) {
        this.a = a;
        super(50);
    }
    
    @Override
    protected final /* bridge */ void f(final boolean b, Object b2, final Object o, final Object o2) {
        final adem adem = (adem)o;
        super.f(b, b2, adem, o2);
        b2 = this.a.b;
        ((AtomicInteger)b2).addAndGet(-adem.c);
    }
}
