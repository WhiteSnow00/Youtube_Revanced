import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aonw extends agzi implements ahax
{
    public static final aonw a;
    private static volatile ahbe c;
    public ahfy b;
    private int d;
    private byte e;
    
    static {
        agzi.registerDefaultInstance((Class)aonw.class, (agzi)(a = new aonw()));
    }
    
    private aonw() {
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
                final ahbe c;
                if ((c = aonw.c) == null) {
                    synchronized (aonw.class) {
                        if (aonw.c == null) {
                            aonw.c = (ahbe)new agzb((agzi)aonw.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aonw.a;
            }
            case 4: {
                return new agza((agzi)aonw.a);
            }
            case 3: {
                return new aonw();
            }
            case 2: {
                return newMessageInfo((MessageLite)aonw.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u1409\u0000", new Object[] { "d", "b" });
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
