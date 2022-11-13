// 
// Decompiled by Procyon v0.6.0
// 

public final class emu extends env
{
    public emu(final emk emk, final ahaz ahaz, final int n) {
        super(emk, "wPLuRKbAvZPAiJqPYNBqgvUCesMc3+VTtpgM018gMz5F9Lz38uNUBeCfwu8TSv2X", "+DZ4rAqlxoGmt/vl5o0tqi0yaHBF48hUHJNY3yJnYpc=", ahaz, n, 89);
    }
    
    protected final void a() {
        final String af = (String)this.d.invoke(null, new Object[0]);
        synchronized (this.g) {
            final ahaz g = this.g;
            g.copyOnWrite();
            final eht eht = (eht)g.instance;
            final eht a = eht.a;
            af.getClass();
            eht.d |= 0x8000;
            eht.af = af;
        }
    }
}
