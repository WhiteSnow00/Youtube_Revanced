import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahhv extends agzi implements ahax
{
    public static final ahhv a;
    private static volatile ahbe d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        agzi.registerDefaultInstance(ahhv.class, a = new ahhv());
    }
    
    private ahhv() {
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
                if ((d = ahhv.d) == null) {
                    synchronized (ahhv.class) {
                        if (ahhv.d == null) {
                            ahhv.d = (ahbe)new agzb((agzi)ahhv.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ahhv.a;
            }
            case 4: {
                return new agza((agzi)ahhv.a);
            }
            case 3: {
                return new ahhv();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahhv.a, "\u0001\u0003\u0001\u0000\uff28\u1dbe\uf72c\u4c0d\u0003\u0000\u0000\u0003\uff28\u1dbe\u143c\u0000\ued6a\u25bb\u143c\u0000\uf72c\u4c0d\u143c\u0000", new Object[] { "c", "b", ahhs.class, aisy.class, aiwc.class });
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
