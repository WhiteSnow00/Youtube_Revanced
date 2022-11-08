import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atwp extends agzd implements agze
{
    public static final atwp a;
    private static volatile ahbe b;
    private byte c;
    
    static {
        agzi.registerDefaultInstance(atwp.class, (agzi)(a = new atwp()));
    }
    
    private atwp() {
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
                if ((b = atwp.b) == null) {
                    synchronized (atwp.class) {
                        if (atwp.b == null) {
                            atwp.b = (ahbe)new agzb((agzi)atwp.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return atwp.a;
            }
            case 4: {
                return new agzc((agzd)atwp.a);
            }
            case 3: {
                return new atwp();
            }
            case 2: {
                return newMessageInfo((MessageLite)atwp.a, "\u0001\u0000", (Object[])null);
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
