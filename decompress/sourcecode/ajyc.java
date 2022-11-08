import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajyc extends agzi implements ahax
{
    public static final ajyc a;
    private static volatile ahbe b;
    private int c;
    private ajsq d;
    private ajsq e;
    private ajsq f;
    private ajsq g;
    private anss h;
    private byte i;
    
    static {
        agzi.registerDefaultInstance(ajyc.class, a = new ajyc());
    }
    
    private ajyc() {
        this.i = 2;
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
                if ((b2 = ajyc.b) == null) {
                    synchronized (ajyc.class) {
                        if (ajyc.b == null) {
                            ajyc.b = (ahbe)new agzb((agzi)ajyc.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return ajyc.a;
            }
            case 4: {
                return new agza((agzi)ajyc.a);
            }
            case 3: {
                return new ajyc();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ajyc.a, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0005\u0001\u1409\u0000\u0002\u1409\u0001\u0004\u1409\u0003\u0005\u1409\u0004\u0006\u1409\u0005", new Object[] { "c", "d", "e", "f", "g", "h" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.i = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.i;
            }
        }
    }
}
