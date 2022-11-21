import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.Map;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

final class arja implements dpy
{
    List a;
    List b;
    dqd c;
    long d;
    
    public arja(final arjb arjb, final ariv ariv, final Map map, long d) {
        this.b = new ArrayList();
        this.d = d;
        this.a = ariv.d;
        for (int i = 0; i < ((int[])map.values().iterator().next()).length; ++i) {
            for (final ariy ariy : this.a) {
                final int[] array = map.get(ariy);
                d = 0L;
                for (int j = 0; j < i; ++j) {
                    d += array[j];
                }
                this.b.add(arjb.c.get(ariy).subList(aqvs.o(d), aqvs.o(d + array[i])));
            }
        }
    }
    
    private static final boolean h(final long n) {
        return n + 8L < 4294967296L;
    }
    
    public final long a() {
        throw new RuntimeException("Doesn't have any meaning for programmatically created boxes");
    }
    
    public final long b() {
        return this.d + 16L;
    }
    
    public final dqd c() {
        return this.c;
    }
    
    public final String d() {
        return "mdat";
    }
    
    public final void e(final WritableByteChannel writableByteChannel) {
        final ByteBuffer allocate = ByteBuffer.allocate(16);
        final long b = this.b();
        if (h(b)) {
            cop.k(allocate, b);
        }
        else {
            cop.k(allocate, 1L);
        }
        allocate.put(dpw.b("mdat"));
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
                ((arix)iterator2.next()).b(writableByteChannel);
            }
        }
    }
    
    public final void f(final arir arir, final ByteBuffer byteBuffer, final long n, final dpu dpu) {
    }
    
    public final void g(final dqd c) {
        this.c = c;
    }
}
