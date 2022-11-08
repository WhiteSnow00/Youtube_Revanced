import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apxt extends agzi implements ahax
{
    public static final apxt a;
    private static volatile ahbe c;
    public agsr b;
    private int d;
    private byte e;
    
    static {
        agzi.registerDefaultInstance(apxt.class, a = new apxt());
    }
    
    private apxt() {
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
                final ahbe c;
                if ((c = apxt.c) == null) {
                    synchronized (apxt.class) {
                        if (apxt.c == null) {
                            apxt.c = (ahbe)new agzb((agzi)apxt.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return apxt.a;
            }
            case 4: {
                return new agza((agzi)apxt.a);
            }
            case 3: {
                return new apxt();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)apxt.a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001\u0002\u1409\u0001", new Object[] { "d", "b" });
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
