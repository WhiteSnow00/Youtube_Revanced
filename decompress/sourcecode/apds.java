import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apds extends agzi implements ahax
{
    public static final apds a;
    private static volatile ahbe d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        agzi.registerDefaultInstance(apds.class, a = new apds());
    }
    
    private apds() {
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
                if ((d = apds.d) == null) {
                    synchronized (apds.class) {
                        if (apds.d == null) {
                            apds.d = (ahbe)new agzb((agzi)apds.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return apds.a;
            }
            case 4: {
                return new agza((agzi)apds.a);
            }
            case 3: {
                return new apds();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)apds.a, "\u0001\u0003\u0001\u0000\ue818\u3884\ufdad\u6124\u0003\u0000\u0000\u0003\ue818\u3884\u143c\u0000\ue38b\u3a4e\u143c\u0000\ufdad\u6124\u143c\u0000", new Object[] { "c", "b", ahxr.class, aipi.class, anjn.class });
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
