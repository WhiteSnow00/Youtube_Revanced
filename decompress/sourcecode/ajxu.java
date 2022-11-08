import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajxu extends agzi implements ahax
{
    public static final ajxu a;
    private static volatile ahbe b;
    private int c;
    private ahym d;
    private byte e;
    
    static {
        agzi.registerDefaultInstance(ajxu.class, a = new ajxu());
    }
    
    private ajxu() {
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
                if ((b2 = ajxu.b) == null) {
                    synchronized (ajxu.class) {
                        if (ajxu.b == null) {
                            ajxu.b = (ahbe)new agzb((agzi)ajxu.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return ajxu.a;
            }
            case 4: {
                return new agza((agzi)ajxu.a);
            }
            case 3: {
                return new ajxu();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ajxu.a, "\u0001\u0001\u0000\u0001\ue14a\u1cb1\ue14a\u1cb1\u0001\u0000\u0000\u0001\ue14a\u1cb1\u1409\u0000", new Object[] { "c", "d" });
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
