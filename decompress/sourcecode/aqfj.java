import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqfj extends agzi implements ahax
{
    public static final aqfj a;
    private static volatile ahbe b;
    private int c;
    private aqfi d;
    private byte e;
    
    static {
        agzi.registerDefaultInstance((Class)aqfj.class, (agzi)(a = new aqfj()));
    }
    
    private aqfj() {
        this.e = 2;
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
                if ((b2 = aqfj.b) == null) {
                    synchronized (aqfj.class) {
                        if (aqfj.b == null) {
                            aqfj.b = (ahbe)new agzb((agzi)aqfj.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return aqfj.a;
            }
            case 4: {
                return new agza((agzi)aqfj.a);
            }
            case 3: {
                return new aqfj();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqfj.a, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0001\u0003\u1409\u0002", new Object[] { "c", "d" });
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