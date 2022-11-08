import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajyb extends agzi implements ahax
{
    public static final ajyb a;
    private static volatile ahbe b;
    private int c;
    private ajsq d;
    private byte e;
    
    static {
        agzi.registerDefaultInstance(ajyb.class, a = new ajyb());
    }
    
    private ajyb() {
        this.e = 2;
        emptyProtobufList();
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
                if ((b2 = ajyb.b) == null) {
                    synchronized (ajyb.class) {
                        if (ajyb.b == null) {
                            ajyb.b = (ahbe)new agzb((agzi)ajyb.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return ajyb.a;
            }
            case 4: {
                return new agza((agzi)ajyb.a);
            }
            case 3: {
                return new ajyb();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ajyb.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u1409\u0000", new Object[] { "c", "d" });
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
