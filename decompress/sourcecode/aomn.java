import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aomn extends agzi implements ahax
{
    public static final aomn a;
    private static volatile ahbe d;
    public int b;
    public aomk c;
    private byte e;
    
    static {
        agzi.registerDefaultInstance((Class)aomn.class, (agzi)(a = new aomn()));
    }
    
    private aomn() {
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
                if ((d = aomn.d) == null) {
                    synchronized (aomn.class) {
                        if (aomn.d == null) {
                            aomn.d = (ahbe)new agzb((agzi)aomn.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aomn.a;
            }
            case 4: {
                return new agza((agzi)aomn.a);
            }
            case 3: {
                return new aomn();
            }
            case 2: {
                return newMessageInfo((MessageLite)aomn.a, "\u0001\u0001\u0000\u0001\uee44\u297c\uee44\u297c\u0001\u0000\u0000\u0001\uee44\u297c\u1409\u0000", new Object[] { "b", "c" });
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
