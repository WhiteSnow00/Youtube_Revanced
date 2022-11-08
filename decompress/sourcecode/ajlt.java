import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajlt extends agzi implements ahax
{
    public static final ajlt a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance((Class)ajlt.class, (agzi)(a = new ajlt()));
    }
    
    private ajlt() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe b;
                if ((b = ajlt.b) == null) {
                    synchronized (ajlt.class) {
                        if (ajlt.b == null) {
                            ajlt.b = (ahbe)new agzb((agzi)ajlt.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ajlt.a;
            }
            case 4: {
                return new agza((agzi)ajlt.a);
            }
            case 3: {
                return new ajlt();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajlt.a, "\u0001\u0000", (Object[])null);
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
