import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aidv extends agzi implements ahax
{
    public static final aidv a;
    private static volatile ahbe b;
    private int c;
    private ajsq d;
    private byte e;
    
    static {
        agzi.registerDefaultInstance((Class)aidv.class, (agzi)(a = new aidv()));
    }
    
    private aidv() {
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
                if ((b2 = aidv.b) == null) {
                    synchronized (aidv.class) {
                        if (aidv.b == null) {
                            aidv.b = (ahbe)new agzb((agzi)aidv.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return aidv.a;
            }
            case 4: {
                return new agza((agzi)aidv.a);
            }
            case 3: {
                return new aidv();
            }
            case 2: {
                return newMessageInfo((MessageLite)aidv.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u1409\u0000", new Object[] { "c", "d" });
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
