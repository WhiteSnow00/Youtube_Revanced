import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajbq extends agzi implements ahax
{
    public static final ajbq a;
    private static volatile ahbe b;
    private int c;
    private ajbp d;
    private byte e;
    
    static {
        agzi.registerDefaultInstance(ajbq.class, a = new ajbq());
    }
    
    private ajbq() {
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
                if ((b2 = ajbq.b) == null) {
                    synchronized (ajbq.class) {
                        if (ajbq.b == null) {
                            ajbq.b = (ahbe)new agzb((agzi)ajbq.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return ajbq.a;
            }
            case 4: {
                return new agza((agzi)ajbq.a);
            }
            case 3: {
                return new ajbq();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ajbq.a, "\u0001\u0001\u0000\u0001\uea42\u2d5e\uea42\u2d5e\u0001\u0000\u0000\u0001\uea42\u2d5e\u1409\u0000", new Object[] { "c", "d" });
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
