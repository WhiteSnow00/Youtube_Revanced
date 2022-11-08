import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqxo extends agzi implements ahax
{
    private static final aqxo a;
    private static volatile ahbe b;
    private int c;
    private long d;
    private int e;
    
    static {
        agzi.registerDefaultInstance(aqxo.class, a = new aqxo());
    }
    
    private aqxo() {
    }
    
    public static aqxn a() {
        return (aqxn)aqxo.a.createBuilder();
    }
    
    private void e(final int e) {
        this.c |= 0x2;
        this.e = e;
    }
    
    private void f(final long d) {
        this.c |= 0x1;
        this.d = d;
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
                if ((b = aqxo.b) == null) {
                    synchronized (aqxo.class) {
                        if (aqxo.b == null) {
                            aqxo.b = (ahbe)new agzb((agzi)aqxo.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aqxo.a;
            }
            case 4: {
                return new aqxn();
            }
            case 3: {
                return new aqxo();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aqxo.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1002\u0000\u0002\u1004\u0001", new Object[] { "c", "d", "e" });
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
