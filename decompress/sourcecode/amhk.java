import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

@Deprecated
public final class amhk extends agzi implements ahax
{
    public static final amhk a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance((Class)amhk.class, (agzi)(a = new amhk()));
    }
    
    private amhk() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe b;
                if ((b = amhk.b) == null) {
                    synchronized (amhk.class) {
                        if (amhk.b == null) {
                            amhk.b = (ahbe)new agzb((agzi)amhk.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return amhk.a;
            }
            case 4: {
                return new agza((agzi)amhk.a);
            }
            case 3: {
                return new amhk();
            }
            case 2: {
                return newMessageInfo((MessageLite)amhk.a, "\u0001\u0000", (Object[])null);
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
