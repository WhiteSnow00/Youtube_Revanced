import java.util.List;
import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

final class jfb implements acrf
{
    final jfc a;
    
    public jfb(final jfc a) {
        this.a = a;
    }
    
    public final /* bridge */ void b(final Object o, final acre acre) {
        final alkh alkh = (alkh)o;
        if ((alkh.d & 0x80) != 0x0) {
            anjk anjk;
            if ((anjk = alkh.M) == null) {
                anjk = anjk.a;
            }
            acre.a(anjk);
            if (!anjk.c) {
                anuv anuv;
                if ((anuv = anjk.b) == null) {
                    anuv = anuv.a;
                }
                final Iterator<Object> iterator = ((List<Object>)((ankm)((ahbc)anuv).rx((ahaq)ankp.a)).d).iterator();
                while (iterator.hasNext()) {
                    ankt ankt;
                    if ((ankt = iterator.next().c) == null) {
                        ankt = ankt.a;
                    }
                    acre.a(ankt);
                }
            }
            else {
                this.a.a.add(anjk);
            }
        }
    }
    
    public final void c() {
    }
    
    public final aezs e() {
        return (aezs)iim.h;
    }
}
