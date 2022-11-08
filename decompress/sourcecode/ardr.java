import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.Map;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

final class ardr implements dpu
{
    List a;
    List b;
    dpz c;
    long d;
    
    public ardr(final ards ards, final ardm ardm, final Map map, long d) {
        this.b = new ArrayList();
        this.d = d;
        this.a = ardm.d;
        for (int i = 0; i < ((int[])map.values().iterator().next()).length; ++i) {
            for (final ardp ardp : this.a) {
                final int[] array = map.get(ardp);
                d = 0L;
                for (int j = 0; j < i; ++j) {
                    d += array[j];
                }
                this.b.add(ards.c.get(ardp).subList(aqqm.q(d), aqqm.q(d + array[i])));
            }
        }
    }
    
    private static final boolean h(final long n) {
        return n + 8L < 4294967296L;
    }
    
    @Override
    public final long a() {
        throw new RuntimeException("Doesn't have any meaning for programmatically created boxes");
    }
    
    @Override
    public final long b() {
        return this.d + 16L;
    }
    
    @Override
    public final dpz c() {
        return this.c;
    }
    
    @Override
    public final String d() {
        return "mdat";
    }
    
    @Override
    public final void e(final WritableByteChannel writableByteChannel) {
        final ByteBuffer allocate = ByteBuffer.allocate(16);
        final long b = this.b();
        if (h(b)) {
            clm.m(allocate, b);
        }
        else {
            clm.m(allocate, 1L);
        }
        allocate.put(dps.b("mdat"));
        if (h(b)) {
            allocate.put(new byte[8]);
        }
        else {
            allocate.putLong(b);
        }
        allocate.rewind();
        writableByteChannel.write(allocate);
        final Iterator iterator = this.b.iterator();
        while (iterator.hasNext()) {
            final Iterator iterator2 = ((List)iterator.next()).iterator();
            while (iterator2.hasNext()) {
                ((ardo)iterator2.next()).b(writableByteChannel);
            }
        }
    }
    
    @Override
    public final void f(final ardi ardi, final ByteBuffer byteBuffer, final long n, final dpq dpq) {
    }
    
    @Override
    public final void g(final dpz c) {
        this.c = c;
    }
}
