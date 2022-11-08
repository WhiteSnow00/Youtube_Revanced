import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqic extends agzi implements ahax
{
    public static final aqic a;
    private static volatile ahbe d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        agzi.registerDefaultInstance((Class)aqic.class, (agzi)(a = new aqic()));
    }
    
    private aqic() {
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
                if ((d = aqic.d) == null) {
                    synchronized (aqic.class) {
                        if (aqic.d == null) {
                            aqic.d = (ahbe)new agzb((agzi)aqic.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aqic.a;
            }
            case 4: {
                return new agza((agzi)aqic.a);
            }
            case 3: {
                return new aqic();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqic.a, "\u0001\u0002\u0001\u0000\u0001\u001d\u0002\u0000\u0000\u0002\u0001\u143c\u0000\u001d\u143c\u0000", new Object[] { "c", "b", aqdw.class, aqhy.class });
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
