import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqxw extends agzi implements ahax
{
    private static final aqxw a;
    private static volatile ahbe b;
    private int c;
    private int d;
    private ahdv e;
    private int f;
    private boolean g;
    
    static {
        agzi.registerDefaultInstance(aqxw.class, a = new aqxw());
    }
    
    private aqxw() {
    }
    
    public static aqxv a() {
        return (aqxv)aqxw.a.createBuilder();
    }
    
    private void g(final int d) {
        this.c |= 0x1;
        this.d = d;
    }
    
    private void h(final boolean g) {
        this.c |= 0x8;
        this.g = g;
    }
    
    private void i(final ahdv e) {
        e.getClass();
        this.e = e;
        this.c |= 0x2;
    }
    
    private void j(final aqxx aqxx) {
        this.f = aqxx.f;
        this.c |= 0x4;
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
                if ((b = aqxw.b) == null) {
                    synchronized (aqxw.class) {
                        if (aqxw.b == null) {
                            aqxw.b = (ahbe)new agzb((agzi)aqxw.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aqxw.a;
            }
            case 4: {
                return new aqxv();
            }
            case 3: {
                return new aqxw();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aqxw.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u1004\u0000\u0002\u1009\u0001\u0003\u100c\u0002\u0004\u1007\u0003", new Object[] { "c", "d", "e", "f", aqxx.a(), "g" });
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
