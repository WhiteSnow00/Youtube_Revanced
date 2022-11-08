import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aian extends agzi implements ahax
{
    public static final aian a;
    private static volatile ahbe c;
    public aiam b;
    private int d;
    private aiak e;
    private byte f;
    
    static {
        agzi.registerDefaultInstance((Class)aian.class, (agzi)(a = new aian()));
    }
    
    private aian() {
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
                if ((c = aian.c) == null) {
                    synchronized (aian.class) {
                        if (aian.c == null) {
                            aian.c = (ahbe)new agzb((agzi)aian.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aian.a;
            }
            case 4: {
                return new agza((agzi)aian.a);
            }
            case 3: {
                return new aian();
            }
            case 2: {
                return newMessageInfo((MessageLite)aian.a, "\u0001\u0002\u0000\u0001\uf733\u45a2\ue98d\u4647\u0002\u0000\u0000\u0001\uf733\u45a2\u1009\u0002\ue98d\u4647\u1409\u0003", new Object[] { "d", "b", "e" });
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
