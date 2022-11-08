import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aidj extends agzi implements ahax
{
    public static final aidj a;
    private static volatile ahbe d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        agzi.registerDefaultInstance((Class)aidj.class, (agzi)(a = new aidj()));
    }
    
    private aidj() {
        this.b = 0;
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
                final ahbe d;
                if ((d = aidj.d) == null) {
                    synchronized (aidj.class) {
                        if (aidj.d == null) {
                            aidj.d = (ahbe)new agzb((agzi)aidj.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aidj.a;
            }
            case 4: {
                return new agza((agzi)aidj.a);
            }
            case 3: {
                return new aidj();
            }
            case 2: {
                return newMessageInfo((MessageLite)aidj.a, "\u0001\u0001\u0001\u0000\ue63d\u43b1\ue63d\u43b1\u0001\u0000\u0000\u0001\ue63d\u43b1\u143c\u0000", new Object[] { "c", "b", ajzx.class });
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
