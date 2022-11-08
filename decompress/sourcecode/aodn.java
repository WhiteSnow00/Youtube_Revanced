import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aodn extends agzi implements ahax
{
    private static final aodn a;
    private static volatile ahbe b;
    private int c;
    private int d;
    private Object e;
    private int f;
    private boolean g;
    
    static {
        agzi.registerDefaultInstance(aodn.class, a = new aodn());
    }
    
    private aodn() {
        this.d = 0;
    }
    
    public static aodm a() {
        return (aodm)aodn.a.createBuilder();
    }
    
    private void g(final aodk e) {
        e.getClass();
        this.e = e;
        this.d = 2;
    }
    
    private void h(final int f) {
        this.c |= 0x4;
        this.f = f;
    }
    
    private void i(final boolean g) {
        this.c |= 0x8;
        this.g = g;
    }
    
    private void j(final aodq e) {
        e.getClass();
        this.e = e;
        this.d = 1;
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
                if ((b = aodn.b) == null) {
                    synchronized (aodn.class) {
                        if (aodn.b == null) {
                            aodn.b = (ahbe)new agzb((agzi)aodn.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aodn.a;
            }
            case 4: {
                return new aodm();
            }
            case 3: {
                return new aodn();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aodn.a, "\u0001\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u103c\u0000\u0002\u103c\u0000\u0003\u1004\u0002\u0004\u1007\u0003", new Object[] { "e", "d", "c", aodq.class, aodk.class, "f", "g" });
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
