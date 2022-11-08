import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajdm extends agzi implements ahax
{
    public static final ajdm a;
    private static volatile ahbe b;
    private int c;
    private ajsq d;
    private ajsq e;
    private ajsq f;
    private ahfw g;
    private byte h;
    
    static {
        agzi.registerDefaultInstance(ajdm.class, a = new ajdm());
    }
    
    private ajdm() {
        this.h = 2;
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
                if ((b2 = ajdm.b) == null) {
                    synchronized (ajdm.class) {
                        if (ajdm.b == null) {
                            ajdm.b = (ahbe)new agzb((agzi)ajdm.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return ajdm.a;
            }
            case 4: {
                return new agza((agzi)ajdm.a);
            }
            case 3: {
                return new ajdm();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ajdm.a, "\u0001\u0004\u0000\u0001\u0001\u0007\u0004\u0000\u0000\u0004\u0001\u1409\u0000\u0005\u1409\u0006\u0006\u1409\u0002\u0007\u1409\u0004", new Object[] { "c", "d", "g", "e", "f" });
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
