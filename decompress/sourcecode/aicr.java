import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aicr extends agzi implements ahax
{
    public static final aicr a;
    private static volatile ahbe c;
    public anbz b;
    private int d;
    private anbv e;
    private byte f;
    
    static {
        agzi.registerDefaultInstance((Class)aicr.class, (agzi)(a = new aicr()));
    }
    
    private aicr() {
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
                final ahbe c;
                if ((c = aicr.c) == null) {
                    synchronized (aicr.class) {
                        if (aicr.c == null) {
                            aicr.c = (ahbe)new agzb((agzi)aicr.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aicr.a;
            }
            case 4: {
                return new agza((agzi)aicr.a);
            }
            case 3: {
                return new aicr();
            }
            case 2: {
                return newMessageInfo((MessageLite)aicr.a, "\u0001\u0002\u0000\u0001\ufdd2\u178f\uee01\u189d\u0002\u0000\u0000\u0002\ufdd2\u178f\u1409\u0000\uee01\u189d\u1409\u0001", new Object[] { "d", "e", "b" });
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
