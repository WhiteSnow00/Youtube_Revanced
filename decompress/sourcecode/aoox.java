import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoox extends agzi implements ahax
{
    public static final aoox a;
    private static volatile ahbe m;
    public int b;
    public boolean c;
    public aoot d;
    public aoow e;
    public aoor f;
    public aooq g;
    public aoon h;
    public aool i;
    public aoop j;
    public aoov k;
    public aoos l;
    
    static {
        agzi.registerDefaultInstance((Class)aoox.class, (agzi)(a = new aoox()));
    }
    
    private aoox() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe m;
                if ((m = aoox.m) == null) {
                    synchronized (aoox.class) {
                        if (aoox.m == null) {
                            aoox.m = (ahbe)new agzb((agzi)aoox.a);
                        }
                    }
                }
                return m;
            }
            case 5: {
                return aoox.a;
            }
            case 4: {
                return new agza((agzi)aoox.a);
            }
            case 3: {
                return new aoox();
            }
            case 2: {
                return newMessageInfo((MessageLite)aoox.a, "\u0001\n\u0000\u0001\u0001\u001e\n\u0000\u0000\u0000\u0001\u1007\u0000\u0002\u1009\u0001\u0003\u1009\u0004\u0004\u1009\u0006\b\u1009\b\t\u1009\t\r\u1009\f\u0018\u1009\u0017\u001c\u1009\r\u001e\u1009\u001c", new Object[] { "b", "c", "d", "e", "f", "g", "h", "i", "k", "j", "l" });
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
