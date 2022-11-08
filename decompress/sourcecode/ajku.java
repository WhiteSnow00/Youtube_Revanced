import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajku extends agzd implements agze
{
    public static final ajku a;
    private static volatile ahbe b;
    private byte c;
    
    static {
        agzi.registerDefaultInstance((Class)ajku.class, (agzi)(a = new ajku()));
    }
    
    private ajku() {
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
                if ((b = ajku.b) == null) {
                    synchronized (ajku.class) {
                        if (ajku.b == null) {
                            ajku.b = (ahbe)new agzb((agzi)ajku.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ajku.a;
            }
            case 4: {
                return new agzc(ajku.a);
            }
            case 3: {
                return new ajku();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajku.a, "\u0001\u0000", (Object[])null);
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
