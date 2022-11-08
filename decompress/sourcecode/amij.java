import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amij extends agzi implements ahax
{
    public static final amij a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance((Class)amij.class, (agzi)(a = new amij()));
    }
    
    private amij() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe b;
                if ((b = amij.b) == null) {
                    synchronized (amij.class) {
                        if (amij.b == null) {
                            amij.b = (ahbe)new agzb((agzi)amij.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return amij.a;
            }
            case 4: {
                return new agza((agzi)amij.a);
            }
            case 3: {
                return new amij();
            }
            case 2: {
                return newMessageInfo((MessageLite)amij.a, "\u0001\u0000", (Object[])null);
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
