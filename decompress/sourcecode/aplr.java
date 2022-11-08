import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aplr extends agzi implements ahax
{
    public static final aplr a;
    private static volatile ahbe b;
    private int c;
    private apmw d;
    private byte e;
    
    static {
        agzi.registerDefaultInstance(aplr.class, a = new aplr());
    }
    
    private aplr() {
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
                if ((b2 = aplr.b) == null) {
                    synchronized (aplr.class) {
                        if (aplr.b == null) {
                            aplr.b = (ahbe)new agzb((agzi)aplr.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return aplr.a;
            }
            case 4: {
                return new agza((agzi)aplr.a);
            }
            case 3: {
                return new aplr();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aplr.a, "\u0001\u0001\u0000\u0001\ueaf2\u2166\ueaf2\u2166\u0001\u0000\u0000\u0001\ueaf2\u2166\u1409\u0000", new Object[] { "c", "d" });
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
