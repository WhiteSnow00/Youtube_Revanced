import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahtd extends agzi implements ahax
{
    public static final ahtd a;
    private static volatile ahbe d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        agzi.registerDefaultInstance(ahtd.class, a = new ahtd());
    }
    
    private ahtd() {
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
                if ((d = ahtd.d) == null) {
                    synchronized (ahtd.class) {
                        if (ahtd.d == null) {
                            ahtd.d = (ahbe)new agzb((agzi)ahtd.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ahtd.a;
            }
            case 4: {
                return new agza((agzi)ahtd.a);
            }
            case 3: {
                return new ahtd();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahtd.a, "\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u143c\u0000", new Object[] { "c", "b", ahte.class });
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
