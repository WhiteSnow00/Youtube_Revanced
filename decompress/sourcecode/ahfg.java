import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahfg extends agzi implements ahax
{
    public static final ahfg a;
    private static volatile ahbe b;
    private int c;
    private afpe d;
    private byte e;
    
    static {
        agzi.registerDefaultInstance(ahfg.class, a = new ahfg());
    }
    
    private ahfg() {
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
                if ((b2 = ahfg.b) == null) {
                    synchronized (ahfg.class) {
                        if (ahfg.b == null) {
                            ahfg.b = (ahbe)new agzb((agzi)ahfg.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return ahfg.a;
            }
            case 4: {
                return new agza((agzi)ahfg.a);
            }
            case 3: {
                return new ahfg();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahfg.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u1409\u0000", new Object[] { "c", "d" });
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
