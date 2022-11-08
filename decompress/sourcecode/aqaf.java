import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqaf extends agzd implements agze
{
    public static final aqaf a;
    private static volatile ahbe b;
    private byte c;
    
    static {
        agzi.registerDefaultInstance(aqaf.class, (agzi)(a = new aqaf()));
    }
    
    private aqaf() {
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
                if ((b = aqaf.b) == null) {
                    synchronized (aqaf.class) {
                        if (aqaf.b == null) {
                            aqaf.b = (ahbe)new agzb((agzi)aqaf.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aqaf.a;
            }
            case 4: {
                return new agzc((agzd)aqaf.a);
            }
            case 3: {
                return new aqaf();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqaf.a, "\u0001\u0000", (Object[])null);
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
