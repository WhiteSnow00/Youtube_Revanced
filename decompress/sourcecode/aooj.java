import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aooj extends agzi implements ahax
{
    private static final aooj a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance((Class)aooj.class, (agzi)(a = new aooj()));
    }
    
    private aooj() {
    }
    
    public static /* synthetic */ aooj a() {
        return aooj.a;
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe b;
                if ((b = aooj.b) == null) {
                    synchronized (aooj.class) {
                        if (aooj.b == null) {
                            aooj.b = (ahbe)new agzb((agzi)aooj.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aooj.a;
            }
            case 4: {
                return new agza((agzi)a());
            }
            case 3: {
                return new aooj();
            }
            case 2: {
                return newMessageInfo((MessageLite)aooj.a, "\u0001\u0000", (Object[])null);
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
