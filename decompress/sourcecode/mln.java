import java.util.concurrent.atomic.AtomicLong;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mln
{
    public mhs a;
    public final AtomicLong b;
    final /* synthetic */ mlu c;
    
    public mln(final mlu c) {
        this.c = c;
        this.b = new AtomicLong((mmt.b.nextLong() & 0xFFFFL) * 10000L);
    }
}
