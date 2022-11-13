import j$.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gji implements gjk
{
    public final vcy a;
    public aiqj b;
    public aiqj c;
    public aiqj d;
    
    public gji(final vcy a, final acbj acbj) {
        this.a = a;
        ajmq ajmq;
        if ((acbj.b().b & 0x80000) != 0x0) {
            if ((ajmq = acbj.b().j) == null) {
                ajmq = ajmq.a;
            }
        }
        else {
            ajmq = null;
        }
        if (ajmq != null) {
            aiqj b;
            if ((b = ajmq.b) == null) {
                b = aiqj.a;
            }
            this.b = b;
            aiqj c;
            if ((c = ajmq.c) == null) {
                c = aiqj.a;
            }
            this.c = c;
            aiqj d;
            if ((d = ajmq.d) == null) {
                d = aiqj.a;
            }
            this.d = d;
        }
    }
    
    @Override
    public final boolean b(final gjk gjk) {
        if (gjk instanceof gji) {
            final aiqj b = this.b;
            final gji gji = (gji)gjk;
            if (Objects.equals((Object)b, (Object)gji.b) && Objects.equals((Object)this.c, (Object)gji.c) && Objects.equals((Object)this.d, (Object)gji.d)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final ashc pW(final int n) {
        return ashc.u((asjg)new lgh(this, n, 1));
    }
}
