import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class obr extends agzi implements ahax
{
    public static final obr a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance((Class)obr.class, (agzi)(a = new obr()));
    }
    
    private obr() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe b;
                if ((b = obr.b) == null) {
                    synchronized (obr.class) {
                        if (obr.b == null) {
                            obr.b = (ahbe)new agzb((agzi)obr.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return obr.a;
            }
            case 4: {
                return new agza((agzi)obr.a);
            }
            case 3: {
                return new obr();
            }
            case 2: {
                return newMessageInfo((MessageLite)obr.a, "\u0000\u0000", (Object[])null);
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
