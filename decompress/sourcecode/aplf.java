import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aplf extends agzi implements ahax
{
    public static final aplf a;
    private static volatile ahbe b;
    private int c;
    private apmw d;
    private byte e;
    
    static {
        agzi.registerDefaultInstance(aplf.class, a = new aplf());
    }
    
    private aplf() {
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
                if ((b2 = aplf.b) == null) {
                    synchronized (aplf.class) {
                        if (aplf.b == null) {
                            aplf.b = (ahbe)new agzb((agzi)aplf.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return aplf.a;
            }
            case 4: {
                return new agza((agzi)aplf.a);
            }
            case 3: {
                return new aplf();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aplf.a, "\u0001\u0001\u0000\u0001\ueaf2\u2166\ueaf2\u2166\u0001\u0000\u0000\u0001\ueaf2\u2166\u1409\u0000", new Object[] { "c", "d" });
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
