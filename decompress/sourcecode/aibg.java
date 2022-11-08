import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aibg extends agzi implements ahax
{
    public static final aibg a;
    private static volatile ahbe b;
    private int c;
    private ajsq d;
    private aioe e;
    private byte f;
    
    static {
        agzi.registerDefaultInstance((Class)aibg.class, (agzi)(a = new aibg()));
    }
    
    private aibg() {
        this.f = 2;
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
                if ((b2 = aibg.b) == null) {
                    synchronized (aibg.class) {
                        if (aibg.b == null) {
                            aibg.b = (ahbe)new agzb((agzi)aibg.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return aibg.a;
            }
            case 4: {
                return new agza((agzi)aibg.a);
            }
            case 3: {
                return new aibg();
            }
            case 2: {
                return newMessageInfo((MessageLite)aibg.a, "\u0001\u0002\u0000\u0001\u0003\u0004\u0002\u0000\u0000\u0002\u0003\u1409\u0002\u0004\u1409\u0003", new Object[] { "c", "d", "e" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.f = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.f;
            }
        }
    }
}
