import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqex extends agzd implements agze
{
    public static final aqex a;
    private static volatile ahbe b;
    private byte c;
    
    static {
        agzi.registerDefaultInstance((Class)aqex.class, (agzi)(a = new aqex()));
    }
    
    private aqex() {
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
                if ((b = aqex.b) == null) {
                    synchronized (aqex.class) {
                        if (aqex.b == null) {
                            aqex.b = (ahbe)new agzb((agzi)aqex.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aqex.a;
            }
            case 4: {
                return new agzc(aqex.a);
            }
            case 3: {
                return new aqex();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqex.a, "\u0001\u0000", (Object[])null);
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
