import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aice extends agzi implements ahax
{
    private static final aice a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance((Class)aice.class, (agzi)(a = new aice()));
    }
    
    private aice() {
    }
    
    public static /* synthetic */ aice a() {
        return aice.a;
    }
    
    public static aice b() {
        return aice.a;
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe b;
                if ((b = aice.b) == null) {
                    synchronized (aice.class) {
                        if (aice.b == null) {
                            aice.b = (ahbe)new agzb((agzi)aice.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aice.a;
            }
            case 4: {
                return new agza((agzi)a());
            }
            case 3: {
                return new aice();
            }
            case 2: {
                return newMessageInfo((MessageLite)aice.a, "\u0001\u0000", (Object[])null);
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
