import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apmw extends agzi implements ahax
{
    public static final apmw a;
    private static volatile ahbe e;
    public int b;
    public ajsq c;
    public ajsq d;
    private ajsq f;
    private ajsq g;
    private byte h;
    
    static {
        agzi.registerDefaultInstance((Class)apmw.class, (agzi)(a = new apmw()));
    }
    
    private apmw() {
        this.h = 2;
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
                final ahbe e;
                if ((e = apmw.e) == null) {
                    synchronized (apmw.class) {
                        if (apmw.e == null) {
                            apmw.e = (ahbe)new agzb((agzi)apmw.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return apmw.a;
            }
            case 4: {
                return new agza((agzi)apmw.a);
            }
            case 3: {
                return new apmw();
            }
            case 2: {
                return newMessageInfo((MessageLite)apmw.a, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0004\u0001\u1409\u0000\u0002\u1409\u0003\u0004\u1409\u0001\u0005\u1409\u0002", new Object[] { "b", "c", "g", "f", "d" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.h = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.h;
            }
        }
    }
}
