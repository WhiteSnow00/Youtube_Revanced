import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqev extends agzd implements agze
{
    public static final aqev a;
    private static volatile ahbe b;
    private byte c;
    
    static {
        agzi.registerDefaultInstance((Class)aqev.class, (agzi)(a = new aqev()));
    }
    
    private aqev() {
        this.c = 2;
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe b;
                if ((b = aqev.b) == null) {
                    synchronized (aqev.class) {
                        if (aqev.b == null) {
                            aqev.b = (ahbe)new agzb((agzi)aqev.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aqev.a;
            }
            case 4: {
                return new agzc(aqev.a);
            }
            case 3: {
                return new aqev();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqev.a, "\u0001\u0000", (Object[])null);
            }
            case 1: {
                this.c = (byte)((o != null) ? 1 : 0);
                return null;
            }
            case 0: {
                return this.c;
            }
        }
    }
}