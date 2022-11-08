import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agfh extends agzi implements ahax
{
    private static final agfh a;
    private static volatile ahbe b;
    private int c;
    private int d;
    private Object e;
    private int f;
    private String g;
    
    static {
        agzi.registerDefaultInstance(agfh.class, a = new agfh());
    }
    
    private agfh() {
        this.d = 0;
        this.g = "";
    }
    
    public static agfg a() {
        return (agfg)agfh.a.createBuilder();
    }
    
    private void f(final agfc agfc) {
        this.f = agfc.f;
        this.c |= 0x4;
    }
    
    private void g(final agfd e) {
        e.getClass();
        this.e = e;
        this.d = 2;
    }
    
    private void h(final String e) {
        e.getClass();
        this.d = 1;
        this.e = e;
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
                if ((b = agfh.b) == null) {
                    synchronized (agfh.class) {
                        if (agfh.b == null) {
                            agfh.b = (ahbe)new agzb((agzi)agfh.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return agfh.a;
            }
            case 4: {
                return new agfg();
            }
            case 3: {
                return new agfh();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)agfh.a, "\u0001\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u103b\u0000\u0002\u103c\u0000\u0003\u100c\u0002", new Object[] { "e", "d", "c", agfd.class, "f", agfc.b() });
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
