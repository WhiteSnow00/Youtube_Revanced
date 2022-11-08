import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajpa extends agzi implements ahax
{
    public static final ajpa a;
    private static volatile ahbe b;
    private int c;
    private ajsq d;
    private byte e;
    
    static {
        agzi.registerDefaultInstance((Class)ajpa.class, (agzi)(a = new ajpa()));
    }
    
    private ajpa() {
        this.e = 2;
        emptyProtobufList();
    }
    
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
                if ((b2 = ajpa.b) == null) {
                    synchronized (ajpa.class) {
                        if (ajpa.b == null) {
                            ajpa.b = (ahbe)new agzb((agzi)ajpa.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return ajpa.a;
            }
            case 4: {
                return new agza((agzi)ajpa.a);
            }
            case 3: {
                return new ajpa();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajpa.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u1409\u0000", new Object[] { "c", "d" });
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
