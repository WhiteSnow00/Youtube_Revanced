// 
// Decompiled by Procyon v0.6.0
// 

public final class emt extends enu
{
    public emt(final emj emj, final agza agza, final int n) {
        super(emj, "wPLuRKbAvZPAiJqPYNBqgvUCesMc3+VTtpgM018gMz5F9Lz38uNUBeCfwu8TSv2X", "+DZ4rAqlxoGmt/vl5o0tqi0yaHBF48hUHJNY3yJnYpc=", agza, n, 89);
    }
    
    protected final void a() {
        final String af = (String)this.d.invoke(null, new Object[0]);
        synchronized (this.g) {
            final agza g = this.g;
            g.copyOnWrite();
            final ehs ehs = (ehs)g.instance;
            final ehs a = ehs.a;
            af.getClass();
            ehs.d |= 0x8000;
            ehs.af = af;
        }
    }
}
