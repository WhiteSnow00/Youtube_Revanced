import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajxf extends agzi implements ahax
{
    public static final ajxf a;
    private static volatile ahbe b;
    private int c;
    private amva d;
    private byte e;
    
    static {
        agzi.registerDefaultInstance(ajxf.class, a = new ajxf());
    }
    
    private ajxf() {
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
                if ((b2 = ajxf.b) == null) {
                    synchronized (ajxf.class) {
                        if (ajxf.b == null) {
                            ajxf.b = (ahbe)new agzb((agzi)ajxf.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return ajxf.a;
            }
            case 4: {
                return new agza((agzi)ajxf.a);
            }
            case 3: {
                return new ajxf();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ajxf.a, "\u0001\u0001\u0000\u0001\ue528\u1ce2\ue528\u1ce2\u0001\u0000\u0000\u0001\ue528\u1ce2\u1409\u0000", new Object[] { "c", "d" });
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
