import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqez extends agzd implements agze
{
    public static final aqez a;
    private static volatile ahbe b;
    private byte c;
    
    static {
        agzi.registerDefaultInstance((Class)aqez.class, (agzi)(a = new aqez()));
    }
    
    private aqez() {
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
                if ((b = aqez.b) == null) {
                    synchronized (aqez.class) {
                        if (aqez.b == null) {
                            aqez.b = (ahbe)new agzb((agzi)aqez.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aqez.a;
            }
            case 4: {
                return new agzc(aqez.a);
            }
            case 3: {
                return new aqez();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqez.a, "\u0001\u0000", (Object[])null);
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
