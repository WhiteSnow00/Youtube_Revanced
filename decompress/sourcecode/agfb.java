import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agfb extends agzi implements ahax
{
    private static final agfb a;
    private static volatile ahbe b;
    private int c;
    private String d;
    private agfj e;
    private int f;
    
    static {
        agzi.registerDefaultInstance(agfb.class, a = new agfb());
    }
    
    private agfb() {
        this.d = "";
    }
    
    public static agfa a() {
        return (agfa)agfb.a.createBuilder();
    }
    
    public static agfb c() {
        return agfb.a;
    }
    
    private void h(final String d) {
        d.getClass();
        this.c |= 0x1;
        this.d = d;
    }
    
    private void i(final agfj e) {
        e.getClass();
        this.e = e;
        this.c |= 0x2;
    }
    
    private void j(final int f) {
        this.c |= 0x4;
        this.f = f;
    }
    
    public String d() {
        return this.d;
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe b;
                if ((b = agfb.b) == null) {
                    synchronized (agfb.class) {
                        if (agfb.b == null) {
                            agfb.b = (ahbe)new agzb((agzi)agfb.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return agfb.a;
            }
            case 4: {
                return new agfa();
            }
            case 3: {
                return new agfb();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)agfb.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1009\u0001\u0003\u100b\u0002", new Object[] { "c", "d", "e", "f" });
            }
            case 1: {
                return null;
            }
            case 0: {
                return 1;
            }
        }
    }
}
