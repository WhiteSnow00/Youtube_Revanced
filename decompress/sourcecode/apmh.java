import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apmh extends agzi implements ahax
{
    public static final apmh a;
    private static volatile ahbe b;
    private int c;
    private aplg d;
    private byte e;
    
    static {
        agzi.registerDefaultInstance((Class)apmh.class, (agzi)(a = new apmh()));
    }
    
    private apmh() {
        this.e = 2;
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        final int ordinal = agzh.ordinal();
        boolean b = true;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe b2;
                if ((b2 = apmh.b) == null) {
                    synchronized (apmh.class) {
                        if (apmh.b == null) {
                            apmh.b = (ahbe)new agzb((agzi)apmh.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return apmh.a;
            }
            case 4: {
                return new agza((agzi)apmh.a);
            }
            case 3: {
                return new apmh();
            }
            case 2: {
                return newMessageInfo((MessageLite)apmh.a, "\u0001\u0001\u0000\u0001\uf87c\u18b0\uf87c\u18b0\u0001\u0000\u0000\u0001\uf87c\u18b0\u1409\u0000", new Object[] { "c", "d" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.e = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.e;
            }
        }
    }
}
