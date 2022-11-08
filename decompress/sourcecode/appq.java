import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class appq extends agzi implements ahax
{
    public static final appq a;
    private static volatile ahbe d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        agzi.registerDefaultInstance((Class)appq.class, (agzi)(a = new appq()));
    }
    
    private appq() {
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
                if ((d = appq.d) == null) {
                    synchronized (appq.class) {
                        if (appq.d == null) {
                            appq.d = (ahbe)new agzb((agzi)appq.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return appq.a;
            }
            case 4: {
                return new agza((agzi)appq.a);
            }
            case 3: {
                return new appq();
            }
            case 2: {
                return newMessageInfo((MessageLite)appq.a, "\u0001\u0004\u0001\u0000\ue1b7\u3802\uf676\u4665\u0004\u0000\u0000\u0004\ue1b7\u3802\u143c\u0000\ue4d4\u380d\u143c\u0000\ue206\u3820\u143c\u0000\uf676\u4665\u143c\u0000", new Object[] { "c", "b", appp.class, appo.class, appr.class, appn.class });
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
