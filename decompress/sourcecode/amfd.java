import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amfd extends agzi implements ahax
{
    public static final amfd a;
    private static volatile ahbe b;
    private byte c;
    
    static {
        agzi.registerDefaultInstance((Class)amfd.class, (agzi)(a = new amfd()));
    }
    
    private amfd() {
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
                if ((b = amfd.b) == null) {
                    synchronized (amfd.class) {
                        if (amfd.b == null) {
                            amfd.b = (ahbe)new agzb((agzi)amfd.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return amfd.a;
            }
            case 4: {
                return new agza((agzi)amfd.a);
            }
            case 3: {
                return new amfd();
            }
            case 2: {
                return newMessageInfo((MessageLite)amfd.a, "\u0001\u0000", (Object[])null);
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
