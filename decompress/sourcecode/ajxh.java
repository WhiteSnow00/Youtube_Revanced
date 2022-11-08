import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajxh extends agzi implements ahax
{
    public static final ajxh a;
    private static volatile ahbe b;
    private int c;
    private aioe d;
    private aioe e;
    private ahfw f;
    private byte g;
    
    static {
        agzi.registerDefaultInstance(ajxh.class, a = new ajxh());
    }
    
    private ajxh() {
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
                if ((b2 = ajxh.b) == null) {
                    synchronized (ajxh.class) {
                        if (ajxh.b == null) {
                            ajxh.b = (ahbe)new agzb((agzi)ajxh.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return ajxh.a;
            }
            case 4: {
                return new agza((agzi)ajxh.a);
            }
            case 3: {
                return new ajxh();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ajxh.a, "\u0001\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0000\u0003\u0002\u1409\u0002\u0003\u1409\u0003\u0004\u1409\u0004", new Object[] { "c", "d", "e", "f" });
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
