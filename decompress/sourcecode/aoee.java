import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoee extends agzi implements ahax
{
    public static final aoee a;
    private static volatile ahbe d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        agzi.registerDefaultInstance(aoee.class, a = new aoee());
    }
    
    private aoee() {
        this.b = 0;
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
                final ahbe d;
                if ((d = aoee.d) == null) {
                    synchronized (aoee.class) {
                        if (aoee.d == null) {
                            aoee.d = (ahbe)new agzb((agzi)aoee.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aoee.a;
            }
            case 4: {
                return new agza((agzi)aoee.a);
            }
            case 3: {
                return new aoee();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aoee.a, "\u0001\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0003\u0001\u143c\u0000\u0002\u143c\u0000\u0003\u103c\u0000\u0004\u143c\u0000", new Object[] { "c", "b", aohe.class, aipy.class, anwl.class, akdf.class });
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
