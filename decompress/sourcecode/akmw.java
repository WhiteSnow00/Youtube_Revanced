import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akmw extends agzi implements ahax
{
    public static final akmw a;
    private static volatile ahbe d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        agzi.registerDefaultInstance(akmw.class, a = new akmw());
    }
    
    private akmw() {
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
                if ((d = akmw.d) == null) {
                    synchronized (akmw.class) {
                        if (akmw.d == null) {
                            akmw.d = (ahbe)new agzb((agzi)akmw.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return akmw.a;
            }
            case 4: {
                return new agza((agzi)akmw.a);
            }
            case 3: {
                return new akmw();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)akmw.a, "\u0001\u0002\u0001\u0000\ue8e9\u4616\ue8f3\u55ce\u0002\u0000\u0000\u0002\ue8e9\u4616\u143c\u0000\ue8f3\u55ce\u143c\u0000", new Object[] { "c", "b", amgw.class, anug.class });
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
