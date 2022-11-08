import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajcx extends agzi implements ahax
{
    public static final ajcx a;
    private static volatile ahbe b;
    private int c;
    private aioe d;
    private aioe e;
    private ahfw f;
    private byte g;
    
    static {
        agzi.registerDefaultInstance(ajcx.class, a = new ajcx());
    }
    
    private ajcx() {
        this.g = 2;
        final agyc b = agyc.b;
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
                if ((b2 = ajcx.b) == null) {
                    synchronized (ajcx.class) {
                        if (ajcx.b == null) {
                            ajcx.b = (ahbe)new agzb((agzi)ajcx.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return ajcx.a;
            }
            case 4: {
                return new agza((agzi)ajcx.a);
            }
            case 3: {
                return new ajcx();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ajcx.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0003\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002", new Object[] { "c", "d", "e", "f" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.g = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.g;
            }
        }
    }
}
