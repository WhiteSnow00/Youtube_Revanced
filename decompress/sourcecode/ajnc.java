import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajnc extends agzi implements ahax
{
    public static final ajnc a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance((Class)ajnc.class, (agzi)(a = new ajnc()));
    }
    
    private ajnc() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe b;
                if ((b = ajnc.b) == null) {
                    synchronized (ajnc.class) {
                        if (ajnc.b == null) {
                            ajnc.b = (ahbe)new agzb((agzi)ajnc.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ajnc.a;
            }
            case 4: {
                return new agza((agzi)ajnc.a);
            }
            case 3: {
                return new ajnc();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajnc.a, "\u0001\u0000", (Object[])null);
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
