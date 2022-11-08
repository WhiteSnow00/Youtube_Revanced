import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class obg extends agzi implements ahax
{
    public static final obg a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance((Class)obg.class, (agzi)(a = new obg()));
    }
    
    private obg() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe b;
                if ((b = obg.b) == null) {
                    synchronized (obg.class) {
                        if (obg.b == null) {
                            obg.b = (ahbe)new agzb((agzi)obg.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return obg.a;
            }
            case 4: {
                return new agza((agzi)obg.a);
            }
            case 3: {
                return new obg();
            }
            case 2: {
                return newMessageInfo((MessageLite)obg.a, "\u0000\u0000", (Object[])null);
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
