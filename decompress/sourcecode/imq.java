import java.util.Map;
import android.util.Pair;

// 
// Decompiled by Procyon v0.6.0
// 

public final class imq implements abyu
{
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;
    
    public imq(final Pair a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public imq(final hhl a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public imq(final wql a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public imq(final wra a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public imq(final wrk a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public imq(final wrm a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public final void m() {
        if (this.b != 1) {
            return;
        }
        aibc aibc;
        if ((aibc = ((hhl)this.a).ao.i) == null) {
            aibc = aibc.a;
        }
        aibb aibb;
        if ((aibb = aibc.c) == null) {
            aibb = aibb.a;
        }
        if ((aibb.b & 0x8000) != 0x0) {
            final hhl hhl = (hhl)this.a;
            final vax c = hhl.c;
            aibc aibc2;
            if ((aibc2 = hhl.ao.i) == null) {
                aibc2 = aibc.a;
            }
            aibb aibb2;
            if ((aibb2 = aibc2.c) == null) {
                aibb2 = aibb.a;
            }
            aioe aioe;
            if ((aioe = aibb2.o) == null) {
                aioe = aioe.a;
            }
            c.c(aioe, (Map)null);
        }
    }
    
    public final void n() {
        if (this.b != 0) {
            return;
        }
        ((Runnable)((Pair)this.a).second).run();
    }
    
    public final void o(final boolean b) {
        final int b2 = this.b;
        if (b2 != 0) {
            if (b2 != 1) {
                if (b2 == 2) {
                    if (b) {
                        ((wql)this.a).af.ai();
                    }
                    return;
                }
                if (b2 == 3) {
                    ((wra)this.a).q();
                    return;
                }
                if (b2 != 4) {
                    if (b) {
                        ((wrm)this.a).aF.aC();
                    }
                    return;
                }
                ((wrk)this.a).b.aF.aC();
            }
            else {
                ((hhl)this.a).aq.d();
            }
        }
    }
}
