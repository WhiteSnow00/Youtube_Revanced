import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahyx extends agzi implements ahax
{
    public static final ahyx a;
    private static volatile ahbe b;
    private int c;
    private ahye d;
    private byte e;
    
    static {
        agzi.registerDefaultInstance(ahyx.class, a = new ahyx());
    }
    
    private ahyx() {
        this.e = 2;
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        final int ordinal = agzh.ordinal();
        boolean b = true;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe b2;
                if ((b2 = ahyx.b) == null) {
                    synchronized (ahyx.class) {
                        if (ahyx.b == null) {
                            ahyx.b = (ahbe)new agzb((agzi)ahyx.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return ahyx.a;
            }
            case 4: {
                return new agza((agzi)ahyx.a);
            }
            case 3: {
                return new ahyx();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahyx.a, "\u0001\u0001\u0000\u0001\ue384\u3020\ue384\u3020\u0001\u0000\u0000\u0001\ue384\u3020\u1409\u0000", new Object[] { "c", "d" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.e = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.e;
            }
        }
    }
}
