import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajyh extends agzi implements ahax
{
    public static final ajyh a;
    private static volatile ahbe b;
    private int c;
    private ajsq d;
    private ajsq e;
    private byte f;
    
    static {
        agzi.registerDefaultInstance(ajyh.class, a = new ajyh());
    }
    
    private ajyh() {
        this.f = 2;
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
                if ((b2 = ajyh.b) == null) {
                    synchronized (ajyh.class) {
                        if (ajyh.b == null) {
                            ajyh.b = (ahbe)new agzb((agzi)ajyh.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return ajyh.a;
            }
            case 4: {
                return new agza((agzi)ajyh.a);
            }
            case 3: {
                return new ajyh();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ajyh.a, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0002\u0001\u1409\u0000\u0003\u1409\u0002", new Object[] { "c", "d", "e" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.f = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.f;
            }
        }
    }
}
