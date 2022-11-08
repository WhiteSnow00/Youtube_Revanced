import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajdy extends agzi implements ahax
{
    public static final ajdy a;
    public static final agzg b;
    private static volatile ahbe g;
    public int c;
    public ajdx d;
    public ajea e;
    public aqcz f;
    private byte h;
    
    static {
        final ajdy a2 = new ajdy();
        agzi.registerDefaultInstance(ajdy.class, a = a2);
        b = agzi.newSingularGeneratedExtension((MessageLite)aqcu.a, a2, (MessageLite)a2, null, 372117054, ahcm.k, ajdy.class);
    }
    
    private ajdy() {
        this.h = 2;
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
                final ahbe g;
                if ((g = ajdy.g) == null) {
                    synchronized (ajdy.class) {
                        if (ajdy.g == null) {
                            ajdy.g = (ahbe)new agzb((agzi)ajdy.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return ajdy.a;
            }
            case 4: {
                return new agza((agzi)ajdy.a);
            }
            case 3: {
                return new ajdy();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ajdy.a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0002\u0001\u1409\u0000\u0002\u1009\u0001\u0004\u1409\u0003", new Object[] { "c", "d", "e", "f" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.h = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.h;
            }
        }
    }
}
