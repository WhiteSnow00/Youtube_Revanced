import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqeu extends agzd implements agze
{
    public static final aqeu a;
    private static volatile ahbe b;
    private byte c;
    
    static {
        agzi.registerDefaultInstance((Class)aqeu.class, (agzi)(a = new aqeu()));
    }
    
    private aqeu() {
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
                if ((b = aqeu.b) == null) {
                    synchronized (aqeu.class) {
                        if (aqeu.b == null) {
                            aqeu.b = (ahbe)new agzb((agzi)aqeu.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aqeu.a;
            }
            case 4: {
                return new agzc(aqeu.a);
            }
            case 3: {
                return new aqeu();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqeu.a, "\u0001\u0000", (Object[])null);
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
